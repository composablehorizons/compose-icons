package org.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.composeunstyled.Icon

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            App()
        }
    }
}

@Composable
fun App() {
    val iconsRes = listOf(
        com.composables.icons.lucide.R.drawable.lucide_ic_axe,
        com.composables.icons.feather.R.drawable.feather_ic_file,
        com.composables.icons.bootstrap.fill.R.drawable.bootstrap_ic_0_circle_fill,
        com.composables.icons.bootstrap.outline.R.drawable.bootstrap_ic_0_circle_outline,
        com.composables.icons.codicons.R.drawable.codicons_ic_account,
        com.composables.icons.radix.R.drawable.radix_ic_accessibility
    )
    Row(
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        modifier = Modifier
            .fillMaxSize()
            .safeDrawingPadding()
            .padding(16.dp)
    ) {
        iconsRes.forEach { id ->
            Icon(
                painter = painterResource(id),
                contentDescription = null,
            )
        }
    }
}
