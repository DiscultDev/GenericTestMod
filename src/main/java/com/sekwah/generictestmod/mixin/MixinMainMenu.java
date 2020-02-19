package com.sekwah.generictestmod.mixin;

import com.sekwah.generictestmod.GenericTestMod;
import net.minecraft.client.gui.screen.MainMenuScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(MainMenuScreen.class)
public class MixinMainMenu {

    @Inject(method = "init()V", at = @At("RETURN"))
    private void init(CallbackInfo ci) {
        GenericTestMod.LOGGER.debug("MAIN MENU INIT MIXIN");
    }

}
