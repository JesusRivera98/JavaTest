import org.junit.Test;

import static org.junit.Assert.*;

public class PlayerTest {
    @Test
    public void looses_when_dice_number_is_too_low(){
        Dice dice = new Dice(6);
        Player player = new Player(dice, 5);
        assertEquals(false, player.play());
    }
}