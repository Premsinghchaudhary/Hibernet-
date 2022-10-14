package Hibernet;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Car" )
public class Demo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name="Reg_No")
	private Long Reg_No;
@Column(name="Owner_Name")
	private String Owner_Name;
@Column(name="Brand_Name")
    private String Brand_Name;
@Column(name="Model_Name")
    private String Model_Name;
@Column(name="Price")
    private String Price;

public Long getReg_No() {
	return Reg_No;
}
public void setReg_No(Long reg_No) {
	Reg_No = reg_No;
}
public String getOwner_Name() {
	return Owner_Name;
}
public void setOwner_Name(String owner_Name) {
	Owner_Name = owner_Name;
}
public String getBrand_Name() {
	return Brand_Name;
}
public void setBrand_Name(String brand_Name) {
	Brand_Name = brand_Name;
}
public String getModel_Name() {
	return Model_Name;
}
public void setModel_Name(String model_Name) {
	Model_Name = model_Name;
}
public String getPrice() {
	return Price;
}
public void setPrice(String price) {
	Price = price;
}
@Override
public String toString() {
	return "Car [Reg_No=" + Reg_No + ", Owner_Name=" + Owner_Name + ", Brand_Name=" + Brand_Name + ", Model_Name="
			+ Model_Name + ", Price=" + Price + "]";
}
public Demo() {
	super();
	// TODO Auto-generated constructor stub
}
public Demo(Long reg_No, String owner_Name, String brand_Name, String model_Name, String price) {
	super();
	Reg_No = reg_No;
	Owner_Name = owner_Name;
	Brand_Name = brand_Name;
	Model_Name = model_Name;
	Price = price;
}	
}
