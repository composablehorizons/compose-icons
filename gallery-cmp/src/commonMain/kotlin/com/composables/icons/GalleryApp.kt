package com.composables.icons

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.runtime.Composable
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
import com.composables.icons.heroicons.Heroicons
import com.composables.icons.heroicons.outline.AcademicCap
import com.composables.icons.heroicons.solid.AcademicCap
import com.composables.icons.heroicons.mini.AcademicCap
import com.composables.icons.heroicons.micro.AcademicCap
import com.composables.icons.lucide.AppWindow
import com.composables.icons.materialicons.MaterialIcons
import com.composables.icons.materialicons.filled.Android
import com.composables.icons.materialicons.rounded.Android
import com.composables.icons.materialicons.sharp.Android
import com.composables.icons.materialicons.twotone.Android
import com.composables.icons.lucide.Lucide
import com.composables.icons.radix.Radix
import com.composables.icons.radix.Timer
import com.composables.icons.tabler.Tabler
import com.composables.icons.tabler.filled.FileCode
import com.composables.icons.tabler.outline.Circle

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
        Tabler.Filled.FileCode,
        Tabler.Outline.Circle,
        Heroicons.Outline.AcademicCap,
        Heroicons.Solid.AcademicCap,
        Heroicons.Mini.AcademicCap,
        Heroicons.Micro.AcademicCap,
        MaterialIcons.Filled.Android,
        MaterialIcons.Rounded.Android,
        MaterialIcons.Sharp.Android,
        MaterialIcons.Twotone.Android,
    )
    FlowRow {
        vectors.forEach {
            Image(
                imageVector = it,
                contentDescription = it.name,
            )
        }
    }
}
