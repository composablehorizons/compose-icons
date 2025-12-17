package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Space_dashboard: ImageVector
    get() {
        if (_Space_dashboard != null) return _Space_dashboard!!
        
        _Space_dashboard = ImageVector.Builder(
            name = "space_dashboard",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 840f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(720f)
                horizontalLineTo(120f)
                close()
                moveToRelative(400f, -440f)
                verticalLineToRelative(-280f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(280f)
                horizontalLineTo(520f)
                close()
                moveToRelative(320f, 440f)
                horizontalLineTo(520f)
                verticalLineToRelative(-360f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(360f)
                close()
            }
        }.build()
        
        return _Space_dashboard!!
    }

private var _Space_dashboard: ImageVector? = null

