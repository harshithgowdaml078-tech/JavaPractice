public class FirstChallenge {
    public static void main(String[] args) {
        double value = 20.00d;
        double othervalue = 80.00d;
        double result = (value + othervalue) * 100.00d;
        System.out.println("result " + result);
        double remainderResult = result % 40.00d;
        System.out.println("remainder result " + remainderResult);
        boolean challengevalue = (remainderResult == 0) ? true : false;
        System.out.println("challenge value " + challengevalue);
        if(!challengevalue) {
            System.out.print("got some remainder");
        }

    }
}
