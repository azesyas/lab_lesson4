import android.content.Context;
import android.os.SystemClock;

import androidx.annotation.Nullable;
import androidx.loader.content.AsyncTaskLoader;

public class MyLoader extends AsyncTaskLoader {
    @Nullable
    @Override
    public Integer loadInBackground() {
        SystemClock.sleep(5000);
        return 5;
    }
    MyLoader(Context context) {
        super(context);
    }
    @Override
    protected void onStartLoading() {
        super.onStartLoading();
        forceLoad();
    }
}