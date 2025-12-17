package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Video_stable: ImageVector
    get() {
        if (_Video_stable != null) return _Video_stable!!
        
        _Video_stable = ImageVector.Builder(
            name = "video_stable",
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
            }
            group {
                group {
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(20f, 4f)
                        horizontalLineTo(4f)
                        curveTo(2.9f, 4f, 2f, 4.9f, 2f, 6f)
                        verticalLineToRelative(12f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        horizontalLineToRelative(16f)
                        curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                        verticalLineTo(6f)
                        curveTo(22f, 4.9f, 21.1f, 4f, 20f, 4f)
                        close()
                        moveTo(4f, 18f)
                        verticalLineTo(6f)
                        horizontalLineToRelative(2.95f)
                        lineToRelative(-2.33f, 8.73f)
                        lineTo(16.82f, 18f)
                        horizontalLineTo(4f)
                        close()
                        moveTo(20f, 18f)
                        horizontalLineToRelative(-2.95f)
                        lineToRelative(2.34f, -8.73f)
                        lineTo(7.18f, 6f)
                        horizontalLineTo(20f)
                        verticalLineTo(18f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Video_stable!!
    }

private var _Video_stable: ImageVector? = null

