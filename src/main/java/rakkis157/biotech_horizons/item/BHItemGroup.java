package rakkis157.biotech_horizons.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import rakkis157.biotech_horizons.BiotechHorizons;

public class BHItemGroup {

    public static final ItemGroup MI_BIOTECH = FabricItemGroupBuilder.build(new Identifier(BiotechHorizons.MOD_ID, "group"),
            () -> new ItemStack(BHItem.GREEN_AlGAE));


}
