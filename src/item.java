public class item {

    String itemName ;
    String itemPrice ;
    String itemColors ;
    item(){

    }
    item(String name,String price,String colors){
        itemName=name ;
        itemPrice=price;
        itemColors=colors;
    }

    @Override
    public String toString(){
        return "itemName-"+itemName+"-itemPrice-"+itemPrice+"-itemColors-"+itemColors;
    }

}