package javaOdev4.bussines.concretes;

import javaOdev4.bussines.abstracts.EmailService;
import javaOdev4.bussines.abstracts.UserService;
import javaOdev4.bussines.abstracts.UserValidationService;
import javaOdev4.core.AuthService;
import javaOdev4.core.Utils.BussinesRules;
import javaOdev4.entities.concretes.User;

public class AuthManager implements AuthService{
	
	UserService userService;
	UserValidationService userValidationService;
	EmailService emailService;
	
	

	public AuthManager(UserService userService, UserValidationService userValidationService,
			EmailService emailService) {
		super();
		this.userService = userService;
		this.userValidationService = userValidationService;
		this.emailService = emailService;
	}

	@Override
	public void register(int id, String email, String password, String firstname, String lastName) {
		User userToRegister = new User(id, email, password, firstname, lastName, false);
		if (!userValidationService.validate(userToRegister)) {
			System.out.println("Validate i�lemi ba�ar�s�z. L�tfen t�m alanlar� girdi�inizden emin olun");
			return;
			
		
		}
		if (!BussinesRules.run(CheckEmail(email))) {
			System.out.println("Kay�t olma i�lemi ba�ar�s�z. Bu email ile bir ba�ka �ye mevcut.");
			return;
		}
		System.out.println("Ba�ar�yla kay�t olundu. �yeli�inizi do�rulamak i�in l�tfen e-posta adresinizi kontrol ediniz.");
		emailService.send("Deneme do�rulama mesaj�d�r. Do�rulamak i�in kodlama.io/........ adresine gidin.", userToRegister.getEmail());
		userToRegister.setVerified(true); 
		userService.add(userToRegister);
	}

	@Override
	public void login(String email, String password) {
		if(!BussinesRules.run(checkIfAllFieldsFilled(email, password))) {
			System.out.println("Giri� ba�ar�s�z. Inputlar do�ru doldurulmad�.");
			return;
		}
		
		User userToLogin = userService.getByEmailAndPassword(email, password);
		
		if(userToLogin == null) {
			System.out.println("Giri� ba�ar�s�z. E-posta adresiniz veya �ifreniz yanl��.");
			return;
		}
		
		if(!checkIfUserVerified(userToLogin)) {
			System.out.println("Giri� ba�ar�s�z. �yeli�inizi do�rulamad�n�z.");
			return;
		}
		System.out.println("Giri� ba�ar�l�. Ho�geldiniz : " + userToLogin.getFirstName() + " " + userToLogin.getLastName());		
	}
	
	public boolean CheckEmail(String email) {
		return userService.getByEmail(email) ==null;
	}
	private boolean checkIfUserVerified(User user) {
		return user.isVerified();
	}
	private boolean checkIfAllFieldsFilled(String email,String password) {
		if(email.length()<=0 || password.length() <=0) {
			return false;
		}
		return true;
	}

}
