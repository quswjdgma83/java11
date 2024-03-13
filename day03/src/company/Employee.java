package company;

public class Employee {
    private int id;
    private String idc;
    private String name; // 이름
    private long sal; // 급여

    static int num = 100;

    public Employee() {
        System.out.println("Default Constructor...");
        num++;
    }

    public Employee(int id) {
        this(id, "", "");
        this.sal = 10000L;
    }

    public Employee(String idc, String name, long sal) {
        this(num, idc, name, sal); // 이 줄을 생성자의 첫 줄로 옮기고, id 대신 num을 사용합니다.
    }


    public Employee(int id, String idc, String name) {
        this.id = id;
        this.idc = idc;
        this.name = name;
        this.sal = 100000L;
    }

    public Employee(int id, String idc, String name, long sal) {
        this.id = num++;
        this.idc = idc;
        this.name = name;
        if(sal <= 0) {
            //예외를 발생 한다.
        }
        this.sal = sal;
    }

    public int getId() {
        return id;
    }

    public String getIdc() {
        return idc;
    }

    public String getName() {
        return name;
    }

    public long getSal() {
        return sal;
    }

    // Methods, Operator
    public long getAnnSalary(){
        return sal * 12;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Employee{");
        sb.append("id=").append(id);
        sb.append(", idc='").append(idc).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", sal=").append(sal);
        sb.append('}');
        return sb.toString();
    }
}
