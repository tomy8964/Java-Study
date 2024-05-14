package access;

public class MaxCounter {
    private int count;
    private int max;

    public MaxCounter(int max) {
        this.max = max;
    }

    public void increment() {
        if (isValid()) {
            this.count++;
        }
    }

    private boolean isValid() {
        if (count >= max) {
            System.out.println("최대값을 초과할 수 없습니다.");
            return false;
        }
        return true;
    }

    public int getCount() {
        return count;
    }
}
