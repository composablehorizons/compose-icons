package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Airline_seat_flat_angled: ImageVector
    get() {
        if (_Airline_seat_flat_angled != null) return _Airline_seat_flat_angled!!
        
        _Airline_seat_flat_angled = ImageVector.Builder(
            name = "airline_seat_flat_angled",
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
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(22.25f, 14.29f)
                lineToRelative(-0.69f, 1.89f)
                lineTo(9.2f, 11.71f)
                lineToRelative(2.08f, -5.66f)
                lineToRelative(8.56f, 3.09f)
                curveToRelative(2.1f, 0.76f, 3.18f, 3.06f, 2.41f, 5.15f)
                close()
                moveTo(1.5f, 12.14f)
                lineTo(8f, 14.48f)
                verticalLineTo(19f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-1.63f)
                lineTo(20.52f, 19f)
                lineToRelative(0.69f, -1.89f)
                lineToRelative(-19.02f, -6.86f)
                lineToRelative(-0.69f, 1.89f)
                close()
                moveToRelative(5.8f, -1.94f)
                curveToRelative(1.49f, -0.72f, 2.12f, -2.51f, 1.41f, -4f)
                curveTo(7.99f, 4.71f, 6.2f, 4.08f, 4.7f, 4.8f)
                curveToRelative(-1.49f, 0.71f, -2.12f, 2.5f, -1.4f, 4f)
                curveToRelative(0.71f, 1.49f, 2.5f, 2.12f, 4f, 1.4f)
                close()
            }
        }.build()
        
        return _Airline_seat_flat_angled!!
    }

private var _Airline_seat_flat_angled: ImageVector? = null

