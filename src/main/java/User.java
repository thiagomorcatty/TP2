Package Compras;

public class User {
    private String nome;
    private String email;
    private String username;
    private String password;
    private Address address;

    public User( String nome, String email,String username, String password, Address address)   {
        this.nome = nome;
        this.email = email;
        this.username = username;
        this.password = password;
        this.address = address;
    }

    public String getNome() {
        return nome; }
    public void setNome(String nome) {
        this.nome = nome; }

    public String getEmail() {
        return email; }
    public void setEmail(String email) {
        this.email = email; }

    public String getUsername() {
        return username; }
    public void setUsername(String username) {
        this.username = username; }

    public String getPassword() {
        return password; }
    public void setPassword(String password) {
        this.password = password; }

    public Address getAddress() {
        return address; }
    public void setAddress(Address address){
        this.address = address; }


}
