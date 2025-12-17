package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Sliders: ImageVector
    get() {
        if (_Sliders != null) return _Sliders!!
        
        _Sliders = ImageVector.Builder(
            name = "sliders",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 600f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(240f)
                horizontalLineTo(80f)
                close()
                moveToRelative(480f, -80f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-80f)
                horizontalLineTo(560f)
                verticalLineToRelative(80f)
                close()
            }
        }.build()
        
        return _Sliders!!
    }

private var _Sliders: ImageVector? = null

