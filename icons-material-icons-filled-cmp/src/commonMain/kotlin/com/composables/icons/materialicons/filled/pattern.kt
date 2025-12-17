package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Pattern: ImageVector
    get() {
        if (_Pattern != null) return _Pattern!!
        
        _Pattern = ImageVector.Builder(
            name = "pattern",
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
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(4f, 6f)
                        curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                        reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                        reflectiveCurveTo(7.1f, 8f, 6f, 8f)
                        reflectiveCurveTo(4f, 7.1f, 4f, 6f)
                        close()
                        moveTo(6f, 14f)
                        curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                        reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                        reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                        reflectiveCurveTo(4.9f, 14f, 6f, 14f)
                        close()
                        moveTo(12f, 8f)
                        curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                        reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                        reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                        reflectiveCurveTo(10.9f, 8f, 12f, 8f)
                        close()
                        moveTo(18f, 10f)
                        curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                        reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                        reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                        reflectiveCurveTo(19.1f, 10f, 18f, 10f)
                        close()
                        moveTo(17.98f, 16f)
                        curveToRelative(-0.74f, 0f, -1.37f, 0.4f, -1.72f, 1f)
                        horizontalLineToRelative(-2.54f)
                        curveToRelative(-0.34f, -0.6f, -0.98f, -1f, -1.72f, -1f)
                        reflectiveCurveToRelative(-1.37f, 0.4f, -1.72f, 1f)
                        horizontalLineTo(8.41f)
                        lineToRelative(3.07f, -3.07f)
                        curveTo(11.65f, 13.97f, 11.82f, 14f, 12f, 14f)
                        curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                        curveToRelative(0f, -0.18f, -0.03f, -0.35f, -0.07f, -0.51f)
                        lineToRelative(3.56f, -3.56f)
                        curveTo(17.65f, 7.97f, 17.82f, 8f, 18f, 8f)
                        curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                        reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                        reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                        curveToRelative(0f, 0.18f, 0.03f, 0.35f, 0.07f, 0.51f)
                        lineToRelative(-3.56f, 3.56f)
                        curveTo(12.35f, 10.03f, 12.18f, 10f, 12f, 10f)
                        curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                        curveToRelative(0f, 0.18f, 0.03f, 0.35f, 0.07f, 0.51f)
                        lineToRelative(-3.56f, 3.56f)
                        curveTo(6.35f, 16.03f, 6.18f, 16f, 6f, 16f)
                        curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                        reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                        curveToRelative(0.74f, 0f, 1.37f, -0.4f, 1.72f, -1f)
                        horizontalLineToRelative(2.57f)
                        curveToRelative(0.34f, 0.6f, 0.98f, 1f, 1.72f, 1f)
                        reflectiveCurveToRelative(1.37f, -0.4f, 1.72f, -1f)
                        horizontalLineToRelative(2.55f)
                        curveToRelative(0.34f, 0.6f, 0.98f, 1f, 1.72f, 1f)
                        curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                        curveTo(19.98f, 16.9f, 19.08f, 16f, 17.98f, 16f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Pattern!!
    }

private var _Pattern: ImageVector? = null

