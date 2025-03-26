package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		Department obj = new Department(1, "Books");

		SellerDao sellerDao = DaoFactory.creteSellerDao();
		
		System.out.println("=== TESTE 1: seller findByID ==== ");
		Seller seller = sellerDao.findById(3);

		System.out.println(seller);

	}

}
