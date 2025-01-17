// Generated by Dagger (https://dagger.dev).
package org.odk.collect.android.injection.config;

import android.app.Application;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import org.odk.collect.android.formmanagement.InstancesAppState;
import org.odk.collect.android.projects.CurrentProjectProvider;
import org.odk.collect.android.utilities.InstancesRepositoryProvider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppDependencyModule_ProvidesInstancesAppStateFactory implements Factory<InstancesAppState> {
  private final AppDependencyModule module;

  private final Provider<Application> applicationProvider;

  private final Provider<InstancesRepositoryProvider> instancesRepositoryProvider;

  private final Provider<CurrentProjectProvider> currentProjectProvider;

  public AppDependencyModule_ProvidesInstancesAppStateFactory(AppDependencyModule module,
      Provider<Application> applicationProvider,
      Provider<InstancesRepositoryProvider> instancesRepositoryProvider,
      Provider<CurrentProjectProvider> currentProjectProvider) {
    this.module = module;
    this.applicationProvider = applicationProvider;
    this.instancesRepositoryProvider = instancesRepositoryProvider;
    this.currentProjectProvider = currentProjectProvider;
  }

  @Override
  public InstancesAppState get() {
    return providesInstancesAppState(module, applicationProvider.get(), instancesRepositoryProvider.get(), currentProjectProvider.get());
  }

  public static AppDependencyModule_ProvidesInstancesAppStateFactory create(
      AppDependencyModule module, Provider<Application> applicationProvider,
      Provider<InstancesRepositoryProvider> instancesRepositoryProvider,
      Provider<CurrentProjectProvider> currentProjectProvider) {
    return new AppDependencyModule_ProvidesInstancesAppStateFactory(module, applicationProvider, instancesRepositoryProvider, currentProjectProvider);
  }

  public static InstancesAppState providesInstancesAppState(AppDependencyModule instance,
      Application application, InstancesRepositoryProvider instancesRepositoryProvider,
      CurrentProjectProvider currentProjectProvider) {
    return Preconditions.checkNotNullFromProvides(instance.providesInstancesAppState(application, instancesRepositoryProvider, currentProjectProvider));
  }
}
