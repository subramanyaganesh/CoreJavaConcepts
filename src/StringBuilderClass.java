import java.util.Map;

public class StringBuilderClass {

    /*Note if -15 is written then after the text there is 15 spaces
     and if just 15 is written then first 15 spaces is given and then the text is written*/

    public static StringBuilder display(int number,String name,int age){
        StringBuilder consoleOutput=new StringBuilder();
        consoleOutput.append("_____________________________________________________________________________________\n");
        consoleOutput.append(String.format("|%-15s| |%-25s| |%-15s|","number","Name","age")+"\n");
        consoleOutput.append(String.format("|%-15s| |%-25s| |%-15s|",number,name,age));
        consoleOutput.append("\n_____________________________________________________________________________________");
        return consoleOutput;
    }
    /*
   when the data is present in some other class and we want to access it in a different class by invoking a function
   1. we need to store in in a data type which can hold it and the iterate it by the key set



   Note If we want an object to be in string form then we should do object.toString
        If we want the object to be in integer form then we should do object.hashCode
    */

    public static void main(String[] args) {
        int i=1;
        Map<String,Integer> da=dataForBuilder.data();
        for (String abc:da.keySet()){
            System.out.println(display(i,abc,da.get(abc)));
            i++;
        }
    }

}
