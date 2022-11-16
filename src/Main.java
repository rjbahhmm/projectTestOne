
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String [] names={"John","carl","Jerry"};

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

        linkedList list = new linkedList();
        // to read item from a files
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
//        System.out.println("Do you want to add an item to your store      0/1");
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
//        linkedList.node current = list.first;
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



        binarySearchTree tree = new binarySearchTree("firstTree");
        tree.increasingOrderDisplay();

        //   System.out.println(tree.updateHelper(tree.root));

        //tree.increasingOrderDisplay();






    }
}