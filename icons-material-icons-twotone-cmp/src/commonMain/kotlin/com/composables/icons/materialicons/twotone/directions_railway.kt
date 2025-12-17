package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Directions_railway: ImageVector
    get() {
        if (_Directions_railway != null) return _Directions_railway!!
        
        _Directions_railway = ImageVector.Builder(
            name = "directions_railway",
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
                moveTo(6f, 15.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(9f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineTo(12f)
                horizontalLineTo(6f)
                verticalLineToRelative(3.5f)
                close()
                moveToRelative(6f, -3f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                close()
                moveTo(12f, 3f)
                curveTo(6f, 3f, 6f, 4.2f, 6f, 5f)
                horizontalLineToRelative(12f)
                curveToRelative(0f, -0.8f, 0f, -2f, -6f, -2f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(20f, 15.5f)
                verticalLineTo(5f)
                curveToRelative(0f, -3.5f, -3.58f, -4f, -8f, -4f)
                reflectiveCurveToRelative(-8f, 0.5f, -8f, 4f)
                verticalLineToRelative(10.5f)
                curveTo(4f, 17.43f, 5.57f, 19f, 7.5f, 19f)
                lineTo(6f, 20.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-0.5f)
                lineTo(16.5f, 19f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                close()
                moveToRelative(-2f, 0f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-9f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineTo(12f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(3.5f)
                close()
                moveToRelative(0f, -5.5f)
                horizontalLineTo(6f)
                verticalLineTo(7f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(3f)
                close()
                moveTo(6f, 5f)
                curveToRelative(0f, -0.8f, 0f, -2f, 6f, -2f)
                reflectiveCurveToRelative(6f, 1.2f, 6f, 2f)
                horizontalLineTo(6f)
                close()
                moveToRelative(6f, 11.5f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                close()
            }
        }.build()
        
        return _Directions_railway!!
    }

private var _Directions_railway: ImageVector? = null

