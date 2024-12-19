package model;

public class Module {

    private final String code;

    private final String name;

    private final String description;




    public Module(String code, String name, String description) {
            this.code = code;
            this.name = name;
            this.description = description;
        }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Module{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}



