package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Grid_off: ImageVector
    get() {
        if (_Grid_off != null) return _Grid_off!!
        
        _Grid_off = ImageVector.Builder(
            name = "grid_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(333f, 760f)
                verticalLineToRelative(-133f)
                horizontalLineTo(200f)
                verticalLineToRelative(133f)
                horizontalLineToRelative(133f)
                close()
                moveToRelative(214f, 0f)
                verticalLineToRelative(-100f)
                lineToRelative(-33f, -33f)
                horizontalLineTo(413f)
                verticalLineToRelative(133f)
                horizontalLineToRelative(134f)
                close()
                moveToRelative(80f, 0f)
                close()
                moveToRelative(116f, -133f)
                close()
                moveToRelative(-410f, -80f)
                verticalLineToRelative(-101f)
                lineToRelative(-33f, -33f)
                horizontalLineTo(200f)
                verticalLineToRelative(134f)
                horizontalLineToRelative(133f)
                close()
                moveToRelative(80f, 0f)
                close()
                moveToRelative(347f, 0f)
                verticalLineToRelative(-134f)
                horizontalLineTo(627f)
                verticalLineToRelative(99f)
                lineToRelative(35f, 35f)
                horizontalLineToRelative(98f)
                close()
                moveTo(529f, 413f)
                close()
                moveToRelative(-329f, -80f)
                close()
                moveToRelative(347f, 0f)
                verticalLineToRelative(-133f)
                horizontalLineTo(413f)
                verticalLineToRelative(98f)
                lineToRelative(35f, 35f)
                horizontalLineToRelative(99f)
                close()
                moveToRelative(213f, 0f)
                verticalLineToRelative(-133f)
                horizontalLineTo(627f)
                verticalLineToRelative(133f)
                horizontalLineToRelative(133f)
                close()
                moveTo(316f, 200f)
                close()
                moveToRelative(524f, 525f)
                lineTo(235f, 120f)
                horizontalLineToRelative(605f)
                verticalLineToRelative(605f)
                close()
                moveTo(120f, 840f)
                verticalLineToRelative(-720f)
                lineToRelative(720f, 720f)
                horizontalLineTo(120f)
                close()
                moveToRelative(699f, 92f)
                lineTo(28f, 140f)
                lineToRelative(56f, -56f)
                lineTo(876f, 876f)
                lineToRelative(-57f, 56f)
                close()
            }
        }.build()
        
        return _Grid_off!!
    }

private var _Grid_off: ImageVector? = null

