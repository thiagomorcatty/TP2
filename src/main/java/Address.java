Package Compras;

public class Address {

    private String streetname;
    private Integer doorno;
    private String postalcode;

    public Address ( String streetname, Integer doorno, String postalcode)
    {
        this.streetname = streetname;
        this.doorno = doorno;
        this.postalcode = postalcode;
    }

    public String getStreetname() {
        return streetname;     }
    public void setStreetname(String streetname){
        this.streetname = streetname;     }

    public Integer getDoorno() {
        return doorno;     }
    public void setDoorno(Integer doorno){
        this.doorno = doorno;     }

    public String getPostalcode() {
        return postalcode;     }
    public void setPostalcode(String postalcode){
        this.postalcode = postalcode;     }

}
