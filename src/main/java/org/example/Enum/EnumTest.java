package org.example.Enum;

public enum EnumTest {

    TEST(0),TEST1(1),TEST2(2);

    public final Integer value;

    EnumTest(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
}
