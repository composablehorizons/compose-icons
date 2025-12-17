package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Pause: ImageVector
    get() {
        if (_Pause != null) return _Pause!!
        
        _Pause = ImageVector.Builder(
            name = "pause",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(520f, 760f)
                verticalLineToRelative(-560f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(560f)
                horizontalLineTo(520f)
                close()
                moveToRelative(-320f, 0f)
                verticalLineToRelative(-560f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(560f)
                horizontalLineTo(200f)
                close()
                moveToRelative(400f, -80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-400f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(400f)
                close()
                moveToRelative(-320f, 0f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-400f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(400f)
                close()
                moveToRelative(0f, -400f)
                verticalLineToRelative(400f)
                verticalLineToRelative(-400f)
                close()
                moveToRelative(320f, 0f)
                verticalLineToRelative(400f)
                verticalLineToRelative(-400f)
                close()
            }
        }.build()
        
        return _Pause!!
    }

private var _Pause: ImageVector? = null

