package net.petemc.netherrackblocks.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.petemc.netherrackblocks.NetherrackBlocks;
import net.petemc.netherrackblocks.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, NetherrackBlocks.MOD_ID);

    public static final RegistryObject<Block> NETHERRACK_STAIRS = registerBlock("netherrack_stairs",
            () -> new StairBlock(Blocks.NETHERRACK::defaultBlockState,
                    BlockBehaviour.Properties.copy(Blocks.NETHERRACK).sound(SoundType.NETHERRACK)));
    public static final RegistryObject<Block> NETHERRACK_SLAB = registerBlock("netherrack_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.NETHERRACK).sound(SoundType.NETHERRACK)));
    public static final RegistryObject<Block> NETHERRACK_WALL = registerBlock("netherrack_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.NETHERRACK).sound(SoundType.NETHERRACK)));
    public static final RegistryObject<Block> NETHERRACK_BUTTON = registerBlock("netherrack_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.NETHERRACK).sound(SoundType.NETHERRACK),
                    BlockSetType.STONE, 10, true));
    public static final RegistryObject<Block> NETHERRACK_PLATE = registerBlock("netherrack_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.NETHERRACK).sound(SoundType.NETHERRACK),
                    BlockSetType.STONE));

    public static final RegistryObject<Block> SMOOTH_NETHERRACK = registerBlock("smooth_netherrack",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.NETHERRACK)));
    public static final RegistryObject<Block> SMOOTH_NETHERRACK_STAIRS = registerBlock("smooth_netherrack_stairs",
            () -> new StairBlock(() -> ModBlocks.SMOOTH_NETHERRACK.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS).sound(SoundType.NETHERRACK)));
    public static final RegistryObject<Block> SMOOTH_NETHERRACK_SLAB = registerBlock("smooth_netherrack_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB).sound(SoundType.NETHERRACK)));
    public static final RegistryObject<Block> SMOOTH_NETHERRACK_WALL = registerBlock("smooth_netherrack_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).sound(SoundType.NETHERRACK)));
    public static final RegistryObject<Block> SMOOTH_NETHERRACK_BUTTON = registerBlock("smooth_netherrack_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).sound(SoundType.NETHERRACK),
                    BlockSetType.STONE, 10, true));
    public static final RegistryObject<Block> SMOOTH_NETHERRACK_PLATE = registerBlock("smooth_netherrack_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.STONE_PRESSURE_PLATE).sound(SoundType.NETHERRACK),
                    BlockSetType.STONE));
    public static final RegistryObject<Block> CHISELED_SMOOTH_NETHERRACK = registerBlock("chiseled_smooth_netherrack",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.CHISELED_STONE_BRICKS).sound(SoundType.NETHERRACK)));

    public static final RegistryObject<Block> NETHERRACK_BRICKS = registerBlock("netherrack_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS).sound(SoundType.NETHERRACK)));
    public static final RegistryObject<Block> NETHERRACK_BRICK_STAIRS = registerBlock("netherrack_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.NETHERRACK_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_STAIRS).sound(SoundType.NETHERRACK)));
    public static final RegistryObject<Block> NETHERRACK_BRICK_SLAB = registerBlock("netherrack_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_SLAB).sound(SoundType.NETHERRACK)));
    public static final RegistryObject<Block> NETHERRACK_BRICK_WALL = registerBlock("netherrack_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).sound(SoundType.NETHERRACK)));


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
