package com.practicacrud.model;

public class Product {
	private int idProduct;
	private String nameProduct;
	private int existenciasProduct;
	private double precioProduct;
	
	// CONSTRUCTORES
	public Product(){
		
	}
	
	public Product(int idProduct, String nameProduct, int existenciasProduct, double precioProduct) {
		this.idProduct = idProduct;
		this.nameProduct = nameProduct;
		this.existenciasProduct = existenciasProduct;
		this.precioProduct = precioProduct;
	}
	
	
	//GETTERS & SETTERS
	
	public void setIdProduct(int idProduct) {
		this.idProduct = idProduct;
	}
	public int getIdProduct() {
		return this.idProduct;
	}
	
	public void setNameProduct(String nameProduct) {
		this.nameProduct = nameProduct;
	}
	
	public String getNameProduct() {
		return this.nameProduct;
	}
	
	public void setExistenciasProduct(int existenciasProduct) {
		this.existenciasProduct = existenciasProduct;
	}
	
	public int getExistenciasProduct() {
		return this.existenciasProduct;
	}
	
	public void setPrecioProduct(double precioProduct) {
		this.precioProduct = precioProduct;
	}
	
	public double getPrecioProduct() {
		return precioProduct;
	}
}
