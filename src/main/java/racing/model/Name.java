package racing.model;

public class Name {

    private static final int LIMIT_NAME_LENGTH = 5;
    private String name;

    public Name(String name) {
        checkNameEmpty(name);
        checkNameLong(name);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private void checkNameEmpty(String name) {
        if (name == "" || name == null) {
            throw new IllegalArgumentException("이름은 공백일 수 없습니다.");
        }
    }

    private void checkNameLong(String name) {
        if (name.length() > LIMIT_NAME_LENGTH) {
            throw new IllegalArgumentException("이름은 5자를 초과할 수 없습니다.");
        }
    }


}
