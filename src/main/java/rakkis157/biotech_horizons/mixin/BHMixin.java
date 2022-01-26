package rakkis157.biotech_horizons.mixin;


import net.minecraft.client.gui.screen.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import rakkis157.biotech_horizons.BiotechHorizons;

@Mixin(TitleScreen.class)
public class BHMixin {
	@Inject(at = @At("HEAD"), method = "init()V")
	private void init(CallbackInfo info) {
		BiotechHorizons.LOGGER.info("This line is printed by an example mod mixin!");
	}
}
