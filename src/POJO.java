public class POJO {
    private String name;
    private String company;
    private String salary;

    /*public POJO(String name, String company, String salary) {
        this.name = name;
        this.company = company;
        this.salary = salary;
    }*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "POJO{" +
                "name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }
}
