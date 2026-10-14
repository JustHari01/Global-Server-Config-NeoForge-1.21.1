# Global Server Config — NeoForge 1.21.1

An unofficial NeoForge port of [Global Server Config by TJT01](https://modrinth.com/mod/global-server-config). The original project changes the server configuration path so all worlds in one game directory use the shared `config` folder. This port keeps that behavior for Minecraft 1.21.1 on NeoForge.

## Install and behavior

Install the mod on the NeoForge server. Server configuration files are read from the shared `config` directory instead of each world's `serverconfig` directory. Existing world-specific files are left in place, but they will not be the active files while this mod is loaded. A dedicated-server startup smoke test confirmed that the mod loads and creates `neoforge-server.toml` in the shared config directory. Whether an unmodded client can join has not been tested; client-side compatibility is currently unknown.

This is a narrow loader/version port. It does not add new settings or migrate existing config files.

## Attribution and license

Original source: [TJT01/GlobalServerConfig](https://github.com/TJT01/GlobalServerConfig). The upstream source is released under The Unlicense; its license text is included here. The mod ID and package remain unchanged to preserve upstream compatibility.

AI-assisted porting disclosure: AI assistance was used to adapt and test this NeoForge port; the original project and its authors are credited above.
