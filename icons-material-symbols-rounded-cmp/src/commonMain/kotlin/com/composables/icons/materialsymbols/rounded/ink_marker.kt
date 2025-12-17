package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Ink_marker: ImageVector
    get() {
        if (_Ink_marker != null) return _Ink_marker!!
        
        _Ink_marker = ImageVector.Builder(
            name = "ink_marker",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(272f, 856f)
                lineToRelative(-38f, -38f)
                lineToRelative(-42f, 42f)
                quadToRelative(-19f, 19f, -46.5f, 19.5f)
                reflectiveQuadTo(100f, 860f)
                quadToRelative(-19f, -19f, -19f, -46f)
                reflectiveQuadToRelative(19f, -46f)
                lineToRelative(42f, -42f)
                lineToRelative(-38f, -40f)
                lineToRelative(554f, -554f)
                quadToRelative(12f, -12f, 29f, -12f)
                reflectiveQuadToRelative(29f, 12f)
                lineToRelative(112f, 112f)
                quadToRelative(12f, 12f, 12f, 29f)
                reflectiveQuadToRelative(-12f, 29f)
                lineTo(272f, 856f)
                close()
                moveToRelative(172f, -396f)
                lineTo(216f, 686f)
                lineToRelative(58f, 58f)
                lineToRelative(226f, -228f)
                lineToRelative(-56f, -56f)
                close()
            }
        }.build()
        
        return _Ink_marker!!
    }

private var _Ink_marker: ImageVector? = null

