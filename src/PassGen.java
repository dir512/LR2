

import java.util.*;

public class PassGen {

    public String getPassword(int size) {
        StringBuilder b = new StringBuilder();
        Random r = new Random();
        for (int i = 0; i < size; i++)
            b.append((char) (r.nextInt(26) + 'a'));
        return b.toString();
    }
}

