package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Travel_explore: ImageVector
    get() {
        if (_Travel_explore != null) return _Travel_explore!!
        
        _Travel_explore = ImageVector.Builder(
            name = "travel_explore",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
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
                moveTo(19.3f, 16.9f)
                curveToRelative(0.4f, -0.7f, 0.7f, -1.5f, 0.7f, -2.4f)
                curveToRelative(0f, -2.5f, -2f, -4.5f, -4.5f, -4.5f)
                reflectiveCurveTo(11f, 12f, 11f, 14.5f)
                reflectiveCurveToRelative(2f, 4.5f, 4.5f, 4.5f)
                curveToRelative(0.9f, 0f, 1.7f, -0.3f, 2.4f, -0.7f)
                lineToRelative(3.2f, 3.2f)
                lineToRelative(1.4f, -1.4f)
                lineTo(19.3f, 16.9f)
                close()
                moveTo(15.5f, 17f)
                curveToRelative(-1.4f, 0f, -2.5f, -1.1f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.1f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.1f, 2.5f, 2.5f)
                reflectiveCurveTo(16.9f, 17f, 15.5f, 17f)
                close()
                moveTo(12f, 20f)
                verticalLineToRelative(2f)
                curveTo(6.48f, 22f, 2f, 17.52f, 2f, 12f)
                curveTo(2f, 6.48f, 6.48f, 2f, 12f, 2f)
                curveToRelative(4.84f, 0f, 8.87f, 3.44f, 9.8f, 8f)
                horizontalLineToRelative(-2.07f)
                curveToRelative(-0.64f, -2.46f, -2.4f, -4.47f, -4.73f, -5.41f)
                verticalLineTo(5f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineTo(8f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                horizontalLineTo(9f)
                lineToRelative(-4.79f, -4.79f)
                curveTo(4.08f, 10.79f, 4f, 11.38f, 4f, 12f)
                curveTo(4f, 16.41f, 7.59f, 20f, 12f, 20f)
                close()
            }
        }.build()
        
        return _Travel_explore!!
    }

private var _Travel_explore: ImageVector? = null

