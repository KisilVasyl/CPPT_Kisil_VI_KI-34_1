package ki_304.Kisil.Lab6;

public class BoxDriver {
public static void main(String[] args)
 {
Box <? super IObj> myBox = new Box <IObj>();


myBox.AddData(new Notebook("Weekend" , 32568741));
myBox.clear();
myBox.AddData(new Notebook("People" , 2547814));
myBox.AddData(new Book("Windows", 0, 852124325));
myBox.AddData(new Book("JRE" , 0, 67894257));
IObj res = myBox.findMin();
System.out.print("The smallest object in Box is: \n");
res.print();
System.out.print("The list of objects in Box: \n");
myBox.printContent();
System.out.print("The list of objects in Box: \n");
myBox.sortSize();
myBox.printContent();
}
}
