// Generated by Dagger (https://dagger.dev).
package org.odk.collect.android.preferences.screens;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;
import org.odk.collect.android.configure.SettingsChangeHandler;
import org.odk.collect.android.preferences.source.SettingsProvider;
import org.odk.collect.android.preferences.source.SettingsStore;
import org.odk.collect.android.projects.CurrentProjectProvider;
import org.odk.collect.android.projects.ProjectDeleter;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ProjectManagementPreferencesFragment_MembersInjector implements MembersInjector<ProjectManagementPreferencesFragment> {
  private final Provider<SettingsChangeHandler> settingsChangeHandlerProvider;

  private final Provider<SettingsProvider> settingsProvider;

  private final Provider<CurrentProjectProvider> currentProjectProvider;

  private final Provider<SettingsStore> adminSettingsStoreProvider;

  private final Provider<ProjectDeleter> projectDeleterProvider;

  public ProjectManagementPreferencesFragment_MembersInjector(
      Provider<SettingsChangeHandler> settingsChangeHandlerProvider,
      Provider<SettingsProvider> settingsProvider,
      Provider<CurrentProjectProvider> currentProjectProvider,
      Provider<SettingsStore> adminSettingsStoreProvider,
      Provider<ProjectDeleter> projectDeleterProvider) {
    this.settingsChangeHandlerProvider = settingsChangeHandlerProvider;
    this.settingsProvider = settingsProvider;
    this.currentProjectProvider = currentProjectProvider;
    this.adminSettingsStoreProvider = adminSettingsStoreProvider;
    this.projectDeleterProvider = projectDeleterProvider;
  }

  public static MembersInjector<ProjectManagementPreferencesFragment> create(
      Provider<SettingsChangeHandler> settingsChangeHandlerProvider,
      Provider<SettingsProvider> settingsProvider,
      Provider<CurrentProjectProvider> currentProjectProvider,
      Provider<SettingsStore> adminSettingsStoreProvider,
      Provider<ProjectDeleter> projectDeleterProvider) {
    return new ProjectManagementPreferencesFragment_MembersInjector(settingsChangeHandlerProvider, settingsProvider, currentProjectProvider, adminSettingsStoreProvider, projectDeleterProvider);
  }

  @Override
  public void injectMembers(ProjectManagementPreferencesFragment instance) {
    BasePreferencesFragment_MembersInjector.injectSettingsChangeHandler(instance, settingsChangeHandlerProvider.get());
    BasePreferencesFragment_MembersInjector.injectSettingsProvider(instance, settingsProvider.get());
    BasePreferencesFragment_MembersInjector.injectCurrentProjectProvider(instance, currentProjectProvider.get());
    BaseAdminPreferencesFragment_MembersInjector.injectAdminSettingsStore(instance, adminSettingsStoreProvider.get());
    injectProjectDeleter(instance, projectDeleterProvider.get());
  }

  @InjectedFieldSignature("org.odk.collect.android.preferences.screens.ProjectManagementPreferencesFragment.projectDeleter")
  public static void injectProjectDeleter(ProjectManagementPreferencesFragment instance,
      ProjectDeleter projectDeleter) {
    instance.projectDeleter = projectDeleter;
  }
}
