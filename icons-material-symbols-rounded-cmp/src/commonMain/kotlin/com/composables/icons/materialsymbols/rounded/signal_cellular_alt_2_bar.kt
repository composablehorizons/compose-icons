package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Signal_cellular_alt_2_bar: ImageVector
    get() {
        if (_Signal_cellular_alt_2_bar != null) return _Signal_cellular_alt_2_bar!!
        
        _Signal_cellular_alt_2_bar = ImageVector.Builder(
            name = "signal_cellular_alt_2_bar",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(260f, 800f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(200f, 740f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(260f, 560f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(320f, 620f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(260f, 800f)
                close()
                moveToRelative(240f, 0f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(440f, 740f)
                verticalLineToRelative(-320f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(500f, 360f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(560f, 420f)
                verticalLineToRelative(320f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(500f, 800f)
                close()
            }
        }.build()
        
        return _Signal_cellular_alt_2_bar!!
    }

private var _Signal_cellular_alt_2_bar: ImageVector? = null

