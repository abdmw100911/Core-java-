class Shop{
    public String buyPen(int payment){
        if(payment>=10){
            return "Pen";
        }
        return "give proper Payment";
    }
}
public class ObjectsAndClasses3 {
    public static void main(String[] args){
        Shop sh = new Shop();
        String str = sh.buyPen(10);
        System.out.println(str);
    }
}
