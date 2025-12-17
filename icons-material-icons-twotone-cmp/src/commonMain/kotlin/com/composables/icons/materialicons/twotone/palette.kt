package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Palette: ImageVector
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
                                moveTo(6.5f, 13f)
                                curveTo(5.67f, 13f, 5f, 12.33f, 5f, 11.5f)
                                reflectiveCurveTo(5.67f, 10f, 6.5f, 10f)
                                reflectiveCurveTo(8f, 10.67f, 8f, 11.5f)
                                reflectiveCurveTo(7.33f, 13f, 6.5f, 13f)
                                close()
                                moveTo(9.5f, 9f)
                                curveTo(8.67f, 9f, 8f, 8.33f, 8f, 7.5f)
                                reflectiveCurveTo(8.67f, 6f, 9.5f, 6f)
                                reflectiveCurveTo(11f, 6.67f, 11f, 7.5f)
                                reflectiveCurveTo(10.33f, 9f, 9.5f, 9f)
                                close()
                                moveTo(14.5f, 9f)
                                curveTo(13.67f, 9f, 13f, 8.33f, 13f, 7.5f)
                                reflectiveCurveTo(13.67f, 6f, 14.5f, 6f)
                                reflectiveCurveTo(16f, 6.67f, 16f, 7.5f)
                                reflectiveCurveTo(15.33f, 9f, 14.5f, 9f)
                                close()
                                moveTo(19f, 11.5f)
                                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                                reflectiveCurveTo(16f, 12.33f, 16f, 11.5f)
                                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                                reflectiveCurveTo(19f, 10.67f, 19f, 11.5f)
                                close()
                            }
                            path(
                                fill = SolidColor(Color(0xFF000000))
                            ) {
                                moveTo(12f, 2f)
                                curveTo(6.49f, 2f, 2f, 6.49f, 2f, 12f)
                                reflectiveCurveToRelative(4.49f, 10f, 10f, 10f)
                                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                                curveToRelative(0f, -0.61f, -0.23f, -1.21f, -0.64f, -1.67f)
                                curveToRelative(-0.08f, -0.09f, -0.13f, -0.21f, -0.13f, -0.33f)
                                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                                horizontalLineTo(16f)
                                curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
                                curveTo(22f, 6.04f, 17.51f, 2f, 12f, 2f)
                                close()
                                moveTo(16f, 15f)
                                horizontalLineToRelative(-1.77f)
                                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                                curveToRelative(0f, 0.61f, 0.22f, 1.19f, 0.63f, 1.65f)
                                curveToRelative(0.06f, 0.07f, 0.14f, 0.19f, 0.14f, 0.35f)
                                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                                curveToRelative(-4.41f, 0f, -8f, -3.59f, -8f, -8f)
                                reflectiveCurveToRelative(3.59f, -8f, 8f, -8f)
                                reflectiveCurveToRelative(8f, 3.14f, 8f, 7f)
                                curveTo(20f, 13.21f, 18.21f, 15f, 16f, 15f)
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

