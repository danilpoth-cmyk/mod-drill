package ru.college.i923v;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.player.UseItemCallback;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;
import net.minecraft.text.Text;
import net.minecraft.util.TypedActionResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ModDrill implements ModInitializer {

    public static final String MOD_ID = "mod-drill";

    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {

        LOGGER.info("Проект загружен успешно");

        ModItems.initialize();

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> entries.add(ModItems.DRILL));

        UseItemCallback.EVENT.register((player, world, hand) -> {

            if (player.getStackInHand(hand).isOf(ModItems.DRILL)) {

                if (!world.isClient()) {

                    player.sendMessage(Text.literal("Бур активирован!"), false);
                }

                return TypedActionResult.success(player.getStackInHand(hand));
            }

            return TypedActionResult.pass(player.getStackInHand(hand));
        });
    }
}