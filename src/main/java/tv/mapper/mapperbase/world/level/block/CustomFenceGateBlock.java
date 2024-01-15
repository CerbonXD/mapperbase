package tv.mapper.mapperbase.world.level.block;

import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.state.properties.WoodType;

public class CustomFenceGateBlock extends FenceGateBlock implements ToolManager
{
    private ToolTiers tier;
    private ToolTypes tool;

    public CustomFenceGateBlock(Properties properties, ToolTypes tool, WoodType woodType)
    {
        this(properties, tool, ToolTiers.WOOD, woodType);
    }

    public CustomFenceGateBlock(Properties properties, ToolTypes tool, ToolTiers tier, WoodType woodType)
    {
        super(properties, woodType);
        this.tool = tool;
        this.tier = tier;
    }

    @Override
    public ToolTiers getTier()
    {
        return this.tier;
    }

    @Override
    public ToolTypes getTool()
    {
        return this.tool;
    }
}