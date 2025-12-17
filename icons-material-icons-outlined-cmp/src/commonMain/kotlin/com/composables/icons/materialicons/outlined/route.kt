package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Route: ImageVector
    get() {
        if (_Route != null) return _Route!!
        
        _Route = ImageVector.Builder(
            name = "route",
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
                        moveTo(19f, 15.18f)
                        verticalLineTo(7f)
                        curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                        reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
                        verticalLineToRelative(10f)
                        curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                        reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                        verticalLineTo(8.82f)
                        curveTo(8.16f, 8.4f, 9f, 7.3f, 9f, 6f)
                        curveToRelative(0f, -1.66f, -1.34f, -3f, -3f, -3f)
                        reflectiveCurveTo(3f, 4.34f, 3f, 6f)
                        curveToRelative(0f, 1.3f, 0.84f, 2.4f, 2f, 2.82f)
                        verticalLineTo(17f)
                        curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                        reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
                        verticalLineTo(7f)
                        curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                        reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                        verticalLineToRelative(8.18f)
                        curveToRelative(-1.16f, 0.41f, -2f, 1.51f, -2f, 2.82f)
                        curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
                        reflectiveCurveToRelative(3f, -1.34f, 3f, -3f)
                        curveTo(21f, 16.7f, 20.16f, 15.6f, 19f, 15.18f)
                        close()
                        moveTo(6f, 7f)
                        curveTo(5.45f, 7f, 5f, 6.55f, 5f, 6f)
                        reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                        reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                        reflectiveCurveTo(6.55f, 7f, 6f, 7f)
                        close()
                        moveTo(18f, 19f)
                        curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                        reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                        reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                        reflectiveCurveTo(18.55f, 19f, 18f, 19f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Route!!
    }

private var _Route: ImageVector? = null

