public class Patient {
    private String name;
    private String email;
    private String phoneNum;
    private String addy;
    private String city;
    private String state;
    private String symptom;
    private String daysWithSymptoms;
    private String description;

//    private String nameofContact;
//    private String emailOfContact;
//    private String phoneNumOfContact;
//    private String cityContact;
//    private String stateContact;
//    private int dayOfContact;
//    private int monthOfContact;
//    private int yearOfContact;
//
//    public String getNameofContact() {
//        return nameofContact;
//    }
//
//    public void setNameofContact(String nameofContact) {
//        this.nameofContact = nameofContact;
//    }
//
//    public String getEmailOfContact() {
//        return emailOfContact;
//    }
//
//    public void setEmailOfContact(String emailOfContact) {
//        this.emailOfContact = emailOfContact;
//    }
//
//    public String getPhoneNumOfContact() {
//        return phoneNumOfContact;
//    }
//
//    public void setPhoneNumOfContact(String phoneNumOfContact) {
//        this.phoneNumOfContact = phoneNumOfContact;
//    }
//
//    public int getDayOfContact() {
//        return dayOfContact;
//    }
//
//    public void setDayOfContact(int dayOfContact) {
//        this.dayOfContact = dayOfContact;
//    }
//
//    public int getMonthOfContact() {
//        return monthOfContact;
//    }
//
//    public void setMonthOfContact(int monthOfContact) {
//        this.monthOfContact = monthOfContact;
//    }
//
//    public int getYearOfContact() {
//        return yearOfContact;
//    }
//
//    public void setYearOfContact(int yearOfContact) {
//        this.yearOfContact = yearOfContact;
//    }
//
//    public String getCityContact() {
//        return cityContact;
//    }
//
//    public void setCityContact(String cityContact) {
//        this.cityContact = cityContact;
//    }
//
//    public String getStateContact() {
//        return stateContact;
//    }
//
//    public void setStateContact(String stateContact) {
//        this.stateContact = stateContact;
//    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getDaysWithSymptoms() {
        return daysWithSymptoms;
    }

    public void setDaysWithSymptoms(String daysWithSymptoms) {
        this.daysWithSymptoms = daysWithSymptoms;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public Patient(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getAddy() {
        return addy;
    }

    public void setAddy(String addy) {
        this.addy = addy;
    }

    public String getSymptom() {
        return symptom;
    }

    public void setSymptom(String symptom) {
        this.symptom = symptom;
    }

    public String toString(){
        String retval = "name: " + getName() + "\n" + "email address: " + getEmail()
                + "\n" + "phone number: " + getPhoneNum() + "\n" + "address: " + addy(city, state)
                + "\n" + symptomHistory(symptom, daysWithSymptoms,description);
        return retval;
    }

    public String addy(String city, String state){
        this.city = city;
        this.state = state;
        return "Address" + city + ", " + state;
    }

    public String symptomHistory(String symptom, String daysWithSymptoms, String description){
        this.symptom = symptom;
        this.daysWithSymptoms = daysWithSymptoms;
        this.description = description;
        return "name of a symptom: " + symptom + "\n" + "number of days with symptom: " + daysWithSymptoms
                + "\n" + "detail description: " + description;
    }

//    public String contactInfo(String nameofContact, String emailOfContact, String phoneNumOfContact, ){
//        this.nameofContact = nameofContact;
//        this.emailOfContact = emailOfContact;
//        this.phoneNumOfContact = phoneNumOfContact;
//        this.placeOfContact(cityContact, stateContact);
//        this.dateOfContact(dayOfContact, monthOfContact, yearOfContact);
//    }
//    public String Patient(String name, String email, String phoneNum){
//        this.name = name;
//        this.email = email;
//        this.phoneNum = phoneNum;
//        this.addy(city, state);
//        this.symptomHistory(symptom, daysWithSymptoms, description);
//        this.placeOfContact(cityContact, stateContact);
//        this.dateOfContact(dayOfContact, monthOfContact, yearOfContact);
//    }

//    public String placeOfContact(String cityContact, String stateContact){
//        this.cityContact = cityContact;
//        this.stateContact = stateContact;
//        return cityContact + ", " + stateContact;
//    }
//
//    public String dateOfContact(int dayOfContact, int monthOfContact, int yearOfContact){
//        this.dayOfContact = dayOfContact;
//        this.monthOfContact = monthOfContact;
//        this.yearOfContact = yearOfContact;
//        return "date of contact: " + dayOfContact + "/" + monthOfContact + "/" + yearOfContact;
//    }
}
