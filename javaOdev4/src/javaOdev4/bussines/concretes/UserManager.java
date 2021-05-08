package javaOdev4.bussines.concretes;

import java.util.List;

import javaOdev4.bussines.abstracts.UserService;
import javaOdev4.dataAccess.abstracts.UserDao;
import javaOdev4.entities.concretes.User;

public class UserManager implements UserService {
	
	private UserDao userDao;

	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public void add(User user) {
		userDao.add(user);
		
	}

	@Override
	public void delete(User user) {
		userDao.delete(user);
		
	}

	@Override
	public void update(User user) {
		userDao.update(user);
		
	}

	@Override
	public void verifyUser(int id) {
		User user = userDao.get(id);
		user.setVerified(true);
		System.out.println("Kullanıcı başarıyla doğrulandı....");
	}

	@Override
	public User get(int id) {
		return userDao.get(id);
	}

	@Override
	public User getByEmail(String email) {
		return userDao.getByEmail(email);
	}

	@Override
	public User getByEmailAndPassword(String email, String Password) {
		return userDao.getByEmailAndPassword(email, Password);
	}

	@Override
	public List<User> getAll() {
		return userDao.getAll();
	}

	
		
}


