package android;

import android.content.Intent;
import android.content.pm.ApplicationInfo;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.car.app.CarAppService;
import androidx.car.app.Screen;
import androidx.car.app.Session;
import androidx.car.app.validation.HostValidator;

public final class HelloWorldService extends CarAppService {
    @Override
    @NonNull
    public Session onCreateSession() {
        return new Session() {
            @Override
            @NonNull
            public Screen onCreateScreen(@Nullable Intent intent) {
                return new HelloWorldScreen(getCarContext());
            }
        };
    }

    @NonNull
    @Override
    public HostValidator createHostValidator() {
        if ((getApplicationInfo().flags & ApplicationInfo.FLAG_DEBUGGABLE) != 0) {
            return HostValidator.ALLOW_ALL_HOSTS_VALIDATOR;
        } else {
            return new HostValidator.Builder(getApplicationContext())
                    .addAllowedHosts(androidx.car.app.R.array.hosts_allowlist_sample)
                    .build();
        }
    }
}