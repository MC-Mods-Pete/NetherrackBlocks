package net.petemc.netherrackblocks.datagen.loot;

import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.RegistryObject;
import net.petemc.netherrackblocks.block.ModBlocks;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.NETHERRACK_STAIRS.get());
        this.dropSelf(ModBlocks.NETHERRACK_SLAB.get());
        this.dropSelf(ModBlocks.NETHERRACK_WALL.get());
        this.dropSelf(ModBlocks.NETHERRACK_BUTTON.get());
        this.dropSelf(ModBlocks.NETHERRACK_PLATE.get());

        this.dropSelf(ModBlocks.SMOOTH_NETHERRACK.get());
        this.dropSelf(ModBlocks.SMOOTH_NETHERRACK_STAIRS.get());
        this.dropSelf(ModBlocks.SMOOTH_NETHERRACK_SLAB.get());
        this.dropSelf(ModBlocks.SMOOTH_NETHERRACK_WALL.get());
        this.dropSelf(ModBlocks.SMOOTH_NETHERRACK_BUTTON.get());
        this.dropSelf(ModBlocks.SMOOTH_NETHERRACK_PLATE.get());
        this.dropSelf(ModBlocks.CHISELED_SMOOTH_NETHERRACK.get());

        this.dropSelf(ModBlocks.NETHERRACK_BRICKS.get());
        this.dropSelf(ModBlocks.NETHERRACK_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.NETHERRACK_BRICK_SLAB.get());
        this.dropSelf(ModBlocks.NETHERRACK_BRICK_WALL.get());
    }

    protected LootTable.Builder createCopperLikeOreDrops(Block pBlock, Item item) {
        return createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock,
                        LootItem.lootTableItem(item)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(2.0F, 5.0F)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
