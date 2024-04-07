package com.muhammadsapplication.app.modules.preferences.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.widget.SearchView
import com.muhammadsapplication.app.R
import com.muhammadsapplication.app.appcomponents.base.BaseActivity
import com.muhammadsapplication.app.databinding.ActivityPreferencesBinding
import com.muhammadsapplication.app.modules.homepageexploretabcontainer.ui.HomepageexploretabContainerActivity
import com.muhammadsapplication.app.modules.preferences.`data`.viewmodel.PreferencesVM
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit

class PreferencesActivity : BaseActivity<ActivityPreferencesBinding>(R.layout.activity_preferences)
    {
  private val viewModel: PreferencesVM by viewModels<PreferencesVM>()

  private val REQUEST_CODE_HOMEPAGEEXPLORETAB_CONTAINER_ACTIVITY: Int = 466


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.preferencesVM = viewModel
    setUpSearchViewSearchListener()
    val destIntent = HomepageexploretabContainerActivity.getIntent(this, null)
    startActivityForResult(destIntent, REQUEST_CODE_HOMEPAGEEXPLORETAB_CONTAINER_ACTIVITY)
  }

  override fun setUpClicks(): Unit {
  }

  private fun setUpSearchViewSearchListener(): Unit {
    binding.searchViewSearch.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
      override fun onQueryTextSubmit(p0 : String) : Boolean {
        // Performs search when user hit
        // the search button on the keyboard
        return false
      }
      override fun onQueryTextChange(p0 : String) : Boolean {
        // Start filtering the list as user
        // start entering the characters
        return false
      }
      })
    }

    companion object {
      const val TAG: String = "PREFERENCES_ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, PreferencesActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
