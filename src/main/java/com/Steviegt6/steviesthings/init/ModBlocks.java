package com.Steviegt6.steviesthings.init;

import java.util.ArrayList;
import java.util.List;

import com.Steviegt6.steviesthings.blocks.BlockBase;
import com.Steviegt6.steviesthings.blocks.RubyBlock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks
{

	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block RUBY_BLOCK = new RubyBlock("ruby_block", Material.IRON);
	public static final Block RUBY_ORE = new BlockBase("ruby_ore", Material.ROCK);
	
}
