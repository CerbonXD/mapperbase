package tv.mapper.mapperbase.world.level.block;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.PressurePlateBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import tv.mapper.mapperbase.MapperBase;

public class BaseBlocks
{
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MapperBase.MODID);

    private static Properties steelProperties = Block.Properties.of().mapColor(MapColor.STONE).strength(5.0F, 6.0F).sound(SoundType.LANTERN).requiresCorrectToolForDrops();
    private static BlockSetType steelBlockSetType = new BlockSetType("steel", false, SoundType.LANTERN, SoundEvents.IRON_DOOR_CLOSE, SoundEvents.IRON_DOOR_OPEN, SoundEvents.IRON_TRAPDOOR_CLOSE, SoundEvents.IRON_TRAPDOOR_OPEN, SoundEvents.WOODEN_PRESSURE_PLATE_CLICK_OFF, SoundEvents.WOODEN_PRESSURE_PLATE_CLICK_ON, SoundEvents.STONE_BUTTON_CLICK_OFF, SoundEvents.STONE_BUTTON_CLICK_ON);
    private static WoodType steelWoodyType = new WoodType("steel", steelBlockSetType, SoundType.LANTERN, SoundType.HANGING_SIGN, SoundEvents.FENCE_GATE_CLOSE, SoundEvents.FENCE_GATE_OPEN);

    public static final RegistryObject<CustomBlock> STEEL_BLOCK = BLOCKS.register("steel_block", () -> new CustomBlock(steelProperties, ToolTypes.PICKAXE, ToolTiers.IRON));
    public static final RegistryObject<CustomStairsBlock> STEEL_STAIRS = BLOCKS.register("steel_stairs", () -> new CustomStairsBlock(() -> STEEL_BLOCK.get().defaultBlockState(), steelProperties, ToolTypes.PICKAXE, ToolTiers.IRON));
    public static final RegistryObject<CustomSlabBlock> STEEL_SLAB = BLOCKS.register("steel_slab", () -> new CustomSlabBlock(steelProperties, ToolTypes.PICKAXE, ToolTiers.IRON));
    public static final RegistryObject<CustomWallBlock> STEEL_WALL = BLOCKS.register("steel_wall", () -> new CustomWallBlock(steelProperties, ToolTypes.PICKAXE, ToolTiers.IRON));
    public static final RegistryObject<CustomPressurePlateBlock> STEEL_PRESSURE_PLATE = BLOCKS.register("steel_pressure_plate", () -> new CustomPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, steelProperties.noCollission(), steelBlockSetType, ToolTypes.PICKAXE, ToolTiers.IRON));
    public static final RegistryObject<CustomFenceBlock> STEEL_FENCE = BLOCKS.register("steel_fence", () -> new CustomFenceBlock(steelProperties, ToolTypes.PICKAXE, ToolTiers.IRON));
    public static final RegistryObject<CustomFenceGateBlock> STEEL_FENCE_GATE = BLOCKS.register("steel_fence_gate", () -> new CustomFenceGateBlock(steelProperties, ToolTypes.PICKAXE, ToolTiers.IRON, steelWoodyType));

    public static void init()
    {
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}