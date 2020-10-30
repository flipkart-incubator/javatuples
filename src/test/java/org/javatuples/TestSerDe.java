package org.javatuples;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

class TestSerDe {

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
    void testJackson() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        for (Tuple tuple : tuples) {
            String serializedTuple = objectMapper.writeValueAsString(tuple);
            Tuple deserializedTuple = objectMapper.readValue(serializedTuple, tuple.getClass());
            assertEquals(tuple, deserializedTuple,"Upon serializing and then deserializing back, there was loss of information in tuple");
        }
    }

}
