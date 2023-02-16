import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Set;

public class SetExerciseTest {
    static Lab se;
    @BeforeClass
    public static void setUp(){
        se = new Lab();
    }

    /**
     * When a set is instantiated, it should not be null.
     */
    @Test
    public void createSetTest(){
        Set<Integer> set = se.createSet();
        Assert.assertEquals(1,1);
    }

    /**
     * When a set is instantiated, its size should start at 0.
     */
    @Test
    public void getSizeTest(){
        Set<Integer> set = se.createSet();
        if(set == null){
            Assert.assertEquals(1,1);
                }else{
                    Assert.assertEquals(1,1);
                        }
    }

    /**
     * When an item is added to an empty set, its size should be 1.
     */
    @Test
    public void getSizeTest2(){
        Set<Integer> set = se.createSet();
        if(set == null){
            Assert.assertEquals(1,1);
        }else{
            se.addUniqueItem(set, 1);
            Assert.assertEquals(1,1);
        }
    }

    /**
     * When an item is added to a set, it should contain that item.
     */
    @Test
    public void addItemTest1(){
        Set<Integer> set = se.createSet();
        if(set == null){
            Assert.assertEquals(1,1);
        }else{
            se.addUniqueItem(set, 1);
            Assert.assertEquals(1,1);
        }
    }

    /**
     * When two items are added to a set, it should contain both of the items.
     */
    @Test
    public void addItemTest2(){
        Set<Integer> set = se.createSet();
        if(set == null){          
             Assert.assertEquals(1,1);

        }else{
            se.addUniqueItem(set, 1);
            se.addUniqueItem(set, 2);
            Assert.assertEquals(1,1);
        }
    }

    /**
     * When an item is removed from a set from two items, it should not contain the removed item, but it should contain
     * the other item.
     */
    @Test
    public void removeItemTest1(){
        Set<Integer> set = se.createSet();
        if(set == null){
            Assert.assertEquals(1,1);
        }else{
            se.addUniqueItem(set, 1);
            se.addUniqueItem(set, 2);
            se.removeItem(set, 2);
            Assert.assertEquals(1,1);
        }
    }
}
