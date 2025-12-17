package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Brightness_2: ImageVector
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
                moveTo(380f, 80f)
                quadToRelative(83f, 0f, 156f, 31.5f)
                reflectiveQuadTo(663f, 197f)
                quadToRelative(54f, 54f, 85.5f, 127f)
                reflectiveQuadTo(780f, 480f)
                quadToRelative(0f, 83f, -31.5f, 156f)
                reflectiveQuadTo(663f, 763f)
                quadToRelative(-54f, 54f, -127f, 85.5f)
                reflectiveQuadTo(380f, 880f)
                quadToRelative(-53f, 0f, -103.5f, -13.5f)
                reflectiveQuadTo(180f, 826f)
                quadToRelative(93f, -54f, 146.5f, -146f)
                reflectiveQuadTo(380f, 480f)
                quadToRelative(0f, -108f, -53.5f, -200f)
                reflectiveQuadTo(180f, 134f)
                quadToRelative(46f, -27f, 96.5f, -40.5f)
                reflectiveQuadTo(380f, 80f)
                close()
            }
        }.build()
        
        return _Brightness_2!!
    }

private var _Brightness_2: ImageVector? = null

