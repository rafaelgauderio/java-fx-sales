package model.services;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class SellerService {

	/*
	 * mock data public List<Seller> findAll() { List<Seller> list = new
	 * ArrayList<>(); list.add(new Seller(1, "Books")); list.add(new
	 * Seller(2, "Computers")); list.add(new Seller(3, "Eletronics"));
	 * list.add(new Seller(4, "Miscellaneous")); list.add(new Seller(5,
	 * "Cell phones")); return list;
	 * 
	 * }
	 */

	private SellerDao dao = DaoFactory.createSellerDao();

	public List<Seller> findAll() {
		return dao.findAll();

	}

	public void saveOrUpdate(Seller obj) {
		if (obj.getId() == null) {
			dao.insert(obj);
		} else {
			dao.update(obj);
		}
	}
	
	public void remove(Seller obj) {
		dao.deleteById(obj.getId());
	}

}
