package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Play_circle: ImageVector
    get() {
        if (_Play_circle != null) return _Play_circle!!
        
        _Play_circle = ImageVector.Builder(
            name = "play_circle",
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
                        moveTo(12f, 4f)
                        curveToRelative(-4.41f, 0f, -8f, 3.59f, -8f, 8f)
                        curveToRelative(0f, 4.41f, 3.59f, 8f, 8f, 8f)
                        reflectiveCurveToRelative(8f, -3.59f, 8f, -8f)
                        curveTo(20f, 7.59f, 16.41f, 4f, 12f, 4f)
                        close()
                        moveTo(9.5f, 16.5f)
                        verticalLineToRelative(-9f)
                        lineToRelative(7f, 4.5f)
                        lineTo(9.5f, 16.5f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(12f, 2f)
                        curveTo(6.48f, 2f, 2f, 6.48f, 2f, 12f)
                        reflectiveCurveToRelative(4.48f, 10f, 10f, 10f)
                        reflectiveCurveToRelative(10f, -4.48f, 10f, -10f)
                        reflectiveCurveTo(17.52f, 2f, 12f, 2f)
                        close()
                        moveTo(12f, 20f)
                        curveToRelative(-4.41f, 0f, -8f, -3.59f, -8f, -8f)
                        curveToRelative(0f, -4.41f, 3.59f, -8f, 8f, -8f)
                        reflectiveCurveToRelative(8f, 3.59f, 8f, 8f)
                        curveTo(20f, 16.41f, 16.41f, 20f, 12f, 20f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(9.5f, 16.5f)
                        lineTo(16.5f, 12f)
                        lineTo(9.5f, 7.5f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Play_circle!!
    }

private var _Play_circle: ImageVector? = null

