package tv.mapper.mapperbase.world.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import tv.mapper.mapperbase.MapperBase;

public class BaseGroups
{
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MapperBase.MODID);

    public static RegistryObject<CreativeModeTab> MAPPERBASE = CREATIVE_MODE_TABS.register("mapperbase_group", () -> CreativeModeTab.builder()
            .icon(() -> new ItemStack(BaseItems.STEEL_INGOT.get()))
            .title(Component.translatable("itemGroup.mapperbase_group"))
            .build()
    );

    public static void init() {
        CREATIVE_MODE_TABS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}