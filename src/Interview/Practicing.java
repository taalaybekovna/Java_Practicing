    package Interview;

    public class Practicing {
        public static int num;

        public static int getNum() {
            num = 3;
            if (true) {
                int num;
                num = 10;
            }
            return num;
        }
    }
