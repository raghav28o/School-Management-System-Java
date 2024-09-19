package school.management.system;
/*
This class records student data
 */
public class Student {

    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    public Student(int id, String name, int grade){
        this.feesPaid = 0;
        this.feesTotal = 30000;
        this.id = id;
        this.name = name;
        this.grade = grade;
    }
    // student id & name will  not alter

    public void setGrade(int grade){
        this.grade = grade;
    }

    /**
     *keep adding the fees to the fees paid
     * add the fees to the fees paid
     * school will receive funds
     * @param fees fees that the student pays
     */
    public void payFees(int fees){
        feesPaid += fees;
        School.updateTotalMoneyEarned(feesPaid);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getFeesTotal() {
        return feesTotal;
    }

    /**
     * returns the remaining fees
     * @return
     */
    public int getRemainingFees(){
        return feesTotal-feesPaid;
    }

    @Override
    public String toString() {
        return "Student's name :" +name+ "\n"+ " Total fees paid so far is $"+feesPaid;
    }
}
