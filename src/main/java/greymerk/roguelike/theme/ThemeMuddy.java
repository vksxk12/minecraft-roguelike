package greymerk.roguelike.theme;

import greymerk.roguelike.worldgen.BlockWeightedRandom;
import greymerk.roguelike.worldgen.MetaBlock;
import greymerk.roguelike.worldgen.MetaStair;
import greymerk.roguelike.worldgen.blocks.Log;
import greymerk.roguelike.worldgen.blocks.StairType;
import greymerk.roguelike.worldgen.blocks.Wood;
import net.minecraft.block.BlockStoneBrick;
import net.minecraft.init.Blocks;

public class ThemeMuddy extends ThemeBase{

	public ThemeMuddy(){
	
		BlockWeightedRandom floor = new BlockWeightedRandom();
		floor.addBlock(new MetaBlock(Blocks.flowing_water), 10);
		floor.addBlock(new MetaBlock(Blocks.clay), 3);
		floor.addBlock(new MetaBlock(Blocks.dirt), 1);
		
		BlockWeightedRandom walls = new BlockWeightedRandom();
		walls.addBlock(new MetaBlock(Blocks.cobblestone), 50);
		walls.addBlock(new MetaBlock(Blocks.mossy_cobblestone), 30);
		MetaBlock cracked = new MetaBlock(Blocks.stonebrick);
		cracked.withProperty(BlockStoneBrick.VARIANT_PROP, BlockStoneBrick.EnumType.CRACKED);
		walls.addBlock(cracked, 10);
		walls.addBlock(new MetaBlock(Blocks.dirt), 15);
		walls.addBlock(new MetaBlock(Blocks.clay), 30);
		walls.addBlock(new MetaBlock(Blocks.gravel), 15);
		
		MetaStair stair = new MetaStair(StairType.COBBLE);
		
		MetaBlock mossy = new MetaBlock(Blocks.stonebrick);
		mossy.withProperty(BlockStoneBrick.VARIANT_PROP, BlockStoneBrick.EnumType.MOSSY);
		MetaBlock pillar = mossy;
		
		this.primary = new BlockSet(floor, walls, stair, pillar);
		
		MetaBlock segmentWall = Log.getLog(Wood.DARKOAK);
		MetaStair segmentStair = new MetaStair(StairType.DARKOAK);

		
		this.secondary = new BlockSet(floor, segmentWall, segmentStair, segmentWall);
	}
}
