package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Exercise: ImageVector
    get() {
        if (_Exercise != null) return _Exercise!!
        
        _Exercise = ImageVector.Builder(
            name = "exercise",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(839f, 361f)
                lineTo(597f, 119f)
                lineToRelative(74f, -74f)
                lineToRelative(246f, 247f)
                lineToRelative(-78f, 69f)
                close()
                moveTo(290f, 912f)
                lineTo(48f, 670f)
                lineToRelative(72f, -72f)
                lineToRelative(242f, 242f)
                lineToRelative(-72f, 72f)
                close()
                moveToRelative(173f, -56f)
                lineTo(104f, 497f)
                lineToRelative(113f, -115f)
                lineToRelative(92f, 92f)
                lineToRelative(166f, -166f)
                lineToRelative(-91f, -91f)
                lineToRelative(113f, -115f)
                lineToRelative(361f, 361f)
                lineToRelative(-115f, 113f)
                lineToRelative(-91f, -91f)
                lineToRelative(-166f, 166f)
                lineToRelative(92f, 92f)
                lineToRelative(-115f, 113f)
                close()
            }
        }.build()
        
        return _Exercise!!
    }

private var _Exercise: ImageVector? = null

