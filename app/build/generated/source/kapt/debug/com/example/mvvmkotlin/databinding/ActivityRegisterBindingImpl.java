package com.example.mvvmkotlin.databinding;
import com.example.mvvmkotlin.R;
import com.example.mvvmkotlin.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityRegisterBindingImpl extends ActivityRegisterBinding implements com.example.mvvmkotlin.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityRegisterBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private ActivityRegisterBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.EditText) bindings[1]
            , (android.widget.EditText) bindings[2]
            , (android.widget.EditText) bindings[3]
            , (android.widget.EditText) bindings[4]
            , (android.widget.Button) bindings[5]
            );
        this.EmailRegister.setTag(null);
        this.NameRegister.setTag(null);
        this.NumberRegister.setTag(null);
        this.PasswordRegister.setTag(null);
        this.buttonRegister.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        mCallback1 = new com.example.mvvmkotlin.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x20L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.registerModel == variableId) {
            setRegisterModel((com.example.mvvmkotlin.viewmodel.UserViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setRegisterModel(@Nullable com.example.mvvmkotlin.viewmodel.UserViewModel RegisterModel) {
        updateRegistration(0, RegisterModel);
        this.mRegisterModel = RegisterModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.registerModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeRegisterModel((com.example.mvvmkotlin.viewmodel.UserViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeRegisterModel(com.example.mvvmkotlin.viewmodel.UserViewModel RegisterModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.userEmail) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        else if (fieldId == BR.userName) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        else if (fieldId == BR.number) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        else if (fieldId == BR.password) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String registerModelPassword = null;
        com.example.mvvmkotlin.viewmodel.UserViewModel registerModel = mRegisterModel;
        java.lang.String registerModelUserName = null;
        java.lang.String registerModelNumber = null;
        java.lang.String registerModelUserEmail = null;

        if ((dirtyFlags & 0x3fL) != 0) {


            if ((dirtyFlags & 0x31L) != 0) {

                    if (registerModel != null) {
                        // read registerModel.password
                        registerModelPassword = registerModel.getPassword();
                    }
            }
            if ((dirtyFlags & 0x25L) != 0) {

                    if (registerModel != null) {
                        // read registerModel.userName
                        registerModelUserName = registerModel.getUserName();
                    }
            }
            if ((dirtyFlags & 0x29L) != 0) {

                    if (registerModel != null) {
                        // read registerModel.number
                        registerModelNumber = registerModel.getNumber();
                    }
            }
            if ((dirtyFlags & 0x23L) != 0) {

                    if (registerModel != null) {
                        // read registerModel.userEmail
                        registerModelUserEmail = registerModel.getUserEmail();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x23L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.EmailRegister, registerModelUserEmail);
        }
        if ((dirtyFlags & 0x25L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.NameRegister, registerModelUserName);
        }
        if ((dirtyFlags & 0x29L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.NumberRegister, registerModelNumber);
        }
        if ((dirtyFlags & 0x31L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.PasswordRegister, registerModelPassword);
        }
        if ((dirtyFlags & 0x20L) != 0) {
            // api target 1

            this.buttonRegister.setOnClickListener(mCallback1);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // registerModel != null
        boolean registerModelJavaLangObjectNull = false;
        // registerModel
        com.example.mvvmkotlin.viewmodel.UserViewModel registerModel = mRegisterModel;



        registerModelJavaLangObjectNull = (registerModel) != (null);
        if (registerModelJavaLangObjectNull) {



            registerModel.onRegister(callbackArg_0);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): registerModel
        flag 1 (0x2L): registerModel.userEmail
        flag 2 (0x3L): registerModel.userName
        flag 3 (0x4L): registerModel.number
        flag 4 (0x5L): registerModel.password
        flag 5 (0x6L): null
    flag mapping end*/
    //end
}