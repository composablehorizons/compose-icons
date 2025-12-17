package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Water: ImageVector
    get() {
        if (_Water != null) return _Water!!
        
        _Water = ImageVector.Builder(
            name = "water",
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
                        moveTo(21.98f, 14f)
                        horizontalLineTo(22f)
                        horizontalLineTo(21.98f)
                        close()
                        moveTo(5.35f, 13f)
                        curveToRelative(1.19f, 0f, 1.42f, 1f, 3.33f, 1f)
                        curveToRelative(1.95f, 0f, 2.09f, -1f, 3.33f, -1f)
                        curveToRelative(1.19f, 0f, 1.42f, 1f, 3.33f, 1f)
                        curveToRelative(1.95f, 0f, 2.09f, -1f, 3.33f, -1f)
                        curveToRelative(0.93f, 0f, 1.05f, 0.45f, 2.01f, 0.79f)
                        curveToRelative(0.63f, 0.22f, 1.3f, -0.24f, 1.3f, -0.91f)
                        curveToRelative(0f, -0.52f, -0.23f, -0.83f, -0.64f, -0.97f)
                        curveToRelative(-0.6f, -0.22f, -1.15f, -0.9f, -2.69f, -0.9f)
                        curveToRelative(-1.95f, 0f, -2.09f, 1f, -3.33f, 1f)
                        curveToRelative(-1.19f, 0f, -1.42f, -1f, -3.33f, -1f)
                        curveToRelative(-1.95f, 0f, -2.09f, 1f, -3.33f, 1f)
                        curveToRelative(-1.19f, 0f, -1.42f, -1f, -3.33f, -1f)
                        curveToRelative(-1.54f, 0f, -2.13f, 0.71f, -2.68f, 0.91f)
                        curveTo(2.24f, 12.05f, 2f, 12.35f, 2f, 12.89f)
                        curveToRelative(0f, 0.67f, 0.66f, 1.13f, 1.29f, 0.91f)
                        curveTo(4.35f, 13.44f, 4.39f, 13f, 5.35f, 13f)
                        close()
                        moveTo(18.67f, 15f)
                        curveToRelative(-1.95f, 0f, -2.09f, 1f, -3.33f, 1f)
                        curveToRelative(-1.19f, 0f, -1.42f, -1f, -3.33f, -1f)
                        curveToRelative(-1.95f, 0f, -2.1f, 1f, -3.34f, 1f)
                        curveToRelative(-1.24f, 0f, -1.38f, -1f, -3.33f, -1f)
                        curveToRelative(-1.53f, 0f, -2.15f, 0.71f, -2.69f, 0.91f)
                        curveTo(2.24f, 16.05f, 2f, 16.36f, 2f, 16.89f)
                        curveToRelative(0f, 0.67f, 0.66f, 1.13f, 1.3f, 0.91f)
                        curveTo(4.32f, 17.44f, 4.38f, 17f, 5.34f, 17f)
                        curveToRelative(1.24f, 0f, 1.38f, 1f, 3.33f, 1f)
                        curveToRelative(1.95f, 0f, 2.1f, -1f, 3.34f, -1f)
                        curveToRelative(1.19f, 0f, 1.42f, 1f, 3.33f, 1f)
                        curveToRelative(1.94f, 0f, 2.09f, -1f, 3.33f, -1f)
                        curveToRelative(0.94f, 0f, 1.06f, 0.46f, 2.03f, 0.8f)
                        curveToRelative(0.63f, 0.22f, 1.3f, -0.24f, 1.3f, -0.91f)
                        curveToRelative(0f, -0.53f, -0.24f, -0.83f, -0.65f, -0.98f)
                        curveTo(20.82f, 15.72f, 20.21f, 15f, 18.67f, 15f)
                        close()
                        moveTo(5.35f, 9f)
                        curveToRelative(1.19f, 0f, 1.42f, 1f, 3.33f, 1f)
                        curveToRelative(1.95f, 0f, 2.09f, -1f, 3.33f, -1f)
                        curveToRelative(1.19f, 0f, 1.42f, 1f, 3.33f, 1f)
                        curveToRelative(1.95f, 0f, 2.09f, -1f, 3.33f, -1f)
                        curveToRelative(0.93f, 0f, 1.05f, 0.45f, 2.01f, 0.79f)
                        curveToRelative(0.63f, 0.22f, 1.3f, -0.24f, 1.3f, -0.91f)
                        curveToRelative(0f, -0.52f, -0.23f, -0.83f, -0.64f, -0.97f)
                        curveTo(20.74f, 7.68f, 20.19f, 7f, 18.65f, 7f)
                        curveToRelative(-1.95f, 0f, -2.09f, 1f, -3.33f, 1f)
                        curveToRelative(-1.19f, 0f, -1.42f, -1f, -3.33f, -1f)
                        curveTo(10.04f, 7f, 9.9f, 8f, 8.66f, 8f)
                        curveTo(7.47f, 8f, 7.24f, 7f, 5.33f, 7f)
                        curveTo(3.79f, 7f, 3.2f, 7.71f, 2.65f, 7.91f)
                        curveTo(2.24f, 8.05f, 2f, 8.35f, 2f, 8.89f)
                        curveToRelative(0f, 0.67f, 0.66f, 1.13f, 1.29f, 0.91f)
                        curveTo(4.35f, 9.44f, 4.39f, 9f, 5.35f, 9f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Water!!
    }

private var _Water: ImageVector? = null

