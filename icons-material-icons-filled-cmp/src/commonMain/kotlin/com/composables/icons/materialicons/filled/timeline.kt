package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Timeline: ImageVector
    get() {
        if (_Timeline != null) return _Timeline!!
        
        _Timeline = ImageVector.Builder(
            name = "timeline",
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
                            moveTo(23f, 8f)
                            curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                            curveToRelative(-0.18f, 0f, -0.35f, -0.02f, -0.51f, -0.07f)
                            lineToRelative(-3.56f, 3.55f)
                            curveTo(16.98f, 13.64f, 17f, 13.82f, 17f, 14f)
                            curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                            reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                            curveToRelative(0f, -0.18f, 0.02f, -0.36f, 0.07f, -0.52f)
                            lineToRelative(-2.55f, -2.55f)
                            curveTo(10.36f, 10.98f, 10.18f, 11f, 10f, 11f)
                            reflectiveCurveToRelative(-0.36f, -0.02f, -0.52f, -0.07f)
                            lineToRelative(-4.55f, 4.56f)
                            curveTo(4.98f, 15.65f, 5f, 15.82f, 5f, 16f)
                            curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                            reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                            reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                            curveToRelative(0.18f, 0f, 0.35f, 0.02f, 0.51f, 0.07f)
                            lineToRelative(4.56f, -4.55f)
                            curveTo(8.02f, 9.36f, 8f, 9.18f, 8f, 9f)
                            curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                            reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                            curveToRelative(0f, 0.18f, -0.02f, 0.36f, -0.07f, 0.52f)
                            lineToRelative(2.55f, 2.55f)
                            curveTo(14.64f, 12.02f, 14.82f, 12f, 15f, 12f)
                            reflectiveCurveToRelative(0.36f, 0.02f, 0.52f, 0.07f)
                            lineToRelative(3.55f, -3.56f)
                            curveTo(19.02f, 8.35f, 19f, 8.18f, 19f, 8f)
                            curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                            reflectiveCurveTo(23f, 6.9f, 23f, 8f)
                            close()
                        }
                    }
                }
            }
        }.build()
        
        return _Timeline!!
    }

private var _Timeline: ImageVector? = null

