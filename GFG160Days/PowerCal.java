class PowerCal {
    double power(double b, int e) {
        // code here
        if (e == 0) {
            return 1;
        }

        if (e < 1) {
            return 1 / power(b, -e);
        }

        double temp = power(b, e / 2);
        if (e % 2 == 0) {
            return temp * temp;
        } else {
            return temp * temp * b;
        }

    }

    public static void main(String[] args) {
        PowerCal pc = new PowerCal();
        System.out.println(pc.power(2, 3)); // 8.0
        System.out.println(pc.power(2, -3)); // 0.125
        System.out.println(pc.power(2, 0)); // 1.0
    }
}