package builders;

import entities.Category;
import entities.Pet;
import entities.Tags;

public class PetBuilder {

    private Pet pet = new Pet();
    private Category category = new CategoryBuilder().build();
    private Tags[] tags = new Tags[1];

    public PetBuilder() {
        pet.setId("0");
        pet.setName("Doggie");
        pet.setStatus("Available");
        String[] photos = new String[2];
        photos[0] = "String";
        pet.setPhotoUrls(photos);
        pet.setCategory(category);
        tags[0] = new TagsBuilder().build();
        pet.setTags(tags);
    }

    public PetBuilder withId(String id) {
        pet.setId(id);
        return this;
    }

    public PetBuilder withName(String name) {
        pet.setName(name);
        return this;
    }

    public PetBuilder withStatus(String status) {
        pet.setStatus(status);
        return this;
    }

    public PetBuilder withPhotoUrls(String[] photos) {
        pet.setPhotoUrls(photos);
        return this;
    }

    public Pet build() {
        return pet;
    }
}
