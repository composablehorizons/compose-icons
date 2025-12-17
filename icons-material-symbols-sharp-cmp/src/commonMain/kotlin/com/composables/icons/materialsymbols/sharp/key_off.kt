package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Key_off: ImageVector
    get() {
        if (_Key_off != null) return _Key_off!!
        
        _Key_off = ImageVector.Builder(
            name = "key_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(790f, 903f)
                lineTo(488f, 601f)
                quadToRelative(-32f, 54f, -87f, 86.5f)
                reflectiveQuadTo(280f, 720f)
                quadToRelative(-100f, 0f, -170f, -70f)
                reflectiveQuadTo(40f, 480f)
                quadToRelative(0f, -66f, 32.5f, -121f)
                reflectiveQuadToRelative(86.5f, -87f)
                lineTo(57f, 170f)
                lineToRelative(57f, -56f)
                lineToRelative(732f, 733f)
                lineToRelative(-56f, 56f)
                close()
                moveToRelative(50f, -543f)
                lineToRelative(120f, 120f)
                lineToRelative(-183f, 183f)
                lineToRelative(-127f, -126f)
                lineToRelative(50f, -37f)
                lineToRelative(72f, 54f)
                lineToRelative(75f, -74f)
                lineToRelative(-40f, -40f)
                horizontalLineTo(553f)
                lineToRelative(-80f, -80f)
                horizontalLineToRelative(367f)
                close()
                moveTo(280f, 640f)
                quadToRelative(51f, 0f, 90.5f, -27.5f)
                reflectiveQuadTo(428f, 541f)
                lineToRelative(-56f, -56f)
                lineToRelative(-48.5f, -48.5f)
                lineTo(275f, 388f)
                lineToRelative(-56f, -56f)
                quadToRelative(-44f, 18f, -71.5f, 57.5f)
                reflectiveQuadTo(120f, 480f)
                quadToRelative(0f, 66f, 47f, 113f)
                reflectiveQuadToRelative(113f, 47f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(200f, 480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(280f, 400f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(360f, 480f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(280f, 560f)
                close()
            }
        }.build()
        
        return _Key_off!!
    }

private var _Key_off: ImageVector? = null

