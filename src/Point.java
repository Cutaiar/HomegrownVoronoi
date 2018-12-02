
public class Point {

    private int x, y;
    private boolean isSite;

    /**
     * @return the isSite
     */
    public boolean isSite() {
        return isSite;
    }

    /**
     * @param isSite the isSite to set
     */
    public void setSite(boolean isSite) {
        this.isSite = isSite;
    }

    /**
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public int getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(int y) {
        this.y = y;
    }

    public int compareTo(Point point) {
        if (x < point.x) {
            return -1;
        }
        else if (x == point.x) {
            if (y < point.y) {
                return -1;
            }
        }
        return 1;
    }
    
}
