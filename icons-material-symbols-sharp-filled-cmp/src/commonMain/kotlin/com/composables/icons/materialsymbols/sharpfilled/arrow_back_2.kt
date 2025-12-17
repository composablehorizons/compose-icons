package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Arrow_back_2: ImageVector
    get() {
        if (_Arrow_back_2 != null) return _Arrow_back_2!!
        
        _Arrow_back_2 = ImageVector.Builder(
            name = "arrow_back_2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(640f, 760f)
                lineTo(200f, 480f)
                lineToRelative(440f, -280f)
                verticalLineToRelative(560f)
                close()
            }
        }.build()
        
        return _Arrow_back_2!!
    }

private var _Arrow_back_2: ImageVector? = null

