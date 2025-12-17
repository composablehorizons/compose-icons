package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Visibility_off: ImageVector
    get() {
        if (_Visibility_off != null) return _Visibility_off!!
        
        _Visibility_off = ImageVector.Builder(
            name = "visibility_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(792f, 904f)
                lineTo(624f, 738f)
                quadToRelative(-35f, 11f, -70.5f, 16.5f)
                reflectiveQuadTo(480f, 760f)
                quadToRelative(-151f, 0f, -269f, -83.5f)
                reflectiveQuadTo(40f, 460f)
                quadToRelative(21f, -53f, 53f, -98.5f)
                reflectiveQuadToRelative(73f, -81.5f)
                lineTo(56f, 168f)
                lineToRelative(56f, -56f)
                lineToRelative(736f, 736f)
                lineToRelative(-56f, 56f)
                close()
                moveTo(480f, 640f)
                quadToRelative(11f, 0f, 20.5f, -1f)
                reflectiveQuadToRelative(20.5f, -4f)
                lineTo(305f, 419f)
                quadToRelative(-3f, 11f, -4f, 20.5f)
                reflectiveQuadToRelative(-1f, 20.5f)
                quadToRelative(0f, 75f, 52.5f, 127.5f)
                reflectiveQuadTo(480f, 640f)
                close()
                moveToRelative(292f, 18f)
                lineTo(645f, 532f)
                quadToRelative(7f, -17f, 11f, -34.5f)
                reflectiveQuadToRelative(4f, -37.5f)
                quadToRelative(0f, -75f, -52.5f, -127.5f)
                reflectiveQuadTo(480f, 280f)
                quadToRelative(-20f, 0f, -37.5f, 4f)
                reflectiveQuadTo(408f, 296f)
                lineTo(306f, 194f)
                quadToRelative(41f, -17f, 84f, -25.5f)
                reflectiveQuadToRelative(90f, -8.5f)
                quadToRelative(151f, 0f, 269f, 83.5f)
                reflectiveQuadTo(920f, 460f)
                quadToRelative(-23f, 59f, -60.5f, 109.5f)
                reflectiveQuadTo(772f, 658f)
                close()
                moveTo(587f, 474f)
                lineTo(467f, 354f)
                quadToRelative(28f, -5f, 51.5f, 4.5f)
                reflectiveQuadTo(559f, 386f)
                quadToRelative(17f, 18f, 24.5f, 41.5f)
                reflectiveQuadTo(587f, 474f)
                close()
            }
        }.build()
        
        return _Visibility_off!!
    }

private var _Visibility_off: ImageVector? = null

