// Generated by Dagger (https://dagger.dev).
package org.odk.collect.android.projects;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;
import org.odk.collect.android.activities.viewmodels.CurrentProjectViewModel;
import org.odk.collect.android.preferences.source.SettingsProvider;
import org.odk.collect.projects.ProjectsRepository;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ProjectSettingsDialog_MembersInjector implements MembersInjector<ProjectSettingsDialog> {
  private final Provider<ProjectsRepository> projectsRepositoryProvider;

  private final Provider<CurrentProjectViewModel.Factory> currentProjectViewModelFactoryProvider;

  private final Provider<SettingsProvider> settingsProvider;

  public ProjectSettingsDialog_MembersInjector(
      Provider<ProjectsRepository> projectsRepositoryProvider,
      Provider<CurrentProjectViewModel.Factory> currentProjectViewModelFactoryProvider,
      Provider<SettingsProvider> settingsProvider) {
    this.projectsRepositoryProvider = projectsRepositoryProvider;
    this.currentProjectViewModelFactoryProvider = currentProjectViewModelFactoryProvider;
    this.settingsProvider = settingsProvider;
  }

  public static MembersInjector<ProjectSettingsDialog> create(
      Provider<ProjectsRepository> projectsRepositoryProvider,
      Provider<CurrentProjectViewModel.Factory> currentProjectViewModelFactoryProvider,
      Provider<SettingsProvider> settingsProvider) {
    return new ProjectSettingsDialog_MembersInjector(projectsRepositoryProvider, currentProjectViewModelFactoryProvider, settingsProvider);
  }

  @Override
  public void injectMembers(ProjectSettingsDialog instance) {
    injectProjectsRepository(instance, projectsRepositoryProvider.get());
    injectCurrentProjectViewModelFactory(instance, currentProjectViewModelFactoryProvider.get());
    injectSettingsProvider(instance, settingsProvider.get());
  }

  @InjectedFieldSignature("org.odk.collect.android.projects.ProjectSettingsDialog.projectsRepository")
  public static void injectProjectsRepository(ProjectSettingsDialog instance,
      ProjectsRepository projectsRepository) {
    instance.projectsRepository = projectsRepository;
  }

  @InjectedFieldSignature("org.odk.collect.android.projects.ProjectSettingsDialog.currentProjectViewModelFactory")
  public static void injectCurrentProjectViewModelFactory(ProjectSettingsDialog instance,
      CurrentProjectViewModel.Factory currentProjectViewModelFactory) {
    instance.currentProjectViewModelFactory = currentProjectViewModelFactory;
  }

  @InjectedFieldSignature("org.odk.collect.android.projects.ProjectSettingsDialog.settingsProvider")
  public static void injectSettingsProvider(ProjectSettingsDialog instance,
      SettingsProvider settingsProvider) {
    instance.settingsProvider = settingsProvider;
  }
}