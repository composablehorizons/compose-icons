package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Sports_baseball: ImageVector
    get() {
        if (_Sports_baseball != null) return _Sports_baseball!!
        
        _Sports_baseball = ImageVector.Builder(
            name = "sports_baseball",
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
                            moveTo(3.81f, 6.28f)
                            curveTo(2.67f, 7.9f, 2f, 9.87f, 2f, 12f)
                            reflectiveCurveToRelative(0.67f, 4.1f, 1.81f, 5.72f)
                            curveTo(6.23f, 16.95f, 8f, 14.68f, 8f, 12f)
                            reflectiveCurveTo(6.23f, 7.05f, 3.81f, 6.28f)
                            close()
                        }
                    }
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(20.19f, 6.28f)
                            curveTo(17.77f, 7.05f, 16f, 9.32f, 16f, 12f)
                            reflectiveCurveToRelative(1.77f, 4.95f, 4.19f, 5.72f)
                            curveTo(21.33f, 16.1f, 22f, 14.13f, 22f, 12f)
                            reflectiveCurveTo(21.33f, 7.9f, 20.19f, 6.28f)
                            close()
                        }
                    }
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(14f, 12f)
                            curveToRelative(0f, -3.28f, 1.97f, -6.09f, 4.79f, -7.33f)
                            curveTo(17.01f, 3.02f, 14.63f, 2f, 12f, 2f)
                            reflectiveCurveTo(6.99f, 3.02f, 5.21f, 4.67f)
                            curveTo(8.03f, 5.91f, 10f, 8.72f, 10f, 12f)
                            reflectiveCurveToRelative(-1.97f, 6.09f, -4.79f, 7.33f)
                            curveTo(6.99f, 20.98f, 9.37f, 22f, 12f, 22f)
                            reflectiveCurveToRelative(5.01f, -1.02f, 6.79f, -2.67f)
                            curveTo(15.97f, 18.09f, 14f, 15.28f, 14f, 12f)
                            close()
                        }
                    }
                }
            }
        }.build()
        
        return _Sports_baseball!!
    }

private var _Sports_baseball: ImageVector? = null

