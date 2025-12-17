package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Airline_seat_flat_angled: ImageVector
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
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(22.25f, 14.29f)
                lineToRelative(-0.69f, 1.89f)
                lineTo(9.2f, 11.71f)
                lineToRelative(1.39f, -3.79f)
                curveToRelative(0.38f, -1.03f, 1.52f, -1.56f, 2.56f, -1.19f)
                lineToRelative(6.69f, 2.41f)
                curveToRelative(2.1f, 0.76f, 3.18f, 3.06f, 2.41f, 5.15f)
                close()
                moveToRelative(-19.8f, -1.81f)
                lineToRelative(5.55f, 2f)
                verticalLineTo(18f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(6f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-0.63f)
                lineToRelative(3.58f, 1.29f)
                curveToRelative(0.52f, 0.19f, 1.1f, -0.08f, 1.29f, -0.6f)
                curveToRelative(0.19f, -0.52f, -0.08f, -1.1f, -0.6f, -1.29f)
                lineTo(3.13f, 10.59f)
                curveToRelative(-0.52f, -0.19f, -1.1f, 0.08f, -1.29f, 0.6f)
                curveToRelative(-0.18f, 0.52f, 0.09f, 1.1f, 0.61f, 1.29f)
                close()
                moveTo(7.3f, 10.2f)
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

