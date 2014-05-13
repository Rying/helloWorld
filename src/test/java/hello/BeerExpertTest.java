package hello;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class BeerExpertTest {
    @Test
    public void should_color_amber_get_brands_jack_amber_and_red_moose() {
        BeerExpert beerExpert = new BeerExpert();
        List list = new ArrayList<String>();
        list.add("Jack Amber");
        list.add("Red Moose");

        assertThat(beerExpert.getBrands("amber").equals(list), is(true));
    }

}