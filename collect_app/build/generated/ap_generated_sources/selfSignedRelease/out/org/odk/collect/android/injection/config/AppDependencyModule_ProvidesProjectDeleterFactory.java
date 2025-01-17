// Generated by Dagger (https://dagger.dev).
package org.odk.collect.android.injection.config;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import org.odk.collect.android.backgroundwork.FormUpdateScheduler;
import org.odk.collect.android.backgroundwork.InstanceSubmitScheduler;
import org.odk.collect.android.preferences.source.SettingsProvider;
import org.odk.collect.android.projects.CurrentProjectProvider;
import org.odk.collect.android.projects.ProjectDeleter;
import org.odk.collect.android.storage.StoragePathProvider;
import org.odk.collect.android.utilities.ChangeLockProvider;
import org.odk.collect.android.utilities.InstancesRepositoryProvider;
import org.odk.collect.projects.ProjectsRepository;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppDependencyModule_ProvidesProjectDeleterFactory implements Factory<ProjectDeleter> {
  private final AppDependencyModule module;

  private final Provider<ProjectsRepository> projectsRepositoryProvider;

  private final Provider<CurrentProjectProvider> currentProjectProvider;

  private final Provider<FormUpdateScheduler> formUpdateSchedulerProvider;

  private final Provider<InstanceSubmitScheduler> instanceSubmitSchedulerProvider;

  private final Provider<InstancesRepositoryProvider> instancesRepositoryProvider;

  private final Provider<StoragePathProvider> storagePathProvider;

  private final Provider<ChangeLockProvider> changeLockProvider;

  private final Provider<SettingsProvider> settingsProvider;

  public AppDependencyModule_ProvidesProjectDeleterFactory(AppDependencyModule module,
      Provider<ProjectsRepository> projectsRepositoryProvider,
      Provider<CurrentProjectProvider> currentProjectProvider,
      Provider<FormUpdateScheduler> formUpdateSchedulerProvider,
      Provider<InstanceSubmitScheduler> instanceSubmitSchedulerProvider,
      Provider<InstancesRepositoryProvider> instancesRepositoryProvider,
      Provider<StoragePathProvider> storagePathProvider,
      Provider<ChangeLockProvider> changeLockProvider,
      Provider<SettingsProvider> settingsProvider) {
    this.module = module;
    this.projectsRepositoryProvider = projectsRepositoryProvider;
    this.currentProjectProvider = currentProjectProvider;
    this.formUpdateSchedulerProvider = formUpdateSchedulerProvider;
    this.instanceSubmitSchedulerProvider = instanceSubmitSchedulerProvider;
    this.instancesRepositoryProvider = instancesRepositoryProvider;
    this.storagePathProvider = storagePathProvider;
    this.changeLockProvider = changeLockProvider;
    this.settingsProvider = settingsProvider;
  }

  @Override
  public ProjectDeleter get() {
    return providesProjectDeleter(module, projectsRepositoryProvider.get(), currentProjectProvider.get(), formUpdateSchedulerProvider.get(), instanceSubmitSchedulerProvider.get(), instancesRepositoryProvider.get(), storagePathProvider.get(), changeLockProvider.get(), settingsProvider.get());
  }

  public static AppDependencyModule_ProvidesProjectDeleterFactory create(AppDependencyModule module,
      Provider<ProjectsRepository> projectsRepositoryProvider,
      Provider<CurrentProjectProvider> currentProjectProvider,
      Provider<FormUpdateScheduler> formUpdateSchedulerProvider,
      Provider<InstanceSubmitScheduler> instanceSubmitSchedulerProvider,
      Provider<InstancesRepositoryProvider> instancesRepositoryProvider,
      Provider<StoragePathProvider> storagePathProvider,
      Provider<ChangeLockProvider> changeLockProvider,
      Provider<SettingsProvider> settingsProvider) {
    return new AppDependencyModule_ProvidesProjectDeleterFactory(module, projectsRepositoryProvider, currentProjectProvider, formUpdateSchedulerProvider, instanceSubmitSchedulerProvider, instancesRepositoryProvider, storagePathProvider, changeLockProvider, settingsProvider);
  }

  public static ProjectDeleter providesProjectDeleter(AppDependencyModule instance,
      ProjectsRepository projectsRepository, CurrentProjectProvider currentProjectProvider,
      FormUpdateScheduler formUpdateScheduler, InstanceSubmitScheduler instanceSubmitScheduler,
      InstancesRepositoryProvider instancesRepositoryProvider,
      StoragePathProvider storagePathProvider, ChangeLockProvider changeLockProvider,
      SettingsProvider settingsProvider) {
    return Preconditions.checkNotNullFromProvides(instance.providesProjectDeleter(projectsRepository, currentProjectProvider, formUpdateScheduler, instanceSubmitScheduler, instancesRepositoryProvider, storagePathProvider, changeLockProvider, settingsProvider));
  }
}
