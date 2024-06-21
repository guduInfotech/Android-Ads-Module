[1mdiff --git a/.gitignore b/.gitignore[m
[1mnew file mode 100644[m
[1mindex 0000000..aa724b7[m
[1m--- /dev/null[m
[1m+++ b/.gitignore[m
[36m@@ -0,0 +1,15 @@[m
[32m+[m[32m*.iml[m
[32m+[m[32m.gradle[m
[32m+[m[32m/local.properties[m
[32m+[m[32m/.idea/caches[m
[32m+[m[32m/.idea/libraries[m
[32m+[m[32m/.idea/modules.xml[m
[32m+[m[32m/.idea/workspace.xml[m
[32m+[m[32m/.idea/navEditor.xml[m
[32m+[m[32m/.idea/assetWizardSettings.xml[m
[32m+[m[32m.DS_Store[m
[32m+[m[32m/build[m
[32m+[m[32m/captures[m
[32m+[m[32m.externalNativeBuild[m
[32m+[m[32m.cxx[m
[32m+[m[32mlocal.properties[m
[1mdiff --git a/.idea/.name b/.idea/.name[m
[1mnew file mode 100644[m
[1mindex 0000000..f05d899[m
[1m--- /dev/null[m
[1m+++ b/.idea/.name[m
[36m@@ -0,0 +1 @@[m
[32m+[m[32mGudu Ads Helper[m
\ No newline at end of file[m
[1mdiff --git a/.idea/deploymentTargetSelector.xml b/.idea/deploymentTargetSelector.xml[m
[1mnew file mode 100644[m
[1mindex 0000000..b268ef3[m
[1m--- /dev/null[m
[1m+++ b/.idea/deploymentTargetSelector.xml[m
[36m@@ -0,0 +1,10 @@[m
[32m+[m[32m<?xml version="1.0" encoding="UTF-8"?>[m
[32m+[m[32m<project version="4">[m
[32m+[m[32m  <component name="deploymentTargetSelector">[m
[32m+[m[32m    <selectionStates>[m
[32m+[m[32m      <SelectionState runConfigName="app">[m
[32m+[m[32m        <option name="selectionMode" value="DROPDOWN" />[m
[32m+[m[32m      </SelectionState>[m
[32m+[m[32m    </selectionStates>[m
[32m+[m[32m  </component>[m
[32m+[m[32m</project>[m
\ No newline at end of file[m
[1mdiff --git a/.idea/gradle.xml b/.idea/gradle.xml[m
[1mnew file mode 100644[m
[1mindex 0000000..1912657[m
[1m--- /dev/null[m
[1m+++ b/.idea/gradle.xml[m
[36m@@ -0,0 +1,12 @@[m
[32m+[m[32m<?xml version="1.0" encoding="UTF-8"?>[m
[32m+[m[32m<project version="4">[m
[32m+[m[32m  <component name="GradleSettings">[m
[32m+[m[32m    <option name="linkedExternalProjectsSettings">[m
[32m+[m[32m      <GradleProjectSettings>[m
[32m+[m[32m        <option name="externalProjectPath" value="$PROJECT_DIR$" />[m
[32m+[m[32m        <option name="gradleJvm" value="jbr-17" />[m
[32m+[m[32m        <option name="resolveExternalAnnotations" value="false" />[m
[32m+[m[32m      </GradleProjectSettings>[m
[32m+[m[32m    </option>[m
[32m+[m[32m  </component>[m
[32m+[m[32m</project>[m
\ No newline at end of file[m
[1mdiff --git a/.idea/misc.xml b/.idea/misc.xml[m
[1mnew file mode 100644[m
[1mindex 0000000..6ed36dd[m
[1m--- /dev/null[m
[1m+++ b/.idea/misc.xml[m
[36m@@ -0,0 +1,4 @@[m
[32m+[m[32m<?xml version="1.0" encoding="UTF-8"?>[m
[32m+[m[32m<project version="4">[m
[32m+[m[32m  <component name="ExternalStorageConfigurationManager" enabled="true" />[m
[32m+[m[32m</project>[m
\ No newline at end of file[m
[1mdiff --git a/README.md b/README.md[m
[1mindex 94780e5..e69de29 100644[m
[1m--- a/README.md[m
[1m+++ b/README.md[m
[36m@@ -1 +0,0 @@[m
[31m-# Android-Ads-Helper-Lib[m
\ No newline at end of file[m
[1mdiff --git a/adshelper/.gitignore b/adshelper/.gitignore[m
[1mnew file mode 100644[m
[1mindex 0000000..42afabf[m
[1m--- /dev/null[m
[1m+++ b/adshelper/.gitignore[m
[36m@@ -0,0 +1 @@[m
[32m+[m[32m/build[m
\ No newline at end of file[m
[1mdiff --git a/adshelper/build.gradle b/adshelper/build.gradle[m
[1mnew file mode 100644[m
[1mindex 0000000..08630ea[m
[1m--- /dev/null[m
[1m+++ b/adshelper/build.gradle[m
[36m@@ -0,0 +1,98 @@[m
[32m+[m[32mplugins {[m
[32m+[m[32m    id 'com.android.library'[m
[32m+[m[32m    id 'kotlin-android'[m
[32m+[m[32m    id 'kotlin-parcelize'[m
[32m+[m[32m    id 'kotlin-kapt'[m
[32m+[m[32m    id 'maven-publish'[m
[32m+[m[32m}[m
[32m+[m
[32m+[m[32mandroid {[m
[32m+[m[32m    compileSdk 34[m
[32m+[m[32m    namespace "com.gudu.ads.module.helper"[m
[32m+[m[32m    defaultConfig {[m
[32m+[m[32m        minSdk 23[m
[32m+[m[32m        targetSdk 34[m
[3