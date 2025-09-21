package net.petemc.netherrackblocks.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.petemc.netherrackblocks.NetherrackBlocks;
import net.petemc.netherrackblocks.block.ModBlocks;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, NetherrackBlocks.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {



        stairsBlock(((StairBlock) ModBlocks.NETHERRACK_STAIRS.get()), blockTexture(Blocks.NETHERRACK));
        slabBlock(((SlabBlock) ModBlocks.NETHERRACK_SLAB.get()), blockTexture(Blocks.NETHERRACK), blockTexture(Blocks.NETHERRACK));
        wallBlock((WallBlock) ModBlocks.NETHERRACK_WALL.get(), blockTexture(Blocks.NETHERRACK));
        buttonBlock(((ButtonBlock) ModBlocks.NETHERRACK_BUTTON.get()), blockTexture(Blocks.NETHERRACK));
        pressurePlateBlock(((PressurePlateBlock) ModBlocks.NETHERRACK_PLATE.get()), blockTexture(Blocks.NETHERRACK));

        blockWithItem(ModBlocks.SMOOTH_NETHERRACK);
        stairsBlock(((StairBlock) ModBlocks.SMOOTH_NETHERRACK_STAIRS.get()), blockTexture(ModBlocks.SMOOTH_NETHERRACK.get()));
        slabBlock(((SlabBlock) ModBlocks.SMOOTH_NETHERRACK_SLAB.get()), blockTexture(ModBlocks.SMOOTH_NETHERRACK.get()), blockTexture(ModBlocks.SMOOTH_NETHERRACK.get()));
        wallBlock((WallBlock) ModBlocks.SMOOTH_NETHERRACK_WALL.get(), blockTexture(ModBlocks.SMOOTH_NETHERRACK.get()));
        buttonBlock(((ButtonBlock) ModBlocks.SMOOTH_NETHERRACK_BUTTON.get()), blockTexture(ModBlocks.SMOOTH_NETHERRACK.get()));
        pressurePlateBlock(((PressurePlateBlock) ModBlocks.SMOOTH_NETHERRACK_PLATE.get()), blockTexture(ModBlocks.SMOOTH_NETHERRACK.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.CHISELED_SMOOTH_NETHERRACK.get()), blockTexture(ModBlocks.CHISELED_SMOOTH_NETHERRACK.get()),
                ResourceLocation.fromNamespaceAndPath(NetherrackBlocks.MOD_ID, "block/chiseled_smooth_netherrack_top"));
        blockItem(ModBlocks.CHISELED_SMOOTH_NETHERRACK);

        blockWithItem(ModBlocks.NETHERRACK_BRICKS);
        stairsBlock(((StairBlock) ModBlocks.NETHERRACK_BRICK_STAIRS.get()), blockTexture(ModBlocks.NETHERRACK_BRICKS.get()));
        slabBlock(((SlabBlock) ModBlocks.NETHERRACK_BRICK_SLAB.get()), blockTexture(ModBlocks.NETHERRACK_BRICKS.get()), blockTexture(ModBlocks.NETHERRACK_BRICKS.get()));
        wallBlock((WallBlock) ModBlocks.NETHERRACK_BRICK_WALL.get(), blockTexture(ModBlocks.NETHERRACK_BRICKS.get()));
    }

    private void saplingBlock(RegistryObject<Block> blockRegistryObject) {
        simpleBlock(blockRegistryObject.get(),
                models().cross(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath(), blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }

    public void hangingSignBlock(Block signBlock, Block wallSignBlock, ResourceLocation texture) {
        ModelFile sign = models().sign(name(signBlock), texture);
        hangingSignBlock(signBlock, wallSignBlock, sign);
    }

    public void hangingSignBlock(Block signBlock, Block wallSignBlock, ModelFile sign) {
        simpleBlock(signBlock, sign);
        simpleBlock(wallSignBlock, sign);
    }

    private String name(Block block) {
        return key(block).getPath();
    }

    private ResourceLocation key(Block block) {
        return ForgeRegistries.BLOCKS.getKey(block);
    }

    private void leavesBlock(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(),
                models().singleTexture(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath(), ResourceLocation.parse("minecraft:block/leaves"),
                        "all", blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }

    private void blockItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile(NetherrackBlocks.MOD_ID +
                ":block/" + ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath()));
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
