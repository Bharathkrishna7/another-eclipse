package com.pages;

public class Displaysearch {

	public String displayproduct(AmazonSearch productname) {
		if (productname.getproductlist().contains(productname.getProductname())) {
			return productname.getProductname();
		}
		return null;

	}
}
