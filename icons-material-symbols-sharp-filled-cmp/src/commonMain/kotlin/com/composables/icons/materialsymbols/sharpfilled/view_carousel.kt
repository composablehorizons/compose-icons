package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.View_carousel: ImageVector
    get() {
        if (_View_carousel != null) return _View_carousel!!
        
        _View_carousel = ImageVector.Builder(
            name = "view_carousel",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 680f)
                verticalLineToRelative(-400f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(400f)
                horizontalLineTo(80f)
                close()
                moveToRelative(200f, 80f)
                verticalLineToRelative(-560f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(560f)
                horizontalLineTo(280f)
                close()
                moveToRelative(440f, -80f)
                verticalLineToRelative(-400f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(400f)
                horizontalLineTo(720f)
                close()
            }
        }.build()
        
        return _View_carousel!!
    }

private var _View_carousel: ImageVector? = null

