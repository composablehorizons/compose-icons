package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Lock_outline: ImageVector
    get() {
        if (_Lock_outline != null) return _Lock_outline!!
        
        _Lock_outline = ImageVector.Builder(
            name = "lock_outline",
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
                            moveTo(12f, 17f)
                            curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                            reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                            reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                            reflectiveCurveTo(10.9f, 17f, 12f, 17f)
                            close()
                            moveTo(18f, 8f)
                            horizontalLineToRelative(-1f)
                            verticalLineTo(6f)
                            curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                            reflectiveCurveTo(7f, 3.24f, 7f, 6f)
                            verticalLineToRelative(2f)
                            horizontalLineTo(6f)
                            curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                            verticalLineToRelative(10f)
                            curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                            horizontalLineToRelative(12f)
                            curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                            verticalLineTo(10f)
                            curveTo(20f, 8.9f, 19.1f, 8f, 18f, 8f)
                            close()
                            moveTo(8.9f, 6f)
                            curveToRelative(0f, -1.71f, 1.39f, -3.1f, 3.1f, -3.1f)
                            reflectiveCurveToRelative(3.1f, 1.39f, 3.1f, 3.1f)
                            verticalLineToRelative(2f)
                            horizontalLineTo(8.9f)
                            verticalLineTo(6f)
                            close()
                            moveTo(18f, 20f)
                            horizontalLineTo(6f)
                            verticalLineTo(10f)
                            horizontalLineToRelative(12f)
                            verticalLineTo(20f)
                            close()
                        }
                    }
                }
            }
        }.build()
        
        return _Lock_outline!!
    }

private var _Lock_outline: ImageVector? = null

