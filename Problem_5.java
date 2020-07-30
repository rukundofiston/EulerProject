public class Problem_5 {
	public static void main(String[] args) {
		int i = 2520;
        boolean found = false;
        while (!found) {
            i += 2520;
            boolean isDividable = true;
            for (int j = 11; j <= 20; j++) {
                if (i % j != 0) {
                    isDividable = false;
                    break;
                }
            }
            if (isDividable) {
                found = true;
            }
        }
        System.out.println(i);
	}
}
