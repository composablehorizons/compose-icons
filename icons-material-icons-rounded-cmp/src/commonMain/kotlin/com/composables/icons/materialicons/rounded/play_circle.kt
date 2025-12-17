package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Play_circle: ImageVector
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
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(12f, 2f)
                    curveTo(6.48f, 2f, 2f, 6.48f, 2f, 12f)
                    reflectiveCurveToRelative(4.48f, 10f, 10f, 10f)
                    reflectiveCurveToRelative(10f, -4.48f, 10f, -10f)
                    reflectiveCurveTo(17.52f, 2f, 12f, 2f)
                    close()
                    moveTo(9.5f, 14.67f)
                    verticalLineTo(9.33f)
                    curveToRelative(0f, -0.79f, 0.88f, -1.27f, 1.54f, -0.84f)
                    lineToRelative(4.15f, 2.67f)
                    curveToRelative(0.61f, 0.39f, 0.61f, 1.29f, 0f, 1.68f)
                    lineToRelative(-4.15f, 2.67f)
                    curveTo(10.38f, 15.94f, 9.5f, 15.46f, 9.5f, 14.67f)
                    close()
                }
            }
        }.build()
        
        return _Play_circle!!
    }

private var _Play_circle: ImageVector? = null

