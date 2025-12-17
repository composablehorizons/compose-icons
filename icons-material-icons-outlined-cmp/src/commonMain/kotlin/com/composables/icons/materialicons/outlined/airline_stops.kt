package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Airline_stops: ImageVector
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
                moveTo(19f, 8.7f)
                curveToRelative(-2.46f, 1.5f, -5.5f, 4.17f, -6f, 8.3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineTo(9f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                curveToRelative(-0.5f, -4.5f, -4.37f, -8f, -9f, -8f)
                verticalLineTo(7f)
                curveToRelative(4.39f, 0f, 8.22f, 2.55f, 10f, 6.3f)
                curveToRelative(1.38f, -2.97f, 3.86f, -5.03f, 5.96f, -6.31f)
                lineTo(14f, 7f)
                verticalLineTo(5f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-2f)
                verticalLineTo(8.7f)
                close()
            }
        }.build()
        
        return _Airline_stops!!
    }

private var _Airline_stops: ImageVector? = null

