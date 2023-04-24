package onetomany_DTO;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Hospital
{
	@Id
	private int id;
	private String name;
	private String address;
	@OneToMany(cascade = CascadeType.ALL)
	List<Branches> b;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public List<Branches> getB() {
		return b;
	}
	public void setB(List<Branches> b) {
		this.b = b;
	}
	@Override
	public String toString() {
		return "Hospital [id=" + id + ", name=" + name + ", address=" + address + ", b=" + b + "]";
	}
	
	
	
}
