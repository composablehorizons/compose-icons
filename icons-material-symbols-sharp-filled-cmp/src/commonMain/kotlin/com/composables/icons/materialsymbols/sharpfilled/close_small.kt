package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Close_small: ImageVector
    get() {
        if (_Close_small != null) return _Close_small!!
        
        _Close_small = ImageVector.Builder(
            name = "close_small",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(335.28f, 681f)
                lineTo(279f, 625f)
                lineToRelative(144.72f, -145f)
                lineTo(279f, 336f)
                lineToRelative(56.28f, -56f)
                lineTo(480f, 424.61f)
                lineTo(623.72f, 280f)
                lineTo(680f, 336f)
                lineTo(535.28f, 480f)
                lineTo(680f, 625f)
                lineToRelative(-56.28f, 56f)
                lineTo(480f, 536.39f)
                lineTo(335.28f, 681f)
                close()
            }
        }.build()
        
        return _Close_small!!
    }

private var _Close_small: ImageVector? = null

