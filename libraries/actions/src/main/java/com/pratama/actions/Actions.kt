import android.content.Context
import android.content.Intent

object Actions {
    fun openOnboardingIntent(ctx: Context): Intent {
        return internalIntent(ctx, "com.pratama.baseappmultimodule.onboarding.open")
    }

    fun openRegister(ctx: Context): Intent {
        return internalIntent(ctx, "com.pratama.baseappmultimodule.register.open")
    }

    fun openLogin(ctx: Context): Intent {
        return internalIntent(ctx, "com.pratama.baseappmultimodule.login.open")
    }

    private fun internalIntent(context: Context, action: String) = Intent(action).setPackage(context.packageName)

}