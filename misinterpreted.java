public class misinterpreted {
    public static void main(String[] args) {
        System.out.println(correct("1F-RUDYARD K1PL1NG"));
    }

    public static String correct(String string){
        StringBuilder line = new StringBuilder(string);
        int index1 = line.indexOf("5");
        int index2 = line.indexOf("0");
        int index3 = line.indexOf("1");

        while (index1 != -1 ||index2  != -1 ||index3  != -1){
            if (index1 != -1) {
                line.replace(index1, index1 + 1, "S");
                index1 = line.indexOf("5");
            }
            if (index2 != -1) {
                line.replace(index2, index2 + 1, "O");
                index2 = line.indexOf("0");
            }
            if (index3 != -1) {
                line.replace(index3, index3 + 1, "I");
                index3 = line.indexOf("1");
            }
        }
        return line.toString();
    }
}
