// Generated by Dagger (https://dagger.dev).
package org.odk.collect.android.injection.config;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import org.odk.collect.android.application.initialization.ExistingProjectMigrator;
import org.odk.collect.android.preferences.source.SettingsProvider;
import org.odk.collect.android.projects.CurrentProjectProvider;
import org.odk.collect.android.storage.StoragePathProvider;
import org.odk.collect.projects.ProjectsRepository;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppDependencyModule_ProvidesExistingProjectMigratorFactory implements Factory<ExistingProjectMigrator> {
  private final AppDependencyModule module;

  private final Provider<Context> contextProvider;

  private final Provider<StoragePathProvider> storagePathProvider;

  private final Provider<ProjectsRepository> projectsRepositoryProvider;

  private final Provider<SettingsProvider> settingsProvider;

  private final Provider<CurrentProjectProvider> currentProjectProvider;

  public AppDependencyModule_ProvidesExistingProjectMigratorFactory(AppDependencyModule module,
      Provider<Context> contextProvider, Provider<StoragePathProvider> storagePathProvider,
      Provider<ProjectsRepository> projectsRepositoryProvider,
      Provider<SettingsProvider> settingsProvider,
      Provider<CurrentProjectProvider> currentProjectProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
    this.storagePathProvider = storagePathProvider;
    this.projectsRepositoryProvider = projectsRepositoryProvider;
    this.settingsProvider = settingsProvider;
    this.currentProjectProvider = currentProjectProvider;
  }

  @Override
  public ExistingProjectMigrator get() {
    return providesExistingProjectMigrator(module, contextProvider.get(), storagePathProvider.get(), projectsRepositoryProvider.get(), settingsProvider.get(), currentProjectProvider.get());
  }

  public static AppDependencyModule_ProvidesExistingProjectMigratorFactory create(
      AppDependencyModule module, Provider<Context> contextProvider,
      Provider<StoragePathProvider> storagePathProvider,
      Provider<ProjectsRepository> projectsRepositoryProvider,
      Provider<SettingsProvider> settingsProvider,
      Provider<CurrentProjectProvider> currentProjectProvider) {
    return new AppDependencyModule_ProvidesExistingProjectMigratorFactory(module, contextProvider, storagePathProvider, projectsRepositoryProvider, settingsProvider, currentProjectProvider);
  }

  public static ExistingProjectMigrator providesExistingProjectMigrator(
      AppDependencyModule instance, Context context, StoragePathProvider storagePathProvider,
      ProjectsRepository projectsRepository, SettingsProvider settingsProvider,
      CurrentProjectProvider currentProjectProvider) {
    return Preconditions.checkNotNullFromProvides(instance.providesExistingProjectMigrator(context, storagePathProvider, projectsRepository, settingsProvider, currentProjectProvider));
  }
}
