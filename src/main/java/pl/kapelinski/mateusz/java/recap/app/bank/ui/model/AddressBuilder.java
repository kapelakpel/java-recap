package pl.kapelinski.mateusz.java.recap.app.bank.ui.model;

public class AddressBuilder {
    private String city;
    private String postCode;
    private String houseNumber;
    private String apartmentNumber;
    private String street;

    public AddressBuilder setCity(String city) {
        this.city = city;
        return this;
    }

    public AddressBuilder setPostCode(String postCode) {
        this.postCode = postCode;
        return this;
    }

    public AddressBuilder setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
        return this;
    }

    public AddressBuilder setApartmentNumber(String apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
        return this;
    }

    public AddressBuilder setStreet(String street) {
        this.street = street;
        return this;
    }

    public Address createAddress() {
        return new Address(city, postCode, houseNumber, apartmentNumber, street);
    }
}