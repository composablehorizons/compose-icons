package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Donut_large: ImageVector
    get() {
        if (_Donut_large != null) return _Donut_large!!
        
        _Donut_large = ImageVector.Builder(
            name = "donut_large",
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
                            moveTo(11f, 5.08f)
                            verticalLineTo(2f)
                            curveTo(6f, 2.5f, 2f, 6.81f, 2f, 12f)
                            reflectiveCurveToRelative(4f, 9.5f, 9f, 10f)
                            verticalLineToRelative(-3.08f)
                            curveToRelative(-3f, -0.48f, -6f, -3.4f, -6f, -6.92f)
                            reflectiveCurveTo(8f, 5.56f, 11f, 5.08f)
                            close()
                            moveTo(18.97f, 11f)
                            horizontalLineTo(22f)
                            curveToRelative(-0.47f, -5f, -4f, -8.53f, -9f, -9f)
                            verticalLineToRelative(3.08f)
                            curveTo(16f, 5.51f, 18.54f, 8f, 18.97f, 11f)
                            close()
                            moveTo(13f, 18.92f)
                            verticalLineTo(22f)
                            curveToRelative(5f, -0.47f, 8.53f, -4f, 9f, -9f)
                            horizontalLineToRelative(-3.03f)
                            curveTo(18.54f, 16f, 16f, 18.49f, 13f, 18.92f)
                            close()
                        }
                    }
                }
            }
        }.build()
        
        return _Donut_large!!
    }

private var _Donut_large: ImageVector? = null

