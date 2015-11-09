package greymerk.roguelike.theme;

import greymerk.roguelike.worldgen.BlockStripes;
import greymerk.roguelike.worldgen.BlockWeightedRandom;
import greymerk.roguelike.worldgen.MetaBlock;
import greymerk.roguelike.worldgen.MetaStair;
import greymerk.roguelike.worldgen.blocks.ColorBlock;
import greymerk.roguelike.worldgen.blocks.DyeColor;
import greymerk.roguelike.worldgen.blocks.StairType;
import net.minecraft.block.BlockStoneBrick;
import net.minecraft.block.BlockStoneSlab;
import net.minecraft.init.Blocks;

public class ThemeEniko2 extends ThemeBase{

	public ThemeEniko2(){
		
		BlockStripes floor = new BlockStripes();
		floor.addBlock(ColorBlock.get(ColorBlock.CLAY, DyeColor.PINK));
		floor.addBlock(ColorBlock.get(ColorBlock.CLAY, DyeColor.PURPLE));
		
		BlockWeightedRandom walls = new BlockWeightedRandom();
		walls.addBlock(new MetaBlock(Blocks.stonebrick), 20);
		MetaBlock cracked = new MetaBlock(Blocks.stonebrick);
		cracked.withProperty(BlockStoneBrick.VARIANT_PROP, BlockStoneBrick.EnumType.CRACKED);
		walls.addBlock(cracked, 10);
		MetaBlock mossy = new MetaBlock(Blocks.stonebrick);
		mossy.withProperty(BlockStoneBrick.VARIANT_PROP, BlockStoneBrick.EnumType.CRACKED);
		walls.addBlock(new MetaBlock(mossy), 5);
		walls.addBlock(new MetaBlock(Blocks.cobblestone), 3);
		walls.addBlock(new MetaBlock(Blocks.gravel), 1);
		
		MetaStair stair = new MetaStair(StairType.STONEBRICK);
		MetaBlock pillar = new MetaBlock(Blocks.double_stone_slab);
		pillar.withProperty(BlockStoneSlab.SEAMLESS_PROP, true);
		pillar.withProperty(BlockStoneSlab.VARIANT_PROP, BlockStoneSlab.EnumType.STONE);
		
		this.primary = new BlockSet(floor, walls, stair, pillar);
		
		this.secondary =  primary;
	}
}
