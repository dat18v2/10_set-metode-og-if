public class Student{

String name;
String phone;
int age;

//constructors
public Student(){

}
public Student(String name, String phone, int age){
   this.name = name;
   this.phone = phone;
   this.age = age;
}
//printStudentInfo()
public void printInfo(){
   System.out.println("Student name: " + name);
   System.out.println("Student phone: " + phone);
   System.out.println("Student age: " + age);
   System.out.println();
} 

/* set exercise
change to private attributes
setName method, setPhone definition
printInfo method definition

From School:
Call setName, setPhone method with appropriate values
Call printInfo method
*/

/* if exercise
make method to test if older than 18
make test for ranges of age (limited SU, full SU, retirement aid)
if (...){
}
else if (...){
}
else{
}

From School:
test if name is Claus (equals method)
use age test
combine age test with test on name
*/

}