public class School{

public static void main(String[] args){
//initialise student1
Student student1 = new Student("Kurt Cobain", "Heaven 42");
Teacher teacher1 = new Teacher("Claus Bove", "Teachers Office 117");

student1.printInfo();

//change attributes of student1
student1.phone = "Heaven nor Hell";

student1.printInfo();
teacher1.printInfo();
}
}