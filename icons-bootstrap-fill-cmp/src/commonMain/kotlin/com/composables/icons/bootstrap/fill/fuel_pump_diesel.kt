package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.FuelPumpDiesel: ImageVector
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
                moveTo(4.974f, 9.806f)
                horizontalLineToRelative(0.692f)
                quadToRelative(0.459f, 0f, 0.75f, 0.19f)
                quadToRelative(0.297f, 0.191f, 0.437f, 0.568f)
                quadToRelative(0.144f, 0.377f, 0.144f, 0.941f)
                quadToRelative(0f, 0.425f, -0.083f, 0.74f)
                quadToRelative(-0.08f, 0.315f, -0.241f, 0.528f)
                arcToRelative(1f, 1f, 0f, false, true, -0.412f, 0.315f)
                arcToRelative(1.6f, 1.6f, 0f, false, true, -0.595f, 0.103f)
                horizontalLineToRelative(-0.692f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1f, 2f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(6f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(8f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 1f, 0f)
                verticalLineTo(8f)
                horizontalLineToRelative(-0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
                verticalLineTo(4.375f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(1.495f)
                curveToRelative(-0.011f, -0.476f, -0.053f, -0.894f, -0.201f, -1.222f)
                arcToRelative(0.97f, 0.97f, 0f, false, false, -0.394f, -0.458f)
                curveToRelative(-0.184f, -0.11f, -0.464f, -0.195f, -0.9f, -0.195f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -1f)
                quadToRelative(0.846f, -0.002f, 1.412f, 0.336f)
                curveToRelative(0.383f, 0.228f, 0.634f, 0.551f, 0.794f, 0.907f)
                curveToRelative(0.295f, 0.655f, 0.294f, 1.465f, 0.294f, 2.081f)
                verticalLineTo(7.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, 0.5f)
                horizontalLineTo(15f)
                verticalLineToRelative(4.5f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -3f, 0f)
                verticalLineTo(12f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                horizontalLineTo(0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -1f)
                horizontalLineTo(1f)
                close()
                moveToRelative(2f, 0.5f)
                verticalLineToRelative(5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, -0.5f)
                verticalLineToRelative(-5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, -0.5f)
                horizontalLineToRelative(-5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, 0.5f)
                moveTo(4f, 9f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(1.796f)
                quadToRelative(0.744f, 0f, 1.23f, -0.297f)
                quadToRelative(0.49f, -0.296f, 0.732f, -0.86f)
                reflectiveQuadTo(8f, 11.487f)
                quadToRelative(0f, -0.788f, -0.242f, -1.344f)
                arcToRelative(1.78f, 1.78f, 0f, false, false, -0.725f, -0.85f)
                quadTo(6.547f, 9f, 5.796f, 9f)
                close()
            }
        }.build()
        
        return _FuelPumpDiesel!!
    }

private var _FuelPumpDiesel: ImageVector? = null

