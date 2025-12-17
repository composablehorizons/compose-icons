package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Play_circle_filled: ImageVector
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
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 20f)
                curveToRelative(4.41f, 0f, 8f, -3.59f, 8f, -8f)
                reflectiveCurveToRelative(-3.59f, -8f, -8f, -8f)
                reflectiveCurveToRelative(-8f, 3.59f, -8f, 8f)
                reflectiveCurveToRelative(3.59f, 8f, 8f, 8f)
                close()
                moveTo(10f, 7.5f)
                lineToRelative(6f, 4.5f)
                lineToRelative(-6f, 4.5f)
                verticalLineToRelative(-9f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 22f)
                curveToRelative(5.52f, 0f, 10f, -4.48f, 10f, -10f)
                reflectiveCurveTo(17.52f, 2f, 12f, 2f)
                reflectiveCurveTo(2f, 6.48f, 2f, 12f)
                reflectiveCurveToRelative(4.48f, 10f, 10f, 10f)
                close()
                moveToRelative(0f, -18f)
                curveToRelative(4.41f, 0f, 8f, 3.59f, 8f, 8f)
                reflectiveCurveToRelative(-3.59f, 8f, -8f, 8f)
                reflectiveCurveToRelative(-8f, -3.59f, -8f, -8f)
                reflectiveCurveToRelative(3.59f, -8f, 8f, -8f)
                close()
                moveToRelative(-2f, 3.5f)
                verticalLineToRelative(9f)
                lineToRelative(6f, -4.5f)
                close()
            }
        }.build()
        
        return _Play_circle_filled!!
    }

private var _Play_circle_filled: ImageVector? = null

