package ru.college.i923v;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    // Регистрируем бур с прочностью 1000 и огнестойкостью
    public static final Item DRILL = Registry.register(
            Registries.ITEM,
            Identifier.of(ModDrill.MOD_ID, "drill"),
            new Item(new Item.Settings().maxCount(1).maxDamage(1000).fireproof())
    );

    public static void initialize() {
        // Метод пустой, так как регистрация происходит выше
    }
}