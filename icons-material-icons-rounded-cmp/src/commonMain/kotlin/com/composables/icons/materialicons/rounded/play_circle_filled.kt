package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Play_circle_filled: ImageVector
    get() {
        if (_Play_circle_filled != null) return _Play_circle_filled!!
        
        _Play_circle_filled = ImageVector.Builder(
            name = "play_circle_filled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 2f)
                curveTo(6.48f, 2f, 2f, 6.48f, 2f, 12f)
                reflectiveCurveToRelative(4.48f, 10f, 10f, 10f)
                reflectiveCurveToRelative(10f, -4.48f, 10f, -10f)
                reflectiveCurveTo(17.52f, 2f, 12f, 2f)
                close()
                moveToRelative(-2f, 13.5f)
                verticalLineToRelative(-7f)
                curveToRelative(0f, -0.41f, 0.47f, -0.65f, 0.8f, -0.4f)
                lineToRelative(4.67f, 3.5f)
                curveToRelative(0.27f, 0.2f, 0.27f, 0.6f, 0f, 0.8f)
                lineToRelative(-4.67f, 3.5f)
                curveToRelative(-0.33f, 0.25f, -0.8f, 0.01f, -0.8f, -0.4f)
                close()
            }
        }.build()
        
        return _Play_circle_filled!!
    }

private var _Play_circle_filled: ImageVector? = null

