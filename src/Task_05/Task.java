package Task_05;

public class Task {

    private Priority taskPriority;
    private Complexity taskComplexity;
    String taskName;

    public Task(String currentName, int currentPriority, int currentComplexity) {
//    this.Priority1 = Priority.valueOf(currentPriority);
        this.taskName = currentName;
        this.taskPriority = Priority.priorityValue(currentPriority);
        this.taskComplexity = Complexity.complexityValue(currentComplexity);

        //switch (currentPriority){
        //   case 1: Priority.High; break; }
        //this.Priority1 = Priority.High;
        //this.Complexity1 = this.getComplexity(currentComplexity);
    }

    public String getTaskName() {
        return this.taskName;
    }

    public Priority getPriority() {
        return this.taskPriority;
    }

    public Complexity getComplexity() {
        return this.taskComplexity;
    }


}
