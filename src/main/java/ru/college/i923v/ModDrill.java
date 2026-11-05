package ru.college.i923v;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ModDrill implements ModInitializer {

    // Идентификатор нашего мода (должен совпадать с тем, что в fabric.mod.json)
    public static final String MOD_ID = "mod-drill";

    // Логгер для вывода сообщений
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        // То самое сообщение из прошлой лабы
        LOGGER.info("Проект загружен успешно");

        // Вызываем инициализацию наших предметов (бура)
        ModItems.initialize();
    }
}