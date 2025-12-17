package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Space_dashboard: ImageVector
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
                horizontalLineToRelative(720f)
                verticalLineToRelative(720f)
                horizontalLineTo(120f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-560f)
                horizontalLineTo(200f)
                verticalLineToRelative(560f)
                close()
                moveToRelative(320f, 0f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-280f)
                horizontalLineTo(520f)
                verticalLineToRelative(280f)
                close()
                moveToRelative(0f, -360f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-200f)
                horizontalLineTo(520f)
                verticalLineToRelative(200f)
                close()
            }
        }.build()
        
        return _Space_dashboard!!
    }

private var _Space_dashboard: ImageVector? = null

