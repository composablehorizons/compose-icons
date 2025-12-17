package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.View_stream: ImageVector
    get() {
        if (_View_stream != null) return _View_stream!!
        
        _View_stream = ImageVector.Builder(
            name = "view_stream",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 760f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(240f)
                horizontalLineTo(120f)
                close()
                moveToRelative(0f, -320f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(240f)
                horizontalLineTo(120f)
                close()
            }
        }.build()
        
        return _View_stream!!
    }

private var _View_stream: ImageVector? = null

