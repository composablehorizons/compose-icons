package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Signal_cellular_off: ImageVector
    get() {
        if (_Signal_cellular_off != null) return _Signal_cellular_off!!
        
        _Signal_cellular_off = ImageVector.Builder(
            name = "signal_cellular_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(177f, 880f)
                quadToRelative(-27f, 0f, -37.5f, -24.5f)
                reflectiveQuadTo(148f, 812f)
                lineToRelative(276f, -276f)
                lineToRelative(-300f, -299f)
                quadToRelative(-12f, -11f, -11.5f, -27.5f)
                reflectiveQuadTo(124f, 181f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                lineToRelative(679f, 679f)
                quadToRelative(12f, 12f, 11.5f, 28f)
                reflectiveQuadTo(859f, 916f)
                quadToRelative(-12f, 11f, -28f, 11.5f)
                reflectiveQuadTo(803f, 916f)
                lineToRelative(-36f, -36f)
                horizontalLineTo(177f)
                close()
                moveToRelative(703f, -703f)
                verticalLineToRelative(494f)
                quadToRelative(0f, 18f, -12f, 29.5f)
                reflectiveQuadTo(840f, 712f)
                quadToRelative(-8f, 0f, -15f, -3f)
                reflectiveQuadToRelative(-13f, -9f)
                lineTo(564f, 452f)
                quadToRelative(-6f, -6f, -8.5f, -13f)
                reflectiveQuadToRelative(-2.5f, -15f)
                quadToRelative(0f, -8f, 2.5f, -15f)
                reflectiveQuadToRelative(8.5f, -13f)
                lineToRelative(248f, -248f)
                quadToRelative(19f, -19f, 43.5f, -8.5f)
                reflectiveQuadTo(880f, 177f)
                close()
            }
        }.build()
        
        return _Signal_cellular_off!!
    }

private var _Signal_cellular_off: ImageVector? = null

