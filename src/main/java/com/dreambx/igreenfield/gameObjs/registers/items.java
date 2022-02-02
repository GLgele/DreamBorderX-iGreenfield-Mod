package com.dreambx.igreenfield.gameObjs.registers;

import com.dreambx.igreenfield.Utils;
import com.dreambx.igreenfield.gameObjs.items.ObsidianIngot;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.RegistryObject;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.DyeColor;
import net.minecraft.item.Item;
import net.minecraft.item.Rarity;

public class items {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Utils.MOD_ID);
    public static final RegistryObject<Item> obsidianIngot = ITEMS.register("obsidian_ingot", ObsidianIngot::new);
}

