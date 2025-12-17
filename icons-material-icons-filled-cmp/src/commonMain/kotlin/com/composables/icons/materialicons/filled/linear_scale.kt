package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Linear_scale: ImageVector
    get() {
        if (_Linear_scale != null) return _Linear_scale!!
        
        _Linear_scale = ImageVector.Builder(
            name = "linear_scale",
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
                            moveTo(19.5f, 9.5f)
                            curveToRelative(-1.03f, 0f, -1.9f, 0.62f, -2.29f, 1.5f)
                            horizontalLineToRelative(-2.92f)
                            curveTo(13.9f, 10.12f, 13.03f, 9.5f, 12f, 9.5f)
                            reflectiveCurveToRelative(-1.9f, 0.62f, -2.29f, 1.5f)
                            horizontalLineTo(6.79f)
                            curveTo(6.4f, 10.12f, 5.53f, 9.5f, 4.5f, 9.5f)
                            curveTo(3.12f, 9.5f, 2f, 10.62f, 2f, 12f)
                            reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                            curveToRelative(1.03f, 0f, 1.9f, -0.62f, 2.29f, -1.5f)
                            horizontalLineToRelative(2.92f)
                            curveToRelative(0.39f, 0.88f, 1.26f, 1.5f, 2.29f, 1.5f)
                            reflectiveCurveToRelative(1.9f, -0.62f, 2.29f, -1.5f)
                            horizontalLineToRelative(2.92f)
                            curveToRelative(0.39f, 0.88f, 1.26f, 1.5f, 2.29f, 1.5f)
                            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                            reflectiveCurveTo(20.88f, 9.5f, 19.5f, 9.5f)
                            close()
                        }
                    }
                }
            }
        }.build()
        
        return _Linear_scale!!
    }

private var _Linear_scale: ImageVector? = null

