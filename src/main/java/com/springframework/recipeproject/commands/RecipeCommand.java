package com.springframework.recipeproject.commands;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.URL;

import com.springframework.recipeproject.domain.Difficulty;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class RecipeCommand {
	
	private Long id;
	
	@NotBlank
	@Size(min = 3, max = 255)
	private String description;
	
	@Min(1)
	@Max(999)
	private int prepTime;
	
	@Min(1)
	@Max(999)
	private int cookTime;
	
	@Min(1)
	@Max(999)
	private int servings;
	private String source;
	
	@URL
	private String url;
	
	@NotBlank
	private String directions; 
	private List<IngredientsCommand> ingredients = new ArrayList<>();
	private Difficulty difficulty;
	private NotesCommand notes;
	private List<CategoryCommand> categories = new ArrayList<>();
	private Byte[] image;
	
}
