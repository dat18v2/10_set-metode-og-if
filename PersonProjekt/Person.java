public class Person{
   
   //personattributer
   private String navn;
   private int alder;
   private String telefon;
   
   //constructor
   public Person(){
      navn = "Jarl";
      alder = 117;
      telefon = "+1 555-1244-334";
   }
   //constructor med parametre
   public Person(String name, int age, String phone){
      this.navn = name;
      this.alder = age;
      this.telefon = phone;
   }
   
   //set metode
   public void setPerson(String name, int age, String phone){
      navn = name;
      alder = age;
      telefon = phone;
   }
   
   //get metode
   /* public String getPersonNavn(){
         kode...
      }*/
   
   //metode til udskrivning af Person
   public void printInfo(){
      System.out.println("Navn: " + navn);
      isTeacher();
      System.out.println("Alder: " + alder);
      // && logisk og - begge udtryk skal være sande
      if (13 <= alder && alder <= 19){
         System.out.println("Teenager");
      }
      System.out.println("Telefon: " + telefon);
      if (telefon !="xyz"){
         System.out.println("Er det et telefonnummer?");
      }
      System.out.println();
   }
   
   public void isTeacher(){
      //logisk or - den ene eller den anden skal være sand
      if (navn == "Jarl" || navn == "Claus"){
         System.out.println("lærer");
      }
      else{
         System.out.println("studerende");
      }
   }
   
}