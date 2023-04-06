package LabWork;

//Main.java
public class Question3 {
 public static void main(String[] args) {
     Bank sbiBank = new SBIBank();
     Bank iciciBank = new ICICIBank();
     Bank axisBank = new AXISBank();

     System.out.println("Rate of Interest for SBI Bank: " + sbiBank.getRateOfInterest() + "%");
     System.out.println("Rate of Interest for ICICI Bank: " + iciciBank.getRateOfInterest() + "%");
     System.out.println("Rate of Interest for AXIS Bank: " + axisBank.getRateOfInterest() + "%");
 }
}


