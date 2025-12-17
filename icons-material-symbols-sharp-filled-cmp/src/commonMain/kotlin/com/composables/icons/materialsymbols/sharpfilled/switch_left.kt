package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Switch_left: ImageVector
    get() {
        if (_Switch_left != null) return _Switch_left!!
        
        _Switch_left = ImageVector.Builder(
            name = "switch_left",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(400f, 760f)
                lineTo(120f, 480f)
                lineToRelative(280f, -280f)
                verticalLineToRelative(560f)
                close()
                moveToRelative(-60f, -145f)
                verticalLineToRelative(-270f)
                lineTo(205f, 480f)
                lineToRelative(135f, 135f)
                close()
                moveToRelative(220f, 145f)
                verticalLineToRelative(-560f)
                lineToRelative(280f, 280f)
                lineToRelative(-280f, 280f)
                close()
            }
        }.build()
        
        return _Switch_left!!
    }

private var _Switch_left: ImageVector? = null

