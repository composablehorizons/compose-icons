package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Park: ImageVector
    get() {
        if (_Park != null) return _Park!!
        
        _Park = ImageVector.Builder(
            name = "park",
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
                            moveTo(16.96f, 12f)
                            horizontalLineToRelative(0.08f)
                            curveToRelative(0.81f, 0f, 1.28f, -0.91f, 0.82f, -1.57f)
                            lineToRelative(-5.08f, -7.25f)
                            curveToRelative(-0.4f, -0.57f, -1.24f, -0.57f, -1.64f, 0f)
                            lineTo(6.1f, 10.43f)
                            curveTo(5.64f, 11.09f, 6.12f, 12f, 6.93f, 12f)
                            horizontalLineToRelative(0.04f)
                            lineToRelative(-2.9f, 4.46f)
                            curveTo(3.63f, 17.12f, 4.11f, 18f, 4.91f, 18f)
                            horizontalLineToRelative(5.08f)
                            verticalLineToRelative(2.02f)
                            curveToRelative(0f, 1.09f, 0.89f, 1.98f, 1.98f, 1.98f)
                            horizontalLineToRelative(0f)
                            curveToRelative(1.09f, 0f, 1.98f, -0.89f, 1.98f, -1.98f)
                            verticalLineTo(18f)
                            horizontalLineToRelative(5.15f)
                            curveToRelative(0.8f, 0f, 1.28f, -0.89f, 0.83f, -1.55f)
                            lineTo(16.96f, 12f)
                            close()
                        }
                    }
                }
            }
        }.build()
        
        return _Park!!
    }

private var _Park: ImageVector? = null

