/*
// передать строку input в масив
// посчитать кол-во каждого символа в массиве


package Task_0;
{
public void test2() {
        String input = "abcdeajhsdfddgjasdfff";
        HashMap<Character, Integer> example = processString(input);
        for (Character name: example.keySet()){
        String key = name.toString();
        String value = example.get(name).toString();
        System.out.println(key + " " + value);
        }
        }

public HashMap<Character, Integer> processString(String input) {
    HashMap<Character, Integer> hashmap = new HashMap<>();

        int inputLength = input.length;
        int i = 1;

        while (i <= inputLength ) {
        char alpha = input.charAt(i);
        hashmap.put(alpha, i)
        i++;
        }

       // hashmap.put('A', 1);
        return new HashMap();



        int i = 0;
        int Compare = 0;
        int d = 0;

        while ((i <= inputLength-1) ) {

        char alphaValue0 = hashmap.get(alpha, i);
        char alphaValue1 = hashmap.get(alpha, i+1);

        Compare = compare(alphaValue0, alphaValue1)
        if (Compare = 0) {
            duplicates = d+1
        ........
        }

        i++;
        }


        }
}

// compare the first char to the third
        int compareOneThree = Character.compare(firstValue, thirdValue);

        // display the comparison result of first
        // and second value
        if (compareOneTwo == 0) {
        System.out.println("First and second value are equal");
        } else if (compareOneTwo > 0) {
        System.out.println("First value is greater than second value");
        } else {
        System.out.println("First value is less than second value");
        }*/
