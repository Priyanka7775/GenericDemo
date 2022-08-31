public class Student <T,S>{
   private T rollNo;
   private S name;

    public void  setRollNo(T rollNo){
        this.rollNo=rollNo;
    }
    public T getRollNo(){
        return rollNo;
    }

    public S getName() {
        return name;
    }

    public void setName(S name) {
        this.name = name;
    }

    public Student(T rollNo, S name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    public Student(){

    }


}
