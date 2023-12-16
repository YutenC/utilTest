package org.example.Const;

public enum TestConst {

    TEST_CONST1(1);

    private  final  Integer type;

    TestConst(Integer type) {
        this.type = type;
    }

    public Integer getType(){
        return type;
    }
}
