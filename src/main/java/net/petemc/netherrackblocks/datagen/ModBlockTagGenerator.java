package net.petemc.netherrackblocks.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.petemc.netherrackblocks.NetherrackBlocks;
import net.petemc.netherrackblocks.block.ModBlocks;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, NetherrackBlocks.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.NETHERRACK_STAIRS.get(),
                     ModBlocks.NETHERRACK_SLAB.get(),
                     ModBlocks.NETHERRACK_PLATE.get(),
                     ModBlocks.CHISELED_SMOOTH_NETHERRACK.get(),
                     ModBlocks.SMOOTH_NETHERRACK.get(),
                     ModBlocks.SMOOTH_NETHERRACK_STAIRS.get(),
                     ModBlocks.SMOOTH_NETHERRACK_SLAB.get(),
                     ModBlocks.SMOOTH_NETHERRACK_PLATE.get(),
                     ModBlocks.NETHERRACK_BRICKS.get(),
                     ModBlocks.NETHERRACK_BRICK_STAIRS.get(),
                     ModBlocks.NETHERRACK_BRICK_SLAB.get());

        this.tag(BlockTags.WALLS)
                .add(ModBlocks.NETHERRACK_WALL.get(),
                     ModBlocks.SMOOTH_NETHERRACK_WALL.get(),
                     ModBlocks.NETHERRACK_BRICK_WALL.get());
    }
}
