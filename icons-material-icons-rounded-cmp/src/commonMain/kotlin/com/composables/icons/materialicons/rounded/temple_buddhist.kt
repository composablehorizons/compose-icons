package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Temple_buddhist: ImageVector
    get() {
        if (_Temple_buddhist != null) return _Temple_buddhist!!
        
        _Temple_buddhist = ImageVector.Builder(
            name = "temple_buddhist",
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
                group {
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(21.85f, 9.01f)
                            curveToRelative(-0.41f, 0f, -0.82f, 0.24f, -0.95f, 0.63f)
                            curveTo(20.64f, 10.43f, 19.89f, 11f, 19.02f, 11f)
                            horizontalLineTo(4.98f)
                            curveToRelative(-0.87f, 0f, -1.62f, -0.57f, -1.88f, -1.36f)
                            curveTo(2.97f, 9.25f, 2.57f, 9.02f, 2.16f, 9.02f)
                            horizontalLineToRelative(0f)
                            curveTo(1.5f, 9.02f, 1f, 9.66f, 1.21f, 10.28f)
                            curveToRelative(0.43f, 1.27f, 1.48f, 2.24f, 2.79f, 2.58f)
                            verticalLineTo(20f)
                            curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                            horizontalLineToRelative(4f)
                            lineToRelative(0f, -2.89f)
                            curveToRelative(0f, -1f, 0.68f, -1.92f, 1.66f, -2.08f)
                            curveTo(12.92f, 16.82f, 14f, 17.79f, 14f, 19f)
                            verticalLineToRelative(3f)
                            horizontalLineToRelative(4f)
                            curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                            verticalLineToRelative(-7.14f)
                            curveToRelative(0.46f, -0.12f, 2.22f, -0.76f, 2.81f, -2.58f)
                            curveTo(23.01f, 9.65f, 22.51f, 9f, 21.85f, 9.01f)
                            lineTo(21.85f, 9.01f)
                            close()
                        }
                    }
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(6f, 8.86f)
                            verticalLineTo(10f)
                            horizontalLineToRelative(12f)
                            verticalLineTo(8.86f)
                            curveToRelative(0.46f, -0.12f, 2.22f, -0.76f, 2.81f, -2.58f)
                            curveToRelative(0.2f, -0.63f, -0.3f, -1.27f, -0.96f, -1.27f)
                            lineToRelative(0f, 0f)
                            curveToRelative(-0.41f, 0f, -0.82f, 0.24f, -0.95f, 0.63f)
                            curveTo(18.64f, 6.43f, 17.89f, 7f, 17.02f, 7f)
                            horizontalLineTo(6.98f)
                            curveTo(6.11f, 7f, 5.36f, 6.43f, 5.1f, 5.64f)
                            curveTo(4.97f, 5.25f, 4.57f, 5.02f, 4.16f, 5.02f)
                            horizontalLineToRelative(0f)
                            curveTo(3.5f, 5.02f, 3f, 5.66f, 3.21f, 6.28f)
                            curveTo(3.64f, 7.55f, 4.69f, 8.53f, 6f, 8.86f)
                            close()
                        }
                    }
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(11.2f, 2.07f)
                            lineTo(8.25f, 6f)
                            horizontalLineToRelative(7.5f)
                            lineTo(12.8f, 2.07f)
                            curveTo(12.4f, 1.53f, 11.6f, 1.53f, 11.2f, 2.07f)
                            close()
                        }
                    }
                }
            }
        }.build()
        
        return _Temple_buddhist!!
    }

private var _Temple_buddhist: ImageVector? = null

