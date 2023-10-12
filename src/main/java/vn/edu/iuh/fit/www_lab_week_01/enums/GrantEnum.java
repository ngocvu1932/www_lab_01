package vn.edu.iuh.fit.www_lab_week_01.enums;

public enum GrantEnum {
    Diasable(0),
    Enable(1);

    private int value;
    GrantEnum(int value) {
        this.value=value;
    }

    public  int getValue() {
        return value;
    }
}
