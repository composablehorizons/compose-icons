package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Flutter: ImageVector
    get() {
        if (_Flutter != null) return _Flutter!!
        
        _Flutter = ImageVector.Builder(
            name = "flutter",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(236f, 615f)
                lineTo(100f, 480f)
                lineToRelative(440f, -440f)
                horizontalLineToRelative(271f)
                lineTo(236f, 615f)
                close()
                moveTo(540f, 920f)
                lineTo(303f, 683f)
                lineToRelative(237f, -237f)
                horizontalLineToRelative(271f)
                lineTo(574f, 683f)
                lineTo(811f, 920f)
                horizontalLineTo(540f)
                close()
            }
        }.build()
        
        return _Flutter!!
    }

private var _Flutter: ImageVector? = null

