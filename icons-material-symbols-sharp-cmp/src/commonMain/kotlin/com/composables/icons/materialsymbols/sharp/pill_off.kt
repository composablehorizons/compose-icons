package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Pill_off: ImageVector
    get() {
        if (_Pill_off != null) return _Pill_off!!
        
        _Pill_off = ImageVector.Builder(
            name = "pill_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(694f, 584f)
                lineToRelative(-56f, -56f)
                lineToRelative(80f, -80f)
                quadToRelative(20f, -20f, 31f, -47f)
                reflectiveQuadToRelative(11f, -56f)
                quadToRelative(0f, -60f, -42.5f, -102.5f)
                reflectiveQuadTo(615f, 200f)
                quadToRelative(-29f, 0f, -56f, 11f)
                reflectiveQuadToRelative(-47f, 31f)
                lineToRelative(-80f, 80f)
                lineToRelative(-56f, -56f)
                lineToRelative(80f, -80f)
                quadToRelative(32f, -32f, 73f, -49f)
                reflectiveQuadToRelative(86f, -17f)
                quadToRelative(94f, 0f, 159.5f, 65.5f)
                reflectiveQuadTo(840f, 345f)
                quadToRelative(0f, 45f, -17f, 86f)
                reflectiveQuadToRelative(-49f, 73f)
                lineToRelative(-80f, 80f)
                close()
                moveTo(345f, 760f)
                quadToRelative(29f, 0f, 56f, -11f)
                reflectiveQuadToRelative(47f, -31f)
                lineToRelative(77f, -77f)
                lineToRelative(-206f, -206f)
                lineToRelative(-77f, 77f)
                quadToRelative(-20f, 20f, -31f, 47f)
                reflectiveQuadToRelative(-11f, 56f)
                quadToRelative(0f, 60f, 42.5f, 102.5f)
                reflectiveQuadTo(345f, 760f)
                close()
                moveTo(792f, 908f)
                lineTo(581f, 697f)
                lineToRelative(-77f, 77f)
                quadToRelative(-32f, 32f, -73f, 49f)
                reflectiveQuadToRelative(-86f, 17f)
                quadToRelative(-94f, 0f, -159.5f, -65.5f)
                reflectiveQuadTo(120f, 615f)
                quadToRelative(0f, -45f, 17f, -86f)
                reflectiveQuadToRelative(49f, -73f)
                lineToRelative(77f, -77f)
                lineTo(56f, 172f)
                lineToRelative(56f, -56f)
                lineToRelative(736f, 736f)
                lineToRelative(-56f, 56f)
                close()
                moveTo(422f, 538f)
                close()
                moveToRelative(113f, -113f)
                close()
            }
        }.build()
        
        return _Pill_off!!
    }

private var _Pill_off: ImageVector? = null

