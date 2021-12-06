package String;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String [] names = {"Ali", "Sa3eed", "Mohammad"};

        ArrayList<String> family = new ArrayList<String>();

        for (int index = 0; index < names.length; index++)
        {
            family.add(names[index]);
        }

        System.out.println(family.get(0));
        for (int i = 0; i < 3; i++)
        {
            System.out.println(family.get(i));
        }
    }
}
