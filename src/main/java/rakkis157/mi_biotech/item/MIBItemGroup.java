package rakkis157.mi_biotech.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import rakkis157.mi_biotech.MIBiotech;

public class MIBItemGroup {

    public static final ItemGroup MI_BIOTECH = FabricItemGroupBuilder.build(new Identifier(MIBiotech.MOD_ID, "group"),
            () -> new ItemStack(MIBItem.GREEN_AlGAE));

    /*public static final ItemGroup COURSE = FabricItemGroupBuilder.build(new Identifier(MCCourseMod.MOD_ID, "course"),
            () -> new ItemStack(ModItems.ORICHALCUM_INGOT));*/
}
