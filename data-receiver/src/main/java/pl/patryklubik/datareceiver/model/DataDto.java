package pl.patryklubik.datareceiver.model;

import javax.validation.constraints.NotBlank;

/**
 * Create by Patryk Łubik on 24.07.2021.
 */

public class DataDto {

    @NotBlank(message = "Id must not be null")
    private int id;
    @NotBlank(message = "Data title must not be null")
    private String title;
    @NotBlank(message = "Data description must not be null")
    private String description;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
