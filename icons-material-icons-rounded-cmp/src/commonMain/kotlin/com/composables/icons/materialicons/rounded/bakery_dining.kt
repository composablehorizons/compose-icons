package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Bakery_dining: ImageVector
    get() {
        if (_Bakery_dining != null) return _Bakery_dining!!
        
        _Bakery_dining = ImageVector.Builder(
            name = "bakery_dining",
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
                            moveTo(18.77f, 8.55f)
                            lineTo(17.6f, 8.08f)
                            curveToRelative(-0.62f, -0.25f, -1.31f, 0.17f, -1.37f, 0.84f)
                            lineToRelative(-0.74f, 8.08f)
                            horizontalLineTo(17f)
                            lineToRelative(2.6f, -6.5f)
                            curveTo(19.91f, 9.73f, 19.54f, 8.85f, 18.77f, 8.55f)
                            close()
                        }
                    }
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(6.4f, 8.08f)
                            lineTo(5.23f, 8.55f)
                            curveTo(4.46f, 8.85f, 4.09f, 9.73f, 4.4f, 10.5f)
                            lineToRelative(2.6f, 6.5f)
                            horizontalLineToRelative(1.5f)
                            lineTo(7.76f, 8.92f)
                            curveTo(7.7f, 8.25f, 7.02f, 7.83f, 6.4f, 8.08f)
                            close()
                        }
                    }
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(13.36f, 6f)
                            horizontalLineToRelative(-2.71f)
                            curveTo(9.76f, 6f, 9.07f, 6.76f, 9.15f, 7.64f)
                            lineTo(10f, 16.99f)
                            horizontalLineToRelative(4f)
                            lineToRelative(0.85f, -9.36f)
                            curveTo(14.93f, 6.76f, 14.24f, 6f, 13.36f, 6f)
                            close()
                        }
                    }
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(3.18f, 13.72f)
                            lineToRelative(-1f, 1.93f)
                            curveToRelative(-0.19f, 0.36f, -0.23f, 0.78f, -0.12f, 1.19f)
                            curveToRelative(0.29f, 1.01f, 1.43f, 1.41f, 2.38f, 0.94f)
                            lineToRelative(1.05f, -0.52f)
                            lineToRelative(-1.4f, -3.49f)
                            curveTo(3.93f, 13.37f, 3.38f, 13.34f, 3.18f, 13.72f)
                            close()
                        }
                    }
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(21.82f, 15.65f)
                            lineToRelative(-1f, -1.93f)
                            curveToRelative(-0.2f, -0.38f, -0.75f, -0.35f, -0.91f, 0.04f)
                            lineToRelative(-1.4f, 3.49f)
                            lineToRelative(1.05f, 0.52f)
                            curveToRelative(0.94f, 0.47f, 2.09f, 0.07f, 2.38f, -0.94f)
                            curveTo(22.05f, 16.43f, 22.01f, 16.01f, 21.82f, 15.65f)
                            close()
                        }
                    }
                }
            }
        }.build()
        
        return _Bakery_dining!!
    }

private var _Bakery_dining: ImageVector? = null

