// Generated by Dagger (https://dagger.dev).
package org.odk.collect.android.activities;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;
import org.odk.collect.android.permissions.PermissionsProvider;
import org.odk.collect.android.preferences.source.SettingsProvider;
import org.odk.collect.android.projects.CurrentProjectProvider;
import org.odk.collect.android.projects.ProjectImporter;
import org.odk.collect.android.version.VersionInformation;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class FirstLaunchActivity_MembersInjector implements MembersInjector<FirstLaunchActivity> {
  private final Provider<PermissionsProvider> permissionsProvider;

  private final Provider<SettingsProvider> settingsProvider;

  private final Provider<ProjectImporter> projectImporterProvider;

  private final Provider<VersionInformation> versionInformationProvider;

  private final Provider<CurrentProjectProvider> currentProjectProvider;

  public FirstLaunchActivity_MembersInjector(Provider<PermissionsProvider> permissionsProvider,
      Provider<SettingsProvider> settingsProvider,
      Provider<ProjectImporter> projectImporterProvider,
      Provider<VersionInformation> versionInformationProvider,
      Provider<CurrentProjectProvider> currentProjectProvider) {
    this.permissionsProvider = permissionsProvider;
    this.settingsProvider = settingsProvider;
    this.projectImporterProvider = projectImporterProvider;
    this.versionInformationProvider = versionInformationProvider;
    this.currentProjectProvider = currentProjectProvider;
  }

  public static MembersInjector<FirstLaunchActivity> create(
      Provider<PermissionsProvider> permissionsProvider,
      Provider<SettingsProvider> settingsProvider,
      Provider<ProjectImporter> projectImporterProvider,
      Provider<VersionInformation> versionInformationProvider,
      Provider<CurrentProjectProvider> currentProjectProvider) {
    return new FirstLaunchActivity_MembersInjector(permissionsProvider, settingsProvider, projectImporterProvider, versionInformationProvider, currentProjectProvider);
  }

  @Override
  public void injectMembers(FirstLaunchActivity instance) {
    CollectAbstractActivity_MembersInjector.injectPermissionsProvider(instance, permissionsProvider.get());
    CollectAbstractActivity_MembersInjector.injectSettingsProvider(instance, settingsProvider.get());
    injectProjectImporter(instance, projectImporterProvider.get());
    injectVersionInformation(instance, versionInformationProvider.get());
    injectCurrentProjectProvider(instance, currentProjectProvider.get());
  }

  @InjectedFieldSignature("org.odk.collect.android.activities.FirstLaunchActivity.projectImporter")
  public static void injectProjectImporter(FirstLaunchActivity instance,
      ProjectImporter projectImporter) {
    instance.projectImporter = projectImporter;
  }

  @InjectedFieldSignature("org.odk.collect.android.activities.FirstLaunchActivity.versionInformation")
  public static void injectVersionInformation(FirstLaunchActivity instance,
      VersionInformation versionInformation) {
    instance.versionInformation = versionInformation;
  }

  @InjectedFieldSignature("org.odk.collect.android.activities.FirstLaunchActivity.currentProjectProvider")
  public static void injectCurrentProjectProvider(FirstLaunchActivity instance,
      CurrentProjectProvider currentProjectProvider) {
    instance.currentProjectProvider = currentProjectProvider;
  }
}
