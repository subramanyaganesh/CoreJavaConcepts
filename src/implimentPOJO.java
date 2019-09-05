public class implimentPOJO {

    public static void main(String[] args) {
        System.out.println(abc.function());
    }
}

class abc {
    static POJO function() {
        //POJO pojo=new POJO("abc","abc","abc");
        POJO pojo=new POJO();
        System.out.println(pojo.getCompany());
        System.out.println(pojo.getName());
        System.out.println(pojo.getSalary());
        pojo.setCompany("Servicenow");
        pojo.setName("hero");
        pojo.setSalary("123456");
        return pojo;


    }


}
