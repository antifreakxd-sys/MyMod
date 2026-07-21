package com.example;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterials;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class TemplateMod implements ModInitializer {
    public static final String MOD_ID = "template-mod";

    // Создаём Рубин
    public static final Item RUBY = new Item(new Item.Settings());

    // Создаём Рубиновый меч (характеристики как у алмазного меча + урон)
    public static final Item RUBY_SWORD = new SwordItem(ToolMaterials.DIAMOND, 4, -2.4f, new Item.Settings());

    @Override
    public void onInitialize() {
        // Регистрируем предметы в игре
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "ruby"), RUBY);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "ruby_sword"), RUBY_SWORD);
    }
}
