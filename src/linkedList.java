import java.io.*;
import java.util.Scanner;

public class linkedList {
    public class node{
        item items ;
        node next ;
        String itemName ;
        String itemPrice ;
        String itemColors ;

        node(String itemName,String itemPrice,String itemColors){
            this.itemName=itemName;
            this.itemPrice=itemPrice;
            this.itemColors=itemColors;
        }
        node (item items){
            this.items = items;
            next =null;
        }
        String nodeDisplay(){
            return "itemName-"+itemName+"-itemPrice-"+itemPrice+"-itemColors-" +itemColors;
        }


        public void edit(String itemName,String itemPrice,String itemColors) {
            this.itemName=itemName;
            this.itemPrice=itemPrice;
            this.itemColors=itemColors;
            update();
        }
    }//item in the store


    node first ;
    int count ;
    Scanner input ;
    linkedList(){
        input = new Scanner(System.in);
    }
    boolean isEmpty(){
        return first==null;
    }
    void insertAtFront(String itemName,String itemPrice,String itemColors){
        node newNode = new node(itemName,itemPrice,itemColors);
        if(isEmpty()){
            first=newNode ;
            return;
        }
        newNode.next=first;
        first=newNode;
    }


    void load(){
        try {
            BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
            String line;
            while ((line = reader.readLine()) != null) {

                String parts[] = line.split("-");
                if (parts.length == 1) continue;
                // System.out.println(line);
                insertAtFront(parts[1], parts[3], parts[5]);
            }
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    void  display(){
        if(isEmpty()) {
            load();
        }


        node current = first ;
        while(current!=null){
            System.out.println(current.nodeDisplay()+" ");
            current=current.next;
        }
    }
    node checkIfDuplicate(node newNode){
        //to check if the item has been added before
        //node newNode = new node(itemName, itemPrice, itemColors);
        node current = first;
        while(current!=null){
            if(current.itemName.equalsIgnoreCase(newNode.itemName))
                current=current.next;
            return current ;
        }
        return null;

    }
    node search(node check){
        return checkIfDuplicate(check);
    }
    void delete(String itemName){
        node current = first;
        node prev = current;
        while(current!=null){
            if(current.itemName.equalsIgnoreCase(itemName))break ;
            prev = current;
            current=current.next;
        }
        if (current==first){
            first=first.next ;
            update();
            return ;
        }
        node temp =current.next ;
        prev.next=temp;
        update();
        return ;

    }

    void update(){
        // if we add or remove an item from the list
        // we use this method to update the txt Source file ie to save the list on the computer
        node current=first;
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
            while(current!=null){
                writer.write(current.nodeDisplay()+"\n");
                current=current.next;
            }
            writer.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }

    }

    void insert(String itemName,String itemPrice,String itemColors){
        node newNode = new node(itemName, itemPrice, itemColors);
        node dupilcate = checkIfDuplicate(newNode);
        if(dupilcate!=null){
            System.out.println("The item you entered is already in the store \n Do you want to edit it ?    0/1");
            int answer = input.nextInt();
            if(answer==1){
                String userInput[] = new String[3];
                String itemAttr[] = {"name","price","colors"};
                for (int i = 0; i <3 ; i++) {
                    System.out.println("Item "+itemAttr[i]+ ":");userInput[i]=input.next();
                }

                dupilcate.edit(userInput[0],userInput[1],userInput[2] );

            }
            return;
        }
        insertAtFront(itemName,itemPrice,itemColors);
        node current = first;

        update();



    }





}
