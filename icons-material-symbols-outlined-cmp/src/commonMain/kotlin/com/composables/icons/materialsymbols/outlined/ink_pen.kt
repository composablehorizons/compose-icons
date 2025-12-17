package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Ink_pen: ImageVector
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
                moveTo(490f, 433f)
                lineToRelative(37f, 37f)
                lineToRelative(217f, -217f)
                lineToRelative(-37f, -37f)
                lineToRelative(-217f, 217f)
                close()
                moveTo(200f, 760f)
                horizontalLineToRelative(37f)
                lineToRelative(233f, -233f)
                lineToRelative(-37f, -37f)
                lineToRelative(-233f, 233f)
                verticalLineToRelative(37f)
                close()
                moveToRelative(355f, -205f)
                lineTo(405f, 405f)
                lineToRelative(167f, -167f)
                lineToRelative(-29f, -29f)
                lineToRelative(-219f, 219f)
                lineToRelative(-56f, -56f)
                lineToRelative(218f, -219f)
                quadToRelative(24f, -24f, 56.5f, -24f)
                reflectiveQuadToRelative(56.5f, 24f)
                lineToRelative(29f, 29f)
                lineToRelative(50f, -50f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                lineToRelative(93f, 93f)
                quadToRelative(12f, 12f, 12f, 28.5f)
                reflectiveQuadTo(828f, 282f)
                lineTo(555f, 555f)
                close()
                moveTo(270f, 840f)
                horizontalLineTo(120f)
                verticalLineToRelative(-150f)
                lineToRelative(285f, -285f)
                lineToRelative(150f, 150f)
                lineToRelative(-285f, 285f)
                close()
            }
        }.build()
        
        return _Ink_pen!!
    }

private var _Ink_pen: ImageVector? = null

