package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Escalator: ImageVector
    get() {
        if (_Escalator != null) return _Escalator!!
        
        _Escalator = ImageVector.Builder(
            name = "escalator",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(220f, 720f)
                horizontalLineToRelative(192f)
                lineToRelative(200f, -360f)
                horizontalLineToRelative(128f)
                verticalLineToRelative(-120f)
                horizontalLineTo(548f)
                lineTo(348f, 600f)
                horizontalLineTo(220f)
                verticalLineToRelative(120f)
                close()
                moveTo(120f, 840f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(720f)
                horizontalLineTo(120f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-560f)
                horizontalLineTo(200f)
                verticalLineToRelative(560f)
                close()
                moveToRelative(0f, 0f)
                verticalLineToRelative(-560f)
                verticalLineToRelative(560f)
                close()
            }
        }.build()
        
        return _Escalator!!
    }

private var _Escalator: ImageVector? = null

