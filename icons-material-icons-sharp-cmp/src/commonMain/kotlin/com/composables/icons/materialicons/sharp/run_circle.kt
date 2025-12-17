package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Run_circle: ImageVector
    get() {
        if (_Run_circle != null) return _Run_circle!!
        
        _Run_circle = ImageVector.Builder(
            name = "run_circle",
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
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(12f, 2f)
                    curveTo(6.48f, 2f, 2f, 6.48f, 2f, 12f)
                    curveToRelative(0f, 5.52f, 4.48f, 10f, 10f, 10f)
                    reflectiveCurveToRelative(10f, -4.48f, 10f, -10f)
                    curveTo(22f, 6.48f, 17.52f, 2f, 12f, 2f)
                    close()
                    moveTo(13.5f, 6f)
                    curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                    curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                    reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                    curveTo(12.5f, 6.45f, 12.95f, 6f, 13.5f, 6f)
                    close()
                    moveTo(16f, 12f)
                    curveToRelative(-0.7f, 0f, -2.01f, -0.54f, -2.91f, -1.76f)
                    lineToRelative(-0.41f, 2.35f)
                    lineTo(14f, 14.03f)
                    verticalLineTo(18f)
                    horizontalLineToRelative(-1f)
                    verticalLineToRelative(-3.58f)
                    lineToRelative(-1.11f, -1.21f)
                    lineToRelative(-0.52f, 2.64f)
                    lineTo(7.6f, 15.08f)
                    lineToRelative(0.2f, -0.98f)
                    lineToRelative(2.78f, 0.57f)
                    lineToRelative(0.96f, -4.89f)
                    lineTo(10f, 10.35f)
                    verticalLineTo(12f)
                    horizontalLineTo(9f)
                    verticalLineTo(9.65f)
                    lineToRelative(3.28f, -1.21f)
                    curveToRelative(0.49f, -0.18f, 1.03f, 0.06f, 1.26f, 0.53f)
                    curveTo(14.37f, 10.67f, 15.59f, 11f, 16f, 11f)
                    verticalLineTo(12f)
                    close()
                }
            }
        }.build()
        
        return _Run_circle!!
    }

private var _Run_circle: ImageVector? = null

