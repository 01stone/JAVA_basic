package pkg2;

//import pkg1.MyParent;

import pkg1.MyParent;

class MyChild extends pkg1.MyParent {
    public void printMembers() {
//        System.out.println(prv);  // error
//        System.out.println(dft);  // error
        System.out.println(prt);
        System.out.println(pub);
    }
}


public class MyParentTest2 {
    public static void main(String[] args) {
        MyParent p = new MyParent();

//        System.out.println(p.prv);  // error
//        System.out.println(p.dft);  // error
//        System.out.println(p.prt);  // error
        System.out.println(p.pub);
    }
}




