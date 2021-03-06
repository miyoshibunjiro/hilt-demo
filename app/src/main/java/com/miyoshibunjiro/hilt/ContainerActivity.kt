package com.miyoshibunjiro.hilt

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.miyoshibunjiro.hilt.databinding.ActivityContainerBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ContainerActivity : AppCompatActivity() {

    private lateinit var navController: NavController

    private lateinit var binding: ActivityContainerBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView<ActivityContainerBinding>(
            this,
            R.layout.activity_container
        ).also {
            it.lifecycleOwner = this@ContainerActivity
        }

        navController =
            (supportFragmentManager.findFragmentById(R.id.container) as NavHostFragment).navController
    }

    override fun onBackPressed() {
        if (onBackPressedDispatcher.hasEnabledCallbacks()) {
        } else {
        }

        super.onBackPressed()
    }

    override fun onSupportNavigateUp() = navController.navigateUp()
}
