package Model;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Registered  {

	private double miles;
	private float discount;
	private LocalDate dateRegister;
	
	
	


	public double getMiles() {
		return miles;
	}


	public void setMiles(double miles) {
		this.miles = miles;
	}


	public float getDiscount() {
		return discount;
	}


	public void setDiscount(float discount) {
		this.discount = discount;
	}


	public LocalDate getDateRegister() {
		return dateRegister;
	}


	public void setDateRegister(LocalDate dateRegister) {
		this.dateRegister = dateRegister;
	}
	
	public double getTicketCost() {
		return 0;
	}
	
	
	
}
