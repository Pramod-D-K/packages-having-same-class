import p1.*;


public class Main {
    public static void main(String args[]){
        A obj1 = new A();
        System.out.println(obj1.a);
        A.B obj2 = obj1.new B();
        A.B.C obj3 = obj2.new C();

        p2.A obj4 = new p2.A();
        System.out.println(obj4.a);
        p2.A.B obj5 = obj4.new B();
        p2.A.B.C obj6 = obj5.new C();

    }
}
