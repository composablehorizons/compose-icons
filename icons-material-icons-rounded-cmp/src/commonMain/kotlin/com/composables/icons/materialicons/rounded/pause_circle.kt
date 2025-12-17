package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Pause_circle: ImageVector
    get() {
        if (_Pause_circle != null) return _Pause_circle!!
        
        _Pause_circle = ImageVector.Builder(
            name = "pause_circle",
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
                        moveTo(12f, 2f)
                        curveTo(6.48f, 2f, 2f, 6.48f, 2f, 12f)
                        reflectiveCurveToRelative(4.48f, 10f, 10f, 10f)
                        reflectiveCurveToRelative(10f, -4.48f, 10f, -10f)
                        reflectiveCurveTo(17.52f, 2f, 12f, 2f)
                        close()
                        moveTo(10f, 16f)
                        lineTo(10f, 16f)
                        curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                        verticalLineTo(9f)
                        curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                        lineToRelative(0f, 0f)
                        curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                        verticalLineToRelative(6f)
                        curveTo(11f, 15.55f, 10.55f, 16f, 10f, 16f)
                        close()
                        moveTo(14f, 16f)
                        lineTo(14f, 16f)
                        curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                        verticalLineTo(9f)
                        curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                        lineToRelative(0f, 0f)
                        curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                        verticalLineToRelative(6f)
                        curveTo(15f, 15.55f, 14.55f, 16f, 14f, 16f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Pause_circle!!
    }

private var _Pause_circle: ImageVector? = null

