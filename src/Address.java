/**
 * Get user name
 * email
 * phone num
 * address
 * ask if they have symptoms
 * if yes as how many days
 * then
 * describe their symptoms
 * then ask if they have come in contact with someone
 * if yes
 * ask for contact name
 * ask for contact email address
 * ask for contact phone number
 * ask for contact address
 * ask for location of contact
 * ask for date of contact
 *
 * then print out patient information
 * the print out symptoms with duration
 * then print contact information
 * */





import java.net.ContentHandler;
import java.util.ArrayList;
import java.util.Scanner;

public class Address extends Contact {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        ArrayList<String> patientInfo = new ArrayList<>();
        ArrayList<String> contactInfo = new ArrayList<>();
        ArrayList<String> patientSymptoms = new ArrayList<>();
        ArrayList<String> daysSick = new ArrayList<>();
        ArrayList<String> sickness = new ArrayList<>();
        sickness.add("fever");
        sickness.add("cough");
        sickness.add("shortness of breath or difficulty breathing");
        sickness.add("tiredness");
        sickness.add("aches");
        sickness.add("chills");
        sickness.add("sore throat");
        sickness.add("loss of smell");
        sickness.add("loss of taste");
        sickness.add("headache");
        sickness.add("diarrhea");
        sickness.add("severe vomiting");

        System.out.println("Welcome to the hospital!");
        Patient admitOne = new Patient();

        System.out.println("What is your name?");
        admitOne.setName(keyboard.nextLine());
        patientInfo.add(admitOne.getName()); //Adding user name to array

        System.out.println("What is your email address?");
        admitOne.setEmail(keyboard.nextLine());
        patientInfo.add(admitOne.getEmail()); //Adding user email to array

        System.out.println("What is your phone number");
        admitOne.setPhoneNum(keyboard.nextLine());
        patientInfo.add(admitOne.getPhoneNum()); //Adding phone num to array

        System.out.println("What is the city you are in?");
        admitOne.setCity(keyboard.nextLine());
        patientInfo.add(admitOne.getCity()); //Add city to array

        System.out.println("What is the state you are in?");
        admitOne.setState(keyboard.nextLine());
        patientInfo.add(admitOne.getState()); //add to Array

        System.out.println("Which of these symptoms are you experiencing?");
        for (int i = 0; i < sickness.size(); i++) {
            System.out.println("Are you experiencing " + sickness.get(i) + "?");
            String restriction = keyboard.nextLine();
            if (restriction.equalsIgnoreCase("y")) {
                patientSymptoms.add(sickness.get(i));
                System.out.println("How many days have you been experiencing this symptom?");
                admitOne.setDaysWithSymptoms(keyboard.nextLine());
                daysSick.add(admitOne.getDaysWithSymptoms());
                System.out.println("Days for symptoms " + admitOne.getDaysWithSymptoms());
                patientInfo.add(admitOne.getDaysWithSymptoms());
            }
        }

        System.out.println("Please give a description of your symptoms");
        admitOne.setDescription(keyboard.nextLine());
        patientInfo.add(admitOne.getDescription());

        System.out.println("Have you come in contact with anyone?");
        String hasContact = keyboard.nextLine();
        if (hasContact.equalsIgnoreCase("y")) {
            Contact infected = new Contact();
            System.out.println("Enter the name of the contacted person");
            infected.setNameOfContact(keyboard.nextLine());
            contactInfo.add(infected.getNameOfContact());//Add contact name to Array

            System.out.println("Please enter the email address of the contacted person");
            infected.setEmailOfContact(keyboard.nextLine());
            contactInfo.add(infected.getEmailOfContact());

            System.out.println("Please enter the phone number of the contacted person");
            infected.setPhoneNumOfContact(keyboard.nextLine());
            contactInfo.add(infected.getPhoneNumOfContact());

            System.out.println("Please enter the city of the contacted person");
            infected.setCityContact(keyboard.nextLine());
            contactInfo.add(infected.getCityContact());

            System.out.println("Please enter the state of the contacted person");
            infected.setStateContact(keyboard.nextLine());
            contactInfo.add(infected.getStateContact());

            System.out.println("Please enter where you and the contacts met");
            infected.setPlaceOfContact(keyboard.nextLine());
            contactInfo.add(infected.getPlaceOfContact());

            System.out.println("Please enter the day you and the contacts met");
            infected.setDayOfContact(keyboard.nextLine());
            contactInfo.add(infected.getDayOfContact());

            System.out.println("Please enter the month you and the contacts met");
            infected.setMonthOfContact(keyboard.nextLine());
            contactInfo.add(infected.getMonthOfContact());

            System.out.println("Please enter where you and the contacts met");
            infected.setYearOfContact(keyboard.nextLine());
            contactInfo.add(infected.getYearOfContact());


            System.out.println("************Contract Tracing Report**************");
            System.out.println("Name: " + admitOne.getName());
            System.out.println("Phone: " + admitOne.getPhoneNum());
            System.out.println("Email: " + admitOne.getEmail());
            System.out.println("City: " + admitOne.getCity());
            System.out.println("State: " + admitOne.getState());
            System.out.println();
            System.out.println();
            System.out.println("************Symptoms****************");
            for (int j = 0; j < patientSymptoms.size(); j++) {
                for (int k = 0; k < daysSick.size(); k++) {
                    System.out.println("Patient was sick with " + patientSymptoms.get(j) + "for " + daysSick.get(k)
                            + " days");
                }
            }
            System.out.println();
            System.out.println();
            System.out.println("**************Contacts*************");
            System.out.println("Name is: " + infected.getNameOfContact());
            System.out.println("Phone: " + infected.getPhoneNumOfContact());
            System.out.println("Email: " + infected.getEmailOfContact());
            System.out.println("City: " + infected.getCityContact());
            System.out.println("State: " + infected.getStateContact());
            System.out.println("Location of contact: " + infected.getStateContact());
            System.out.println("Date of contact " + infected.getDayOfContact() + "/" + infected.getMonthOfContact() + "/" + infected.getYearOfContact());

        } else {
            System.out.println("****************Contract Tracing Report**************");
            System.out.println("Name: " + admitOne.getName());
            System.out.println("Phone: " + admitOne.getPhoneNum());
            System.out.println("Email: " + admitOne.getEmail());
            System.out.println("City: " + admitOne.getCity());
            System.out.println("State: " + admitOne.getState());

            for (int j = 0; j < patientSymptoms.size(); j++) {
                for (int k = 0; k < daysSick.size(); k++) {
                    System.out.println("Patient was sick with " + patientSymptoms.get(j) + "for " + daysSick.get(k)
                            + " days");
                    j++;
                    k++;
                }
            }
        }
    }
}
