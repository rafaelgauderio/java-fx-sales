package model.services;

import java.util.ArrayList;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class DepartmentService {

	/*
	 * mock data public List<Department> findAll() { List<Department> list = new
	 * ArrayList<>(); list.add(new Department(1, "Books")); list.add(new
	 * Department(2, "Computers")); list.add(new Department(3, "Eletronics"));
	 * list.add(new Department(4, "Miscellaneous")); list.add(new Department(5,
	 * "Cell phones")); return list;
	 * 
	 * }
	 */

	private DepartmentDao dao = DaoFactory.createDepartmentDao();

	public List<Department> findAll() {
		return dao.findAll();
	}

}
