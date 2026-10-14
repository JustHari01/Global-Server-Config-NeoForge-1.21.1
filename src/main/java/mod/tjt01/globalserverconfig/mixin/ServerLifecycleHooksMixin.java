package mod.tjt01.globalserverconfig.mixin;

import net.minecraft.server.MinecraftServer;
import net.neoforged.fml.loading.FMLPaths;
import net.neoforged.neoforge.server.ServerLifecycleHooks;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

import java.nio.file.Path;

@Mixin(value = ServerLifecycleHooks.class, remap = false)
public abstract class ServerLifecycleHooksMixin {
    /**
     * @author TJT01
     * @author JustHari01
     */
    @Overwrite(remap = false)
    private static Path getServerConfigPath(final MinecraftServer server) {
        return FMLPaths.CONFIGDIR.get();
    }
}
