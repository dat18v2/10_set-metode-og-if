public class Teacher{
String name;
String phone;

//constructors
public Teacher(){
}

public Teacher(String name, String phone){
   this.name = name;
   this.phone = phone;
}

//printTeacherInfo()
public void printInfo(){
   System.out.println("Teacher name: " + name);
   System.out.println("Teacher phone: " + phone);
   System.out.println();
}


}