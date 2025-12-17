package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.FuelPumpDiesel: ImageVector
    get() {
        if (_FuelPumpDiesel != null) return _FuelPumpDiesel!!
        
        _FuelPumpDiesel = ImageVector.Builder(
            name = "fuel-pump-diesel",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.5f, 2f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, 0.5f)
                verticalLineToRelative(5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, -0.5f)
                verticalLineToRelative(-5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, -0.5f)
                close()
                moveTo(4f, 14f)
                verticalLineTo(9f)
                horizontalLineToRelative(1.796f)
                quadToRelative(0.75f, 0f, 1.237f, 0.293f)
                reflectiveQuadToRelative(0.725f, 0.85f)
                quadTo(8f, 10.7f, 8f, 11.487f)
                quadToRelative(0f, 0.792f, -0.242f, 1.355f)
                arcToRelative(1.8f, 1.8f, 0f, false, true, -0.732f, 0.861f)
                quadTo(6.54f, 14f, 5.796f, 14f)
                close()
                moveToRelative(1.666f, -4.194f)
                horizontalLineToRelative(-0.692f)
                verticalLineToRelative(3.385f)
                horizontalLineToRelative(0.692f)
                quadToRelative(0.343f, 0f, 0.595f, -0.103f)
                arcToRelative(1f, 1f, 0f, false, false, 0.412f, -0.315f)
                quadToRelative(0.162f, -0.213f, 0.241f, -0.528f)
                quadToRelative(0.084f, -0.314f, 0.083f, -0.74f)
                quadToRelative(0f, -0.565f, -0.144f, -0.94f)
                arcToRelative(1.1f, 1.1f, 0f, false, false, -0.436f, -0.569f)
                quadToRelative(-0.293f, -0.19f, -0.75f, -0.19f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3f, 0f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(13f)
                horizontalLineTo(0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 1f)
                horizontalLineToRelative(11f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, -1f)
                horizontalLineTo(11f)
                verticalLineToRelative(-4f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(0.5f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 3f, 0f)
                verticalLineTo(8f)
                horizontalLineToRelative(0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, -0.5f)
                verticalLineTo(4.324f)
                curveToRelative(0f, -0.616f, 0f, -1.426f, -0.294f, -2.081f)
                arcToRelative(1.97f, 1.97f, 0f, false, false, -0.794f, -0.907f)
                quadTo(14.345f, 0.999f, 13.5f, 1f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 1f)
                curveToRelative(0.436f, 0f, 0.716f, 0.086f, 0.9f, 0.195f)
                arcToRelative(0.97f, 0.97f, 0f, false, true, 0.394f, 0.458f)
                curveToRelative(0.147f, 0.328f, 0.19f, 0.746f, 0.201f, 1.222f)
                horizontalLineTo(13.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, 0.5f)
                verticalLineTo(7.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(4.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -1f, 0f)
                verticalLineTo(12f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                verticalLineTo(2f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                close()
                moveToRelative(7f, 2f)
                verticalLineToRelative(13f)
                horizontalLineTo(2f)
                verticalLineTo(2f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                horizontalLineToRelative(6f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
            }
        }.build()
        
        return _FuelPumpDiesel!!
    }

private var _FuelPumpDiesel: ImageVector? = null

