// Generated by Dagger (https://dagger.dev).
package org.odk.collect.android.injection.config;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import org.odk.collect.android.preferences.source.SettingsProvider;
import org.odk.collect.android.utilities.AdminPasswordProvider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppDependencyModule_ProvidesAdminPasswordProviderFactory implements Factory<AdminPasswordProvider> {
  private final AppDependencyModule module;

  private final Provider<SettingsProvider> settingsProvider;

  public AppDependencyModule_ProvidesAdminPasswordProviderFactory(AppDependencyModule module,
      Provider<SettingsProvider> settingsProvider) {
    this.module = module;
    this.settingsProvider = settingsProvider;
  }

  @Override
  public AdminPasswordProvider get() {
    return providesAdminPasswordProvider(module, settingsProvider.get());
  }

  public static AppDependencyModule_ProvidesAdminPasswordProviderFactory create(
      AppDependencyModule module, Provider<SettingsProvider> settingsProvider) {
    return new AppDependencyModule_ProvidesAdminPasswordProviderFactory(module, settingsProvider);
  }

  public static AdminPasswordProvider providesAdminPasswordProvider(AppDependencyModule instance,
      SettingsProvider settingsProvider) {
    return Preconditions.checkNotNullFromProvides(instance.providesAdminPasswordProvider(settingsProvider));
  }
}
