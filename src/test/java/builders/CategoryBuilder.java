package builders;

import entities.Category;

public class CategoryBuilder {

    private Category category = new Category();

    public CategoryBuilder() {
        category.setId("0");
        category.setName("String");
    }

    public CategoryBuilder withId(String id) {
        category.setId(id);
        return this;
    }

    public CategoryBuilder withName(String name) {
        category.setName(name);
        return this;
    }

    public Category build() {
        return category;
    }
}
