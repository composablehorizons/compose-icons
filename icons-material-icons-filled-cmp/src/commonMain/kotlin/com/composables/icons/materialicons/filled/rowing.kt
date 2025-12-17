package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Rowing: ImageVector
    get() {
        if (_Rowing != null) return _Rowing!!
        
        _Rowing = ImageVector.Builder(
            name = "rowing",
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
                            moveTo(8.5f, 14.5f)
                            lineTo(4f, 19f)
                            lineToRelative(1.5f, 1.5f)
                            lineTo(9f, 17f)
                            horizontalLineToRelative(2f)
                            lineTo(8.5f, 14.5f)
                            close()
                            moveTo(15f, 1f)
                            curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                            reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                            reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                            reflectiveCurveTo(16.1f, 1f, 15f, 1f)
                            close()
                            moveTo(21f, 21.01f)
                            lineTo(18f, 24f)
                            lineToRelative(-2.99f, -3.01f)
                            verticalLineTo(19.5f)
                            lineToRelative(-7.1f, -7.09f)
                            curveTo(7.6f, 12.46f, 7.3f, 12.48f, 7f, 12.48f)
                            verticalLineToRelative(-2.16f)
                            curveToRelative(1.66f, 0.03f, 3.61f, -0.87f, 4.67f, -2.04f)
                            lineToRelative(1.4f, -1.55f)
                            curveTo(13.42f, 6.34f, 14.06f, 6f, 14.72f, 6f)
                            horizontalLineToRelative(0.03f)
                            curveTo(15.99f, 6.01f, 17f, 7.02f, 17f, 8.26f)
                            verticalLineToRelative(5.75f)
                            curveToRelative(0f, 0.84f, -0.35f, 1.61f, -0.92f, 2.16f)
                            lineToRelative(-3.58f, -3.58f)
                            verticalLineToRelative(-2.27f)
                            curveToRelative(-0.63f, 0.52f, -1.43f, 1.02f, -2.29f, 1.39f)
                            lineTo(16.5f, 18f)
                            horizontalLineTo(18f)
                            lineTo(21f, 21.01f)
                            close()
                        }
                    }
                }
            }
        }.build()
        
        return _Rowing!!
    }

private var _Rowing: ImageVector? = null

