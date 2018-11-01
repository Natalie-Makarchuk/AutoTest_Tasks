package Task_05;

public enum Priority
{
    High(1),
    Medium(2),
    Low(3);

 //   public final int value;
 //   Priority (final int value) {
 //       this.value = value; }

    private final int prValue;

    Priority(int priorityValue) {
        this.prValue = priorityValue;
    }

    public static Priority priorityValue(int n) {
        for (Priority p : values()) {
            if (p.prValue == n) {
                return p;
            }
        }
        // either throw the IAE or return null, your choice.
        throw new IllegalArgumentException(String.valueOf(n));
    }

    public int getValue() {
        return prValue;
    }

}