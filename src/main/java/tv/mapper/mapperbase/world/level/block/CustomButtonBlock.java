package tv.mapper.mapperbase.world.level.block;

import net.minecraft.world.level.block.ButtonBlock;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class CustomButtonBlock extends ButtonBlock implements ToolManager
{
    protected ToolTiers tier;
    protected ToolTypes tool;

    public CustomButtonBlock(Properties properties, ToolTypes tool, ToolTiers tier, BlockSetType blockSetType, int ticksToStayPressed, boolean arrowsCanPress)
    {
        super(properties, blockSetType, ticksToStayPressed, arrowsCanPress);
        this.tool = tool;
        this.tier = tier;
    }

    public CustomButtonBlock(Properties properties, ToolTypes tool, ToolTiers tier, BlockSetType blockSetType,  boolean arrowsCanPress)
    {
        this(properties, tool, tier, blockSetType, 30, true);
    }

    public CustomButtonBlock(Properties properties, ToolTypes tool, BlockSetType blockSetType, int ticksToStayPressed, boolean arrowsCanPress)
    {
        this(properties, tool, ToolTiers.WOOD, blockSetType, ticksToStayPressed, arrowsCanPress);
    }

    public CustomButtonBlock(Properties properties, ToolTypes tool, BlockSetType blockSetType)
    {
        this(properties, tool, ToolTiers.WOOD, blockSetType, 30, true);
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