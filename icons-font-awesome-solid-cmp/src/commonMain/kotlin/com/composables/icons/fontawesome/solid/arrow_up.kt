package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.ArrowUp: ImageVector
    get() {
        if (_ArrowUp != null) return _ArrowUp!!
        
        _ArrowUp = ImageVector.Builder(
            name = "arrow-up",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(34.9f, 289.5f)
                lineToRelative(-22.2f, -22.2f)
                curveToRelative(-9.4f, -9.4f, -9.4f, -24.6f, 0f, -33.9f)
                lineTo(207f, 39f)
                curveToRelative(9.4f, -9.4f, 24.6f, -9.4f, 33.9f, 0f)
                lineToRelative(194.3f, 194.3f)
                curveToRelative(9.4f, 9.4f, 9.4f, 24.6f, 0f, 33.9f)
                lineTo(413f, 289.4f)
                curveToRelative(-9.5f, 9.5f, -25f, 9.3f, -34.3f, -0.4f)
                lineTo(264f, 168.6f)
                verticalLineTo(456f)
                curveToRelative(0f, 13.3f, -10.7f, 24f, -24f, 24f)
                horizontalLineToRelative(-32f)
                curveToRelative(-13.3f, 0f, -24f, -10.7f, -24f, -24f)
                verticalLineTo(168.6f)
                lineTo(69.2f, 289.1f)
                curveToRelative(-9.3f, 9.8f, -24.8f, 10f, -34.3f, 0.4f)
                close()
            }
        }.build()
        
        return _ArrowUp!!
    }

private var _ArrowUp: ImageVector? = null

