package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Attach_email: ImageVector
    get() {
        if (_Attach_email != null) return _Attach_email!!
        
        _Attach_email = ImageVector.Builder(
            name = "attach_email",
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
                                moveTo(21f, 10f)
                                verticalLineTo(4f)
                                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                                horizontalLineTo(3f)
                                curveTo(1.9f, 2f, 1.01f, 2.9f, 1.01f, 4f)
                                lineTo(1f, 16f)
                                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                                horizontalLineToRelative(11f)
                                verticalLineToRelative(-5f)
                                curveToRelative(0f, -1.66f, 1.34f, -3f, 3f, -3f)
                                horizontalLineTo(21f)
                                close()
                                moveTo(11.53f, 10.67f)
                                curveToRelative(-0.32f, 0.2f, -0.74f, 0.2f, -1.06f, 0f)
                                lineTo(3.4f, 6.25f)
                                curveTo(3.15f, 6.09f, 3f, 5.82f, 3f, 5.53f)
                                curveToRelative(0f, -0.67f, 0.73f, -1.07f, 1.3f, -0.72f)
                                lineTo(11f, 9f)
                                lineToRelative(6.7f, -4.19f)
                                curveTo(18.27f, 4.46f, 19f, 4.86f, 19f, 5.53f)
                                curveToRelative(0f, 0.29f, -0.15f, 0.56f, -0.4f, 0.72f)
                                lineTo(11.53f, 10.67f)
                                close()
                            }
                            path(
                                fill = SolidColor(Color(0xFF000000))
                            ) {
                                moveTo(22f, 14f)
                                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                                verticalLineToRelative(3f)
                                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                                verticalLineToRelative(-4.5f)
                                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                                verticalLineTo(17f)
                                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                                verticalLineToRelative(-3.5f)
                                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                                reflectiveCurveTo(15f, 12.12f, 15f, 13.5f)
                                verticalLineTo(18f)
                                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                                reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
                                verticalLineToRelative(-3f)
                                curveTo(23f, 14.45f, 22.55f, 14f, 22f, 14f)
                                close()
                            }
                        }
                    }
                }
            }
        }.build()
        
        return _Attach_email!!
    }

private var _Attach_email: ImageVector? = null

