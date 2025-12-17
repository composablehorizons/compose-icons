package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.View_quilt: ImageVector
    get() {
        if (_View_quilt != null) return _View_quilt!!
        
        _View_quilt = ImageVector.Builder(
            name = "view_quilt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 760f)
                verticalLineToRelative(-560f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(560f)
                horizontalLineTo(120f)
                close()
                moveToRelative(293f, -320f)
                horizontalLineToRelative(347f)
                verticalLineToRelative(-160f)
                horizontalLineTo(413f)
                verticalLineToRelative(160f)
                close()
                moveToRelative(214f, 240f)
                horizontalLineToRelative(133f)
                verticalLineToRelative(-160f)
                horizontalLineTo(627f)
                verticalLineToRelative(160f)
                close()
                moveToRelative(-214f, 0f)
                horizontalLineToRelative(134f)
                verticalLineToRelative(-160f)
                horizontalLineTo(413f)
                verticalLineToRelative(160f)
                close()
                moveToRelative(-213f, 0f)
                horizontalLineToRelative(133f)
                verticalLineToRelative(-400f)
                horizontalLineTo(200f)
                verticalLineToRelative(400f)
                close()
            }
        }.build()
        
        return _View_quilt!!
    }

private var _View_quilt: ImageVector? = null

