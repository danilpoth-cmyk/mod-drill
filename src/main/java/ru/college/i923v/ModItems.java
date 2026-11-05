package ru.college.i923v;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    // Регистрируем инструмент (обычный Item с максимальным размером стопки 1)
    public static final Item DRILL = Registry.register(
            Registries.ITEM,
            Identifier.of("mod-drill", "drill"),
            new Item(new Item.Settings().maxCount(1))
    );

    public static void initialize() {
        // Пустой метод, чтобы вызывать его из главного класса (как требует методичка)
    }
}