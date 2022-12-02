
import myDataStructure.*;

import java.io.Console;
import java.io.IOException;
import java.io.InputStream;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {


    //idea store in 1980s

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static void main(String[] args) throws InterruptedException, NoSuchAlgorithmException, IOException {
// WHATS wroking right now

        // login system for customers
        // #1 if the user says he is new he can register
        // #2 if the user is old we can check if he exist in the system
        // if he does exist we check his password
        // #3 if he doesnt exist we give him the option to register
        // runTest1 run = new runTest1();
        //binarySearchTree store = new binarySearchTree("store");
        //store.quantityDisplay();
//        binarySearchTree store = new binarySearchTree("store");
//
//
//
//        store.customerDisplay();
//        char  c = '2';
//        int  d = c ;
//        System.out.println(d);




        runTest1 run = new runTest1();


//            ArrayList<item> g = new ArrayList<>();
//            binarySearchTree t = new binarySearchTree("store");
//            t.load();
////            t.customerDisplay();
//            binarySearchTree.treeNode current = t.root;
//            g.add(current);
//            g.add(current.left);
//            g.add(current.right);
//            order o = new order(new customer("user","as"),g,"abu samra");
//            order o2 =  new order(new customer("usertwo","as"),g,"abu samra");
//            order o3 =  new order(new customer("userthree","as"),g,"abu samra");
//            priorityQueue q = new priorityQueue();
//
//            q.enQueue(o);
//            q.enQueueWithP(o2);
//            q.enQueueWithP(o3);
//
//            q.display();


//        for (int i = 0; i < order.length ; i++) {
//            System.out.println(order[i]);
//        }

//        try{
//            int t = Integer.valueOf(test);
//        }catch (Exception e){
//
//        }
//
//
//        System.out.println(t);

        //System.out.println(store.root.itemColors);
//        binarySearchTree store = new binarySearchTree("store");
////      store.insert("255255255","34.99","Bright White",12);
////      store.insert("250235215","29.99","Antique White",11);
////      store.insert("225198153","44.99","Beige",7);
////      store.insert("135206235","39.99","Light Blue",4);
////      store.insert("159160164","34.99","Pale Grey",20);
//        store.increasingOrderDisplay();

        // linkedList l = new linkedList("customersList");

     //   l.delete("userTwo");
    //    l.insertByUser();


        // work in progress
        // admin login system
        // giving the admin an interface to edit the content of his store
        // we need a shopping list object for the customer to be able so buy stuff
        // we need a priority queue to show the admin what he has to dilver
        // i will turn the stack class into priority queue as the stack class is now useless
        // a homepage for the customer to be able to browse // buy items // subscribe for the "plus feature "
        // and thats it

        //binarySearchTree b = new binarySearchTree("store");

        // b.insert("255255255","2","Bright White",50);
//        boolean test  = b.ifNodeExits("Bright White");
//
//        System.out.println(test);

//     myPassWord12$









      //  linkedList list = new linkedList("firstList");
      //  list.insert("userOne","passWord");
      //  linkedList.node temp = list.checkIfDuplicate(list.first);list.display();


        //System.out.println(list.checkIfDuplicate(temp).data.passWord);
   //     String newLine = "itemName-\"HandBag\"-itemPrice-\"29.99$\"-itemColors-\"Red,Blue,Green\"-.";
   //     String newParts [] =newLine.split("-");
        //    System.out.println("name"+newParts[1]+"price"+newParts[3]+"colors"+newParts[5]);

        //to write into a files
//        try {
//
//
//            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
//
//
//            for(String name: names){
//                writer.write("\n"+name);
//            }
//
//            writer.close();
//        }
//        catch(IOException e){
//            e.printStackTrace();
//        }

       // myDataStructure.linkedList list = new myDataStructure.linkedList();
        // to read myDataStructure.item from a files
//        try {
//            BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
//           String line ;
//           while((line= reader.readLine())!=null){
//           String parts [] =line.split("-");
//              // System.out.println(line);
//           list.insertAtFront(parts[1],parts[3],parts[5]);
//           }
//            reader.close();
//
//        }
//        catch(IOException e){
//            e.printStackTrace();
//        }
     //  String test =  list.first.nodeDisplay();
    //    System.out.println(test);
        //list.insert("HandBag","29.99$","Red,White");
       // list.insert("HandBag","29.99$","Red,White");
        //list.insert("HandBag","29.99$","Red,White");

//        System.out.println(list.isEmpty());
//        list.display();
//        System.out.println(list.isEmpty());
//        System.out.println("Do you want to add an myDataStructure.item to your store      0/1");
//        Scanner input = new Scanner(System.in);
//        int answer = input.nextInt();
//        if(answer==1){
//            String userInput[] = new String[3];
//            String itemAttr[] = {"name","price","colors"};
//            for (int i = 0; i <3 ; i++) {
//                    System.out.println("Item "+itemAttr[i]+ ":");userInput[i]=input.next();
//            }
//            list.insert(userInput[0],userInput[1],userInput[2] );
//        }
//        list.delete("ring");
//        System.out.println("Contents of the list");
//        myDataStructure.linkedList.node current = list.first;
//        while(current!=null){
//            System.out.println(current.nodeDisplay(
//
//            ));
//            current=current.next ;
//        }
//        System.out.println("Content of the list end");

     //   list.display();



        //     39
        //   29     50
        //             100



//            myDataStructure.binarySearchTree tree = new myDataStructure.binarySearchTree("firstTree");
//            tree.increasingOrderDisplay();

     //   System.out.println(tree.updateHelper(tree.root));

        //tree.increasingOrderDisplay();
//
//
//        // Create the console object
//        Console cnsl = System.console();
//
//        if (cnsl == null) {
//            System.out.println(
//                    "No console available");
//            return;
//        }
//
//        // Read line
//        String str = cnsl.readLine(
//                "Enter username : ");
//
//        // Print username
//        System.out.println(
//                "Username : " + str);
//
//        // Read password
//        // into character array
//        char[] ch = cnsl.readPassword(
//                "Enter password : ");
//
//        // Print password
//        System.out.println(
//                "Password : " + ch);


//        binarySearchTree tree =new binarySearchTree("MenClothes");
//
////        tree.insert("test9","350","colors");
//       tree.increasingOrderDisplay();
        //tree.load();
        //  tree.load();
               // tree.load();
                //tree.delete();
             //   tree.insert("itemThree","100","colors");

            //    tree.insert("test1","123","colors");

      //  System.out.println(tree.ifNodeExits("test5"));




      //  System.out.println(tree.size());
      //  System.out.println(tree.root.itemName);
//        boolean  arr [] = new boolean[tree.size()];
//        String arrHelper = tree.duplicateArrayHelper(tree.root,"test8");
//        String arrHelperArray[] = arrHelper.split("~");
//        int count =0;
//        for (int i = 0; i < arrHelperArray.length; i++) {
//            if(arrHelperArray[i].equalsIgnoreCase(""))continue;
//            if(arrHelperArray[i].equalsIgnoreCase("false"))arr[count++]=false;
//            if(arrHelperArray[i].equalsIgnoreCase("true"))arr[count++]=true;
//        }
//        for (int i = 0; i < arr.length ; i++) {
//            System.out.println(arr[i]);
//        }




        //tree.checkDuplicate("test8");


      //  tree.increasingOrderDisplay();
      //  tree.insert("test5","250","colors");
       // tree.increasingOrderDisplay();


//
//        String data [] = tree.arrayHelper(tree.root).split("~");
//        for (int i = 0; i < data.length ; i++) {
//            System.out.println(i+" "+data[i]);
//        }


//        String test[] = new String[4];
//        int count=0;
//        for (int i = 0; i < data.length ; i++) {
//            if(data[i].equalsIgnoreCase(""))continue;
//            test[count++]=data[i];
//        }
//        System.out.println("TEST");
//        for (int i = 0; i < test.length ; i++) {
//            System.out.println(i+" "+test[i]);
//        }
//        tree.insert("test","12","color");
//        tree.increasingOrderDisplayHelper(tree.root);
      //  tree.insert("test10","250","color");
      //   tree.increasingOrderDisplay();
      //    tree.insertItem("test4","200","color");
      //   tree.insertItem("test","150","color");
        // tree.increasingOrderDisplay();
       // tree.insertItem("test5","300","colors");

        // tree.insertItem("test5","100","color");



        //




    }

    public static int asciiValue(String s ){
        int result = 0 ;
        char arr [] = s.toCharArray();
        for (int i = 0; i < arr.length ; i++) {
            result += (int)arr[i];
        }
        return result ;
    }

}