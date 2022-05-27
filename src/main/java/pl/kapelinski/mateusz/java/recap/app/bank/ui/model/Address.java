package pl.kapelinski.mateusz.java.recap.app.bank.ui.model;

public class Address
{
    private final String city;
    private final String postCode;
    private final String houseNumber;
    private final String apartmentNumber;
    private final String street;

//    Address(AddressBuilder builder) {
//        this.city = builder.city;
//        this.postCode = builder.postCode;
//        this.houseNumber = builder.houseNumber;
//        this.apartmentNumber = builder.apartmentNumber;
//        this.street = builder.street;
//    }

    public Address(String city, String postCode, String houseNumber, String apartmentNumber, String street) {
        this.city = city;
        this.postCode = postCode;
        this.houseNumber = houseNumber;
        this.apartmentNumber = apartmentNumber;
        this.street = street;
    }

    public String getCity() {
        return city;
    }
    public String getPostCode() {
        return postCode;
    }
    public String getHouseNumber() {
        return houseNumber;
    }
    public String getApartmentNumber() {
        return apartmentNumber;
    }
    public String getStreet() {
        return street;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", postCode='" + postCode + '\'' +
                ", houseNumber='" + houseNumber + '\'' +
                ", apartmentNumber='" + apartmentNumber + '\'' +
                ", street='" + street + '\'' +
                '}';
    }

//    public static class AddressBuilder
//    {
//        private final String city;
//        private final String postCode;
//        private String houseNumber;
//        private String apartmentNumber;
//        private String street;
//
//        public AddressBuilder(String city, String postCode) {
//            this.city = city;
//            this.postCode = postCode;
//        }
//
//        public AddressBuilder houseNumber(String houseNumber) {
//            this.houseNumber = houseNumber;
//            return this;
//        }
//
//        public AddressBuilder apartmentNumber(String apartmentNumber) {
//            this.apartmentNumber = apartmentNumber;
//            return this;
//        }
//
//        public AddressBuilder street(String street) {
//            this.street = street;
//            return this;
//        }
//
//        public Address build() {
//            Address address = new pl.kapelinski.mateusz.java.recap.app.bank.ui.model.AddressBuilder().setBuilder(this).createAddress();
//            return address;
//        }
//
//    }
}



// TODO: 06.05.2022
//Dla klasy adres zastosowac wzorzec Builder (GoF design patterns) - DONE