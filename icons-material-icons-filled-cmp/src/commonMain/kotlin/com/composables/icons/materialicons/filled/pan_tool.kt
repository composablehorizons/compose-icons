package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Pan_tool: ImageVector
    get() {
        if (_Pan_tool != null) return _Pan_tool!!
        
        _Pan_tool = ImageVector.Builder(
            name = "pan_tool",
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
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(23f, 5.5f)
                            verticalLineTo(20f)
                            curveToRelative(0f, 2.2f, -1.8f, 4f, -4f, 4f)
                            horizontalLineToRelative(-7.3f)
                            curveToRelative(-1.08f, 0f, -2.1f, -0.43f, -2.85f, -1.19f)
                            lineTo(1f, 14.83f)
                            curveToRelative(0f, 0f, 1.26f, -1.23f, 1.3f, -1.25f)
                            curveToRelative(0.22f, -0.19f, 0.49f, -0.29f, 0.79f, -0.29f)
                            curveToRelative(0.22f, 0f, 0.42f, 0.06f, 0.6f, 0.16f)
                            curveTo(3.73f, 13.46f, 8f, 15.91f, 8f, 15.91f)
                            verticalLineTo(4f)
                            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                            reflectiveCurveTo(11f, 3.17f, 11f, 4f)
                            verticalLineToRelative(7f)
                            horizontalLineToRelative(1f)
                            verticalLineTo(1.5f)
                            curveTo(12f, 0.67f, 12.67f, 0f, 13.5f, 0f)
                            reflectiveCurveTo(15f, 0.67f, 15f, 1.5f)
                            verticalLineTo(11f)
                            horizontalLineToRelative(1f)
                            verticalLineTo(2.5f)
                            curveTo(16f, 1.67f, 16.67f, 1f, 17.5f, 1f)
                            reflectiveCurveTo(19f, 1.67f, 19f, 2.5f)
                            verticalLineTo(11f)
                            horizontalLineToRelative(1f)
                            verticalLineTo(5.5f)
                            curveTo(20f, 4.67f, 20.67f, 4f, 21.5f, 4f)
                            reflectiveCurveTo(23f, 4.67f, 23f, 5.5f)
                            close()
                        }
                    }
                }
            }
        }.build()
        
        return _Pan_tool!!
    }

private var _Pan_tool: ImageVector? = null

