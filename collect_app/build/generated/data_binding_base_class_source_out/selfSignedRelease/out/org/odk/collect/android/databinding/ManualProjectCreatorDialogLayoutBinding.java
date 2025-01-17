// Generated by view binder compiler. Do not edit!
package org.odk.collect.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.odk.collect.android.R;
import org.odk.collect.android.views.MultiClickSafeButton;

public final class ManualProjectCreatorDialogLayoutBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final MultiClickSafeButton addButton;

  @NonNull
  public final AppBarLayout addProjectToolbar;

  @NonNull
  public final MultiClickSafeButton cancelButton;

  @NonNull
  public final ConstraintLayout configTip;

  @NonNull
  public final TextView configureGdrive;

  @NonNull
  public final ConstraintLayout gdrive;

  @NonNull
  public final TextInputLayout password;

  @NonNull
  public final TextInputEditText passwordInputText;

  @NonNull
  public final TextView projectUsesGdrive;

  @NonNull
  public final ImageView shadowUp;

  @NonNull
  public final ImageView tipIcon;

  @NonNull
  public final TextView tipText;

  @NonNull
  public final MaterialToolbar toolbar;

  @NonNull
  public final TextInputLayout url;

  @NonNull
  public final TextInputEditText urlInputText;

  @NonNull
  public final TextInputLayout username;

  @NonNull
  public final TextInputEditText usernameInputText;

  private ManualProjectCreatorDialogLayoutBinding(@NonNull ConstraintLayout rootView,
      @NonNull MultiClickSafeButton addButton, @NonNull AppBarLayout addProjectToolbar,
      @NonNull MultiClickSafeButton cancelButton, @NonNull ConstraintLayout configTip,
      @NonNull TextView configureGdrive, @NonNull ConstraintLayout gdrive,
      @NonNull TextInputLayout password, @NonNull TextInputEditText passwordInputText,
      @NonNull TextView projectUsesGdrive, @NonNull ImageView shadowUp, @NonNull ImageView tipIcon,
      @NonNull TextView tipText, @NonNull MaterialToolbar toolbar, @NonNull TextInputLayout url,
      @NonNull TextInputEditText urlInputText, @NonNull TextInputLayout username,
      @NonNull TextInputEditText usernameInputText) {
    this.rootView = rootView;
    this.addButton = addButton;
    this.addProjectToolbar = addProjectToolbar;
    this.cancelButton = cancelButton;
    this.configTip = configTip;
    this.configureGdrive = configureGdrive;
    this.gdrive = gdrive;
    this.password = password;
    this.passwordInputText = passwordInputText;
    this.projectUsesGdrive = projectUsesGdrive;
    this.shadowUp = shadowUp;
    this.tipIcon = tipIcon;
    this.tipText = tipText;
    this.toolbar = toolbar;
    this.url = url;
    this.urlInputText = urlInputText;
    this.username = username;
    this.usernameInputText = usernameInputText;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ManualProjectCreatorDialogLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ManualProjectCreatorDialogLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.manual_project_creator_dialog_layout, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ManualProjectCreatorDialogLayoutBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.add_button;
      MultiClickSafeButton addButton = rootView.findViewById(id);
      if (addButton == null) {
        break missingId;
      }

      id = R.id.add_project_toolbar;
      AppBarLayout addProjectToolbar = rootView.findViewById(id);
      if (addProjectToolbar == null) {
        break missingId;
      }

      id = R.id.cancel_button;
      MultiClickSafeButton cancelButton = rootView.findViewById(id);
      if (cancelButton == null) {
        break missingId;
      }

      id = R.id.config_tip;
      ConstraintLayout configTip = rootView.findViewById(id);
      if (configTip == null) {
        break missingId;
      }

      id = R.id.configure_gdrive;
      TextView configureGdrive = rootView.findViewById(id);
      if (configureGdrive == null) {
        break missingId;
      }

      id = R.id.gdrive;
      ConstraintLayout gdrive = rootView.findViewById(id);
      if (gdrive == null) {
        break missingId;
      }

      id = R.id.password;
      TextInputLayout password = rootView.findViewById(id);
      if (password == null) {
        break missingId;
      }

      id = R.id.password_input_text;
      TextInputEditText passwordInputText = rootView.findViewById(id);
      if (passwordInputText == null) {
        break missingId;
      }

      id = R.id.project_uses_gdrive;
      TextView projectUsesGdrive = rootView.findViewById(id);
      if (projectUsesGdrive == null) {
        break missingId;
      }

      id = R.id.shadow_up;
      ImageView shadowUp = rootView.findViewById(id);
      if (shadowUp == null) {
        break missingId;
      }

      id = R.id.tip_icon;
      ImageView tipIcon = rootView.findViewById(id);
      if (tipIcon == null) {
        break missingId;
      }

      id = R.id.tip_text;
      TextView tipText = rootView.findViewById(id);
      if (tipText == null) {
        break missingId;
      }

      id = R.id.toolbar;
      MaterialToolbar toolbar = rootView.findViewById(id);
      if (toolbar == null) {
        break missingId;
      }

      id = R.id.url;
      TextInputLayout url = rootView.findViewById(id);
      if (url == null) {
        break missingId;
      }

      id = R.id.url_input_text;
      TextInputEditText urlInputText = rootView.findViewById(id);
      if (urlInputText == null) {
        break missingId;
      }

      id = R.id.username;
      TextInputLayout username = rootView.findViewById(id);
      if (username == null) {
        break missingId;
      }

      id = R.id.username_input_text;
      TextInputEditText usernameInputText = rootView.findViewById(id);
      if (usernameInputText == null) {
        break missingId;
      }

      return new ManualProjectCreatorDialogLayoutBinding((ConstraintLayout) rootView, addButton,
          addProjectToolbar, cancelButton, configTip, configureGdrive, gdrive, password,
          passwordInputText, projectUsesGdrive, shadowUp, tipIcon, tipText, toolbar, url,
          urlInputText, username, usernameInputText);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
