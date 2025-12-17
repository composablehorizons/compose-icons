package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Pause_circle: ImageVector
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
                        moveTo(11f, 16f)
                        horizontalLineTo(9f)
                        verticalLineTo(8f)
                        horizontalLineToRelative(2f)
                        verticalLineTo(16f)
                        close()
                        moveTo(15f, 16f)
                        horizontalLineToRelative(-2f)
                        verticalLineTo(8f)
                        horizontalLineToRelative(2f)
                        verticalLineTo(16f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Pause_circle!!
    }

private var _Pause_circle: ImageVector? = null

