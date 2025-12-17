package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Timer: ImageVector
    get() {
        if (_Timer != null) return _Timer!!
        
        _Timer = ImageVector.Builder(
            name = "timer",
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
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(12f, 6f)
                        curveToRelative(-3.87f, 0f, -7f, 3.13f, -7f, 7f)
                        reflectiveCurveToRelative(3.13f, 7f, 7f, 7f)
                        reflectiveCurveToRelative(7f, -3.13f, 7f, -7f)
                        reflectiveCurveTo(15.87f, 6f, 12f, 6f)
                        close()
                        moveTo(13f, 14f)
                        horizontalLineToRelative(-2f)
                        verticalLineTo(8f)
                        horizontalLineToRelative(2f)
                        verticalLineTo(14f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(9f, 1f)
                        horizontalLineTo(15f)
                        verticalLineTo(3f)
                        horizontalLineTo(9f)
                        verticalLineTo(1f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(19.03f, 7.39f)
                        lineToRelative(1.42f, -1.42f)
                        curveToRelative(-0.43f, -0.51f, -0.9f, -0.99f, -1.41f, -1.41f)
                        lineToRelative(-1.42f, 1.42f)
                        curveTo(16.07f, 4.74f, 14.12f, 4f, 12f, 4f)
                        curveToRelative(-4.97f, 0f, -9f, 4.03f, -9f, 9f)
                        curveToRelative(0f, 4.97f, 4.02f, 9f, 9f, 9f)
                        reflectiveCurveToRelative(9f, -4.03f, 9f, -9f)
                        curveTo(21f, 10.88f, 20.26f, 8.93f, 19.03f, 7.39f)
                        close()
                        moveTo(12f, 20f)
                        curveToRelative(-3.87f, 0f, -7f, -3.13f, -7f, -7f)
                        reflectiveCurveToRelative(3.13f, -7f, 7f, -7f)
                        reflectiveCurveToRelative(7f, 3.13f, 7f, 7f)
                        reflectiveCurveTo(15.87f, 20f, 12f, 20f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(11f, 8f)
                        horizontalLineTo(13f)
                        verticalLineTo(14f)
                        horizontalLineTo(11f)
                        verticalLineTo(8f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Timer!!
    }

private var _Timer: ImageVector? = null

