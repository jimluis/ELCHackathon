package com.beautyforward.beautyforward.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ItemDAO 
{
	@Id
	@Column(name = "itemId")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long itemId;
	
	@Column(name = "title")
	private String title;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "color")
	private String color;
	
	@Column(name = "productCategory")
	private String productCategory;
	
	@Column(name = "colorSwatch")
	private String colorSwatch;
	
	@Column(name = "shade")
	private String shade;
	
	public Long getItemId() {
		return itemId;
	}
	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getProductCategory() {
		return productCategory;
	}
	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}
	public String getColorSwatch() {
		return colorSwatch;
	}
	public void setColorSwatch(String colorSwatch) {
		this.colorSwatch = colorSwatch;
	}
	public String getShade() {
		return shade;
	}
	public void setShade(String shade) {
		this.shade = shade;
	}
	
	
	
	
}
