package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Key_off: ImageVector
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
                moveTo(763f, 876f)
                lineTo(488f, 601f)
                quadToRelative(-32f, 54f, -87f, 86.5f)
                reflectiveQuadTo(280f, 720f)
                quadToRelative(-100f, 0f, -170f, -70f)
                reflectiveQuadTo(40f, 480f)
                quadToRelative(0f, -66f, 32.5f, -121f)
                reflectiveQuadToRelative(86.5f, -87f)
                lineToRelative(-75f, -75f)
                quadToRelative(-11f, -11f, -11f, -27.5f)
                reflectiveQuadTo(84f, 141f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                lineToRelative(678f, 679f)
                quadToRelative(11f, 11f, 11.5f, 27.5f)
                reflectiveQuadTo(819f, 876f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                close()
                moveToRelative(180f, -396f)
                quadToRelative(0f, 8f, -2.5f, 15f)
                reflectiveQuadToRelative(-8.5f, 13f)
                lineTo(805f, 635f)
                quadToRelative(-6f, 6f, -13.5f, 9f)
                reflectiveQuadToRelative(-12.5f, 3f)
                quadToRelative(-8f, 0f, -14f, -1.5f)
                reflectiveQuadToRelative(-12f, -5.5f)
                lineTo(650f, 537f)
                lineToRelative(50f, -37f)
                lineToRelative(72f, 54f)
                lineToRelative(75f, -74f)
                lineToRelative(-40f, -40f)
                horizontalLineTo(553f)
                lineToRelative(-80f, -80f)
                horizontalLineToRelative(350f)
                quadToRelative(8f, 0f, 15.5f, 3f)
                reflectiveQuadToRelative(13.5f, 9f)
                lineToRelative(80f, 80f)
                quadToRelative(6f, 6f, 8.5f, 13f)
                reflectiveQuadToRelative(2.5f, 15f)
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

