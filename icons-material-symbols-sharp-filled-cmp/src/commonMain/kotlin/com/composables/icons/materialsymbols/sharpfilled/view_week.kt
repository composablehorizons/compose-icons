package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.View_week: ImageVector
    get() {
        if (_View_week != null) return _View_week!!
        
        _View_week = ImageVector.Builder(
            name = "view_week",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 800f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(213f)
                verticalLineToRelative(640f)
                horizontalLineTo(80f)
                close()
                moveToRelative(294f, 0f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(213f)
                verticalLineToRelative(640f)
                horizontalLineTo(374f)
                close()
                moveToRelative(293f, 0f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(213f)
                verticalLineToRelative(640f)
                horizontalLineTo(667f)
                close()
            }
        }.build()
        
        return _View_week!!
    }

private var _View_week: ImageVector? = null

