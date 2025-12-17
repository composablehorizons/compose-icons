package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Arrow_circle_down: ImageVector
    get() {
        if (_Arrow_circle_down != null) return _Arrow_circle_down!!
        
        _Arrow_circle_down = ImageVector.Builder(
            name = "arrow_circle_down",
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
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(12f, 4f)
                    curveToRelative(4.41f, 0f, 8f, 3.59f, 8f, 8f)
                    reflectiveCurveToRelative(-3.59f, 8f, -8f, 8f)
                    reflectiveCurveToRelative(-8f, -3.59f, -8f, -8f)
                    reflectiveCurveTo(7.59f, 4f, 12f, 4f)
                    moveTo(12f, 2f)
                    curveTo(6.48f, 2f, 2f, 6.48f, 2f, 12f)
                    curveToRelative(0f, 5.52f, 4.48f, 10f, 10f, 10f)
                    curveToRelative(5.52f, 0f, 10f, -4.48f, 10f, -10f)
                    curveTo(22f, 6.48f, 17.52f, 2f, 12f, 2f)
                    lineTo(12f, 2f)
                    close()
                    moveTo(13f, 12f)
                    lineToRelative(0f, -4f)
                    horizontalLineToRelative(-2f)
                    lineToRelative(0f, 4f)
                    horizontalLineTo(8f)
                    lineToRelative(4f, 4f)
                    lineToRelative(4f, -4f)
                    horizontalLineTo(13f)
                    close()
                }
            }
        }.build()
        
        return _Arrow_circle_down!!
    }

private var _Arrow_circle_down: ImageVector? = null

