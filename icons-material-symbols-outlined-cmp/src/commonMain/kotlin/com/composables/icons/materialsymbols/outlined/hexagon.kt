package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Hexagon: ImageVector
    get() {
        if (_Hexagon != null) return _Hexagon!!
        
        _Hexagon = ImageVector.Builder(
            name = "hexagon",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(272f, 840f)
                lineTo(64f, 480f)
                lineToRelative(208f, -360f)
                horizontalLineToRelative(416f)
                lineToRelative(208f, 360f)
                lineToRelative(-208f, 360f)
                horizontalLineTo(272f)
                close()
                moveToRelative(46f, -80f)
                horizontalLineToRelative(324f)
                lineToRelative(161f, -280f)
                lineToRelative(-161f, -280f)
                horizontalLineTo(318f)
                lineTo(156f, 480f)
                lineToRelative(162f, 280f)
                close()
                moveToRelative(162f, -280f)
                close()
            }
        }.build()
        
        return _Hexagon!!
    }

private var _Hexagon: ImageVector? = null

