package dto;

public class AddressDTO {

    private String country;
    private String state;
    private String city;
    private String zipCode;
    private String fullAddress;

    public void setCountry(String value) {
        this.country = value;
    }

    public String getCountry() {
        return this.country;
    }

    public void setState(String value) {
        this.state = value;
    }

    public String getState() {
        return this.state;
    }

    public void setCity(String value) {
        this.city = value;
    }

    public String getCity() {
        return this.city;
    }

    public void setZipCode(String value) {
        this.zipCode = value;
    }

    public String getZipCode() {
        return this.zipCode;
    }

    public void setFullAddress(String value) {
        this.fullAddress = value;
    }

    public String getFullAddress() {
        return this.fullAddress;
    }
}
