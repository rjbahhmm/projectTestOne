import java.io.*;

public class binarySearchTree {
    //option to display according to price
    //to be able to display the categories based on price ascending
    //descending easily
    //other option  is to display randomly
    //idea we give a random integer as an attribute to each node
    //then we display them according to those ints

    public class treeNode extends item  {
        treeNode left;
        treeNode right ;
        treeNode(String itemName,String itemPrice,String itemColors){
            this.itemName=itemName;
            this.itemPrice=itemPrice;
            this.itemColors=itemColors;
        }

//test changes
    }
    treeNode root ;
    String sourceFile;


    binarySearchTree(String sourceFile){
        this.sourceFile =sourceFile;
        root=null;
    }
    boolean isEmpty(){
        return root==null;
    }
    treeNode insertHelper(treeNode root,String n,String p , String c){

        if(root==null){root = new treeNode(n,p,c);
            return root ;}
        if(Float.parseFloat(p)<Float.parseFloat(root.itemPrice)){
            root.left=insertHelper(root.left,n,p,c);
        }
        if(Float.parseFloat(p)>Float.parseFloat(root.itemPrice)){
            root.right=insertHelper(root.right, n, p, c);
        }
        return root ;


    }

    void insertItem(String n,String p,String c){
        root=insertHelper(root,n,p,c);
        update();
    }

    void increasingOrderDisplay(){
        load();
        increasingOrderDisplayHelper(root);
    }
    void increasingOrderDisplayHelper(treeNode root){

        //PreOrder Traversal = Root Left Right
        if(root!=null){
            increasingOrderDisplayHelper(root.left);
            System.out.println(root.toString() + " ");
            increasingOrderDisplayHelper(root.right);

        }
    }
    String  updateHelper(treeNode root){
        if(root!=null){
            return root.toString();//+"\n"+updateHelper(root.left)+"\n"+updateHelper(root.right);
        }

        return "";
    }

    String arrayHelper(treeNode root){
        if(root!=null)
            return root.toString()+"~"+arrayHelper(root.left)+"~"+arrayHelper(root.right);
        return "";
    }



    void load(){
        try {
            BufferedReader reader = new BufferedReader(new FileReader(sourceFile+".txt"));
            String line;
            while ((line = reader.readLine()) != null) {

                String parts[] = line.split("-");
                if (parts.length == 1) continue;
                // System.out.println(line);
                insertItem(parts[1], parts[3], parts[5]);
            }
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void update(){
        // if we add or remove an item from the list
        // we use this method to update the txt Source file ie to save the list on the computer

        String source  = sourceFile+".txt";
        String data []= arrayHelper(root).split("~");
//        for (int i = 0; i <data.length ; i++) {
//            System.out.println(data[i]);
//        }

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(source));
            for (int i = 0; i <data.length ; i++) {
                if(data[i].equalsIgnoreCase(""))continue;
                writer.write(data[i]+"\n");
            }

            writer.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }

    }





    int countNode(treeNode root){

        if(root==null)return 0 ;
        //we need to traverse left and right of each node




        return 1 + countNode(root.left) + countNode(root.right);
    }




}

