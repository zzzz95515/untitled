public class FirsrtClass {
    int dfg = 56446;
    String stroka;

    public FirsrtClass(int dfg, String stroka) {
        this.dfg = dfg;
        this.stroka = stroka;
    }

    public int getDfg() {
        return dfg;
    }

    public void setDfg(int dfg) {
        this.dfg = dfg;
    }

    public String getStroka() {
        return stroka;
    }

    public void setStroka(String stroka) {
        this.stroka = stroka;
    }

    @Override
    public String toString() {
        return "FirsrtClass{" +
                "dfg=" + dfg +
                ", stroka='" + stroka + '\'' +
                '}';
    }
}
