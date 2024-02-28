package com.pages;

import java.util.ArrayList;
import java.util.List;

public class AmazonSearch {

	private String ProductName;
	private int Price;

	public AmazonSearch(String productname, int price) {
		this.ProductName = productname;
		this.Price = price;
	}

	public String getProductname() {
		return ProductName;
	}

	public void setproductname(String productname) {
		this.ProductName = productname;
	}

	public int getprice() {
		return Price;
	}

	public void setprice(int price) {
		this.Price = price;
	}

	public List<String> getproductlist() {

		List<String> productlist = new ArrayList<>();
		productlist.add("apple iphone");
		productlist.add("macBook pro");
		productlist.add("ipod");
		return productlist;
	}

}
