package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Palette: ImageVector
    get() {
        if (_Palette != null) return _Palette!!
        
        _Palette = ImageVector.Builder(
            name = "palette",
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
                        group {
                            path(
                                fill = SolidColor(Color(0xFF000000))
                            ) {
                                moveTo(12f, 22f)
                                curveTo(6.49f, 22f, 2f, 17.51f, 2f, 12f)
                                reflectiveCurveTo(6.49f, 2f, 12f, 2f)
                                reflectiveCurveToRelative(10f, 4.04f, 10f, 9f)
                                curveToRelative(0f, 3.31f, -2.69f, 6f, -6f, 6f)
                                horizontalLineToRelative(-1.77f)
                                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                                curveToRelative(0f, 0.12f, 0.05f, 0.23f, 0.13f, 0.33f)
                                curveToRelative(0.41f, 0.47f, 0.64f, 1.06f, 0.64f, 1.67f)
                                curveTo(14.5f, 20.88f, 13.38f, 22f, 12f, 22f)
                                close()
                                moveTo(12f, 4f)
                                curveToRelative(-4.41f, 0f, -8f, 3.59f, -8f, 8f)
                                reflectiveCurveToRelative(3.59f, 8f, 8f, 8f)
                                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                                curveToRelative(0f, -0.16f, -0.08f, -0.28f, -0.14f, -0.35f)
                                curveToRelative(-0.41f, -0.46f, -0.63f, -1.05f, -0.63f, -1.65f)
                                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                                horizontalLineTo(16f)
                                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                                curveTo(20f, 7.14f, 16.41f, 4f, 12f, 4f)
                                close()
                            }
                            path(
                                fill = SolidColor(Color(0xFF000000))
                            ) {
                                moveTo(8f, 11.5f)
                                arcTo(1.5f, 1.5f, 0f, false, true, 6.5f, 13f)
                                arcTo(1.5f, 1.5f, 0f, false, true, 5f, 11.5f)
                                arcTo(1.5f, 1.5f, 0f, false, true, 8f, 11.5f)
                                close()
                            }
                            path(
                                fill = SolidColor(Color(0xFF000000))
                            ) {
                                moveTo(11f, 7.5f)
                                arcTo(1.5f, 1.5f, 0f, false, true, 9.5f, 9f)
                                arcTo(1.5f, 1.5f, 0f, false, true, 8f, 7.5f)
                                arcTo(1.5f, 1.5f, 0f, false, true, 11f, 7.5f)
                                close()
                            }
                            path(
                                fill = SolidColor(Color(0xFF000000))
                            ) {
                                moveTo(16f, 7.5f)
                                arcTo(1.5f, 1.5f, 0f, false, true, 14.5f, 9f)
                                arcTo(1.5f, 1.5f, 0f, false, true, 13f, 7.5f)
                                arcTo(1.5f, 1.5f, 0f, false, true, 16f, 7.5f)
                                close()
                            }
                            path(
                                fill = SolidColor(Color(0xFF000000))
                            ) {
                                moveTo(19f, 11.5f)
                                arcTo(1.5f, 1.5f, 0f, false, true, 17.5f, 13f)
                                arcTo(1.5f, 1.5f, 0f, false, true, 16f, 11.5f)
                                arcTo(1.5f, 1.5f, 0f, false, true, 19f, 11.5f)
                                close()
                            }
                        }
                    }
                }
            }
        }.build()
        
        return _Palette!!
    }

private var _Palette: ImageVector? = null

