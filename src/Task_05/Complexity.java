package Task_05;

public enum Complexity {
    ComplexTask(4),
    MediumTask(2),
    EasyTask(1);

    public final int taskComplexityValue;

    Complexity (final int taskComplexityValue) {
     this.taskComplexityValue = taskComplexityValue;  }

    }
