public class PassByRef_PassByVal {


    public static void main(String[] args) {

        Balloon red = new Balloon("Red"); //memory reference 50
        Balloon blue = new Balloon("Blue"); //memory reference 100

        swap(red, blue);
        System.out.println("red color=" + red.getColor());
        System.out.println("blue color=" + blue.getColor());
//--------------------------------------------------------------------------------
        foo(blue);
        System.out.println("blue color=" + blue.getColor());

    }

    private static void foo(Balloon balloon) { //baloon=100
        balloon.setColor("Red"); //baloon=100
        balloon = new Balloon("Green"); //baloon=200
        balloon.setColor("Blue"); //baloon = 200
    }

    //Generic swap method
    public static void swap(Object o1, Object o2) {
        Object temp = o1;
        o1 = o2;
        o2 = temp;
    }
    //-----------------------------------------------------------------------------------
    /* System.out.println();
            System.out.println(foo(blue).getColor());
            System.out.println("blue color="+blue.getColor());


        }

        private static Balloon foo(Balloon balloon) { //baloon=100
            balloon.setColor("Red"); //baloon=100
            balloon = new Balloon("Green"); //baloon=200
            balloon.setColor("Blue"); //baloon = 200
            return balloon;
        }

        //Generic swap method
        public static void swap(Balloon o1, Balloon o2){
            String temp = o1.getColor();
            o1.setColor(o2.getColor());
            o2.setColor(temp);
        }*/
}

class Balloon {

    private String color;

    public Balloon() {
    }

    public Balloon(String c) {
        this.color = c;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
