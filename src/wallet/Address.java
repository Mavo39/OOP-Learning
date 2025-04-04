package wallet;

class Address {
    private String address;
    private String city;
    private String country;

    public Address(String address, String city, String country){
        this.address = address;
        this.city = city;
        this.country = country;
    }

    @Override
    public String toString(){
        return this.address + " ," + this.city + " " + this.country;
    }
}