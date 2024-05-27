package net.dvvemss.instutationhorizon.item;

import net.dvvemss.instutationhorizon.InstutationHorizon;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, InstutationHorizon.MOD_ID);

    public static final RegistryObject<Item> INSTUTATION_INGOT = ITEMS.register("instutation_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_INSTUTATION = ITEMS.register("raw_instutation",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
