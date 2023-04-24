package onetomany_CONTROLLER;

import java.util.ArrayList;
import java.util.List;

import onetomany_DAO.DAO;
import onetomany_DTO.Branches;
import onetomany_DTO.Hospital;

public class Driver
{
	public static void main(String[] args) 
	{
		Hospital h1 = new Hospital();
		h1.setId(1);
		h1.setName("Apollo");


		Branches b = new Branches();
		b.setId(1);
		b.setName("bengaluru");
		b.setPincode(258645);

		Branches b1 = new Branches();
		b1.setId(2);
		b1.setName("pune");
		b1.setPincode(658458);

		b.setH(h1);
		b1.setH(h1);;

		List<Branches> bl = new ArrayList<Branches>();
		bl.add(b);
		bl.add(b1);

		h1.setB(bl);

		DAO dao=new DAO();
		dao.Insert(h1);
		dao.fetch(1);
		dao.Update(1, h1);
		dao.delete(1);
	}
}
