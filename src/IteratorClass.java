import java.util.*;

public class IteratorClass {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1, "abc");
        map1.put(2, "sdf");
        map1.put(5, "wsde");
        map1.put(3, "fg");
        map1.put(4, "wsaergde");
        map1.put(10, "sdfg");
        map1.put(8, "erh");
        map1.put(9, "wserwgde");
        map1.put(7, "wertghsde");
        map1.put(6, "werfhsde");

        Iterator iterator1 = map1.keySet().iterator();/*for maps we need some thing that can be taken one after the other
                                                            this can be done if we take the keyset and then iterate it*/
        Object ab;
        while (iterator1.hasNext()) {
            ab = iterator1.next();
            System.out.println(ab+" " +map1.get(ab));
        }
        System.out.println("====================================================================================");
        for (int i:map1.keySet()){
            System.out.println(i+" "+map1.get(i));
        }







        List<String> map=new ArrayList<>();
        map.add("abc");
        map.add("sdf");
        map.add("wsde");
        map.add("fg");
        map.add("wsaergde");
        map.add("sdfg");
        map.add("erh");
        map.add("wserwgde");
        map.add("wertghsde");
        map.add("werfhsde");
        Iterator iterator=map.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}
