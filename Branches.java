package onetomany_DTO;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Branches 
{
	@Id
	private int id;
	private String name;
	private int pincode;
	@ManyToOne
	@JoinColumn
	Hospital h;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public Hospital getH() {
		return h;
	}
	public void setH(Hospital h) {
		this.h = h;
	}
	@Override
	public String toString() {
		return "Branches [id=" + id + ", name=" + name + ", pincode=" + pincode + ", h=" + h + "]";
	}
	
}
