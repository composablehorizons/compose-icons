package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.`30fps`: ImageVector
    get() {
        if (_30fps != null) return _30fps!!
        
        _30fps = ImageVector.Builder(
            name = "30fps",
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
                    horizontalLineToRelative(24f)
                    verticalLineToRelative(24f)
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
                        moveTo(2f, 6.5f)
                        lineTo(2f, 6.5f)
                        curveTo(2f, 7.33f, 2.67f, 8f, 3.5f, 8f)
                        horizontalLineTo(8f)
                        verticalLineToRelative(2.5f)
                        horizontalLineTo(4.5f)
                        curveTo(3.67f, 10.5f, 3f, 11.17f, 3f, 12f)
                        verticalLineToRelative(0f)
                        curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                        horizontalLineTo(8f)
                        verticalLineTo(16f)
                        horizontalLineTo(3.5f)
                        curveTo(2.67f, 16f, 2f, 16.67f, 2f, 17.5f)
                        verticalLineToRelative(0f)
                        curveTo(2f, 18.33f, 2.67f, 19f, 3.5f, 19f)
                        horizontalLineTo(8f)
                        curveToRelative(1.66f, 0f, 3f, -1.34f, 3f, -3f)
                        verticalLineToRelative(-1.9f)
                        curveToRelative(0f, -1.16f, -0.94f, -2.1f, -2.1f, -2.1f)
                        curveToRelative(1.16f, 0f, 2.1f, -0.94f, 2.1f, -2.1f)
                        verticalLineTo(8f)
                        curveToRelative(0f, -1.66f, -1.34f, -3f, -3f, -3f)
                        horizontalLineTo(3.5f)
                        curveTo(2.67f, 5f, 2f, 5.67f, 2f, 6.5f)
                        close()
                        moveTo(19f, 8f)
                        verticalLineToRelative(8f)
                        horizontalLineToRelative(-4f)
                        verticalLineTo(8f)
                        horizontalLineTo(19f)
                        moveTo(19f, 5f)
                        horizontalLineToRelative(-4f)
                        curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                        verticalLineToRelative(8f)
                        curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
                        horizontalLineToRelative(4f)
                        curveToRelative(1.66f, 0f, 3f, -1.34f, 3f, -3f)
                        verticalLineTo(8f)
                        curveTo(22f, 6.34f, 20.66f, 5f, 19f, 5f)
                        close()
                    }
                }
            }
        }.build()
        
        return _30fps!!
    }

private var _30fps: ImageVector? = null

