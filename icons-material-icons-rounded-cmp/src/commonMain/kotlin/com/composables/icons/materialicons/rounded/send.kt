package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Send: ImageVector
    get() {
        if (_Send != null) return _Send!!
        
        _Send = ImageVector.Builder(
            name = "send",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.4f, 20.4f)
                lineToRelative(17.45f, -7.48f)
                curveToRelative(0.81f, -0.35f, 0.81f, -1.49f, 0f, -1.84f)
                lineTo(3.4f, 3.6f)
                curveToRelative(-0.66f, -0.29f, -1.39f, 0.2f, -1.39f, 0.91f)
                lineTo(2f, 9.12f)
                curveToRelative(0f, 0.5f, 0.37f, 0.93f, 0.87f, 0.99f)
                lineTo(17f, 12f)
                lineTo(2.87f, 13.88f)
                curveToRelative(-0.5f, 0.07f, -0.87f, 0.5f, -0.87f, 1f)
                lineToRelative(0.01f, 4.61f)
                curveToRelative(0f, 0.71f, 0.73f, 1.2f, 1.39f, 0.91f)
                close()
            }
        }.build()
        
        return _Send!!
    }

private var _Send: ImageVector? = null

