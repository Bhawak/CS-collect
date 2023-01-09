// Generated by Dagger (https://dagger.dev).
package org.odk.collect.android.backgroundwork;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;
import org.odk.collect.android.instancemanagement.InstanceAutoSender;
import org.odk.collect.android.network.NetworkStateProvider;
import org.odk.collect.android.preferences.source.SettingsProvider;
import org.odk.collect.android.utilities.FormsRepositoryProvider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AutoSendTaskSpec_MembersInjector implements MembersInjector<AutoSendTaskSpec> {
  private final Provider<NetworkStateProvider> connectivityProvider;

  private final Provider<FormsRepositoryProvider> formsRepositoryProvider;

  private final Provider<SettingsProvider> settingsProvider;

  private final Provider<InstanceAutoSender> instanceAutoSenderProvider;

  public AutoSendTaskSpec_MembersInjector(Provider<NetworkStateProvider> connectivityProvider,
      Provider<FormsRepositoryProvider> formsRepositoryProvider,
      Provider<SettingsProvider> settingsProvider,
      Provider<InstanceAutoSender> instanceAutoSenderProvider) {
    this.connectivityProvider = connectivityProvider;
    this.formsRepositoryProvider = formsRepositoryProvider;
    this.settingsProvider = settingsProvider;
    this.instanceAutoSenderProvider = instanceAutoSenderProvider;
  }

  public static MembersInjector<AutoSendTaskSpec> create(
      Provider<NetworkStateProvider> connectivityProvider,
      Provider<FormsRepositoryProvider> formsRepositoryProvider,
      Provider<SettingsProvider> settingsProvider,
      Provider<InstanceAutoSender> instanceAutoSenderProvider) {
    return new AutoSendTaskSpec_MembersInjector(connectivityProvider, formsRepositoryProvider, settingsProvider, instanceAutoSenderProvider);
  }

  @Override
  public void injectMembers(AutoSendTaskSpec instance) {
    injectConnectivityProvider(instance, connectivityProvider.get());
    injectFormsRepositoryProvider(instance, formsRepositoryProvider.get());
    injectSettingsProvider(instance, settingsProvider.get());
    injectInstanceAutoSender(instance, instanceAutoSenderProvider.get());
  }

  @InjectedFieldSignature("org.odk.collect.android.backgroundwork.AutoSendTaskSpec.connectivityProvider")
  public static void injectConnectivityProvider(AutoSendTaskSpec instance,
      NetworkStateProvider connectivityProvider) {
    instance.connectivityProvider = connectivityProvider;
  }

  @InjectedFieldSignature("org.odk.collect.android.backgroundwork.AutoSendTaskSpec.formsRepositoryProvider")
  public static void injectFormsRepositoryProvider(AutoSendTaskSpec instance,
      FormsRepositoryProvider formsRepositoryProvider) {
    instance.formsRepositoryProvider = formsRepositoryProvider;
  }

  @InjectedFieldSignature("org.odk.collect.android.backgroundwork.AutoSendTaskSpec.settingsProvider")
  public static void injectSettingsProvider(AutoSendTaskSpec instance,
      SettingsProvider settingsProvider) {
    instance.settingsProvider = settingsProvider;
  }

  @InjectedFieldSignature("org.odk.collect.android.backgroundwork.AutoSendTaskSpec.instanceAutoSender")
  public static void injectInstanceAutoSender(AutoSendTaskSpec instance,
      InstanceAutoSender instanceAutoSender) {
    instance.instanceAutoSender = instanceAutoSender;
  }
}