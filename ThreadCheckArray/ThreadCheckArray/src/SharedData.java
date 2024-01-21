import java.util.List;

public class SharedData {
    private List<Integer> array;
    private List<Boolean> winArray;
    private boolean flag;
    private final int b;

    public SharedData(List<Integer> array, int b) {
        this.array = array;
        this.b = b;
    }

    public List<Boolean> getWinArray() {
        return winArray;
    }

    public void setWinArray(List<Boolean> winArray) {
        this.winArray = winArray;
    }

    public List<Integer> getArray() {
        return array;
    }

    public int getB() {
        return b;
    }

    public boolean getFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
