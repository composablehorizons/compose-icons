package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Play: ImageVector
    get() {
        if (_Play != null) return _Play!!
        
        _Play = ImageVector.Builder(
            name = "play",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(424.4f, 214.7f)
                lineTo(72.4f, 6.6f)
                curveTo(43.8f, -10.3f, 0f, 6.1f, 0f, 47.9f)
                verticalLineTo(464f)
                curveToRelative(0f, 37.5f, 40.7f, 60.1f, 72.4f, 41.3f)
                lineToRelative(352f, -208f)
                curveToRelative(31.4f, -18.5f, 31.5f, -64.1f, 0f, -82.6f)
                close()
            }
        }.build()
        
        return _Play!!
    }

private var _Play: ImageVector? = null

