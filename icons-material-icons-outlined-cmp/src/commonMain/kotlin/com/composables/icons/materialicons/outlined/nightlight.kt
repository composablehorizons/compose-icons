package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Nightlight: ImageVector
    get() {
        if (_Nightlight != null) return _Nightlight!!
        
        _Nightlight = ImageVector.Builder(
            name = "nightlight",
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
                    horizontalLineToRelative(24f)
                    verticalLineToRelative(24f)
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
                            moveTo(14f, 4f)
                            curveToRelative(0.34f, 0f, 0.68f, 0.02f, 1.01f, 0.07f)
                            curveTo(13.1f, 6.23f, 12f, 9.05f, 12f, 12f)
                            reflectiveCurveToRelative(1.1f, 5.77f, 3.01f, 7.93f)
                            curveTo(14.68f, 19.98f, 14.34f, 20f, 14f, 20f)
                            curveToRelative(-4.41f, 0f, -8f, -3.59f, -8f, -8f)
                            reflectiveCurveTo(9.59f, 4f, 14f, 4f)
                            moveTo(14f, 2f)
                            curveTo(8.48f, 2f, 4f, 6.48f, 4f, 12f)
                            reflectiveCurveToRelative(4.48f, 10f, 10f, 10f)
                            curveToRelative(1.82f, 0f, 3.53f, -0.5f, 5f, -1.35f)
                            curveToRelative(-2.99f, -1.73f, -5f, -4.95f, -5f, -8.65f)
                            reflectiveCurveToRelative(2.01f, -6.92f, 5f, -8.65f)
                            curveTo(17.53f, 2.5f, 15.82f, 2f, 14f, 2f)
                            lineTo(14f, 2f)
                            close()
                        }
                    }
                }
            }
        }.build()
        
        return _Nightlight!!
    }

private var _Nightlight: ImageVector? = null

