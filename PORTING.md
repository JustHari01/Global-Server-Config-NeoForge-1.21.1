# Port notes

- Upstream: TJT01/GlobalServerConfig, licensed under The Unlicense.
- Upstream behavior: override NeoForge's `ServerLifecycleHooks.getServerConfigPath` with `FMLPaths.CONFIGDIR`.
- Target: Minecraft 1.21.1, NeoForge 21.1.x.
- NeoForge 21.1 no longer provides the older Forge `IExtensionPoint.DisplayTest` / `NetworkConstants` API. A dedicated-server smoke test on NeoForge 21.1.259 loaded the mod to the normal `Done` marker and generated `config/neoforge-server.toml`; the per-world `world/serverconfig` directory was absent. The client/server handshake remains unverified, so client-side compatibility is unknown.
- The port contains no copied textures, models, audio, or other upstream art assets.
- Porting and runtime verification status is recorded in the task's release audit; upload remains pending account credential rotation and authenticated Modrinth access.
