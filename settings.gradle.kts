rootProject.name = "farmersdelight"

dependencyResolutionManagement {
    @Suppress("UnstableApiUsage")
    repositories {
        mavenCentral()
        maven("https://papermc.io/repo/repository/maven-public/")
        maven("https://repo.xenondevs.xyz/releases/")
    }
    versionCatalogs {
        create("libs") {
            // Nova 0.25.x targets Minecraft 26.3 and replaces the 0.24 API.
            from("xyz.xenondevs.nova:catalog:0.25.0-alpha.5")
        }
    }
}

pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenCentral()
        maven("https://papermc.io/repo/repository/maven-public/")
        maven("https://repo.xenondevs.xyz/releases/")
    }
}
