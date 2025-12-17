package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Update: ImageVector
    get() {
        if (_Update != null) return _Update!!
        
        _Update = ImageVector.Builder(
            name = "update",
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
                            moveTo(21f, 10.12f)
                            horizontalLineToRelative(-6.78f)
                            lineToRelative(2.74f, -2.82f)
                            curveToRelative(-2.73f, -2.7f, -7.15f, -2.8f, -9.88f, -0.1f)
                            curveToRelative(-2.73f, 2.71f, -2.73f, 7.08f, 0f, 9.79f)
                            reflectiveCurveToRelative(7.15f, 2.71f, 9.88f, 0f)
                            curveTo(18.32f, 15.65f, 19f, 14.08f, 19f, 12.1f)
                            horizontalLineToRelative(2f)
                            curveToRelative(0f, 1.98f, -0.88f, 4.55f, -2.64f, 6.29f)
                            curveToRelative(-3.51f, 3.48f, -9.21f, 3.48f, -12.72f, 0f)
                            curveToRelative(-3.5f, -3.47f, -3.53f, -9.11f, -0.02f, -12.58f)
                            reflectiveCurveToRelative(9.14f, -3.47f, 12.65f, 0f)
                            lineTo(21f, 3f)
                            verticalLineTo(10.12f)
                            close()
                            moveTo(12.5f, 8f)
                            verticalLineToRelative(4.25f)
                            lineToRelative(3.5f, 2.08f)
                            lineToRelative(-0.72f, 1.21f)
                            lineTo(11f, 13f)
                            verticalLineTo(8f)
                            horizontalLineTo(12.5f)
                            close()
                        }
                    }
                }
            }
        }.build()
        
        return _Update!!
    }

private var _Update: ImageVector? = null

