package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Host: ImageVector
    get() {
        if (_Host != null) return _Host!!
        
        _Host = ImageVector.Builder(
            name = "host",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 840f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(360f)
                verticalLineToRelative(720f)
                horizontalLineTo(80f)
                close()
                moveToRelative(440f, 0f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(360f)
                verticalLineToRelative(720f)
                horizontalLineTo(520f)
                close()
                moveToRelative(-360f, -80f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-560f)
                horizontalLineTo(160f)
                verticalLineToRelative(560f)
                close()
                moveToRelative(440f, 0f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-560f)
                horizontalLineTo(600f)
                verticalLineToRelative(560f)
                close()
                moveTo(200f, 600f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-80f)
                horizontalLineTo(200f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(440f, 0f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-80f)
                horizontalLineTo(640f)
                verticalLineToRelative(80f)
                close()
                moveTo(200f, 480f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-80f)
                horizontalLineTo(200f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(440f, 0f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-80f)
                horizontalLineTo(640f)
                verticalLineToRelative(80f)
                close()
                moveTo(200f, 360f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-80f)
                horizontalLineTo(200f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(440f, 0f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-80f)
                horizontalLineTo(640f)
                verticalLineToRelative(80f)
                close()
                moveTo(160f, 760f)
                horizontalLineToRelative(200f)
                horizontalLineToRelative(-200f)
                close()
                moveToRelative(440f, 0f)
                horizontalLineToRelative(200f)
                horizontalLineToRelative(-200f)
                close()
            }
        }.build()
        
        return _Host!!
    }

private var _Host: ImageVector? = null

