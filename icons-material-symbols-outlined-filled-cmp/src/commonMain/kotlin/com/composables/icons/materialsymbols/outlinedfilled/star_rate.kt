package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Star_rate: ImageVector
    get() {
        if (_Star_rate != null) return _Star_rate!!
        
        _Star_rate = ImageVector.Builder(
            name = "star_rate",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(233f, 840f)
                lineToRelative(93f, -304f)
                lineTo(80f, 360f)
                horizontalLineToRelative(304f)
                lineToRelative(96f, -320f)
                lineToRelative(96f, 320f)
                horizontalLineToRelative(304f)
                lineTo(634f, 536f)
                lineToRelative(93f, 304f)
                lineToRelative(-247f, -188f)
                lineToRelative(-247f, 188f)
                close()
            }
        }.build()
        
        return _Star_rate!!
    }

private var _Star_rate: ImageVector? = null

