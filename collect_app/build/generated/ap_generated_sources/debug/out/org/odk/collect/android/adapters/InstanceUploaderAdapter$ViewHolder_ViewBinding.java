// Generated code from Butter Knife. Do not modify!
package org.odk.collect.android.adapters;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import org.odk.collect.android.R;
import org.odk.collect.android.views.InstanceUploaderProgressBar;

public class InstanceUploaderAdapter$ViewHolder_ViewBinding implements Unbinder {
  private InstanceUploaderAdapter.ViewHolder target;

  @UiThread
  public InstanceUploaderAdapter$ViewHolder_ViewBinding(InstanceUploaderAdapter.ViewHolder target,
      View source) {
    this.target = target;

    target.formTitle = Utils.findRequiredViewAsType(source, R.id.form_title, "field 'formTitle'", TextView.class);
    target.formSubtitle = Utils.findRequiredViewAsType(source, R.id.form_subtitle, "field 'formSubtitle'", TextView.class);
    target.checkbox = Utils.findRequiredViewAsType(source, R.id.checkbox, "field 'checkbox'", CheckBox.class);
    target.progressBar = Utils.findRequiredViewAsType(source, R.id.progress_bar, "field 'progressBar'", InstanceUploaderProgressBar.class);
    target.statusIcon = Utils.findRequiredViewAsType(source, R.id.image, "field 'statusIcon'", ImageView.class);
    target.closeButton = Utils.findRequiredViewAsType(source, R.id.close_box, "field 'closeButton'", ImageView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    InstanceUploaderAdapter.ViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.formTitle = null;
    target.formSubtitle = null;
    target.checkbox = null;
    target.progressBar = null;
    target.statusIcon = null;
    target.closeButton = null;
  }
}
