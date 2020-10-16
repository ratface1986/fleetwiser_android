package com.gameborn.keeperlogin;

import android.app.Activity;
import android.app.Service;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.hilt.lifecycle.ViewModelFactoryModules_ActivityModule_ProvideFactoryFactory;
import androidx.hilt.lifecycle.ViewModelFactoryModules_FragmentModule_ProvideFactoryFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.gameborn.keeperlogin.di.UserLoginModule_ProvideUserLoginDataFactory;
import com.gameborn.keeperlogin.di.WebserviceModule_ProvideRetrofitClientFactory;
import com.gameborn.keeperlogin.di.WebserviceModule_ProvideUsersAPIFactory;
import com.gameborn.keeperlogin.di.api.WebAPI;
import com.gameborn.keeperlogin.ui.LoginActivity;
import com.gameborn.keeperlogin.ui.login.LoginFragment;
import com.gameborn.keeperlogin.ui.login.LoginFragment_MembersInjector;
import com.gameborn.keeperlogin.ui.login.LoginViewModel;
import com.gameborn.keeperlogin.ui.login.LoginViewModel_Factory;
import com.gameborn.keeperlogin.ui.login.LoginViewModel_MembersInjector;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideApplicationFactory;
import dagger.internal.Preconditions;
import java.util.Collections;
import java.util.Set;
import javax.annotation.Generated;
import javax.inject.Provider;
import retrofit2.Retrofit;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerKeeperApplication_HiltComponents_ApplicationC extends KeeperApplication_HiltComponents.ApplicationC {
  private final ApplicationContextModule applicationContextModule;

  private DaggerKeeperApplication_HiltComponents_ApplicationC(
      ApplicationContextModule applicationContextModuleParam) {
    this.applicationContextModule = applicationContextModuleParam;
  }

  public static Builder builder() {
    return new Builder();
  }

  @Override
  public void injectKeeperApplication(KeeperApplication keeperApplication) {
  }

  @Override
  public ActivityRetainedComponentBuilder retainedComponentBuilder() {
    return new ActivityRetainedCBuilder();}

  @Override
  public ServiceComponentBuilder serviceComponentBuilder() {
    return new ServiceCBuilder();}

  public static final class Builder {
    private ApplicationContextModule applicationContextModule;

    private Builder() {
    }

    public Builder applicationContextModule(ApplicationContextModule applicationContextModule) {
      this.applicationContextModule = Preconditions.checkNotNull(applicationContextModule);
      return this;
    }

    public KeeperApplication_HiltComponents.ApplicationC build() {
      Preconditions.checkBuilderRequirement(applicationContextModule, ApplicationContextModule.class);
      return new DaggerKeeperApplication_HiltComponents_ApplicationC(applicationContextModule);
    }
  }

  private final class ActivityRetainedCBuilder implements KeeperApplication_HiltComponents.ActivityRetainedC.Builder {
    @Override
    public KeeperApplication_HiltComponents.ActivityRetainedC build() {
      return new ActivityRetainedCImpl();
    }
  }

  private final class ActivityRetainedCImpl extends KeeperApplication_HiltComponents.ActivityRetainedC {
    private ActivityRetainedCImpl() {

    }

    @Override
    public ActivityComponentBuilder activityComponentBuilder() {
      return new ActivityCBuilder();}

    private final class ActivityCBuilder implements KeeperApplication_HiltComponents.ActivityC.Builder {
      private Activity activity;

      @Override
      public ActivityCBuilder activity(Activity activity) {
        this.activity = Preconditions.checkNotNull(activity);
        return this;
      }

      @Override
      public KeeperApplication_HiltComponents.ActivityC build() {
        Preconditions.checkBuilderRequirement(activity, Activity.class);
        return new ActivityCImpl(activity);
      }
    }

    private final class ActivityCImpl extends KeeperApplication_HiltComponents.ActivityC {
      private final Activity activity;

      private ActivityCImpl(Activity activityParam) {
        this.activity = activityParam;
      }

      private ViewModelProvider.Factory getProvideFactory() {
        return ViewModelFactoryModules_ActivityModule_ProvideFactoryFactory.provideFactory(activity, ApplicationContextModule_ProvideApplicationFactory.provideApplication(DaggerKeeperApplication_HiltComponents_ApplicationC.this.applicationContextModule), Collections.<String, Provider<ViewModelAssistedFactory<? extends ViewModel>>>emptyMap());}

      @Override
      public void injectLoginActivity(LoginActivity loginActivity) {
      }

      @Override
      public Set<ViewModelProvider.Factory> getActivityViewModelFactory() {
        return Collections.<ViewModelProvider.Factory>singleton(getProvideFactory());}

      @Override
      public FragmentComponentBuilder fragmentComponentBuilder() {
        return new FragmentCBuilder();}

      @Override
      public ViewComponentBuilder viewComponentBuilder() {
        return new ViewCBuilder();}

      private final class FragmentCBuilder implements KeeperApplication_HiltComponents.FragmentC.Builder {
        private Fragment fragment;

        @Override
        public FragmentCBuilder fragment(Fragment fragment) {
          this.fragment = Preconditions.checkNotNull(fragment);
          return this;
        }

        @Override
        public KeeperApplication_HiltComponents.FragmentC build() {
          Preconditions.checkBuilderRequirement(fragment, Fragment.class);
          return new FragmentCImpl(fragment);
        }
      }

      private final class FragmentCImpl extends KeeperApplication_HiltComponents.FragmentC {
        private final Fragment fragment;

        private volatile Retrofit retrofit;

        private volatile WebAPI webAPI;

        private FragmentCImpl(Fragment fragmentParam) {
          this.fragment = fragmentParam;
        }

        private Retrofit getRetrofit() {
          Object local = retrofit;
          if (local == null) {
            local = WebserviceModule_ProvideRetrofitClientFactory.provideRetrofitClient();
            retrofit = (Retrofit) local;
          }
          return (Retrofit) local;
        }

        private WebAPI getWebAPI() {
          Object local = webAPI;
          if (local == null) {
            local = WebserviceModule_ProvideUsersAPIFactory.provideUsersAPI(getRetrofit());
            webAPI = (WebAPI) local;
          }
          return (WebAPI) local;
        }

        private LoginViewModel getLoginViewModel() {
          return injectLoginViewModel(LoginViewModel_Factory.newInstance());}

        private ViewModelProvider.Factory getProvideFactory() {
          return ViewModelFactoryModules_FragmentModule_ProvideFactoryFactory.provideFactory(fragment, ApplicationContextModule_ProvideApplicationFactory.provideApplication(DaggerKeeperApplication_HiltComponents_ApplicationC.this.applicationContextModule), Collections.<String, Provider<ViewModelAssistedFactory<? extends ViewModel>>>emptyMap());}

        @Override
        public void injectLoginFragment(LoginFragment loginFragment) {
          injectLoginFragment2(loginFragment);}

        @Override
        public Set<ViewModelProvider.Factory> getFragmentViewModelFactory() {
          return Collections.<ViewModelProvider.Factory>singleton(getProvideFactory());}

        @Override
        public ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder() {
          return new ViewWithFragmentCBuilder();}

        private LoginViewModel injectLoginViewModel(LoginViewModel instance) {
          LoginViewModel_MembersInjector.injectUserLoginData(instance, UserLoginModule_ProvideUserLoginDataFactory.provideUserLoginData());
          LoginViewModel_MembersInjector.injectWebAPI(instance, getWebAPI());
          return instance;
        }

        private LoginFragment injectLoginFragment2(LoginFragment instance) {
          LoginFragment_MembersInjector.injectViewModel(instance, getLoginViewModel());
          return instance;
        }

        private final class ViewWithFragmentCBuilder implements KeeperApplication_HiltComponents.ViewWithFragmentC.Builder {
          private View view;

          @Override
          public ViewWithFragmentCBuilder view(View view) {
            this.view = Preconditions.checkNotNull(view);
            return this;
          }

          @Override
          public KeeperApplication_HiltComponents.ViewWithFragmentC build() {
            Preconditions.checkBuilderRequirement(view, View.class);
            return new ViewWithFragmentCImpl(view);
          }
        }

        private final class ViewWithFragmentCImpl extends KeeperApplication_HiltComponents.ViewWithFragmentC {
          private ViewWithFragmentCImpl(View view) {

          }
        }
      }

      private final class ViewCBuilder implements KeeperApplication_HiltComponents.ViewC.Builder {
        private View view;

        @Override
        public ViewCBuilder view(View view) {
          this.view = Preconditions.checkNotNull(view);
          return this;
        }

        @Override
        public KeeperApplication_HiltComponents.ViewC build() {
          Preconditions.checkBuilderRequirement(view, View.class);
          return new ViewCImpl(view);
        }
      }

      private final class ViewCImpl extends KeeperApplication_HiltComponents.ViewC {
        private ViewCImpl(View view) {

        }
      }
    }
  }

  private final class ServiceCBuilder implements KeeperApplication_HiltComponents.ServiceC.Builder {
    private Service service;

    @Override
    public ServiceCBuilder service(Service service) {
      this.service = Preconditions.checkNotNull(service);
      return this;
    }

    @Override
    public KeeperApplication_HiltComponents.ServiceC build() {
      Preconditions.checkBuilderRequirement(service, Service.class);
      return new ServiceCImpl(service);
    }
  }

  private final class ServiceCImpl extends KeeperApplication_HiltComponents.ServiceC {
    private ServiceCImpl(Service service) {

    }
  }
}
