package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Airline_stops: ImageVector
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
                moveTo(15f, 18f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-4f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(1f)
                curveToRelative(-0.47f, -4.21f, -3.89f, -7.55f, -8.12f, -7.96f)
                curveTo(2.37f, 8.99f, 2f, 8.56f, 2f, 8.05f)
                curveToRelative(0f, -0.59f, 0.52f, -1.06f, 1.11f, -1f)
                curveTo(7.03f, 7.44f, 10.37f, 9.87f, 12f, 13.3f)
                curveToRelative(1.13f, -2.43f, 2.99f, -4.25f, 4.78f, -5.52f)
                lineToRelative(-1.92f, -1.92f)
                curveTo(14.54f, 5.54f, 14.76f, 5f, 15.21f, 5f)
                horizontalLineToRelative(5.29f)
                curveTo(20.78f, 5f, 21f, 5.22f, 21f, 5.5f)
                verticalLineToRelative(5.29f)
                curveToRelative(0f, 0.45f, -0.54f, 0.67f, -0.85f, 0.35f)
                lineToRelative(-1.94f, -1.94f)
                curveTo(15.93f, 10.78f, 13.45f, 13.3f, 13f, 17f)
                horizontalLineToRelative(1f)
                curveTo(14.55f, 17f, 15f, 17.45f, 15f, 18f)
                close()
            }
        }.build()
        
        return _Airline_stops!!
    }

private var _Airline_stops: ImageVector? = null

