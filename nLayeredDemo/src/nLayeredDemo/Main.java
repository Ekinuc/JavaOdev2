package nLayeredDemo;

import nLayeredDemo.bussines.abstracts.ProductService;
import nLayeredDemo.bussines.concretes.ProductManager;
import nLayeredDemo.core.JLoggerManagerAdapter;
import nLayeredDemo.dataAccess.concretes.AbcProductDao;
import nLayeredDemo.dataAccess.concretes.HibernateProductDao;
import nLayeredDemo.entities.concrates.Product;


public class Main {

	public static void main(String[] args) {
		
		//ToDo Spring IoC ile ��z�lecek
		ProductService productService = new ProductManager(new AbcProductDao(), new JLoggerManagerAdapter());
		
		Product product = new Product(1, 2, "Elma", 12, 50);
		productService.add(product);
	}

}
