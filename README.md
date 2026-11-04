# Farmer's Delight - Nova Addon
*Based on vectorwing's [FarmersDelight mod](https://github.com/vectorwing/FarmersDelight)*

<img src="https://i.imgur.com/aDELzhM.png" width="50%">
<p align="center">
  <a href="https://github.com/NexLab-ceo/NovaFarmersDelight/stargazers">
    <img src="https://img.shields.io/github/stars/NexLab-ceo/NovaFarmersDelight">
  </a>
  <a href="https://github.com/NexLab-ceo/NovaFarmersDelight/releases">
    <img src="https://img.shields.io/github/downloads/NexLab-ceo/NovaFarmersDelight/total.svg">
  </a>
</p>
---

<img src="https://i.imgur.com/Iy0ddGy.png" width="45%"> <img src="https://i.imgur.com/Ktk1Pee.png" width="45%">

## Compatibility

- Minecraft Java **26.3**
- Paper **26.3**
- Nova **0.25.0-alpha.5** (addon API/catalog)
- Java **25**

This branch is the 26.3 port. Nova 0.24.x and Minecraft 26.2 are not supported by this build.

## Overview

**Farmer's Delight** is a Nova Addon that brings the beloved farming and cooking mechanics of the original **Farmer's Delight** mod into Paper servers using the [**Nova Framework**](https://github.com/xenondevs/Nova).

With an intuitive cooking system and a variety of familiar ingredients, players can prepare **delicious meals** such as sandwiches, salads, stews, desserts, and more. Additionally, this addon introduces **decorative blocks and items** for immersive builds.

Whether you're running a survival server, an RPG world, or just want to enhance the farming and cooking aspects of Minecraft, this plugin is for you!

## Features
- 🍽 **Cooking System** – Craft and cook a variety of meals with unique effects.
- 🛠 **New Tools & Equipment** – Scavenge, prepare, and store food efficiently.
- 🏡 **Decorative Elements** – Customize kitchens, farms, and more.

<img width="534" height="1326" alt="image" src="https://github.com/user-attachments/assets/73249fce-c7af-4904-b132-7fa621c5a430" />

## Build

Use JDK 25 and run:

```bash
./gradlew addonJar -PoutDir=artifacts
```

The addon JAR will be written to `artifacts/`.

## Installation
1. Install a Paper server for Minecraft 26.3.
2. Install [Nova 0.25.0-alpha.5](https://github.com/xenondevs/Nova/releases/tag/0.25.0-alpha.5).
3. Put Nova and the FarmersDelight addon JAR in the server's `plugins/` folder.
4. Restart the server.

## Configuration
The addon comes with config files in `plugins/FarmersDelight`, allowing server owners to adjust mechanics, balance recipes, and tweak gameplay elements.

## Contributing
- Report issues or suggest features via GitHub Issues.
- Submit pull requests with optimizations and fixes.

## Support
If you encounter any issues or have feature requests, please open an issue on GitHub.

Happy farming! 🌾🍽
