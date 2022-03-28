public class FakeBin {
    public static String fakeBin(String nums) {
        String arr = "";
        for (char i: nums.toCharArray()) {
            if (Character.getNumericValue(i) < 5) {
                arr = arr + "0";
            } else {
                arr = arr + "1";
            }
        }
        return(arr);
    }

    public static void main(String[] args) {
        String n = Doodle.fakeBin("123456");
        System.out.println(n);
    }
}
