package com.example;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterials;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TemplateMod implements ModInitializer {
    public static final String MOD_ID = "template-mod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    // Регистрация Рубинового Меча (Урон: 10, Скорость: -2.4f)
    public static final Item RUBY_SWORD = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "ruby_sword"),
        new SwordItem(
            ToolMaterials.NETHERITE,
            4,
            -2.4f,
            new Item.Settings()
        )
    );

    @Override
    public void onInitialize() {
        LOGGER.info("Рубиновый меч успешно инициализирован!");
    }
}