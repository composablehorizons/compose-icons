package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.`30fps`: ImageVector
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
                        moveTo(2f, 5f)
                        verticalLineToRelative(3f)
                        horizontalLineToRelative(6f)
                        verticalLineToRelative(2.5f)
                        horizontalLineTo(3f)
                        verticalLineToRelative(3f)
                        horizontalLineToRelative(5f)
                        verticalLineTo(16f)
                        horizontalLineTo(2f)
                        verticalLineToRelative(3f)
                        horizontalLineToRelative(6f)
                        curveToRelative(1.66f, 0f, 3f, -1.34f, 3f, -3f)
                        verticalLineToRelative(-1.9f)
                        curveToRelative(0f, -1.16f, -0.94f, -2.1f, -2.1f, -2.1f)
                        curveToRelative(1.16f, 0f, 2.1f, -0.94f, 2.1f, -2.1f)
                        verticalLineTo(8f)
                        curveToRelative(0f, -1.66f, -1.34f, -3f, -3f, -3f)
                        horizontalLineTo(2f)
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

