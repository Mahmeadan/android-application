import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.androidapplication.common.Routes
import com.example.androidapplication.presentation.MainViewModel.MainViewModel
import com.example.androidapplication.presentation.common.NotificationMessage
import com.example.androidapplication.presentation.screens.auth.LoginScreen
import com.example.androidapplication.presentation.screens.auth.SignupScreen
import com.example.androidapplication.presentation.screens.main.MyServicesScreen
import com.example.androidapplication.presentation.screens.main.SearchScreen
import com.example.androidapplication.presentation.screens.main.ServiceScreen

@Composable
fun DemandApp() {
    val vm: MainViewModel = hiltViewModel()
    val navController = rememberNavController()
    NotificationMessage(vm = vm)
    NavHost(navController = navController, startDestination = Routes.Signup.route) {

        composable(Routes.Signup.route) {
            SignupScreen(navController = navController, vm = vm)
        }
        composable(Routes.Login.route) {
            LoginScreen(navController = navController, vm = vm)
        }
        composable(Routes.Services.route) {
            ServiceScreen(navController = navController, vm = vm)
        }
        composable(Routes.MyServices.route) {
            SearchScreen(navController = navController, vm = vm)
        }
        composable(Routes.Services.route) {
            MyServicesScreen(navController = navController, vm = vm)
        }

    }
}