package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Arrow_circle_left: ImageVector
    get() {
        if (_Arrow_circle_left != null) return _Arrow_circle_left!!
        
        _Arrow_circle_left = ImageVector.Builder(
            name = "arrow_circle_left",
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
                    moveTo(2f, 12f)
                    curveToRelative(0f, 5.52f, 4.48f, 10f, 10f, 10f)
                    curveToRelative(5.52f, 0f, 10f, -4.48f, 10f, -10f)
                    reflectiveCurveTo(17.52f, 2f, 12f, 2f)
                    curveTo(6.48f, 2f, 2f, 6.48f, 2f, 12f)
                    close()
                    moveTo(12f, 11f)
                    lineToRelative(4f, 0f)
                    verticalLineToRelative(2f)
                    lineToRelative(-4f, 0f)
                    lineToRelative(0f, 3f)
                    lineToRelative(-4f, -4f)
                    lineToRelative(4f, -4f)
                    lineTo(12f, 11f)
                    close()
                }
            }
        }.build()
        
        return _Arrow_circle_left!!
    }

private var _Arrow_circle_left: ImageVector? = null

