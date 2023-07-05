// Generated by view binder compiler. Do not edit!
package com.mathias.evaluacionc2.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.textfield.TextInputLayout;
import com.mathias.evaluacionc2.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityLoginBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView TextView;

  @NonNull
  public final Button btnlogin;

  @NonNull
  public final Guideline guidelineMediumHorizontal;

  @NonNull
  public final ImageView imgPromoLogo;

  @NonNull
  public final TextInputLayout tilEmail;

  @NonNull
  public final TextInputLayout tilPassword;

  private ActivityLoginBinding(@NonNull ConstraintLayout rootView, @NonNull TextView TextView,
      @NonNull Button btnlogin, @NonNull Guideline guidelineMediumHorizontal,
      @NonNull ImageView imgPromoLogo, @NonNull TextInputLayout tilEmail,
      @NonNull TextInputLayout tilPassword) {
    this.rootView = rootView;
    this.TextView = TextView;
    this.btnlogin = btnlogin;
    this.guidelineMediumHorizontal = guidelineMediumHorizontal;
    this.imgPromoLogo = imgPromoLogo;
    this.tilEmail = tilEmail;
    this.tilPassword = tilPassword;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_login, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityLoginBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.TextView;
      TextView TextView = ViewBindings.findChildViewById(rootView, id);
      if (TextView == null) {
        break missingId;
      }

      id = R.id.btnlogin;
      Button btnlogin = ViewBindings.findChildViewById(rootView, id);
      if (btnlogin == null) {
        break missingId;
      }

      id = R.id.guideline_medium_horizontal;
      Guideline guidelineMediumHorizontal = ViewBindings.findChildViewById(rootView, id);
      if (guidelineMediumHorizontal == null) {
        break missingId;
      }

      id = R.id.img_promo_logo;
      ImageView imgPromoLogo = ViewBindings.findChildViewById(rootView, id);
      if (imgPromoLogo == null) {
        break missingId;
      }

      id = R.id.til_email;
      TextInputLayout tilEmail = ViewBindings.findChildViewById(rootView, id);
      if (tilEmail == null) {
        break missingId;
      }

      id = R.id.til_password;
      TextInputLayout tilPassword = ViewBindings.findChildViewById(rootView, id);
      if (tilPassword == null) {
        break missingId;
      }

      return new ActivityLoginBinding((ConstraintLayout) rootView, TextView, btnlogin,
          guidelineMediumHorizontal, imgPromoLogo, tilEmail, tilPassword);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}