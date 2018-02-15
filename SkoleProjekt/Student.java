public class Student{

String name;
String phone;

//constructors
public Student(){

}
public Student(String name, String phone){
   this.name = name;
   this.phone = phone;
}
//printStudentInfo()
public void printInfo(){
   System.out.println("Student name: " + name);
   System.out.println("Student phone: " + phone);
   System.out.println();
} 

// change to private attributes
// setName method, setPhone definition
// printInfo method definition

// From RunSchoolExample:
// Call setName, setPhone method with appropriate values
// Call printInfo method.
}