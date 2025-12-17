package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Award: ImageVector
    get() {
        if (_Award != null) return _Award!!
        
        _Award = ImageVector.Builder(
            name = "award",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.669f, 0.864f)
                lineTo(8f, 0f)
                lineTo(6.331f, 0.864f)
                lineToRelative(-1.858f, 0.282f)
                lineToRelative(-0.842f, 1.68f)
                lineToRelative(-1.337f, 1.32f)
                lineTo(2.6f, 6f)
                lineToRelative(-0.306f, 1.854f)
                lineToRelative(1.337f, 1.32f)
                lineToRelative(0.842f, 1.68f)
                lineToRelative(1.858f, 0.282f)
                lineTo(8f, 12f)
                lineToRelative(1.669f, -0.864f)
                lineToRelative(1.858f, -0.282f)
                lineToRelative(0.842f, -1.68f)
                lineToRelative(1.337f, -1.32f)
                lineTo(13.4f, 6f)
                lineToRelative(0.306f, -1.854f)
                lineToRelative(-1.337f, -1.32f)
                lineToRelative(-0.842f, -1.68f)
                close()
                moveToRelative(1.196f, 1.193f)
                lineToRelative(0.684f, 1.365f)
                lineToRelative(1.086f, 1.072f)
                lineTo(12.387f, 6f)
                lineToRelative(0.248f, 1.506f)
                lineToRelative(-1.086f, 1.072f)
                lineToRelative(-0.684f, 1.365f)
                lineToRelative(-1.51f, 0.229f)
                lineTo(8f, 10.874f)
                lineToRelative(-1.355f, -0.702f)
                lineToRelative(-1.51f, -0.229f)
                lineToRelative(-0.684f, -1.365f)
                lineToRelative(-1.086f, -1.072f)
                lineTo(3.614f, 6f)
                lineToRelative(-0.25f, -1.506f)
                lineToRelative(1.087f, -1.072f)
                lineToRelative(0.684f, -1.365f)
                lineToRelative(1.51f, -0.229f)
                lineTo(8f, 1.126f)
                lineToRelative(1.356f, 0.702f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4f, 11.794f)
                verticalLineTo(16f)
                lineToRelative(4f, -1f)
                lineToRelative(4f, 1f)
                verticalLineToRelative(-4.206f)
                lineToRelative(-2.018f, 0.306f)
                lineTo(8f, 13.126f)
                lineTo(6.018f, 12.1f)
                close()
            }
        }.build()
        
        return _Award!!
    }

private var _Award: ImageVector? = null

