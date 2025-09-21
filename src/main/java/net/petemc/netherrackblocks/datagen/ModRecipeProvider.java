package net.petemc.netherrackblocks.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.petemc.netherrackblocks.NetherrackBlocks;
import net.petemc.netherrackblocks.block.ModBlocks;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {

    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(@NotNull Consumer<FinishedRecipe> pWriter) {
        oreSmelting(pWriter, List.of(Blocks.NETHERRACK), RecipeCategory.MISC, ModBlocks.SMOOTH_NETHERRACK.get(), 0.1f, 200, "polished_netherrack");
        oreBlasting(pWriter, List.of(Blocks.NETHERRACK), RecipeCategory.MISC, ModBlocks.SMOOTH_NETHERRACK.get(), 0.1f, 100, "polished_netherrack");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.NETHERRACK_STAIRS.get(), 4)
                .pattern("W  ")
                .pattern("WW ")
                .pattern("WWW")
                .define('W', Blocks.NETHERRACK)
                .unlockedBy(getHasName(Blocks.NETHERRACK), has(Blocks.NETHERRACK))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.NETHERRACK_SLAB.get(), 6)
                .pattern("WWW")
                .define('W', Blocks.NETHERRACK)
                .unlockedBy(getHasName(Blocks.NETHERRACK), has(Blocks.NETHERRACK))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.NETHERRACK_WALL.get(), 6)
                .pattern("WWW")
                .pattern("WWW")
                .define('W', Blocks.NETHERRACK)
                .unlockedBy(getHasName(Blocks.NETHERRACK), has(Blocks.NETHERRACK))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.NETHERRACK_BUTTON.get())
                .requires(Blocks.NETHERRACK,1)
                .unlockedBy(getHasName(Blocks.NETHERRACK), has(Blocks.NETHERRACK))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.NETHERRACK_PLATE.get())
                .pattern("WW")
                .define('W', Blocks.NETHERRACK)
                .unlockedBy(getHasName(Blocks.NETHERRACK), has(Blocks.NETHERRACK))
                .save(pWriter);


        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_NETHERRACK.get())
                .pattern("WW")
                .pattern("WW")
                .define('W', Blocks.NETHERRACK)
                .unlockedBy(getHasName(Blocks.NETHERRACK), has(Blocks.NETHERRACK))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_NETHERRACK_STAIRS.get(), 4)
                .pattern("W  ")
                .pattern("WW ")
                .pattern("WWW")
                .define('W', ModBlocks.SMOOTH_NETHERRACK.get())
                .unlockedBy(getHasName(ModBlocks.SMOOTH_NETHERRACK.get()), has(ModBlocks.SMOOTH_NETHERRACK.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_NETHERRACK_SLAB.get(), 6)
                .pattern("WWW")
                .define('W', ModBlocks.SMOOTH_NETHERRACK.get())
                .unlockedBy(getHasName(ModBlocks.SMOOTH_NETHERRACK.get()), has(ModBlocks.SMOOTH_NETHERRACK.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_NETHERRACK_WALL.get(), 6)
                .pattern("WWW")
                .pattern("WWW")
                .define('W', ModBlocks.SMOOTH_NETHERRACK.get())
                .unlockedBy(getHasName(ModBlocks.SMOOTH_NETHERRACK.get()), has(ModBlocks.SMOOTH_NETHERRACK.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_NETHERRACK_BUTTON.get())
                .requires(ModBlocks.SMOOTH_NETHERRACK.get(),1)
                .unlockedBy(getHasName(ModBlocks.SMOOTH_NETHERRACK.get()), has(ModBlocks.SMOOTH_NETHERRACK.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_NETHERRACK_PLATE.get())
                .pattern("WW")
                .define('W', ModBlocks.SMOOTH_NETHERRACK.get())
                .unlockedBy(getHasName(ModBlocks.SMOOTH_NETHERRACK.get()), has(ModBlocks.SMOOTH_NETHERRACK.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_SMOOTH_NETHERRACK.get())
                .pattern("W")
                .pattern("W")
                .define('W', ModBlocks.SMOOTH_NETHERRACK_SLAB.get())
                .unlockedBy(getHasName(ModBlocks.SMOOTH_NETHERRACK.get()), has(ModBlocks.SMOOTH_NETHERRACK.get()))
                .save(pWriter);


        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.NETHERRACK_BRICKS.get(), 4)
                .pattern("WW")
                .pattern("WW")
                .define('W', ModBlocks.SMOOTH_NETHERRACK.get())
                .unlockedBy(getHasName(ModBlocks.SMOOTH_NETHERRACK.get()), has(ModBlocks.SMOOTH_NETHERRACK.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.NETHERRACK_BRICK_STAIRS.get(), 4)
                .pattern("W  ")
                .pattern("WW ")
                .pattern("WWW")
                .define('W', ModBlocks.NETHERRACK_BRICKS.get())
                .unlockedBy(getHasName(ModBlocks.SMOOTH_NETHERRACK.get()), has(ModBlocks.SMOOTH_NETHERRACK.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.NETHERRACK_BRICK_SLAB.get(), 6)
                .pattern("WWW")
                .define('W', ModBlocks.NETHERRACK_BRICKS.get())
                .unlockedBy(getHasName(ModBlocks.SMOOTH_NETHERRACK.get()), has(ModBlocks.SMOOTH_NETHERRACK.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.NETHERRACK_BRICK_WALL.get(), 6)
                .pattern("WWW")
                .pattern("WWW")
                .define('W', ModBlocks.NETHERRACK_BRICKS.get())
                .unlockedBy(getHasName(ModBlocks.SMOOTH_NETHERRACK.get()), has(ModBlocks.SMOOTH_NETHERRACK.get()))
                .save(pWriter);
    }

    protected static void oreSmelting(@NotNull Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, @NotNull RecipeCategory pCategory, @NotNull ItemLike pResult, float pExperience, int pCookingTIme, @NotNull String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(@NotNull Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, @NotNull RecipeCategory pCategory, @NotNull ItemLike pResult, float pExperience, int pCookingTime, @NotNull String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static void oreCooking(@NotNull Consumer<FinishedRecipe> pFinishedRecipeConsumer, @NotNull RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer, List<ItemLike> pIngredients, @NotNull RecipeCategory pCategory, @NotNull ItemLike pResult, float pExperience, int pCookingTime, @NotNull String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult,
                    pExperience, pCookingTime, pCookingSerializer)
                    .group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(pFinishedRecipeConsumer,  NetherrackBlocks.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }
}
