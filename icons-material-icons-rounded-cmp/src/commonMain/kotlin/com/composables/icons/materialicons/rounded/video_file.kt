package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Video_file: ImageVector
    get() {
        if (_Video_file != null) return _Video_file!!
        
        _Video_file = ImageVector.Builder(
            name = "video_file",
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
                    moveTo(13.17f, 2f)
                    horizontalLineTo(6.01f)
                    curveToRelative(-1.1f, 0f, -2f, 0.89f, -2f, 2f)
                    lineTo(4f, 20f)
                    curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                    horizontalLineToRelative(12f)
                    curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                    verticalLineTo(8.83f)
                    curveToRelative(0f, -0.53f, -0.21f, -1.04f, -0.59f, -1.41f)
                    lineToRelative(-4.83f, -4.83f)
                    curveTo(14.21f, 2.21f, 13.7f, 2f, 13.17f, 2f)
                    close()
                    moveTo(13f, 8f)
                    verticalLineTo(3.5f)
                    lineTo(18.5f, 9f)
                    horizontalLineTo(14f)
                    curveTo(13.45f, 9f, 13f, 8.55f, 13f, 8f)
                    close()
                    moveTo(14f, 14f)
                    lineToRelative(1.27f, -0.67f)
                    curveTo(15.6f, 13.15f, 16f, 13.39f, 16f, 13.77f)
                    verticalLineToRelative(2.46f)
                    curveToRelative(0f, 0.38f, -0.4f, 0.62f, -0.73f, 0.44f)
                    lineTo(14f, 16f)
                    verticalLineToRelative(1f)
                    curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                    horizontalLineTo(9f)
                    curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                    verticalLineToRelative(-4f)
                    curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                    horizontalLineToRelative(4f)
                    curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                    verticalLineTo(14f)
                    close()
                }
            }
        }.build()
        
        return _Video_file!!
    }

private var _Video_file: ImageVector? = null

