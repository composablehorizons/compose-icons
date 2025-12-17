package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Grid_off: ImageVector
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
                horizontalLineToRelative(525f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 200f)
                verticalLineToRelative(525f)
                close()
                moveTo(200f, 840f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 760f)
                verticalLineToRelative(-640f)
                lineToRelative(720f, 720f)
                horizontalLineTo(200f)
                close()
                moveToRelative(591f, 64f)
                lineTo(56f, 168f)
                quadToRelative(-11f, -11f, -11.5f, -27.5f)
                reflectiveQuadTo(56f, 112f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(736f, 736f)
                quadToRelative(12f, 12f, 11.5f, 28f)
                reflectiveQuadTo(847f, 904f)
                quadToRelative(-12f, 11f, -28f, 11.5f)
                reflectiveQuadTo(791f, 904f)
                close()
            }
        }.build()
        
        return _Grid_off!!
    }

private var _Grid_off: ImageVector? = null

