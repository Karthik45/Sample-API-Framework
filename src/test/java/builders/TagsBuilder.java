package builders;

import entities.Tags;

public class TagsBuilder {

    private Tags tags = new Tags();

    public TagsBuilder() {
        tags.setId("0");
        tags.setName("String");
    }

    public TagsBuilder withId(String id) {
        tags.setId(id);
        return this;
    }

    public TagsBuilder withName(String name) {
        tags.setName(name);
        return this;
    }

    public Tags build() {
        return tags;
    }
}
