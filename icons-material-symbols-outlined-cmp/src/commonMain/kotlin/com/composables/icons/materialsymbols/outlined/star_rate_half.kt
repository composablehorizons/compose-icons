package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Star_rate_half: ImageVector
    get() {
        if (_Star_rate_half != null) return _Star_rate_half!!
        
        _Star_rate_half = ImageVector.Builder(
            name = "star_rate_half",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 316f)
                verticalLineToRelative(236f)
                lineToRelative(96f, 74f)
                lineToRelative(-36f, -122f)
                lineToRelative(90f, -64f)
                horizontalLineTo(518f)
                lineToRelative(-38f, -124f)
                close()
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
        
        return _Star_rate_half!!
    }

private var _Star_rate_half: ImageVector? = null

