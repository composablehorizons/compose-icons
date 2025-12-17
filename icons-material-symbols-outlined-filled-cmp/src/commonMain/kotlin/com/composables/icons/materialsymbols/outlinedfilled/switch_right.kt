package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Switch_right: ImageVector
    get() {
        if (_Switch_right != null) return _Switch_right!!
        
        _Switch_right = ImageVector.Builder(
            name = "switch_right",
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
                moveToRelative(160f, 0f)
                verticalLineToRelative(-560f)
                lineToRelative(280f, 280f)
                lineToRelative(-280f, 280f)
                close()
                moveToRelative(60f, -145f)
                lineToRelative(135f, -135f)
                lineToRelative(-135f, -135f)
                verticalLineToRelative(270f)
                close()
            }
        }.build()
        
        return _Switch_right!!
    }

private var _Switch_right: ImageVector? = null

