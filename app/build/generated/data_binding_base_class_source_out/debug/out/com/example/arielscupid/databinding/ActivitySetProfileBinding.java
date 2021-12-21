// Generated by view binder compiler. Do not edit!
package com.example.arielscupid.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.arielscupid.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivitySetProfileBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final RadioButton female;

  @NonNull
  public final RadioButton female1;

  @NonNull
  public final EditText getAbout;

  @NonNull
  public final RadioGroup getGender;

  @NonNull
  public final CardView getuserimage;

  @NonNull
  public final ImageView getuserimageinimageview;

  @NonNull
  public final EditText getusername;

  @NonNull
  public final TextView getwantGender;

  @NonNull
  public final RadioGroup getwantedGender;

  @NonNull
  public final RadioButton male;

  @NonNull
  public final RadioButton male1;

  @NonNull
  public final RadioButton other;

  @NonNull
  public final RadioButton other1;

  @NonNull
  public final ProgressBar progressbarofsetprofile;

  @NonNull
  public final Button saveprofile;

  private ActivitySetProfileBinding(@NonNull RelativeLayout rootView, @NonNull RadioButton female,
      @NonNull RadioButton female1, @NonNull EditText getAbout, @NonNull RadioGroup getGender,
      @NonNull CardView getuserimage, @NonNull ImageView getuserimageinimageview,
      @NonNull EditText getusername, @NonNull TextView getwantGender,
      @NonNull RadioGroup getwantedGender, @NonNull RadioButton male, @NonNull RadioButton male1,
      @NonNull RadioButton other, @NonNull RadioButton other1,
      @NonNull ProgressBar progressbarofsetprofile, @NonNull Button saveprofile) {
    this.rootView = rootView;
    this.female = female;
    this.female1 = female1;
    this.getAbout = getAbout;
    this.getGender = getGender;
    this.getuserimage = getuserimage;
    this.getuserimageinimageview = getuserimageinimageview;
    this.getusername = getusername;
    this.getwantGender = getwantGender;
    this.getwantedGender = getwantedGender;
    this.male = male;
    this.male1 = male1;
    this.other = other;
    this.other1 = other1;
    this.progressbarofsetprofile = progressbarofsetprofile;
    this.saveprofile = saveprofile;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivitySetProfileBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivitySetProfileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_set_profile, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivitySetProfileBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.female;
      RadioButton female = ViewBindings.findChildViewById(rootView, id);
      if (female == null) {
        break missingId;
      }

      id = R.id.female1;
      RadioButton female1 = ViewBindings.findChildViewById(rootView, id);
      if (female1 == null) {
        break missingId;
      }

      id = R.id.getAbout;
      EditText getAbout = ViewBindings.findChildViewById(rootView, id);
      if (getAbout == null) {
        break missingId;
      }

      id = R.id.getGender;
      RadioGroup getGender = ViewBindings.findChildViewById(rootView, id);
      if (getGender == null) {
        break missingId;
      }

      id = R.id.getuserimage;
      CardView getuserimage = ViewBindings.findChildViewById(rootView, id);
      if (getuserimage == null) {
        break missingId;
      }

      id = R.id.getuserimageinimageview;
      ImageView getuserimageinimageview = ViewBindings.findChildViewById(rootView, id);
      if (getuserimageinimageview == null) {
        break missingId;
      }

      id = R.id.getusername;
      EditText getusername = ViewBindings.findChildViewById(rootView, id);
      if (getusername == null) {
        break missingId;
      }

      id = R.id.getwantGender;
      TextView getwantGender = ViewBindings.findChildViewById(rootView, id);
      if (getwantGender == null) {
        break missingId;
      }

      id = R.id.getwantedGender;
      RadioGroup getwantedGender = ViewBindings.findChildViewById(rootView, id);
      if (getwantedGender == null) {
        break missingId;
      }

      id = R.id.male;
      RadioButton male = ViewBindings.findChildViewById(rootView, id);
      if (male == null) {
        break missingId;
      }

      id = R.id.male1;
      RadioButton male1 = ViewBindings.findChildViewById(rootView, id);
      if (male1 == null) {
        break missingId;
      }

      id = R.id.other;
      RadioButton other = ViewBindings.findChildViewById(rootView, id);
      if (other == null) {
        break missingId;
      }

      id = R.id.other1;
      RadioButton other1 = ViewBindings.findChildViewById(rootView, id);
      if (other1 == null) {
        break missingId;
      }

      id = R.id.progressbarofsetprofile;
      ProgressBar progressbarofsetprofile = ViewBindings.findChildViewById(rootView, id);
      if (progressbarofsetprofile == null) {
        break missingId;
      }

      id = R.id.saveprofile;
      Button saveprofile = ViewBindings.findChildViewById(rootView, id);
      if (saveprofile == null) {
        break missingId;
      }

      return new ActivitySetProfileBinding((RelativeLayout) rootView, female, female1, getAbout,
          getGender, getuserimage, getuserimageinimageview, getusername, getwantGender,
          getwantedGender, male, male1, other, other1, progressbarofsetprofile, saveprofile);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
