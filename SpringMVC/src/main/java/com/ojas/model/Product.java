package com.ojas.model;


public class Product {
	private double price,discount,netPrice;
	
	public Product() {
		super();
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public double getNetPrice() {
		return netPrice;
	}

	public void setNetPrice(double netPrice) {
		this.netPrice = netPrice;
	}

	@Override
	public String toString() {
		return "Product [price=" + price + ", discount=" + discount + ", netPrice=" + netPrice + "]";
	}
}
