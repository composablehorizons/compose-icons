package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Volume_mute: ImageVector
    get() {
        if (_Volume_mute != null) return _Volume_mute!!
        
        _Volume_mute = ImageVector.Builder(
            name = "volume_mute",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440f, 600f)
                horizontalLineTo(320f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(280f, 560f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(320f, 360f)
                horizontalLineToRelative(120f)
                lineToRelative(132f, -132f)
                quadToRelative(19f, -19f, 43.5f, -8.5f)
                reflectiveQuadTo(640f, 257f)
                verticalLineToRelative(446f)
                quadToRelative(0f, 27f, -24.5f, 37.5f)
                reflectiveQuadTo(572f, 732f)
                lineTo(440f, 600f)
                close()
            }
        }.build()
        
        return _Volume_mute!!
    }

private var _Volume_mute: ImageVector? = null

