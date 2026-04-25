package oopsConcepts;
class Student{
    int rollNo;
    String name;
    int marks;
}
public class ArrayOfObject5 {
    public static void main(String[] args){
        
        //creating an object for Student 
        Student s1 = new Student();
        s1.rollNo = 29;
        s1.name = "Abdullah";
        s1.marks = 88;

        Student s2 = new Student();
        s2.rollNo = 23;
        s2.name = "Nigesh";
        s2.marks = 18;

        Student s3 = new Student();
        s3.rollNo = 43;
        s3.name = "Husain";
        s3.marks = 98;

        //int arr[] = new int[5];
        //this is how array is created for int

        //Creating an array to store these objects 
        Student[] studentArray = new Student[3];

        //storing the objects(references to the objects) inside the array 
        studentArray[0] = s1;
        studentArray[1] = s2;
        studentArray[2] = s3;

        //accessing the properties of the objects stored in the array 
        System.out.println(studentArray[0].name+", "+studentArray[0].rollNo+", "+studentArray[0].marks);

        //printing each student name and roll no
        /*
        for(int i=0;i<students.length;i++){
            System.out.println(studentArray[i].name +" : "+studentArray[i].marks);
        }
        */

        //Enhanced for loop to iterate array 
        for(Student students : studentArray){
            System.out.println(students.name+" -> "+students.marks);
        }

        //it stores each object of the array inside "students" and then we can perform any operation with it 
        //also called as the forEach loop

           
    }
}
