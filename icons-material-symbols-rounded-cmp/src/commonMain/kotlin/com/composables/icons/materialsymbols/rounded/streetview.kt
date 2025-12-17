package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Streetview: ImageVector
    get() {
        if (_Streetview != null) return _Streetview!!
        
        _Streetview = ImageVector.Builder(
            name = "streetview",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(720f, 440f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(520f, 240f)
                quadToRelative(0f, -83f, 58.5f, -141.5f)
                reflectiveQuadTo(720f, 40f)
                quadToRelative(83f, 0f, 141.5f, 58.5f)
                reflectiveQuadTo(920f, 240f)
                quadToRelative(0f, 83f, -58.5f, 141.5f)
                reflectiveQuadTo(720f, 440f)
                close()
                moveTo(144f, 816f)
                quadToRelative(-11f, -11f, -17.5f, -25f)
                reflectiveQuadToRelative(-6.5f, -31f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 120f)
                horizontalLineToRelative(268f)
                quadToRelative(-14f, 27f, -21f, 57.5f)
                reflectiveQuadToRelative(-7f, 62.5f)
                quadToRelative(0f, 59f, 22f, 109.5f)
                reflectiveQuadToRelative(60f, 88.5f)
                lineTo(144f, 816f)
                close()
                moveToRelative(336f, 24f)
                verticalLineToRelative(-216f)
                quadToRelative(0f, -42f, 25.5f, -75.5f)
                reflectiveQuadTo(572f, 506f)
                quadToRelative(35f, -8f, 72f, -12f)
                reflectiveQuadToRelative(76f, -4f)
                quadToRelative(32f, 0f, 61.5f, 2.5f)
                reflectiveQuadTo(840f, 500f)
                verticalLineToRelative(260f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(760f, 840f)
                horizontalLineTo(480f)
                close()
            }
        }.build()
        
        return _Streetview!!
    }

private var _Streetview: ImageVector? = null

