package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Fullscreen: ImageVector
    get() {
        if (_Fullscreen != null) return _Fullscreen!!
        
        _Fullscreen = ImageVector.Builder(
            name = "fullscreen",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 840f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(80f)
                horizontalLineTo(120f)
                close()
                moveToRelative(520f, 0f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(200f)
                horizontalLineTo(640f)
                close()
                moveTo(120f, 320f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(80f)
                horizontalLineTo(200f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(640f, 0f)
                verticalLineToRelative(-120f)
                horizontalLineTo(640f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Fullscreen!!
    }

private var _Fullscreen: ImageVector? = null

