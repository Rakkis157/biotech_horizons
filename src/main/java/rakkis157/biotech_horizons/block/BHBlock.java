package rakkis157.biotech_horizons.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import rakkis157.biotech_horizons.BiotechHorizons;
import rakkis157.biotech_horizons.item.BHItemGroup;

public class BHBlock {

    // Algae Blocks
    public static final Block BLUE_ALGAE_BLOCK = algaeBlock("blue");
    public static final Block BROWN_ALGAE_BLOCK = algaeBlock("brown");
    public static final Block GREEN_ALGAE_BLOCK = algaeBlock("green");

    // Minerals
    public static final Block PHOSPHORITE = mineralBlock("phosphorite");


    private static Block algaeBlock(String name){
        return registerBlock(name + "_algae_block", new Block(FabricBlockSettings.copy(Blocks.NETHER_WART_BLOCK)));
    }

    private static Block mineralBlock(String name){
        return registerBlock(name, new Block(FabricBlockSettings.copy(Blocks.ANDESITE)));
        //return registerBlock("polished_" + name, new Block(FabricBlockSettings.copy(Blocks.POLISHED_ANDESITE));
    }

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block, BHItemGroup.MI_BIOTECH);
        return Registry.register(Registry.BLOCK, new Identifier(BiotechHorizons.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group){
        return Registry.register(Registry.ITEM, new Identifier(BiotechHorizons.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void init(){
        System.out.println(BiotechHorizons.MOD_NAME + " Blocks Initialized");
    }
}
