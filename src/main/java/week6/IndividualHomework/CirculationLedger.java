public class CirculationLedger {
    private static String branchCode;

    static {
        branchCode = "PT-LIB";
    }

    public static String getBranchCode() {
        return branchCode;
    }

    public static void main(String[] args) {
        System.out.println("Branch Code: " + branchCode);
    }
}
