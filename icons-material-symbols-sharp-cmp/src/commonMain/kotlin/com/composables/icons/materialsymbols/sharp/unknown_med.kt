package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Unknown_med: ImageVector
    get() {
        if (_Unknown_med != null) return _Unknown_med!!
        
        _Unknown_med = ImageVector.Builder(
            name = "unknown_med",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 520f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(360f)
                verticalLineToRelative(120f)
                horizontalLineTo(80f)
                close()
                moveToRelative(440f, 0f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(360f)
                verticalLineToRelative(120f)
                horizontalLineTo(520f)
                close()
            }
        }.build()
        
        return _Unknown_med!!
    }

private var _Unknown_med: ImageVector? = null

