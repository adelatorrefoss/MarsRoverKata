package MarsRover;

public class MarsRover {

    private String direction;

    public MarsRover() {
        this.direction = "N";
    }

    public MarsRover(String direction) {
        this.direction = direction;
    }

    public void run(String command) {
        if (direction == "S") {
            direction = "W";
        } else {
            direction = "E";
        }
    }

    public String getDirection() {
        return direction;
    }
}
