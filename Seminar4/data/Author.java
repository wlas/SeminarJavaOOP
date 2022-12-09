package data;

import java.util.UUID;

public class Author {
    private final UUID authorID;
    private final String name;
    private final String surname;

    public Author(String name, String surname) {
        this.authorID = UUID.randomUUID();
        this.name = name;
        this.surname = surname;
    }

    public UUID getAuthorID() {
        return authorID;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return String.format("%s %s", name, surname);
    }
}
