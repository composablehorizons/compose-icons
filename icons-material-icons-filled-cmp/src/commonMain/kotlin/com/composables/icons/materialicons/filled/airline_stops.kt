package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Airline_stops: ImageVector
    get() {
        if (_Airline_stops != null) return _Airline_stops!!
        
        _Airline_stops = ImageVector.Builder(
            name = "airline_stops",
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
                moveTo(18.21f, 9.21f)
                curveTo(15.93f, 10.78f, 13.45f, 13.3f, 13f, 17f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineTo(9f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                curveToRelative(-0.5f, -4.5f, -4.37f, -8f, -9f, -8f)
                verticalLineTo(7f)
                curveToRelative(4.39f, 0f, 8.22f, 2.55f, 10f, 6.3f)
                curveToRelative(1.13f, -2.43f, 2.99f, -4.25f, 4.78f, -5.52f)
                lineTo(14f, 5f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(7f)
                lineTo(18.21f, 9.21f)
                close()
            }
        }.build()
        
        return _Airline_stops!!
    }

private var _Airline_stops: ImageVector? = null

