public class Contact extends Patient{
    private String nameOfContact;
    private String emailOfContact;
    private String phoneNumOfContact;
    private String cityContact;
    private String stateContact;
    private String placeOfContact;
    private String dayOfContact;
    private String monthOfContact;
    private String yearOfContact;

    public String getPlaceOfContact() {
        return placeOfContact;
    }

    public void setPlaceOfContact(String placeOfContact) {
        this.placeOfContact = placeOfContact;
    }

    public String getNameOfContact() {
        return nameOfContact;
    }

    public void setNameOfContact(String nameOfContact) {
        this.nameOfContact = nameOfContact;
    }

    public String getEmailOfContact() {
        return emailOfContact;
    }

    public void setEmailOfContact(String emailOfContact) {
        this.emailOfContact = emailOfContact;
    }

    public String getPhoneNumOfContact() {
        return phoneNumOfContact;
    }

    public void setPhoneNumOfContact(String phoneNumOfContact) {
        this.phoneNumOfContact = phoneNumOfContact;
    }

    public String getDayOfContact() {
        return dayOfContact;
    }

    public void setDayOfContact(String dayOfContact) {
        this.dayOfContact = dayOfContact;
    }

    public String getMonthOfContact() {
        return monthOfContact;
    }

    public void setMonthOfContact(String monthOfContact) {
        this.monthOfContact = monthOfContact;
    }

    public String getYearOfContact() {
        return yearOfContact;
    }

    public void setYearOfContact(String yearOfContact) {
        this.yearOfContact = yearOfContact;
    }

    public String getCityContact() {
        return cityContact;
    }

    public void setCityContact(String cityContact) {
        this.cityContact = cityContact;
    }

    public String getStateContact() {
        return stateContact;
    }

    public void setStateContact(String stateContact) {
        this.stateContact = stateContact;
    }

    public Contact() {
    }

    public Contact(String nameOfContact, String emailOfContact, String phoneNumOfContact){
        this.nameOfContact = nameOfContact;
        this.emailOfContact = emailOfContact;
        this.phoneNumOfContact = phoneNumOfContact;
    }

//    public String contactInfo(String nameOfContact, String emailOfContact, String phoneNumOfContact,){
//        this.nameOfContact = nameOfContact;
//        this.emailOfContact = emailOfContact;
//        this.phoneNumOfContact = phoneNumOfContact;
//        this.placeOfContact(cityContact, stateContact);
//        this.dateOfContact(dayOfContact, monthOfContact, yearOfContact);
//        return "";
//    }
    public String placeOfContact(String cityContact, String stateContact){
        this.cityContact = cityContact;
        this.stateContact = stateContact;
        return cityContact + ", " + stateContact;
    }

//    public String dateOfContact(int dayOfContact, int monthOfContact, int yearOfContact){
//        this.dayOfContact = dayOfContact;
//        this.monthOfContact = monthOfContact;
//        this.yearOfContact = yearOfContact;
//        return "date of contact: " + dayOfContact + "/" + monthOfContact + "/" + yearOfContact;
//    }

    protected String dateOfContact(String dayOfContact, String monthOfContact, String yearOfContact) {
        this.dayOfContact = dayOfContact;
        this.monthOfContact = monthOfContact;
        this.yearOfContact = yearOfContact;
        return "date of contact: " + dayOfContact + "/" + monthOfContact + "/" + yearOfContact;
    }
}
