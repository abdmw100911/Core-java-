class Smartphone{
        String model = "11111";
        String color;
        
        public void makeCall(String name){
            System.out.println("calling "+name+" from my "+model);
        }
    }
public class ObjectsAndClasses1 {
    public static void main(String[] args){
        System.out.println("Hello");
        //creating 1stobject for class Smartphone

        Smartphone abdullahsPhone = new Smartphone();
        abdullahsPhone.model = "Iphone 15";
        abdullahsPhone.color = "black";

        abdullahsPhone.makeCall("abba");

        Smartphone husainsPhone = new Smartphone();
        husainsPhone.model = "iphone16";
        husainsPhone.color = "white";

        husainsPhone.makeCall("mummy");
    }
}
