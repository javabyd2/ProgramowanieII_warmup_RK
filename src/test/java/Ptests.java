import com.sdabyd2.programowanie.PTestImpl;
        import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;
        import static java.util.Arrays.asList;
        import static org.hamcrest.CoreMatchers.is;

public class Ptests {

    @Test
    public void shouldFindLastElementFromList () throws Exception{
        assertThat(PTestImpl.last(asList("a", "b", "c", "d")), is(equalTo("d")));
    }

}
