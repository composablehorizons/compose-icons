package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Local_see: ImageVector
    get() {
        if (_Local_see != null) return _Local_see!!
        
        _Local_see = ImageVector.Builder(
            name = "local_see",
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
                            moveTo(9.5f, 14f)
                            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                            curveToRelative(1.23f, 0f, 2.25f, -0.9f, 2.46f, -2.07f)
                            curveToRelative(-1f, -1.01f, -1.83f, -1.98f, -2.48f, -2.93f)
                            curveTo(10.61f, 11.52f, 9.5f, 12.63f, 9.5f, 14f)
                            close()
                        }
                    }
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(18.65f, 17.08f)
                            curveToRelative(-0.37f, 0.32f, -0.92f, 0.32f, -1.3f, 0f)
                            curveToRelative(-1.26f, -1.08f, -0.7f, -0.61f, -1.3f, -1.14f)
                            curveToRelative(-0.83f, 1.74f, -2.73f, 2.87f, -4.85f, 2.5f)
                            curveToRelative(-1.83f, -0.32f, -3.31f, -1.8f, -3.63f, -3.63f)
                            curveToRelative(-0.42f, -2.44f, 1.13f, -4.58f, 3.31f, -5.14f)
                            curveTo(10.3f, 8.45f, 10f, 7.28f, 10f, 6.15f)
                            curveTo(10f, 5.4f, 10.1f, 4.68f, 10.28f, 4f)
                            horizontalLineToRelative(-0.4f)
                            curveToRelative(-0.56f, 0f, -1.1f, 0.24f, -1.48f, 0.65f)
                            lineTo(7.17f, 6f)
                            horizontalLineTo(4f)
                            curveTo(2.9f, 6f, 2f, 6.9f, 2f, 8f)
                            verticalLineToRelative(12f)
                            curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                            horizontalLineToRelative(16f)
                            curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                            verticalLineToRelative(-6.03f)
                            curveTo(20.59f, 15.46f, 19.35f, 16.48f, 18.65f, 17.08f)
                            close()
                        }
                    }
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(17.34f, 14.42f)
                            curveToRelative(0.37f, 0.33f, 0.95f, 0.33f, 1.33f, 0f)
                            curveTo(22.22f, 11.25f, 24f, 8.5f, 24f, 6.15f)
                            curveTo(24f, 2.42f, 21.15f, 0f, 18f, 0f)
                            reflectiveCurveToRelative(-6f, 2.42f, -6f, 6.15f)
                            curveTo(12f, 8.5f, 13.78f, 11.25f, 17.34f, 14.42f)
                            close()
                            moveTo(17.27f, 5.25f)
                            lineTo(18f, 3f)
                            lineToRelative(0.73f, 2.25f)
                            horizontalLineTo(21f)
                            lineToRelative(-1.85f, 1.47f)
                            lineTo(19.85f, 9f)
                            lineTo(18f, 7.59f)
                            lineTo(16.15f, 9f)
                            lineToRelative(0.7f, -2.28f)
                            lineTo(15f, 5.25f)
                            horizontalLineTo(17.27f)
                            close()
                        }
                    }
                }
            }
        }.build()
        
        return _Local_see!!
    }

private var _Local_see: ImageVector? = null

