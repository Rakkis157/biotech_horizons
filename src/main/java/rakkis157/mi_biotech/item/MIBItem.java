package rakkis157.mi_biotech.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import rakkis157.mi_biotech.MIBiotech;

public class MIBItem {

    public static final Item BLUE_AlGAE = registerItem("blue_algae");
    public static final Item BROWN_AlGAE = registerItem("brown_algae");
    public static final Item GREEN_AlGAE = registerItem("green_algae");

    private static Item registerItem(String name){
        return Registry.register(Registry.ITEM, new Identifier(MIBiotech.MOD_ID, name),
                new Item(new FabricItemSettings().group(MIBItemGroup.MI_BIOTECH)));
    }

    public static void init(){
        System.out.println( MIBiotech.MOD_NAME + " Items Initialized");
    }
}
