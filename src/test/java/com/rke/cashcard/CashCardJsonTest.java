package com.rke.cashcard;

import com.rke.cashcard.model.CashCard;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.boot.test.json.JacksonTester;

import java.io.IOException;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

@JsonTest
public class CashCardJsonTest {
    @Autowired
    private JacksonTester<CashCard> json;

    @Test
    public void cashCardSerializationTest() throws IOException {
        // Arrange
        CashCard cashCard = new CashCard(99L, 123.45);

        // Act
        // Assert
        assertThat(json.write(cashCard)).isStrictlyEqualToJson("cashcard.json");
        assertThat(json.write(cashCard)).hasJsonPath("$.id");
        assertThat(json.write(cashCard)).hasJsonPathValue("$.id", 99L)            ;
        assertThat(json.write(cashCard)).hasJsonPath("$.amount");
        assertThat(json.write(cashCard)).hasJsonPathValue("$.amount", 123.45);

    }

    // Add a deserialization test
    @Test
    public void cashCardDeserializationTest() throws IOException {
        String expected = """
           {
               "id":99,
               "amount":123.45
           }
           """;
        // Act
        // Assert
        assertThat(json.parse(expected)).isEqualTo(new CashCard(99L, 123.45));
        assertThat(json.parseObject(expected).id()).isEqualTo(99);
        assertThat(json.parseObject(expected).amount()).isEqualTo(123.45);



    }
}
