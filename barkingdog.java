public class barkingdog {
public static boolean shouldWakeup(boolean barking, int hourofDay) {
    if(hourofDay < 0 || hourofDay > 23) {
        return false;
    } else if(barking && (hourofDay < 8 || hourofDay> 22)) {
        return true;
    } else {
        return false;
    }
}

public static void main (String [] args) {
    shouldWakeup(true, 1);
    shouldWakeup(false, 2);
    shouldWakeup(true,  10);
    shouldWakeup(true, 1);
}
}

