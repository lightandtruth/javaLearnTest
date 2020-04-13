
package com.cdsxt.ego.beans;

import java.util.Random;

public class IDUtil {
    public IDUtil() {
    }

    public static String getImageName() {
        long imge = System.currentTimeMillis();
        Random random = new Random();
        int i = random.nextInt(1000);
        String str = imge + String.format("%03d", i);
        return str;
    }
}