package Compras;

import java.util.ArrayList;
import java.util.List;

public class ShoppingList {
    private String nome;
    private User userNome;
    private List <User> userList = new ArrayList<User>();
    private List <Product> productList1 = new ArrayList<>();
    private List <Product> productList2 = new ArrayList<>();


    public ShoppingList (String nome, User userNome)

    {
        this.nome = nome;
        this.userNome = userNome;

    }

    public String getNome() {
        return nome; }
    public void setNome(String nome) {
        this.nome = nome; }

    public User getUserNome() {
        return userNome; }
    public void setUserNome (User userNome) {
        this.userNome = userNome; }



    public double getPercentagemCompleted(){
        double percent = 0;
        int sizeList = productList1.size();
        int sizeCartList = productList2.size();
        percent = (sizeCartList*100 / sizeList);
        return percent;
    }

    public int getTotalOfProduct(){
        int nProduct = productList1.size();
        return nProduct;
    }
    public int getTotalOfProductOnShoppingCart(){
        int nProduct2 = productList2.size();
        return nProduct2;
    }
    public double getTotalPrice (){
        double totalPrice = 0;
        for(int i=0; i<productList1.size(); i++){totalPrice=totalPrice+productList1.get(i).getPrice(); }
        return totalPrice;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public List<Product> getProductList1() {
        return productList1;
    }

    public void setProductList1(List<Product> productList1) {
        this.productList1 = productList1;
    }

    public List<Product> getProductList2() {
        return productList2;
    }

    public void setProductList2(List<Product> productList2) {
        this.productList2 = productList2;
    }

    public void setAddProduct (Product product){
        productList1.add(product);
    }
    public void setRemoveProduct (Product product){
        productList1.remove(product);
    }
    public void setAddProductToShoppingCart (Product product){
        productList2.add(product);
    }
    public void setRemoveProductFromShoppingCart (Product product){
        productList2.remove(product);
    }

}

//private String userList;
//private String productList1;
//private String productList2;
//private double porcentagemCompleted;
//private int totalOfProducts;
//private int totalOfProductsOnShoppingCart;
//private double totalOfPrice;
//private double totalOfPriceOnShoppingCart;
//private Product addProduct;
//private Product removeProduct;
//private Product addProductToShoppingCart;
//private Product removeProductFromShoppingCart;

//(String userList, String productList1, String productList2,
//double porcentagemCompleted, int totalOfProducts, int totalOfProductsOnShoppingCart,
//double totalOfPrice, double totalOfPriceOnShoppingCart, Product addProduct,
//Product removeProduct, Product addProductToShoppingCart, Product removeProductFromShoppingCart)

// this.userList = userList;
// this.productList1 = productList1;
//this.productList2 = productList2;
// this.porcentagemCompleted = porcentagemCompleted;
// this.totalOfProducts = totalOfProducts;
// this.totalOfProductsOnShoppingCart = totalOfProductsOnShoppingCart;
// this.totalOfPrice = totalOfPrice;
// this.totalOfPriceOnShoppingCart = totalOfPriceOnShoppingCart;
// this.addProduct = addProduct;
// this.removeProduct = removeProduct;
// this.addProductToShoppingCart = addProductToShoppingCart;
// this.removeProductFromShoppingCart = removeProductFromShoppingCart;

//public String getUserList(){
//  return userList; }
//public void setUserList (String userList) {
//  this.userList = userList;  }

// public String getProductList1(){
//   return productList1; }
// public void setProductList1 (String productList1) {
//    this.productList1 = productList1;  }

//public String getProductList2(){
//    return productList2; }
// public void setProductList2 (String productList2) {
//    this.productList2 = productList2;  }

// public double getPercentagemCompleted() {
//    return porcentagemCompleted;     }
// public void setPorcentagemCompleted(double porcentagemCompleted) {
//    this.porcentagemCompleted = porcentagemCompleted;     }

// public int getTotalOfProducts() {
//     return totalOfProducts;     }
//public void setTotalOfProducts(int totalOfProducts) {
//   this.totalOfProducts = totalOfProducts;
// }

//  public int getTotalOfProductsOnShoppingCart() {
//    return totalOfProductsOnShoppingCart;     }
// public void setTotalOfProductsOnShoppingCart(int totalOfProductsOnShoppingCart) {
//     this.totalOfProductsOnShoppingCart = totalOfProductsOnShoppingCart;
// }

// public double getTotalOfPrice() {
//    return totalOfPrice;     }
// public void setTotalOfPrice(double totalOfPrice) {
//    this.totalOfPrice = totalOfPrice;     }

//  public double getTotalOfPriceOnShoppingCart() {
//    return totalOfPriceOnShoppingCart; }
// public void setTotalOfPriceOnShoppingCart(double totalOfPriceOnShoppingCart) {
//    this.totalOfPriceOnShoppingCart = totalOfPriceOnShoppingCart;
// }

//  public Product getAddProduct() {
//     return addProduct; }
// public void setAddProduct(Product addProduct) {
//     this.addProduct = addProduct; }

// public Product getRemoveProduct() {
//    return removeProduct;     }
// public void setRemoveProduct(Product removeProduct) {
//     this.removeProduct = removeProduct; }

// public Product getAddProductToShoppingCart() {
//     return addProductToShoppingCart; }
// public void setAddProductToShoppingCart(Product addProductToShoppingCart) {
//    this.addProductToShoppingCart = addProductToShoppingCart; }

// public Product getRemoteProductFromShoppingCart() {
//     return removeProductFromShoppingCart;     }
// public void setRemoveProductFromShoppingCart(Product removeProductFromShoppingCart) {
//   this.removeProductFromShoppingCart = removeProductFromShoppingCart; }
