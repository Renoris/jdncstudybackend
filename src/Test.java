public class Test {
    public static void main(String[] args) {
        int a = 5;

        Type type = new Type();
        type.a = 40;

        setTen(type);

        System.out.println(plusTen(a));
        System.out.println(type);
    }

    static int plusTen(int value) {
        return value += 10;
    }

    static void setTen(Type type) {
        type.a = 10;
    }

    static class Type {
        int a;

        @Override
        public String toString() {
            return "Type{" +
                    "a=" + a +
                    '}';
        }
    }
}
