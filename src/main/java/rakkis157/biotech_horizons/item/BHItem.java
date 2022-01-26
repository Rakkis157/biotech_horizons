package rakkis157.biotech_horizons.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import rakkis157.biotech_horizons.BiotechHorizons;

public class BHItem {

    public static final Item BLUE_AlGAE = registerItem("blue_algae");
    public static final Item BROWN_AlGAE = registerItem("brown_algae");
    public static final Item GREEN_AlGAE = registerItem("green_algae");

    private static Item registerItem(String name){
        return Registry.register(Registry.ITEM, new Identifier(BiotechHorizons.MOD_ID, name),
                new Item(new FabricItemSettings().group(BHItemGroup.MI_BIOTECH)));
    }

    public static void init(){
        System.out.println( BiotechHorizons.MOD_NAME + " Items Initialized");
    }
}
