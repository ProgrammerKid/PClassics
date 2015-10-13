class problem1 {
    public static void main(String args[]) {
        int test = 2000;
        int[] outputs = new int[1000];
        int outputPosition = 0;
        
        for (int i = test; i < 300000; i += 2) {
            if (checkTest(i)) {
                outputs[outputPosition] = i;
                outputPosition++;
            }
        }
        
        System.out.println(count(outputs));
    }
    
    static int count(int[] array) {
        int output = 0;

        for (int i: array) {
            if (i != 0) {
                output++;
            } else {
                return output;
            }
        }

        return output;
    }

    static boolean checkTest(int num) {
        num = num * 365;
        String number = num + "";

        if (number.length() == 8) {
            String half1 = number.substring(0, 4);
            String half2 = number.substring(4, 8);
            return (Integer.parseInt(half1) == Integer.parseInt(half2));
        } else {
            return false;
        }
    }
}
