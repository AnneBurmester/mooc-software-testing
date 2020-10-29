package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GHappyTest {

    @Test
    public void unhappyonly(){
        boolean result = new GHappy().gHappy("xxgxx");
        Assertions.assertEquals(false,result);
    }

    @Test
    public void happyonly(){
        boolean result = new GHappy().gHappy("xxggxx");
        Assertions.assertEquals(true, result);
    }

    @Test
    public void mixedfirst(){
        boolean result = new GHappy().gHappy("xxgyyggxx");
        Assertions.assertEquals(false, result);
    }

    @Test
    public void mixedlast(){
        boolean result = new GHappy().gHappy("xxggyygxx");
        Assertions.assertEquals(false, result);
    }

    @Test
    public void none() {
        boolean result = new GHappy().gHappy("xxyyxxxyy");
        Assertions.assertEquals(false, result);

    }
}
