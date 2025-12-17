package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Position_top_right: ImageVector
    get() {
        if (_Position_top_right != null) return _Position_top_right!!
        
        _Position_top_right = ImageVector.Builder(
            name = "position_top_right",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(360f, 400f)
                horizontalLineToRelative(360f)
                verticalLineToRelative(-120f)
                horizontalLineTo(360f)
                verticalLineToRelative(120f)
                close()
                moveTo(120f, 840f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(720f)
                horizontalLineTo(120f)
                close()
            }
        }.build()
        
        return _Position_top_right!!
    }

private var _Position_top_right: ImageVector? = null

