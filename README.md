# Fabric Template Mod

Stereo528's unofficial Fabric Template Mod. Mainly used because QSL 1.20.4 doesn't exist yet. highly unlikely to be maintained unless quilt doesn't update

## Usage

In order to use this mod as a template:

1. Create a new repository from this template with `Use this template`
2. Clone the recently-created repo on your PC
3. Make the necessary changes in order to make it yours:
    - Update `gradle.properties` in order to use your Maven group and mod ID
        - If you don't know which Maven group to use, and you are planning to host the mod's source code on GitHub, use `io.github.<Your_Username_Here>`
    - Update `fabric.mod.json` in order to reflect your mod's metadata
        - If you are planning to include (jar-in-jar) a mod, don't forget to declare its dependency on it!
        - The icon provided here is a placeholder one. If you aren't able to replace it yet, you can delete it and remove the "icon" property
    - Create a LICENSE file for this mod! If you don't know which license to use, check out [here](https://choosealicense.com/).
        - In `fabric.mod.json`, don't forget to put the license's [SPDX identifier](https://spdx.org/licenses/) under the `"license"` property in `"metadata"`.
        - The GPLv3 and AGPLv3 are not valid mod licenses, so you can use almost any license except for those.
    - Update the Java sub-directory structure so it reflects your Maven group
    - If the dependencies on `gradle/libs.versions.toml` isn't up-to-date, feel free to update them! The [linked utility](https://fabricmc.net/develop/) should help you in this easy and quick process.
4. The mod is now ready to be worked on!

##  Changes
- LazyDFU & Sodium are dev environment only mods
- MidnightLib is a dependency mod
- MidnightLib config system is set up already!

## License

This template is licensed under the [BSD-3-Clause "New" or "Revised" License](./LICENSE.md).

Mods created with this template are not automatically licensed under the BSD-3-Clause License, and are not required to give any kind of credit back to QuiltMC or Stereo528 for this template.
