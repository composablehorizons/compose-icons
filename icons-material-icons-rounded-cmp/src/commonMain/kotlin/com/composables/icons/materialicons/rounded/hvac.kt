package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Hvac: ImageVector
    get() {
        if (_Hvac != null) return _Hvac!!
        
        _Hvac = ImageVector.Builder(
            name = "hvac",
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
                            moveTo(12f, 16f)
                            curveToRelative(1.01f, 0f, 1.91f, -0.39f, 2.62f, -1f)
                            horizontalLineTo(9.38f)
                            curveTo(10.09f, 15.61f, 10.99f, 16f, 12f, 16f)
                            close()
                        }
                    }
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(8.56f, 14f)
                            horizontalLineToRelative(6.89f)
                            curveToRelative(0.26f, -0.45f, 0.44f, -0.96f, 0.51f, -1.5f)
                            horizontalLineToRelative(-7.9f)
                            curveTo(8.12f, 13.04f, 8.29f, 13.55f, 8.56f, 14f)
                            close()
                        }
                    }
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(12f, 8f)
                            curveToRelative(-1.01f, 0f, -1.91f, 0.39f, -2.62f, 1f)
                            horizontalLineToRelative(5.24f)
                            curveTo(13.91f, 8.39f, 13.01f, 8f, 12f, 8f)
                            close()
                        }
                    }
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(8.56f, 10f)
                            curveToRelative(-0.26f, 0.45f, -0.44f, 0.96f, -0.51f, 1.5f)
                            horizontalLineToRelative(7.9f)
                            curveToRelative(-0.07f, -0.54f, -0.24f, -1.05f, -0.51f, -1.5f)
                            horizontalLineTo(8.56f)
                            close()
                        }
                    }
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(19f, 3f)
                            horizontalLineTo(5f)
                            curveTo(3.9f, 3f, 3f, 3.9f, 3f, 5f)
                            verticalLineToRelative(14f)
                            curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                            horizontalLineToRelative(14f)
                            curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                            verticalLineTo(5f)
                            curveTo(21f, 3.9f, 20.1f, 3f, 19f, 3f)
                            close()
                            moveTo(12f, 18f)
                            curveToRelative(-3.31f, 0f, -6f, -2.69f, -6f, -6f)
                            reflectiveCurveToRelative(2.69f, -6f, 6f, -6f)
                            reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                            reflectiveCurveTo(15.31f, 18f, 12f, 18f)
                            close()
                        }
                    }
                }
            }
        }.build()
        
        return _Hvac!!
    }

private var _Hvac: ImageVector? = null

