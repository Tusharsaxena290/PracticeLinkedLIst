package Main;

import Definition.LinkedLIst;

public class Execution {
    public static void main(String[] args) {
        LinkedLIst<String>list=new LinkedLIst<>();
        list.addFirst("ram");


        list.addFirst("Shyam");
        list.addFirst("haram");
        System.out.println(list.toString());
        list.add(2,"hey");
        System.out.println(list.toString());



    }
}
