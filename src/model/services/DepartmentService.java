package model.services;

import java.util.ArrayList;
import java.util.List;

import models.entities.Department;

public class DepartmentService {

	public List<Department> findAll() {
		List<Department> list = new ArrayList<>();
		list.add(new Department(1, "Jewels"));
		list.add(new Department(2, "Clothes"));
		list.add(new Department(3, "Shoes"));
		return list;
	}

}
