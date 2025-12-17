package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Ink_pen: ImageVector
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
                lineToRelative(275f, -275f)
                lineToRelative(85f, 85f)
                lineToRelative(79f, -79f)
                lineToRelative(150f, 150f)
                lineToRelative(-302f, 302f)
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

