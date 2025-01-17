// Generated by view binder compiler. Do not edit!
package org.odk.collect.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.button.MaterialButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.odk.collect.android.R;

public final class GoogleDriveListBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final MaterialButton backButton;

  @NonNull
  public final LinearLayout buttonholder;

  @NonNull
  public final MaterialButton downloadButton;

  @NonNull
  public final TextView empty;

  @NonNull
  public final ListView list;

  @NonNull
  public final MaterialButton rootButton;

  private GoogleDriveListBinding(@NonNull RelativeLayout rootView,
      @NonNull MaterialButton backButton, @NonNull LinearLayout buttonholder,
      @NonNull MaterialButton downloadButton, @NonNull TextView empty, @NonNull ListView list,
      @NonNull MaterialButton rootButton) {
    this.rootView = rootView;
    this.backButton = backButton;
    this.buttonholder = buttonholder;
    this.downloadButton = downloadButton;
    this.empty = empty;
    this.list = list;
    this.rootButton = rootButton;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static GoogleDriveListBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static GoogleDriveListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.google_drive_list, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static GoogleDriveListBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.back_button;
      MaterialButton backButton = rootView.findViewById(id);
      if (backButton == null) {
        break missingId;
      }

      id = R.id.buttonholder;
      LinearLayout buttonholder = rootView.findViewById(id);
      if (buttonholder == null) {
        break missingId;
      }

      id = R.id.download_button;
      MaterialButton downloadButton = rootView.findViewById(id);
      if (downloadButton == null) {
        break missingId;
      }

      id = android.R.id.empty;
      TextView empty = rootView.findViewById(id);
      if (empty == null) {
        break missingId;
      }

      id = android.R.id.list;
      ListView list = rootView.findViewById(id);
      if (list == null) {
        break missingId;
      }

      id = R.id.root_button;
      MaterialButton rootButton = rootView.findViewById(id);
      if (rootButton == null) {
        break missingId;
      }

      return new GoogleDriveListBinding((RelativeLayout) rootView, backButton, buttonholder,
          downloadButton, empty, list, rootButton);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
