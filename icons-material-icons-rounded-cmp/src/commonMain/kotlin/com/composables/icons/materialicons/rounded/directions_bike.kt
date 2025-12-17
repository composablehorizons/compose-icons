package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Directions_bike: ImageVector
    get() {
        if (_Directions_bike != null) return _Directions_bike!!
        
        _Directions_bike = ImageVector.Builder(
            name = "directions_bike",
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
                moveTo(15.5f, 5.5f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                close()
                moveTo(5f, 12f)
                curveToRelative(-2.8f, 0f, -5f, 2.2f, -5f, 5f)
                reflectiveCurveToRelative(2.2f, 5f, 5f, 5f)
                reflectiveCurveToRelative(5f, -2.2f, 5f, -5f)
                reflectiveCurveToRelative(-2.2f, -5f, -5f, -5f)
                close()
                moveToRelative(0f, 8.5f)
                curveToRelative(-1.9f, 0f, -3.5f, -1.6f, -3.5f, -3.5f)
                reflectiveCurveToRelative(1.6f, -3.5f, 3.5f, -3.5f)
                reflectiveCurveToRelative(3.5f, 1.6f, 3.5f, 3.5f)
                reflectiveCurveToRelative(-1.6f, 3.5f, -3.5f, 3.5f)
                close()
                moveToRelative(5.8f, -10f)
                lineToRelative(2.4f, -2.4f)
                lineToRelative(0.8f, 0.8f)
                curveToRelative(1.06f, 1.06f, 2.38f, 1.78f, 3.96f, 2.02f)
                curveToRelative(0.6f, 0.09f, 1.14f, -0.39f, 1.14f, -1f)
                curveToRelative(0f, -0.49f, -0.37f, -0.91f, -0.85f, -0.99f)
                curveToRelative(-1.11f, -0.18f, -2.02f, -0.71f, -2.75f, -1.43f)
                lineToRelative(-1.9f, -1.9f)
                curveToRelative(-0.5f, -0.4f, -1f, -0.6f, -1.6f, -0.6f)
                reflectiveCurveToRelative(-1.1f, 0.2f, -1.4f, 0.6f)
                lineTo(7.8f, 8.4f)
                curveToRelative(-0.4f, 0.4f, -0.6f, 0.9f, -0.6f, 1.4f)
                curveToRelative(0f, 0.6f, 0.2f, 1.1f, 0.6f, 1.4f)
                lineTo(11f, 14f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-4.4f)
                curveToRelative(0f, -0.52f, -0.2f, -1.01f, -0.55f, -1.38f)
                lineTo(10.8f, 10.5f)
                close()
                moveTo(19f, 12f)
                curveToRelative(-2.8f, 0f, -5f, 2.2f, -5f, 5f)
                reflectiveCurveToRelative(2.2f, 5f, 5f, 5f)
                reflectiveCurveToRelative(5f, -2.2f, 5f, -5f)
                reflectiveCurveToRelative(-2.2f, -5f, -5f, -5f)
                close()
                moveToRelative(0f, 8.5f)
                curveToRelative(-1.9f, 0f, -3.5f, -1.6f, -3.5f, -3.5f)
                reflectiveCurveToRelative(1.6f, -3.5f, 3.5f, -3.5f)
                reflectiveCurveToRelative(3.5f, 1.6f, 3.5f, 3.5f)
                reflectiveCurveToRelative(-1.6f, 3.5f, -3.5f, 3.5f)
                close()
            }
        }.build()
        
        return _Directions_bike!!
    }

private var _Directions_bike: ImageVector? = null

