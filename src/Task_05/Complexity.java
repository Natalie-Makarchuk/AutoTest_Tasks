package Task_05;

public enum Complexity
{
    ComplexTask(4),
    MediumTask(2),
    EasyTask(1);

   // public final int taskComplexityValue;
   // Complexity (final int taskComplexityValue) {
   //  this.taskComplexityValue = taskComplexityValue;  }

    private final int compValue;

    Complexity(int complexityValue) {
        this.compValue = complexityValue;
    }

    public static Complexity complexityValue(int m) {
        for (Complexity c : values()) {
            if (c.compValue == m) {
                return c;
            }
        }
        // either throw the IAE or return null, your choice.
        throw new IllegalArgumentException(String.valueOf(m));
    }

}
