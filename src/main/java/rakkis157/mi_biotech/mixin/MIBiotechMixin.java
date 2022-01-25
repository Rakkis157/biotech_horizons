package rakkis157.mi_biotech.mixin;


import net.minecraft.client.gui.screen.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import rakkis157.mi_biotech.MIBiotech;

@Mixin(TitleScreen.class)
public class MIBiotechMixin {
	@Inject(at = @At("HEAD"), method = "init()V")
	private void init(CallbackInfo info) {
		MIBiotech.LOGGER.info("This line is printed by an example mod mixin!");
	}
}
