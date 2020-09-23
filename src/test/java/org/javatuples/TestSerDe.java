package org.javatuples;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TestSerDe {

    final List<Tuple> tuples = Arrays.asList(
            Unit.with(1),
            Unit.with(1.0),
            Unit.with("Hello"),
            Pair.with(1, 4.0),
            Triplet.with(1, 1.0, "Hello"),
            Quartet.with(1, 1.0, "Hello", 2.0),
            Quintet.with("a", 0.5, 1.25, 4, "Hello"),
            Sextet.with("a", 0.5, 1.2, 4, "Hello", "Bye"),
            Septet.with("a", 0.5, 1.2, 4, "Hello", "Bye", 0.0),
            Octet.with("a", 0.5, 1.2, true, "Hello", "Bye", 0.0, 1),
            Ennead.with("a", 0.5, 1.2, false, "Hello", "Bye", 0.0, 1, "A"),
            Decade.with("a", 0.5, 1.2, 4, "Hello", "Bye", 0.0, true, "a", "b")
    );

    @Test
    public void testJackson() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        for (Tuple tuple : tuples) {
            String serializedTuple = objectMapper.writeValueAsString(tuple);
            Tuple deserializedTuple = objectMapper.readValue(serializedTuple, tuple.getClass());
            assertEquals("Upon serializing and then deserializing back, there was loss of information in tuple",
                    tuple, deserializedTuple);
        }
    }

}
