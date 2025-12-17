package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Touch_long: ImageVector
    get() {
        if (_Touch_long != null) return _Touch_long!!
        
        _Touch_long = ImageVector.Builder(
            name = "touch_long",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(800f, 880f)
                horizontalLineTo(361f)
                lineTo(107f, 557f)
                lineToRelative(64f, -67f)
                lineToRelative(129f, 78f)
                verticalLineToRelative(-368f)
                horizontalLineToRelative(81f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(419f)
                verticalLineToRelative(440f)
                close()
                moveTo(240f, 140f)
                verticalLineToRelative(273f)
                quadToRelative(-45f, -26f, -72.5f, -71.5f)
                reflectiveQuadTo(140f, 240f)
                quadToRelative(0f, -83f, 58.5f, -141.5f)
                reflectiveQuadTo(340f, 40f)
                quadToRelative(83f, 0f, 141.5f, 58.5f)
                reflectiveQuadTo(540f, 240f)
                quadToRelative(0f, 56f, -27f, 101.5f)
                reflectiveQuadTo(441f, 413f)
                verticalLineToRelative(-273f)
                horizontalLineTo(240f)
                close()
            }
        }.build()
        
        return _Touch_long!!
    }

private var _Touch_long: ImageVector? = null

