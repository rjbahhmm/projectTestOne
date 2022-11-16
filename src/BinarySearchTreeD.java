import java.io.*;
import java.util.Arrays;

public class BinarySearchTreeD {
    treeNode nodes[];
    String sourceFile;
    int count;

    public BinarySearchTreeD(String sourceFile, int max_size)
    {
        this.sourceFile =sourceFile;
        nodes = new treeNode[max_size];
        count = 0;
    }

    boolean isEmpty(){
        return count==0;
    }

    void insert(String n,String p , String c){
        insertRecursive(n,p,c,0);
    }

    void insertRecursive(String n,String p , String c, int index){
        if(index+2>=nodes.length) increaseSize();
        if(count==0){
            nodes[0]=new treeNode(n,p,c);
            count++;
        }
        else{
            if(Float.parseFloat(p)<Float.parseFloat(nodes[index].itemPrice)&&nodes[(index*2)+1]==null){
                nodes[(index*2)+1]=new treeNode(n,p,c); //insert left node
                count++;
            }
            else if(Float.parseFloat(p)<Float.parseFloat(nodes[index].itemPrice)&&nodes[(index*2)+1]!=null){
                insertRecursive(n,p,c,(index*2)+1); //move to the left
            }
            else if(Float.parseFloat(p)>Float.parseFloat(nodes[index].itemPrice)&&nodes[(index*2)+2]==null){
                nodes[(index*2)+2]=new treeNode(n,p,c); //insert right node
                count++;
            }
            else if(Float.parseFloat(p)>Float.parseFloat(nodes[index].itemPrice)&&nodes[(index*2)+2]!=null){
                insertRecursive(n,p,c,(index*2)+2); //move to the right
            }
            else;//if the value is duplicated
        }
    }

    private void increaseSize() {
        treeNode[] temp = new treeNode[nodes.length * 2];
        for(int i = 0 ; i < nodes.length ; i++)
            temp[i] = nodes[i];
        nodes = temp;
    }

    int countNode(int index) {
        if (count == 0)
            return 0;
        return 1 + countNode((index * 2) + 1) + countNode((index * 2) + 2);
    }

    String  updateHelper(int index){
        if(!isEmpty()){
            return nodes[index].toString();//+"\n"+updateHelper(root.left)+"\n"+updateHelper(root.right);
        }

        return "";
    }

    String arrayHelper(int index){
        if(!isEmpty())
            return nodes[index].toString()+"~"+arrayHelper((index*2)+1)+"~"+arrayHelper((index*2)+2);
        return "";
    }

    void update(){
        // if we add or remove an item from the list
        // we use this method to update the txt Source file ie to save the list on the computer

        String source  = sourceFile+".txt";
        String data []= arrayHelper(0).split("~");
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


    void load(){
        try {
            BufferedReader reader = new BufferedReader(new FileReader(sourceFile+".txt"));
            String line;
            while ((line = reader.readLine()) != null) {

                String parts[] = line.split("-");
                if (parts.length == 1) continue;
                // System.out.println(line);
                insert(parts[1], parts[3], parts[5]);
            }
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void decreasingOrderDisplay(){
        load();
        decreasingOrderDisplayRecursive(0);
    }
    void decreasingOrderDisplayRecursive(int index){
        //right root left
        if(!isEmpty()){
            decreasingOrderDisplayRecursive((index*2)+2);
            System.out.println(nodes[index].toString() + " ");
            decreasingOrderDisplayRecursive((index*2)+1);
        }
    }

    @Override
    public String toString() {
        return "BinarySearchTreeD{" +
                "nodes=" + Arrays.toString(nodes) +
                ", sourceFile='" + sourceFile + '\'' +
                ", count=" + count +
                '}';
    }
}
