package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Audio_file: ImageVector
    get() {
        if (_Audio_file != null) return _Audio_file!!
        
        _Audio_file = ImageVector.Builder(
            name = "audio_file",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            group {
                path(
                    fill = SolidColor(Color.Transparent)
                ) {
                    moveTo(0f, 0f)
                    horizontalLineTo(24f)
                    verticalLineTo(24f)
                    horizontalLineTo(0f)
                    verticalLineTo(0f)
                    close()
                }
                path(
                    fill = SolidColor(Color.Transparent)
                ) {
                    moveTo(0f, 0f)
                    horizontalLineTo(24f)
                    verticalLineTo(24f)
                    horizontalLineTo(0f)
                    verticalLineTo(0f)
                    close()
                }
            }
            group {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(19.41f, 7.41f)
                    lineToRelative(-4.83f, -4.83f)
                    curveTo(14.21f, 2.21f, 13.7f, 2f, 13.17f, 2f)
                    horizontalLineTo(6f)
                    curveTo(4.9f, 2f, 4.01f, 2.9f, 4.01f, 4f)
                    lineTo(4f, 20f)
                    curveToRelative(0f, 1.1f, 0.89f, 2f, 1.99f, 2f)
                    horizontalLineTo(18f)
                    curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                    verticalLineTo(8.83f)
                    curveTo(20f, 8.3f, 19.79f, 7.79f, 19.41f, 7.41f)
                    close()
                    moveTo(15f, 13f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(3.61f)
                    curveToRelative(0f, 1.28f, -1f, 2.41f, -2.28f, 2.39f)
                    curveToRelative(-1.44f, -0.02f, -2.56f, -1.39f, -2.13f, -2.91f)
                    curveToRelative(0.21f, -0.72f, 0.8f, -1.31f, 1.53f, -1.51f)
                    curveToRelative(0.7f, -0.19f, 1.36f, -0.05f, 1.88f, 0.29f)
                    verticalLineTo(12f)
                    curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                    horizontalLineToRelative(2f)
                    curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                    curveTo(16f, 12.55f, 15.55f, 13f, 15f, 13f)
                    close()
                    moveTo(14f, 9f)
                    curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                    verticalLineTo(3.5f)
                    lineTo(18.5f, 9f)
                    horizontalLineTo(14f)
                    close()
                }
            }
        }.build()
        
        return _Audio_file!!
    }

private var _Audio_file: ImageVector? = null

