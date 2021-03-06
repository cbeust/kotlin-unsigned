buildscript {

    repositories {
        gradleScriptKotlin()
    }

    dependencies {
        classpath(kotlinModule("gradle-plugin", "1.1.0-beta-17"))
    }
}

apply {
    plugin("kotlin")
    plugin("maven")
}

repositories {
    gradleScriptKotlin()
}

dependencies {
    compile(kotlinModule("stdlib", "1.1.0-beta-17"))
    testCompile("io.kotlintest:kotlintest:1.3.5")
}