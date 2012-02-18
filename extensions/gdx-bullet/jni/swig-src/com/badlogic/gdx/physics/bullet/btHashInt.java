/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet;

import com.badlogic.gdx.utils.SharedLibraryLoader;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;

public class btHashInt {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public btHashInt(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(btHashInt obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gdxBulletJNI.delete_btHashInt(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  static {
    new SharedLibraryLoader().load("gdx-bullet");
  }

  public btHashInt(int uid) {
    this(gdxBulletJNI.new_btHashInt(uid), true);
  }

  public int getUid1() {
    return gdxBulletJNI.btHashInt_getUid1(swigCPtr, this);
  }

  public void setUid1(int uid) {
    gdxBulletJNI.btHashInt_setUid1(swigCPtr, this, uid);
  }

  public boolean equals(btHashInt other) {
    return gdxBulletJNI.btHashInt_equals(swigCPtr, this, btHashInt.getCPtr(other), other);
  }

  public long getHash() {
    return gdxBulletJNI.btHashInt_getHash(swigCPtr, this);
  }

}