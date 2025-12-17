package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Arrow_left: ImageVector
    get() {
        if (_Arrow_left != null) return _Arrow_left!!
        
        _Arrow_left = ImageVector.Builder(
            name = "arrow_left",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(560f, 680f)
                lineTo(360f, 480f)
                lineToRelative(200f, -200f)
                verticalLineToRelative(400f)
                close()
            }
        }.build()
        
        return _Arrow_left!!
    }

private var _Arrow_left: ImageVector? = null

