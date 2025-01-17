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
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.odk.collect.android.R;

public final class FormChooserListBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final TextView empty;

  @NonNull
  public final ListView list;

  @NonNull
  public final LinearLayout llParent;

  private FormChooserListBinding(@NonNull RelativeLayout rootView, @NonNull TextView empty,
      @NonNull ListView list, @NonNull LinearLayout llParent) {
    this.rootView = rootView;
    this.empty = empty;
    this.list = list;
    this.llParent = llParent;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FormChooserListBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FormChooserListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.form_chooser_list, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FormChooserListBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
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

      id = R.id.llParent;
      LinearLayout llParent = rootView.findViewById(id);
      if (llParent == null) {
        break missingId;
      }

      return new FormChooserListBinding((RelativeLayout) rootView, empty, list, llParent);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
