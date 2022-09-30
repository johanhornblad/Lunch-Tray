package com.example.lunchtray.databinding;
import com.example.lunchtray.R;
import com.example.lunchtray.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentEntreeMenuBindingImpl extends FragmentEntreeMenuBinding implements com.example.lunchtray.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.entree_options, 16);
        sViewsWithIds.put(R.id.divider, 17);
    }
    // views
    @NonNull
    private final android.widget.ScrollView mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback15;
    @Nullable
    private final android.view.View.OnClickListener mCallback19;
    @Nullable
    private final android.view.View.OnClickListener mCallback16;
    @Nullable
    private final android.view.View.OnClickListener mCallback17;
    @Nullable
    private final android.view.View.OnClickListener mCallback14;
    @Nullable
    private final android.view.View.OnClickListener mCallback18;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentEntreeMenuBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 18, sIncludes, sViewsWithIds));
    }
    private FragmentEntreeMenuBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.Button) bindings[14]
            , (android.widget.RadioButton) bindings[1]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[3]
            , (android.widget.RadioButton) bindings[4]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[6]
            , (android.view.View) bindings[17]
            , (android.widget.RadioGroup) bindings[16]
            , (android.widget.Button) bindings[15]
            , (android.widget.RadioButton) bindings[7]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[9]
            , (android.widget.RadioButton) bindings[10]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[13]
            );
        this.cancelButton.setTag(null);
        this.cauliflower.setTag(null);
        this.cauliflowerDescription.setTag(null);
        this.cauliflowerPrice.setTag(null);
        this.chili.setTag(null);
        this.chiliDescription.setTag(null);
        this.chiliPrice.setTag(null);
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.nextButton.setTag(null);
        this.pasta.setTag(null);
        this.pastaDescription.setTag(null);
        this.pastaPrice.setTag(null);
        this.skillet.setTag(null);
        this.skilletDescription.setTag(null);
        this.skilletPrice.setTag(null);
        this.subtotal.setTag(null);
        setRootTag(root);
        // listeners
        mCallback15 = new com.example.lunchtray.generated.callback.OnClickListener(this, 2);
        mCallback19 = new com.example.lunchtray.generated.callback.OnClickListener(this, 6);
        mCallback16 = new com.example.lunchtray.generated.callback.OnClickListener(this, 3);
        mCallback17 = new com.example.lunchtray.generated.callback.OnClickListener(this, 4);
        mCallback14 = new com.example.lunchtray.generated.callback.OnClickListener(this, 1);
        mCallback18 = new com.example.lunchtray.generated.callback.OnClickListener(this, 5);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
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
        if (BR.entreeMenuFragment == variableId) {
            setEntreeMenuFragment((com.example.lunchtray.ui.order.EntreeMenuFragment) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((com.example.lunchtray.model.OrderViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setEntreeMenuFragment(@Nullable com.example.lunchtray.ui.order.EntreeMenuFragment EntreeMenuFragment) {
        this.mEntreeMenuFragment = EntreeMenuFragment;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.entreeMenuFragment);
        super.requestRebind();
    }
    public void setViewModel(@Nullable com.example.lunchtray.model.OrderViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelSubtotal((androidx.lifecycle.LiveData<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelSubtotal(androidx.lifecycle.LiveData<java.lang.String> ViewModelSubtotal, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
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
        java.lang.String viewModelMenuItemsAndroidStringPastaName = null;
        androidx.lifecycle.LiveData<java.lang.String> viewModelSubtotal = null;
        java.lang.String viewModelMenuItemsAndroidStringCauliflowerName = null;
        java.lang.String viewModelMenuItemsAndroidStringPastaDescription = null;
        com.example.lunchtray.model.MenuItem viewModelMenuItemsAndroidStringChili = null;
        java.lang.String viewModelMenuItemsAndroidStringSkilletGetFormattedPrice = null;
        java.util.Map<java.lang.String,com.example.lunchtray.model.MenuItem> viewModelMenuItems = null;
        com.example.lunchtray.model.MenuItem viewModelMenuItemsAndroidStringSkillet = null;
        com.example.lunchtray.ui.order.EntreeMenuFragment entreeMenuFragment = mEntreeMenuFragment;
        java.lang.String viewModelMenuItemsAndroidStringChiliDescription = null;
        com.example.lunchtray.model.MenuItem viewModelMenuItemsAndroidStringCauliflower = null;
        java.lang.String viewModelMenuItemsAndroidStringChiliGetFormattedPrice = null;
        com.example.lunchtray.model.MenuItem viewModelMenuItemsAndroidStringPasta = null;
        java.lang.String subtotalAndroidStringSubtotalViewModelSubtotal = null;
        java.lang.String viewModelMenuItemsAndroidStringSkilletDescription = null;
        java.lang.String viewModelSubtotalGetValue = null;
        java.lang.String viewModelMenuItemsAndroidStringCauliflowerDescription = null;
        java.lang.String viewModelMenuItemsAndroidStringChiliName = null;
        java.lang.String viewModelMenuItemsAndroidStringSkilletName = null;
        java.lang.String viewModelMenuItemsAndroidStringCauliflowerGetFormattedPrice = null;
        java.lang.String viewModelMenuItemsAndroidStringPastaGetFormattedPrice = null;
        com.example.lunchtray.model.OrderViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0xdL) != 0) {



                if (viewModel != null) {
                    // read viewModel.subtotal
                    viewModelSubtotal = viewModel.getSubtotal();
                }
                updateLiveDataRegistration(0, viewModelSubtotal);


                if (viewModelSubtotal != null) {
                    // read viewModel.subtotal.getValue()
                    viewModelSubtotalGetValue = viewModelSubtotal.getValue();
                }


                // read @android:string/subtotal
                subtotalAndroidStringSubtotalViewModelSubtotal = subtotal.getResources().getString(R.string.subtotal, viewModelSubtotalGetValue);
            if ((dirtyFlags & 0xcL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.menuItems
                        viewModelMenuItems = viewModel.getMenuItems();
                    }


                    if (viewModelMenuItems != null) {
                        // read viewModel.menuItems[@android:string/chili]
                        viewModelMenuItemsAndroidStringChili = viewModelMenuItems.get(chili.getResources().getString(R.string.chili));
                        // read viewModel.menuItems[@android:string/skillet]
                        viewModelMenuItemsAndroidStringSkillet = viewModelMenuItems.get(skillet.getResources().getString(R.string.skillet));
                        // read viewModel.menuItems[@android:string/cauliflower]
                        viewModelMenuItemsAndroidStringCauliflower = viewModelMenuItems.get(cauliflower.getResources().getString(R.string.cauliflower));
                        // read viewModel.menuItems[@android:string/pasta]
                        viewModelMenuItemsAndroidStringPasta = viewModelMenuItems.get(pasta.getResources().getString(R.string.pasta));
                    }


                    if (viewModelMenuItemsAndroidStringChili != null) {
                        // read viewModel.menuItems[@android:string/chili].description
                        viewModelMenuItemsAndroidStringChiliDescription = viewModelMenuItemsAndroidStringChili.getDescription();
                        // read viewModel.menuItems[@android:string/chili].getFormattedPrice()
                        viewModelMenuItemsAndroidStringChiliGetFormattedPrice = viewModelMenuItemsAndroidStringChili.getFormattedPrice();
                        // read viewModel.menuItems[@android:string/chili].name
                        viewModelMenuItemsAndroidStringChiliName = viewModelMenuItemsAndroidStringChili.getName();
                    }
                    if (viewModelMenuItemsAndroidStringSkillet != null) {
                        // read viewModel.menuItems[@android:string/skillet].getFormattedPrice()
                        viewModelMenuItemsAndroidStringSkilletGetFormattedPrice = viewModelMenuItemsAndroidStringSkillet.getFormattedPrice();
                        // read viewModel.menuItems[@android:string/skillet].description
                        viewModelMenuItemsAndroidStringSkilletDescription = viewModelMenuItemsAndroidStringSkillet.getDescription();
                        // read viewModel.menuItems[@android:string/skillet].name
                        viewModelMenuItemsAndroidStringSkilletName = viewModelMenuItemsAndroidStringSkillet.getName();
                    }
                    if (viewModelMenuItemsAndroidStringCauliflower != null) {
                        // read viewModel.menuItems[@android:string/cauliflower].name
                        viewModelMenuItemsAndroidStringCauliflowerName = viewModelMenuItemsAndroidStringCauliflower.getName();
                        // read viewModel.menuItems[@android:string/cauliflower].description
                        viewModelMenuItemsAndroidStringCauliflowerDescription = viewModelMenuItemsAndroidStringCauliflower.getDescription();
                        // read viewModel.menuItems[@android:string/cauliflower].getFormattedPrice()
                        viewModelMenuItemsAndroidStringCauliflowerGetFormattedPrice = viewModelMenuItemsAndroidStringCauliflower.getFormattedPrice();
                    }
                    if (viewModelMenuItemsAndroidStringPasta != null) {
                        // read viewModel.menuItems[@android:string/pasta].name
                        viewModelMenuItemsAndroidStringPastaName = viewModelMenuItemsAndroidStringPasta.getName();
                        // read viewModel.menuItems[@android:string/pasta].description
                        viewModelMenuItemsAndroidStringPastaDescription = viewModelMenuItemsAndroidStringPasta.getDescription();
                        // read viewModel.menuItems[@android:string/pasta].getFormattedPrice()
                        viewModelMenuItemsAndroidStringPastaGetFormattedPrice = viewModelMenuItemsAndroidStringPasta.getFormattedPrice();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.cancelButton.setOnClickListener(mCallback18);
            this.cauliflower.setOnClickListener(mCallback14);
            this.chili.setOnClickListener(mCallback15);
            this.nextButton.setOnClickListener(mCallback19);
            this.pasta.setOnClickListener(mCallback16);
            this.skillet.setOnClickListener(mCallback17);
        }
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.cauliflower, viewModelMenuItemsAndroidStringCauliflowerName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.cauliflowerDescription, viewModelMenuItemsAndroidStringCauliflowerDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.cauliflowerPrice, viewModelMenuItemsAndroidStringCauliflowerGetFormattedPrice);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.chili, viewModelMenuItemsAndroidStringChiliName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.chiliDescription, viewModelMenuItemsAndroidStringChiliDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.chiliPrice, viewModelMenuItemsAndroidStringChiliGetFormattedPrice);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.pasta, viewModelMenuItemsAndroidStringPastaName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.pastaDescription, viewModelMenuItemsAndroidStringPastaDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.pastaPrice, viewModelMenuItemsAndroidStringPastaGetFormattedPrice);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.skillet, viewModelMenuItemsAndroidStringSkilletName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.skilletDescription, viewModelMenuItemsAndroidStringSkilletDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.skilletPrice, viewModelMenuItemsAndroidStringSkilletGetFormattedPrice);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.subtotal, subtotalAndroidStringSubtotalViewModelSubtotal);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // viewModel
                com.example.lunchtray.model.OrderViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.setEntree(chili.getResources().getString(R.string.chili));
                }
                break;
            }
            case 6: {
                // localize variables for thread safety
                // entreeMenuFragment
                com.example.lunchtray.ui.order.EntreeMenuFragment entreeMenuFragment = mEntreeMenuFragment;
                // entreeMenuFragment != null
                boolean entreeMenuFragmentJavaLangObjectNull = false;



                entreeMenuFragmentJavaLangObjectNull = (entreeMenuFragment) != (null);
                if (entreeMenuFragmentJavaLangObjectNull) {


                    entreeMenuFragment.goToNextScreen();
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // viewModel
                com.example.lunchtray.model.OrderViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.setEntree(pasta.getResources().getString(R.string.pasta));
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // viewModel
                com.example.lunchtray.model.OrderViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.setEntree(skillet.getResources().getString(R.string.skillet));
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewModel
                com.example.lunchtray.model.OrderViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.setEntree(cauliflower.getResources().getString(R.string.cauliflower));
                }
                break;
            }
            case 5: {
                // localize variables for thread safety
                // entreeMenuFragment
                com.example.lunchtray.ui.order.EntreeMenuFragment entreeMenuFragment = mEntreeMenuFragment;
                // entreeMenuFragment != null
                boolean entreeMenuFragmentJavaLangObjectNull = false;



                entreeMenuFragmentJavaLangObjectNull = (entreeMenuFragment) != (null);
                if (entreeMenuFragmentJavaLangObjectNull) {


                    entreeMenuFragment.cancelOrder();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.subtotal
        flag 1 (0x2L): entreeMenuFragment
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}