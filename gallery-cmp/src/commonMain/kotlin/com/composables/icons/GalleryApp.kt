package com.composables.icons

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.composables.icons.bootstrap.Bootstrap
import com.composables.icons.bootstrap.fill.Bootstrap
import com.composables.icons.bootstrap.outline.Bootstrap
import com.composables.icons.codicons.Codicons
import com.composables.icons.codicons.TerminalTmux
import com.composables.icons.feather.Feather
import com.composables.icons.feather.Star
import com.composables.icons.fontawesome.FontAwesome
import com.composables.icons.fontawesome.brands.Adn
import com.composables.icons.fontawesome.regular.AddressBook
import com.composables.icons.fontawesome.solid.Fill
import com.composables.icons.lucide.AppWindow
import com.composables.icons.lucide.Lucide
import com.composables.icons.radix.Radix
import com.composables.icons.radix.Timer
import com.composeunstyled.Icon

@Composable
fun App() {
    val vectors = listOf(
        Lucide.AppWindow,
        Feather.Star,
        Radix.Timer,
        Codicons.TerminalTmux,
        Bootstrap.Fill.Bootstrap,
        Bootstrap.Outline.Bootstrap,
        FontAwesome.Solid.Fill,
        FontAwesome.Brands.Adn,
        FontAwesome.Regular.AddressBook,
    )
    Row(
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        modifier = Modifier.fillMaxWidth()
    ) {
        vectors.forEach {
            Icon(
                imageVector = it,
                contentDescription = it.name,
            )
        }
    }
}
