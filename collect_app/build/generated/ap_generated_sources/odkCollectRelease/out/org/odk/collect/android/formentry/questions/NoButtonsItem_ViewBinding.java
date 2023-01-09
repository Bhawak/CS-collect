// Generated code from Butter Knife. Do not modify!
package org.odk.collect.android.formentry.questions;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import org.odk.collect.android.R;

public class NoButtonsItem_ViewBinding implements Unbinder {
  private NoButtonsItem target;

  @UiThread
  public NoButtonsItem_ViewBinding(NoButtonsItem target) {
    this(target, target);
  }

  @UiThread
  public NoButtonsItem_ViewBinding(NoButtonsItem target, View source) {
    this.target = target;

    target.imageView = Utils.findRequiredViewAsType(source, R.id.imageView, "field 'imageView'", ImageView.class);
    target.label = Utils.findRequiredViewAsType(source, R.id.label, "field 'label'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    NoButtonsItem target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.imageView = null;
    target.label = null;
  }
}
