public class OOPs01 {
    public static void main(String[] args) {
        Pen p1= new Pen();
        p1.setColor("Red");
        System.out.println(p1.color);

        p1.setThick(6);
        System.out.println(p1.thick);

        //p1.setColor("blue");
        p1.color="blue";
        System.out.println(p1.color);
    }
    
}

class Pen {
    String color;
    int thick;
   void setColor(String newColor){
    color = newColor;
   }
   void setThick(int newThick){
    thick = newThick;
   }
}
class Student{
    String name;
    int age;
    float parcentage;

    void calcParcentage(int phy, int chem, int math){
        parcentage = (phy + chem + math) /3;
    }
}