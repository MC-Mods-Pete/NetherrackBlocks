package net.petemc.netherrackblocks.datagen;

import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.GlobalLootModifierProvider;
import net.petemc.netherrackblocks.NetherrackBlocks;

public class ModGlobalLootModifiersProvider extends GlobalLootModifierProvider {
    public ModGlobalLootModifiersProvider(PackOutput output) {
        super(output, NetherrackBlocks.MOD_ID);
    }

    @Override
    protected void start() {

    }
}
