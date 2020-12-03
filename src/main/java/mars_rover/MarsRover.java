package mars_rover;

public class MarsRover {

    private String direction;
    private int x;
    private int y;

    public MarsRover() {
        this.x = 0;
        this.y = 0;
        this.direction = "N";
    }

    public MarsRover(String direction) {
        this.direction = direction;
    }

    public void run(String command) {

        if (command.equals("f")) {
            if (direction.equals("S")) {
                y = -1;
            } else {
                y = 1;
            }
        }
        if (command.equals("l")) {
            direction = "W";
        } else {
            if (direction.equals("S")) {
                direction = "W";
            } else if (direction.equals("W")) {
                direction = "N";
            } else if (direction.equals("E")) {
                direction = "S";
            } else {
                direction = "E";
            }
        }
    }

    public String getDirection() {
        return direction;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
