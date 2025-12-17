package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Signal_cellular_off: ImageVector
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
                moveTo(273f, 800f)
                horizontalLineToRelative(414f)
                lineTo(480f, 593f)
                lineTo(273f, 800f)
                close()
                moveToRelative(-96f, 80f)
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
                quadToRelative(0f, 20f, -12.5f, 30f)
                reflectiveQuadTo(840f, 711f)
                quadToRelative(-15f, 0f, -27.5f, -10.5f)
                reflectiveQuadTo(800f, 670f)
                verticalLineToRelative(-397f)
                lineTo(621f, 452f)
                quadToRelative(-11f, 11f, -27.5f, 11f)
                reflectiveQuadTo(565f, 452f)
                quadToRelative(-12f, -12f, -12f, -28.5f)
                reflectiveQuadToRelative(12f, -28.5f)
                lineToRelative(247f, -247f)
                quadToRelative(19f, -19f, 43.5f, -8.5f)
                reflectiveQuadTo(880f, 177f)
                close()
                moveTo(697f, 583f)
                close()
                moveTo(584f, 696f)
                close()
            }
        }.build()
        
        return _Signal_cellular_off!!
    }

private var _Signal_cellular_off: ImageVector? = null

