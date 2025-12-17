package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Video_stable: ImageVector
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
                        moveTo(19.96f, 4.01f)
                        horizontalLineToRelative(-16f)
                        curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                        verticalLineToRelative(12f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        horizontalLineToRelative(16f)
                        curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                        verticalLineToRelative(-12f)
                        curveTo(21.96f, 4.91f, 21.06f, 4.01f, 19.96f, 4.01f)
                        close()
                        moveTo(20f, 6f)
                        verticalLineToRelative(12f)
                        horizontalLineTo(4f)
                        verticalLineTo(6f)
                        horizontalLineTo(20f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(18.42f, 9.01f)
                        lineTo(7.92f, 6.18f)
                        curveTo(7.39f, 6.04f, 6.84f, 6.35f, 6.7f, 6.88f)
                        lineToRelative(-1.85f, 6.87f)
                        curveToRelative(-0.14f, 0.53f, 0.17f, 1.08f, 0.71f, 1.23f)
                        lineToRelative(10.5f, 2.83f)
                        curveToRelative(0.53f, 0.14f, 1.08f, -0.17f, 1.23f, -0.71f)
                        lineToRelative(1.85f, -6.87f)
                        curveTo(19.27f, 9.7f, 18.95f, 9.15f, 18.42f, 9.01f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Video_stable!!
    }

private var _Video_stable: ImageVector? = null

