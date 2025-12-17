package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.ArrowLeft: ImageVector
    get() {
        if (_ArrowLeft != null) return _ArrowLeft!!
        
        _ArrowLeft = ImageVector.Builder(
            name = "arrow-left",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(257.5f, 445.1f)
                lineToRelative(-22.2f, 22.2f)
                curveToRelative(-9.4f, 9.4f, -24.6f, 9.4f, -33.9f, 0f)
                lineTo(7f, 273f)
                curveToRelative(-9.4f, -9.4f, -9.4f, -24.6f, 0f, -33.9f)
                lineTo(201.4f, 44.7f)
                curveToRelative(9.4f, -9.4f, 24.6f, -9.4f, 33.9f, 0f)
                lineToRelative(22.2f, 22.2f)
                curveToRelative(9.5f, 9.5f, 9.3f, 25f, -0.4f, 34.3f)
                lineTo(136.6f, 216f)
                horizontalLineTo(424f)
                curveToRelative(13.3f, 0f, 24f, 10.7f, 24f, 24f)
                verticalLineToRelative(32f)
                curveToRelative(0f, 13.3f, -10.7f, 24f, -24f, 24f)
                horizontalLineTo(136.6f)
                lineToRelative(120.5f, 114.8f)
                curveToRelative(9.8f, 9.3f, 10f, 24.8f, 0.4f, 34.3f)
                close()
            }
        }.build()
        
        return _ArrowLeft!!
    }

private var _ArrowLeft: ImageVector? = null

