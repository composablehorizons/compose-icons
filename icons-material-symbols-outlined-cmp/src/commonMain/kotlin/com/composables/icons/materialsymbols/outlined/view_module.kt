package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.View_module: ImageVector
    get() {
        if (_View_module != null) return _View_module!!
        
        _View_module = ImageVector.Builder(
            name = "view_module",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(627f, 440f)
                horizontalLineToRelative(133f)
                verticalLineToRelative(-160f)
                horizontalLineTo(627f)
                verticalLineToRelative(160f)
                close()
                moveToRelative(-214f, 0f)
                horizontalLineToRelative(133f)
                verticalLineToRelative(-160f)
                horizontalLineTo(413f)
                verticalLineToRelative(160f)
                close()
                moveToRelative(-213f, 0f)
                horizontalLineToRelative(133f)
                verticalLineToRelative(-160f)
                horizontalLineTo(200f)
                verticalLineToRelative(160f)
                close()
                moveToRelative(0f, 240f)
                horizontalLineToRelative(133f)
                verticalLineToRelative(-160f)
                horizontalLineTo(200f)
                verticalLineToRelative(160f)
                close()
                moveToRelative(213f, 0f)
                horizontalLineToRelative(133f)
                verticalLineToRelative(-160f)
                horizontalLineTo(413f)
                verticalLineToRelative(160f)
                close()
                moveToRelative(214f, 0f)
                horizontalLineToRelative(133f)
                verticalLineToRelative(-160f)
                horizontalLineTo(627f)
                verticalLineToRelative(160f)
                close()
                moveToRelative(-507f, 0f)
                verticalLineToRelative(-400f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 200f)
                horizontalLineToRelative(560f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 280f)
                verticalLineToRelative(400f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(760f, 760f)
                horizontalLineTo(200f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 680f)
                close()
            }
        }.build()
        
        return _View_module!!
    }

private var _View_module: ImageVector? = null

