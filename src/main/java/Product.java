package Compras;

import Compras.Category;

public class Product {

    private String name;
    private String description;
    private String picture;
    private Category category;
    private double price;
    private String unityType;

    public Product( String name, String description, String picture,
                    Category category, double price, String unityType)   {
        this.name = name;
        this.description = description;
        this.picture = picture;
        this.category = category;
        this.price = price;
        this.unityType = unityType;
    }

    public String getName() {
        return name; }
    public void setName(String name) {
        this.name = name; }

    public String getDescription() {
        return description; }
    public void setDescription(String description) {
        this.description = description; }

    public String getPicture() {
        return picture; }
    public void setPicture(String picture) {
        this.picture = picture; }

    public Category getCategory() {
        return category; }
    public void setCategory(Category category) {
        this.category = category; }

    public double getPrice() {
        return price; }
    public void setPrice(double price){
        this.price = price; }

    public String getUnityType() {
        return unityType; }
    public void setUnityType(String unityType){
        this.unityType = unityType; }

    }
