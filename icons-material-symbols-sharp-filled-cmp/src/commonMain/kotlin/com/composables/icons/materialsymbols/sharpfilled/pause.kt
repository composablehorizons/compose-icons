package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Pause: ImageVector
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
                moveTo(560f, 760f)
                verticalLineToRelative(-560f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(560f)
                horizontalLineTo(560f)
                close()
                moveToRelative(-320f, 0f)
                verticalLineToRelative(-560f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(560f)
                horizontalLineTo(240f)
                close()
            }
        }.build()
        
        return _Pause!!
    }

private var _Pause: ImageVector? = null

