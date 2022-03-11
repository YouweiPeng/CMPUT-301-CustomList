import static org.junit.Assert.assertEquals;

import com.example.simpleparadox.listycity.City;
import com.example.simpleparadox.listycity.CustomList;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList List;
    @Before
    public void createList(){
        List=new CustomList(null,new ArrayList<City>());
        City Edmonton=new City("Edmonton","AB");
        List.addCity(Edmonton);
    }
    @Test
    public void addCityTest(){
        int ListSize=List.getCount();
        List.addCity(new City("Halifax","NS"));
        assertEquals(ListSize+1, List.getCount());

    }

    @Test
    public void hasCityTest(){
        assertEquals(true,List.hasCity(new City("Edmonton","AB")));
    }
    @Test
    public void deteleCity(){

    }
}
