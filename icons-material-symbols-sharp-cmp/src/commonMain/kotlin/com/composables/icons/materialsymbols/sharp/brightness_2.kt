package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Brightness_2: ImageVector
    get() {
        if (_Brightness_2 != null) return _Brightness_2!!
        
        _Brightness_2 = ImageVector.Builder(
            name = "brightness_2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(380f, 800f)
                quadToRelative(133f, 0f, 226.5f, -93.5f)
                reflectiveQuadTo(700f, 480f)
                quadToRelative(0f, -133f, -93.5f, -226.5f)
                reflectiveQuadTo(380f, 160f)
                horizontalLineToRelative(-21f)
                quadToRelative(-10f, 0f, -19f, 2f)
                quadToRelative(57f, 66f, 88.5f, 147.5f)
                reflectiveQuadTo(460f, 480f)
                quadToRelative(0f, 89f, -31.5f, 170.5f)
                reflectiveQuadTo(340f, 798f)
                quadToRelative(9f, 2f, 19f, 2f)
                horizontalLineToRelative(21f)
                close()
                moveToRelative(0f, 80f)
                quadToRelative(-53f, 0f, -103.5f, -13.5f)
                reflectiveQuadTo(180f, 826f)
                quadToRelative(93f, -54f, 146.5f, -146f)
                reflectiveQuadTo(380f, 480f)
                quadToRelative(0f, -108f, -53.5f, -200f)
                reflectiveQuadTo(180f, 134f)
                quadToRelative(46f, -27f, 96.5f, -40.5f)
                reflectiveQuadTo(380f, 80f)
                quadToRelative(83f, 0f, 156f, 31.5f)
                reflectiveQuadTo(663f, 197f)
                quadToRelative(54f, 54f, 85.5f, 127f)
                reflectiveQuadTo(780f, 480f)
                quadToRelative(0f, 83f, -31.5f, 156f)
                reflectiveQuadTo(663f, 763f)
                quadToRelative(-54f, 54f, -127f, 85.5f)
                reflectiveQuadTo(380f, 880f)
                close()
                moveToRelative(80f, -400f)
                close()
            }
        }.build()
        
        return _Brightness_2!!
    }

private var _Brightness_2: ImageVector? = null

