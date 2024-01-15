package tv.mapper.mapperbase.world.level.block;

import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class CustomDoorBlock extends DoorBlock implements ToolManager
{
    protected ToolTiers tier;
    protected ToolTypes tool;

    public CustomDoorBlock(Properties properties, ToolTypes tool, BlockSetType blockSetType)
    {
        this(properties, tool, ToolTiers.WOOD, blockSetType);
    }

    public CustomDoorBlock(Properties properties, ToolTypes tool, ToolTiers tier, BlockSetType blockSetType)
    {
        super(properties, blockSetType);
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