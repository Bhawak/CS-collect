// Generated by view binder compiler. Do not edit!
package org.odk.collect.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.odk.collect.android.R;
import org.odk.collect.android.views.MultiClickSafeButton;

public final class HierarchyLayoutBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final LinearLayout buttonholder;

  @NonNull
  public final TextView empty;

  @NonNull
  public final MultiClickSafeButton exitButton;

  @NonNull
  public final MultiClickSafeButton jumpBeginningButton;

  @NonNull
  public final MultiClickSafeButton jumpEndButton;

  @NonNull
  public final RecyclerView list;

  @NonNull
  public final TextView pathtext;

  private HierarchyLayoutBinding(@NonNull RelativeLayout rootView,
      @NonNull LinearLayout buttonholder, @NonNull TextView empty,
      @NonNull MultiClickSafeButton exitButton, @NonNull MultiClickSafeButton jumpBeginningButton,
      @NonNull MultiClickSafeButton jumpEndButton, @NonNull RecyclerView list,
      @NonNull TextView pathtext) {
    this.rootView = rootView;
    this.buttonholder = buttonholder;
    this.empty = empty;
    this.exitButton = exitButton;
    this.jumpBeginningButton = jumpBeginningButton;
    this.jumpEndButton = jumpEndButton;
    this.list = list;
    this.pathtext = pathtext;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static HierarchyLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static HierarchyLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.hierarchy_layout, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static HierarchyLayoutBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.buttonholder;
      LinearLayout buttonholder = rootView.findViewById(id);
      if (buttonholder == null) {
        break missingId;
      }

      id = android.R.id.empty;
      TextView empty = rootView.findViewById(id);
      if (empty == null) {
        break missingId;
      }

      id = R.id.exitButton;
      MultiClickSafeButton exitButton = rootView.findViewById(id);
      if (exitButton == null) {
        break missingId;
      }

      id = R.id.jumpBeginningButton;
      MultiClickSafeButton jumpBeginningButton = rootView.findViewById(id);
      if (jumpBeginningButton == null) {
        break missingId;
      }

      id = R.id.jumpEndButton;
      MultiClickSafeButton jumpEndButton = rootView.findViewById(id);
      if (jumpEndButton == null) {
        break missingId;
      }

      id = R.id.list;
      RecyclerView list = rootView.findViewById(id);
      if (list == null) {
        break missingId;
      }

      id = R.id.pathtext;
      TextView pathtext = rootView.findViewById(id);
      if (pathtext == null) {
        break missingId;
      }

      return new HierarchyLayoutBinding((RelativeLayout) rootView, buttonholder, empty, exitButton,
          jumpBeginningButton, jumpEndButton, list, pathtext);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
