package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Ink_pen: ImageVector
    get() {
        if (_Ink_pen != null) return _Ink_pen!!
        
        _Ink_pen = ImageVector.Builder(
            name = "ink_pen",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(611f, 499f)
                lineTo(461f, 348f)
                lineToRelative(111f, -110f)
                lineToRelative(-29f, -29f)
                lineToRelative(-191f, 191f)
                quadToRelative(-12f, 12f, -28f, 12f)
                reflectiveQuadToRelative(-28f, -12f)
                quadToRelative(-12f, -12f, -12f, -28.5f)
                reflectiveQuadToRelative(12f, -28.5f)
                lineToRelative(190f, -190f)
                quadToRelative(24f, -24f, 56.5f, -24f)
                reflectiveQuadToRelative(56.5f, 24f)
                lineToRelative(29f, 29f)
                lineToRelative(50f, -50f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                lineToRelative(93f, 93f)
                quadToRelative(12f, 12f, 12f, 28.5f)
                reflectiveQuadTo(828f, 282f)
                lineTo(611f, 499f)
                close()
                moveTo(160f, 840f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(120f, 800f)
                verticalLineToRelative(-77f)
                quadToRelative(0f, -16f, 6f, -30.5f)
                reflectiveQuadToRelative(17f, -25.5f)
                lineToRelative(261f, -262f)
                lineToRelative(151f, 150f)
                lineToRelative(-262f, 262f)
                quadToRelative(-11f, 11f, -25.5f, 17f)
                reflectiveQuadToRelative(-30.5f, 6f)
                horizontalLineToRelative(-77f)
                close()
            }
        }.build()
        
        return _Ink_pen!!
    }

private var _Ink_pen: ImageVector? = null

