package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Play_circle_outline: ImageVector
    get() {
        if (_Play_circle_outline != null) return _Play_circle_outline!!
        
        _Play_circle_outline = ImageVector.Builder(
            name = "play_circle_outline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.8f, 15.9f)
                lineToRelative(4.67f, -3.5f)
                curveToRelative(0.27f, -0.2f, 0.27f, -0.6f, 0f, -0.8f)
                lineTo(10.8f, 8.1f)
                curveToRelative(-0.33f, -0.25f, -0.8f, -0.01f, -0.8f, 0.4f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 0.41f, 0.47f, 0.65f, 0.8f, 0.4f)
                close()
                moveTo(12f, 2f)
                curveTo(6.48f, 2f, 2f, 6.48f, 2f, 12f)
                reflectiveCurveToRelative(4.48f, 10f, 10f, 10f)
                reflectiveCurveToRelative(10f, -4.48f, 10f, -10f)
                reflectiveCurveTo(17.52f, 2f, 12f, 2f)
                close()
                moveToRelative(0f, 18f)
                curveToRelative(-4.41f, 0f, -8f, -3.59f, -8f, -8f)
                reflectiveCurveToRelative(3.59f, -8f, 8f, -8f)
                reflectiveCurveToRelative(8f, 3.59f, 8f, 8f)
                reflectiveCurveToRelative(-3.59f, 8f, -8f, 8f)
                close()
            }
        }.build()
        
        return _Play_circle_outline!!
    }

private var _Play_circle_outline: ImageVector? = null

