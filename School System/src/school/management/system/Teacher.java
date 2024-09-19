package school.management.system;

/**
 * records of teachers
 */
public class Teacher {
    private int id;
    private String name;
    private int salary;

    private int salaryEarned;

    /**
     * creates a new teacher object
     * @param id id of teacher
     * @param name name of teacher
     * @param salary salary of teacher
     */
    public Teacher(int id, String name, int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.salaryEarned = 0;
    }

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getSalary(){
        return salary;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }

    /**
     * adds salary
     * remove from total money earned by ghs
     * @param salary
     */
    public void receiveSalary(int salary){
        salaryEarned += salary;
        School.updateTotalMoneySpent(salary);
    }

    @Override
    public String toString() {
        return "Name of the teacher :" + name+ "\n" + "Total salary earned so far is "+ salaryEarned;
    }
}
