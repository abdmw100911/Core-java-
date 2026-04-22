class Calculator1{
    //method overloading:
    //Same method name with different number of parameters or different datatype of parameters
    public int add(int n1, int n2){
        return n1 + n2;
    }

    //different number of parameters
    public int add(int n1, int n2, int n3){
        return n1+n2+n3;
    }

    //different datatype of parameters
    public double add(double n1, double n2){
        return n1+n2;
    }
}
public class MethodOverloading {
    public static void main(String[] args){
        Calculator1 calc = new Calculator1    ();
        //to add 2 numbers
        System.out.println(calc.add(1,2));

        //to add 3 numbers
        System.out.println(calc.add(1,2,3));

        //to add decimal point values
        System.out.println(calc.add(1.1,2.2));
    }
}
