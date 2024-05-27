package net.dvvemss.instutationhorizon.item;

import net.dvvemss.instutationhorizon.InstutationHorizon;
import net.dvvemss.instutationhorizon.block.ModBlock;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, InstutationHorizon.MOD_ID);

    public static final RegistryObject<CreativeModeTab> INSTUTATION_TAB = CREATIVE_MODE_TABS.register("instutation_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.INSTUTATION_INGOT.get()))
                    .title(Component.translatable("creativetab.instutation_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.INSTUTATION_INGOT.get());
                        pOutput.accept(ModItems.RAW_INSTUTATION.get());

                        pOutput.accept(Items.DIAMOND);
                        pOutput.accept(ModBlock.INSTUTATION_BLOCK.get());
                        pOutput.accept(ModBlock.RAW_INSTUTATION_BLOCK.get());

                    })
                    .build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
