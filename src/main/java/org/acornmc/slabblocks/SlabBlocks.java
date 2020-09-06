package org.acornmc.slabblocks;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapelessRecipe;
import org.bukkit.plugin.java.JavaPlugin;

public final class SlabBlocks extends JavaPlugin {

    @Override
    public void onEnable() {
        // Oak Planks
        ItemStack oakPlanksItem = new ItemStack(Material.OAK_PLANKS);
        NamespacedKey oakPlanksKey = new NamespacedKey(this, "OAK_PLANKS");
        ShapelessRecipe oakPlanksRecipe = new ShapelessRecipe(oakPlanksKey, oakPlanksItem);
        oakPlanksRecipe.addIngredient(2, Material.OAK_SLAB);
        // Spruce Planks
        ItemStack sprucePlanksItem = new ItemStack(Material.SPRUCE_PLANKS);
        NamespacedKey sprucePlanksKey = new NamespacedKey(this, "SPRUCE_PLANKS");
        ShapelessRecipe sprucePlanksRecipe = new ShapelessRecipe(sprucePlanksKey, sprucePlanksItem);
        sprucePlanksRecipe.addIngredient(2, Material.SPRUCE_SLAB);
        // Birch Planks
        ItemStack birchPlanksItem = new ItemStack(Material.BIRCH_PLANKS);
        NamespacedKey birchPlanksKey = new NamespacedKey(this, "BIRCH_PLANKS");
        ShapelessRecipe birchPlanksRecipe = new ShapelessRecipe(birchPlanksKey, birchPlanksItem);
        birchPlanksRecipe.addIngredient(2, Material.BIRCH_SLAB);
        // Jungle Plank
        ItemStack junglePlanksItem = new ItemStack(Material.JUNGLE_PLANKS);
        NamespacedKey junglePlanksKey = new NamespacedKey(this, "JUNGLE_PLANKS");
        ShapelessRecipe junglePlanksRecipe = new ShapelessRecipe(junglePlanksKey, junglePlanksItem);
        junglePlanksRecipe.addIngredient(2, Material.JUNGLE_SLAB);
        // Acacia Planks
        ItemStack acaciaPlanksItem = new ItemStack(Material.ACACIA_PLANKS);
        NamespacedKey acaciaPlanksKey = new NamespacedKey(this, "ACACIA_PLANKS");
        ShapelessRecipe acaciaPlanksRecipe = new ShapelessRecipe(acaciaPlanksKey, acaciaPlanksItem);
        acaciaPlanksRecipe.addIngredient(2, Material.ACACIA_SLAB);
        // Dark Oak Planks
        ItemStack darkOakPlanksItem = new ItemStack(Material.DARK_OAK_PLANKS);
        NamespacedKey darkOakPlanksKey = new NamespacedKey(this, "DARK_OAK_PLANKS");
        ShapelessRecipe darkOakPlanksRecipe = new ShapelessRecipe(darkOakPlanksKey, darkOakPlanksItem);
        darkOakPlanksRecipe.addIngredient(2, Material.DARK_OAK_SLAB);
        // Crimson
        ItemStack crimsonPlanksItem = new ItemStack(Material.CRIMSON_PLANKS);
        NamespacedKey crimsonPlanksKey = new NamespacedKey(this, "CRIMSON_PLANKS");
        ShapelessRecipe crimsonPlanksRecipe = new ShapelessRecipe(crimsonPlanksKey, crimsonPlanksItem);
        crimsonPlanksRecipe.addIngredient(2, Material.CRIMSON_SLAB);
        // Warped
        ItemStack warpedPlanksItem = new ItemStack(Material.WARPED_PLANKS);
        NamespacedKey warpedPlanksKey = new NamespacedKey(this, "WARPED_PLANKS");
        ShapelessRecipe warpedPlanksRecipe = new ShapelessRecipe(warpedPlanksKey, warpedPlanksItem);
        warpedPlanksRecipe.addIngredient(2, Material.WARPED_SLAB);
        // Stone
        ItemStack stoneItem = new ItemStack(Material.STONE);
        NamespacedKey stoneKey = new NamespacedKey(this, "STONE");
        ShapelessRecipe stoneRecipe = new ShapelessRecipe(stoneKey, stoneItem);
        stoneRecipe.addIngredient(2, Material.STONE_SLAB);
        // Smooth Stone
        ItemStack smoothStoneItem = new ItemStack(Material.SMOOTH_STONE);
        NamespacedKey smoothStoneKey = new NamespacedKey(this, "SMOOTH_STONE");
        ShapelessRecipe smoothStoneRecipe = new ShapelessRecipe(smoothStoneKey, smoothStoneItem);
        smoothStoneRecipe.addIngredient(2, Material.SMOOTH_STONE_SLAB);
        // Sandstone
        ItemStack sandstoneItem = new ItemStack(Material.SANDSTONE);
        NamespacedKey sandstoneKey = new NamespacedKey(this, "SANDSTONE");
        ShapelessRecipe sandstoneRecipe = new ShapelessRecipe(sandstoneKey, sandstoneItem);
        sandstoneRecipe.addIngredient(2, Material.SANDSTONE_SLAB);
        // Cut Sandstone
        ItemStack cutSandstoneItem = new ItemStack(Material.CUT_SANDSTONE);
        NamespacedKey cutSandstoneKey = new NamespacedKey(this, "CUT_SANDSTONE");
        ShapelessRecipe cutSandstoneRecipe = new ShapelessRecipe(cutSandstoneKey, cutSandstoneItem);
        cutSandstoneRecipe.addIngredient(2, Material.CUT_SANDSTONE_SLAB);
        // Cobblestone
        ItemStack cobblestoneItem = new ItemStack(Material.COBBLESTONE);
        NamespacedKey cobblestoneKey = new NamespacedKey(this, "COBBLESTONE");
        ShapelessRecipe cobblestoneRecipe = new ShapelessRecipe(cobblestoneKey, cobblestoneItem);
        cobblestoneRecipe.addIngredient(2, Material.COBBLESTONE_SLAB);
        // Bricks
        ItemStack bricksItem = new ItemStack(Material.BRICKS);
        NamespacedKey bricksKey = new NamespacedKey(this, "BRICKS");
        ShapelessRecipe bricksRecipe = new ShapelessRecipe(bricksKey, bricksItem);
        bricksRecipe.addIngredient(2, Material.BRICK_SLAB);
        // Stone Bricks
        ItemStack stoneBricksItem = new ItemStack(Material.STONE_BRICKS);
        NamespacedKey stoneBricksKey = new NamespacedKey(this, "STONE_BRICKS");
        ShapelessRecipe stoneBricksRecipe = new ShapelessRecipe(stoneBricksKey, stoneBricksItem);
        stoneBricksRecipe.addIngredient(2, Material.STONE_BRICK_SLAB);
        // Nether Bricks
        ItemStack netherBricksItem = new ItemStack(Material.NETHER_BRICKS);
        NamespacedKey netherBricksKey = new NamespacedKey(this, "NETHER_BRICKS");
        ShapelessRecipe netherBricksRecipe = new ShapelessRecipe(netherBricksKey, netherBricksItem);
        netherBricksRecipe.addIngredient(2, Material.NETHER_BRICK_SLAB);
        // Quartz
        ItemStack quartzItem = new ItemStack(Material.QUARTZ_BLOCK);
        NamespacedKey quartzKey = new NamespacedKey(this, "QUARTZ_BLOCK");
        ShapelessRecipe quartzRecipe = new ShapelessRecipe(quartzKey, quartzItem);
        quartzRecipe.addIngredient(2, Material.QUARTZ_SLAB);
        // Red Sandstone
        ItemStack redSandstoneItem = new ItemStack(Material.CUT_RED_SANDSTONE);
        NamespacedKey redSandstoneKey = new NamespacedKey(this, "RED_SANDSTONE");
        ShapelessRecipe redSandstoneRecipe = new ShapelessRecipe(redSandstoneKey, redSandstoneItem);
        redSandstoneRecipe.addIngredient(2, Material.CUT_RED_SANDSTONE_SLAB);
        // Cut Red Sandstone
        ItemStack cutRedSandstoneItem = new ItemStack(Material.CUT_RED_SANDSTONE);
        NamespacedKey cutRedSandstoneKey = new NamespacedKey(this, "CUT_RED_SANDSTONE");
        ShapelessRecipe cutRedSandstoneRecipe = new ShapelessRecipe(cutRedSandstoneKey, cutRedSandstoneItem);
        cutRedSandstoneRecipe.addIngredient(2, Material.CUT_RED_SANDSTONE_SLAB);
        // PurPur
        ItemStack purpurItem = new ItemStack(Material.PURPUR_BLOCK);
        NamespacedKey purpurKey = new NamespacedKey(this, "PURPUR_BLOCK");
        ShapelessRecipe purpurRecipe = new ShapelessRecipe(purpurKey, purpurItem);
        purpurRecipe.addIngredient(2, Material.PURPUR_SLAB);
        // Prismarine
        ItemStack prismarineItem = new ItemStack(Material.PRISMARINE);
        NamespacedKey prismarineKey = new NamespacedKey(this, "PRISMARINE");
        ShapelessRecipe prismarineRecipe = new ShapelessRecipe(prismarineKey, prismarineItem);
        prismarineRecipe.addIngredient(2, Material.PRISMARINE_SLAB);
        // Prismarine Bricks
        ItemStack prismarineBricksItem = new ItemStack(Material.PRISMARINE_BRICKS);
        NamespacedKey prismarineBricksKey = new NamespacedKey(this, "PRISMARINE_BRICKS");
        ShapelessRecipe prismarineBricksRecipe = new ShapelessRecipe(prismarineBricksKey, prismarineBricksItem);
        prismarineBricksRecipe.addIngredient(2, Material.PRISMARINE_BRICK_SLAB);
        // Dark Prismarine
        ItemStack darkPrismarineItem = new ItemStack(Material.DARK_PRISMARINE);
        NamespacedKey darkPrismarineKey = new NamespacedKey(this, "DARK_PRISMARINE");
        ShapelessRecipe darkPrismarineRecipe = new ShapelessRecipe(darkPrismarineKey, darkPrismarineItem);
        darkPrismarineRecipe.addIngredient(2, Material.DARK_PRISMARINE_SLAB);
        // Polished Granite
        ItemStack polishedGraniteItem = new ItemStack(Material.POLISHED_GRANITE);
        NamespacedKey polishedGraniteKey = new NamespacedKey(this, "POLISHED_GRANITE");
        ShapelessRecipe polishedGraniteRecipe = new ShapelessRecipe(polishedGraniteKey, polishedGraniteItem);
        polishedGraniteRecipe.addIngredient(2, Material.POLISHED_GRANITE_SLAB);
        // Smooth Red Sandstone
        ItemStack smoothRedSandstoneItem = new ItemStack(Material.SMOOTH_RED_SANDSTONE);
        NamespacedKey smoothRedSandstoneKey = new NamespacedKey(this, "SMOOTH_RED_SANDSTONE");
        ShapelessRecipe smoothRedSandstoneRecipe = new ShapelessRecipe(smoothRedSandstoneKey, smoothRedSandstoneItem);
        smoothRedSandstoneRecipe.addIngredient(2, Material.SMOOTH_RED_SANDSTONE_SLAB);
        // Mossy Stone Bricks
        ItemStack mossyStoneBricksItem = new ItemStack(Material.MOSSY_STONE_BRICKS);
        NamespacedKey mossyStoneBricksKey = new NamespacedKey(this, "MOSSY_STONE_BRICKS");
        ShapelessRecipe mossyStoneBricksRecipe = new ShapelessRecipe(mossyStoneBricksKey, mossyStoneBricksItem);
        mossyStoneBricksRecipe.addIngredient(2, Material.MOSSY_STONE_BRICK_SLAB);
        // Polished Diorite
        ItemStack polishedDioriteItem = new ItemStack(Material.POLISHED_DIORITE);
        NamespacedKey polishedDioriteKey = new NamespacedKey(this, "POLISHED_DIORITE");
        ShapelessRecipe polishedDioriteRecipe = new ShapelessRecipe(polishedDioriteKey, polishedDioriteItem);
        polishedDioriteRecipe.addIngredient(2, Material.POLISHED_DIORITE_SLAB);
        // Mossy Cobblestone
        ItemStack mossyCobblestoneItem = new ItemStack(Material.MOSSY_COBBLESTONE);
        NamespacedKey mossyCobblestoneKey = new NamespacedKey(this, "MOSSY_COBBLESTONE");
        ShapelessRecipe mossyCobblestoneRecipe = new ShapelessRecipe(mossyCobblestoneKey, mossyCobblestoneItem);
        mossyCobblestoneRecipe.addIngredient(2, Material.MOSSY_COBBLESTONE_SLAB);
        // End Stone Bricks
        ItemStack endStoneBricksItem = new ItemStack(Material.END_STONE_BRICKS);
        NamespacedKey endStoneBricksKey = new NamespacedKey(this, "END_STONE_BRICKS");
        ShapelessRecipe endStoneBricksRecipe = new ShapelessRecipe(endStoneBricksKey, endStoneBricksItem);
        endStoneBricksRecipe.addIngredient(2, Material.END_STONE_BRICK_SLAB);
        // Smooth Sandstone
        ItemStack smoothSandstoneItem = new ItemStack(Material.SMOOTH_SANDSTONE);
        NamespacedKey smoothSandstoneKey = new NamespacedKey(this, "SMOOTH_SANDSTONE");
        ShapelessRecipe smoothSandstoneRecipe = new ShapelessRecipe(smoothSandstoneKey, smoothSandstoneItem);
        smoothSandstoneRecipe.addIngredient(2, Material.SMOOTH_SANDSTONE_SLAB);
        // Smooth Quartz
        ItemStack smoothQuartzItem = new ItemStack(Material.SMOOTH_QUARTZ);
        NamespacedKey smoothQuartzKey = new NamespacedKey(this, "SMOOTH_QUARTZ");
        ShapelessRecipe smoothQuartzRecipe = new ShapelessRecipe(smoothQuartzKey, smoothQuartzItem);
        smoothQuartzRecipe.addIngredient(2, Material.SMOOTH_QUARTZ_SLAB);
        // Granite
        ItemStack graniteItem = new ItemStack(Material.GRANITE);
        NamespacedKey graniteKey = new NamespacedKey(this, "GRANITE");
        ShapelessRecipe graniteRecipe = new ShapelessRecipe(graniteKey, graniteItem);
        graniteRecipe.addIngredient(2, Material.GRANITE_SLAB);
        // Andesite
        ItemStack andesiteItem = new ItemStack(Material.ANDESITE);
        NamespacedKey andesiteKey = new NamespacedKey(this, "ANDESITE");
        ShapelessRecipe andesiteRecipe = new ShapelessRecipe(andesiteKey, andesiteItem);
        andesiteRecipe.addIngredient(2, Material.ANDESITE_SLAB);
        // Red Nether Bricks
        ItemStack redNetherBricksItem = new ItemStack(Material.RED_NETHER_BRICKS);
        NamespacedKey redNetherBricksKey = new NamespacedKey(this, "RED_NETHER_BRICKS");
        ShapelessRecipe redNetherBricksRecipe = new ShapelessRecipe(redNetherBricksKey, redNetherBricksItem);
        redNetherBricksRecipe.addIngredient(2, Material.RED_NETHER_BRICK_SLAB);
        // Polished Andesite
        ItemStack polishedAndesiteItem = new ItemStack(Material.POLISHED_ANDESITE);
        NamespacedKey polishedAndesiteKey = new NamespacedKey(this, "POLISHED_ANDESITE");
        ShapelessRecipe polishedAndesiteRecipe = new ShapelessRecipe(polishedAndesiteKey, polishedAndesiteItem);
        polishedAndesiteRecipe.addIngredient(2, Material.POLISHED_ANDESITE_SLAB);
        // Diorite
        ItemStack dioriteItem = new ItemStack(Material.DIORITE);
        NamespacedKey dioriteKey = new NamespacedKey(this, "DIORITE");
        ShapelessRecipe dioriteRecipe = new ShapelessRecipe(dioriteKey, dioriteItem);
        dioriteRecipe.addIngredient(2, Material.DIORITE_SLAB);
        // Blackstone
        ItemStack blackstoneItem = new ItemStack(Material.BLACKSTONE);
        NamespacedKey blackstoneKey = new NamespacedKey(this, "BLACKSTONE");
        ShapelessRecipe blackstoneRecipe = new ShapelessRecipe(blackstoneKey, blackstoneItem);
        blackstoneRecipe.addIngredient(2, Material.BLACKSTONE_SLAB);

        ItemStack polishedBlackstoneItem = new ItemStack(Material.POLISHED_BLACKSTONE);
        NamespacedKey polishedBlackstoneKey = new NamespacedKey(this, "POLISHED_BLACKSTONE");
        ShapelessRecipe polishedBlackstoneRecipe = new ShapelessRecipe(polishedBlackstoneKey, polishedBlackstoneItem);
        polishedBlackstoneRecipe.addIngredient(2, Material.POLISHED_BLACKSTONE_SLAB);

        ItemStack polishedBlackstoneBrickItem = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
        NamespacedKey polishedBlackstoneBrickKey = new NamespacedKey(this, "POLISHED_BLACKSTONE_BRICKS");
        ShapelessRecipe polishedBlackstoneBrickRecipe = new ShapelessRecipe(polishedBlackstoneBrickKey, polishedBlackstoneBrickItem);
        polishedBlackstoneBrickRecipe.addIngredient(2, Material.POLISHED_BLACKSTONE_BRICK_SLAB);

        // Add Recipes
        Bukkit.addRecipe(oakPlanksRecipe);
        Bukkit.addRecipe(sprucePlanksRecipe);
        Bukkit.addRecipe(birchPlanksRecipe);
        Bukkit.addRecipe(junglePlanksRecipe);
        Bukkit.addRecipe(acaciaPlanksRecipe);
        Bukkit.addRecipe(darkOakPlanksRecipe);
        Bukkit.addRecipe(crimsonPlanksRecipe);
        Bukkit.addRecipe(warpedPlanksRecipe);
        Bukkit.addRecipe(stoneRecipe);
        Bukkit.addRecipe(smoothStoneRecipe);
        Bukkit.addRecipe(sandstoneRecipe);
        Bukkit.addRecipe(cutSandstoneRecipe);
        Bukkit.addRecipe(cobblestoneRecipe);
        Bukkit.addRecipe(bricksRecipe);
        Bukkit.addRecipe(stoneBricksRecipe);
        Bukkit.addRecipe(netherBrickRecipe);
        Bukkit.addRecipe(quartzRecipe);
        Bukkit.addRecipe(redSandstoneRecipe);
        Bukkit.addRecipe(cutRedSandstoneRecipe);
        Bukkit.addRecipe(purpurRecipe);
        Bukkit.addRecipe(prismarineRecipe);
        Bukkit.addRecipe(prismarineBricksRecipe);
        Bukkit.addRecipe(darkPrismarineRecipe);
        Bukkit.addRecipe(polishedGraniteRecipe);
        Bukkit.addRecipe(smoothRedSandstoneRecipe);
        Bukkit.addRecipe(mossyStoneBricksRecipe);
        Bukkit.addRecipe(polishedDioriteRecipe);
        Bukkit.addRecipe(mossyCobblestoneRecipe);
        Bukkit.addRecipe(endStoneBricksRecipe);
        Bukkit.addRecipe(smoothSandstoneRecipe);
        Bukkit.addRecipe(smoothQuartzRecipe);
        Bukkit.addRecipe(graniteRecipe);
        Bukkit.addRecipe(andesiteRecipe);
        Bukkit.addRecipe(redNetherBricksRecipe);
        Bukkit.addRecipe(polishedAndesiteRecipe);
        Bukkit.addRecipe(dioriteRecipe);
        Bukkit.addRecipe(blackstoneRecipe);
        Bukkit.addRecipe(polishedBlackstoneRecipe);
        Bukkit.addRecipe(polishedBlackstoneBrickRecipe);
    }

    @Override
    public void onDisable() {

    }
}
