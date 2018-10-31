package Task_05;

public class Task {

    private Priority Priority1;
    private Complexity Complexity1;
    String taskName1;

    public Task(String taskName, String currentPriority, String currentComplexity) {

        this.taskName1 = taskName;
           this.Priority1 = Priority.valueOf(currentPriority);
          this.Complexity1 = Complexity.valueOf(currentComplexity);

        //switch (currentPriority){
         //   case 1: Priority.High; break;
        //}
        //this.Priority1 = Priority.High;
        //this.Complexity1 = this.getComplexity(currentComplexity);
    }

    public String getTaskName() {
        return taskName1;   }

    public int getPriority() {
        return Priority1.value; }

    public int getComplexity() {
        return Complexity1.taskComplexityValue; }




}
