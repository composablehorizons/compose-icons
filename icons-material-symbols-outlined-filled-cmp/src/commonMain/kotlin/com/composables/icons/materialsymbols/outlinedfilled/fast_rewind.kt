package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Fast_rewind: ImageVector
    get() {
        if (_Fast_rewind != null) return _Fast_rewind!!
        
        _Fast_rewind = ImageVector.Builder(
            name = "fast_rewind",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(860f, 720f)
                lineTo(500f, 480f)
                lineToRelative(360f, -240f)
                verticalLineToRelative(480f)
                close()
                moveToRelative(-400f, 0f)
                lineTo(100f, 480f)
                lineToRelative(360f, -240f)
                verticalLineToRelative(480f)
                close()
            }
        }.build()
        
        return _Fast_rewind!!
    }

private var _Fast_rewind: ImageVector? = null

