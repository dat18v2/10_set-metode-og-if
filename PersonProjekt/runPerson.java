public class runPerson{
   
   public static void main(String[] args){
   
   //lav person
   Person person1 = new Person();
   
   //udskriv person
   person1.printInfo();
   
   //ændr person
   //person1.navn = "Daniel";
   person1.setPerson("Daniel", 22,"12345566");
   
   //udskriv person
   person1.printInfo();
   
   }
}