package net.petemc.netherrackblocks.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.petemc.netherrackblocks.NetherrackBlocks;
import net.petemc.netherrackblocks.block.ModBlocks;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, NetherrackBlocks.MOD_ID);

    public static final RegistryObject<CreativeModeTab> NETHERRACK_BLOCK_TAB = CREATIVE_MODE_TABS.register("netherrack_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(Blocks.NETHERRACK))
                    .title(Component.translatable("creativetab.netherrackblocks_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModBlocks.NETHERRACK_STAIRS.get());
                        pOutput.accept(ModBlocks.NETHERRACK_SLAB.get());
                        pOutput.accept(ModBlocks.NETHERRACK_WALL.get());
                        pOutput.accept(ModBlocks.NETHERRACK_BUTTON.get());
                        pOutput.accept(ModBlocks.NETHERRACK_PLATE.get());

                        pOutput.accept(ModBlocks.SMOOTH_NETHERRACK.get());
                        pOutput.accept(ModBlocks.SMOOTH_NETHERRACK_STAIRS.get());
                        pOutput.accept(ModBlocks.SMOOTH_NETHERRACK_SLAB.get());
                        pOutput.accept(ModBlocks.SMOOTH_NETHERRACK_WALL.get());
                        pOutput.accept(ModBlocks.SMOOTH_NETHERRACK_BUTTON.get());
                        pOutput.accept(ModBlocks.SMOOTH_NETHERRACK_PLATE.get());
                        pOutput.accept(ModBlocks.CHISELED_SMOOTH_NETHERRACK.get());

                        pOutput.accept(ModBlocks.NETHERRACK_BRICKS.get());
                        pOutput.accept(ModBlocks.NETHERRACK_BRICK_STAIRS.get());
                        pOutput.accept(ModBlocks.NETHERRACK_BRICK_SLAB.get());
                        pOutput.accept(ModBlocks.NETHERRACK_BRICK_WALL.get());
                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
