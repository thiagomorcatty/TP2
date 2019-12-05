package Compras;

import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {


        Address address = new Address();
        Address address1 = new Address();
        Address address2 = new Address();


        User user = new User();
        User user1 = new User();
        User user2 = new User();
        ArrayList <User> userlist = new ArrayList<User>();
        userlist.add(user1);
        userlist.add(user2);

        Product product1 = new Product();
        Product product2 = new Product();
        Product product3 = new Product();
        Product product4 = new Product();
        Product product5 = new Product();
        Product product6 = new Product();
        Product product7 = new Product();


        Category category1 = new Category();
        Category category2 = new Category();
        Category category3 = new Category();


        category1.setColor("Vermelho");
        category1.setName("Talho");
        category1.setDescription("Produtos do talho (ex: filé de frango, picanha)");
        category2.setColor("Azul");
        category2.setName("Produtos de Limpeza");
        category2.setDescription("Produtos de Limpeza (ex: amaciador, gel de banho)");
        category3.setColor("Vermelho");
        category3.setName("Peixaria");
        category3.setDescription("Produtos de peixaria (ex: salmão, atum");

        product1.setCategory(category2);
        product1.setDescription("Picanha Suína");
        product1.setName("Picanha");
        product1.setPicture("picture");
        product1.setPrice(4.56);
        product1.setUnityType("kg");
        product2.setCategory(category1);
        product2.setDescription("Gel de Banho com cheiros especiais da flora");
        product2.setName("Gel de Banho Nivea");
        product2.setPicture("picture");
        product2.setPrice(2.50);
        product2.setUnityType("ml");
        product3.setCategory(category3);
        product3.setDescription("Filé de Salmão Fresco");
        product3.setName("Salmão");
        product3.setPicture("picture");
        product3.setPrice(16.98);
        product3.setUnityType("kg");
        product4.setCategory(category2);
        product4.setDescription("Queijo Limiano");
        product4.setName("Queijo");
        product4.setPicture("picture");
        product4.setPrice(6.99);
        product4.setUnityType("gr");
        product5.setCategory(category3);
        product5.setDescription("Peixe Espada Branco");
        product5.setName("Peixe Espada Branco (ao kg)");
        product5.setPicture("picture");
        product5.setPrice(9.99);
        product5.setUnityType("kg");
        product6.setCategory(category2);
        product6.setDescription("Pão de forma integral 200g");
        product6.setName("Pão de Forma (200g)");
        product6.setPicture("picture");
        product6.setPrice(0.99);
        product6.setUnityType("gr");
        product7.setCategory(category1);
        product7.setDescription("Filé de Atum Fresco");
        product7.setName("Atum");
        product7.setPicture("picture");
        product7.setPrice(12.86);
        product7.setUnityType("kg");



        address.setDoorno(7);
        address.setPostalcode("4700-116");
        address.setStreetname("Rua do Cruzeiro");
        address1.setDoorno(171);
        address1.setPostalcode("4715-142");
        address1.setStreetname("Rua da Tomada");
        address2.setDoorno(1000);
        address2.setPostalcode("4500-0000");
        address2.setStreetname("Rua de Santos Pousada");


        ShoppingList lista = new ShoppingList();

        lista.setNome("Lista de Compras 1");
        lista.setUserNome(user);

        lista.setAddProduct(product1);
        lista.setAddProduct(product2);
        lista.setAddProduct(product3);
        lista.setAddProduct(product4);
        lista.setAddProduct(product5);
        lista.setAddProduct(product6);
        lista.setAddProduct(product7);
        lista.setRemoveProduct(product1);
        lista.setAddProduct(product1);
        lista.setAddProductToShoppingCart(product4);
        lista.setRemoveProductFromShoppingCart(product4);


         System.out.println("Nome das pessoas com quem a lista está a ser partilhada");
        System.out.println(lista.getUserNome());
        for(int i=0; i<lista.getUserList().size();i++) {
            System.out.println(lista.getUserList().get(i).getNome());
        }

        System.out.println("Numero de produtos que estao no carrinho:"+lista.getTotalOfProductOnShoppingCart());
        System.out.println("Total do carrinho:"+lista.getTotalPrice());

        System.out.println("Produtos que estao estao na lista de compras:"+lista.getTotalOfProduct());
        System.out.println("Total da lista de compras:"+lista2.getTotalPrice());

        System.out.println("\nPercetegem completa:"+lista.getPercentagemCompleted());

        System.out.println("Imprimir telefones dos utilizadores:");
        for(int i=0; i<lista.getUserList().size();i++) {
            System.out.println(lista.getUserList().get(i).getTelefone());
        }
    }
}
