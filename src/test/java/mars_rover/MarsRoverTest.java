package mars_rover;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class MarsRoverTest {
    @Test
    public void given_n_when_receives_r_then_e() {
        MarsRover rover = new MarsRover();
        rover.run("r");
        assertThat(rover.getDirection(), is("E"));
    }

    @Test
    public void given_s_when_receives_r_then_w() {
        MarsRover rover = new MarsRover("S");
        rover.run("r");
        assertThat(rover.getDirection(), is("W"));
    }

    @Test
    public void given_e_when_receives_r_then_s() {
        MarsRover rover = new MarsRover("E");
        rover.run("r");
        assertThat(rover.getDirection(), is("S"));
    }

    @Test
    public void given_w_when_receives_r_then_n() {
        MarsRover rover = new MarsRover("W");
        rover.run("r");
        assertThat(rover.getDirection(), is("N"));
    }


    @Test
    public void given_n_when_receives_l_then_w() {
        MarsRover rover = new MarsRover("N");
        rover.run("l");
        assertThat(rover.getDirection(), is("W"));
    }

    // Given (0,0,"N") , when receives "f", then (0,1,"N")
    @Test
    public void given_n_when_receives_f_then_moves_1() {
        MarsRover rover = new MarsRover("N");
        rover.run("f");
        // assertThat(rover.getCoords(), is(new Coords()));
        assertThat(rover.getX(), is(0));
        assertThat(rover.getY(), is(1));

    }

    // Given (0,0,"N") , when receives "f", then (0,1,"N")
    @Test
    public void given_s_when_receives_f_then_moves_1() {
        MarsRover rover = new MarsRover("S");
        rover.run("f");
        // assertThat(rover.getCoords(), is(new Coords()));
        assertThat(rover.getX(), is(0));
        assertThat(rover.getY(), is(-1));
    }

}

// Given face "N", when receives "l",  then "W"
// Given face "S", when receives "l",
// Given face "E"
// Given face "W"

// Given (0,0,"N") , when receives "f", then (0,1,"N")
// Given (0,0,"S") , when receives "f", then (0,-1,"S")
// ...

// Given (0,0,"N") , when receives "b", then (0,-1,"N")
// ...

// Given (1,1,"E") , when receives "b", then (0,-1,"N")

// Given xxx  , when receives ""
// Given xxx  , when receives "f"
// Given xxx  , when receives "ff"
// Given xxx  , when receives "x"
