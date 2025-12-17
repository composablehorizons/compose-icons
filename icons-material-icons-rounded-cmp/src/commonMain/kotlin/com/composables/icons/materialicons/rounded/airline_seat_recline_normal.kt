package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Airline_seat_recline_normal: ImageVector
    get() {
        if (_Airline_seat_recline_normal != null) return _Airline_seat_recline_normal!!
        
        _Airline_seat_recline_normal = ImageVector.Builder(
            name = "airline_seat_recline_normal",
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
                moveTo(7.59f, 5.41f)
                curveToRelative(-0.78f, -0.78f, -0.78f, -2.05f, 0f, -2.83f)
                reflectiveCurveToRelative(2.05f, -0.78f, 2.83f, 0f)
                reflectiveCurveToRelative(0.78f, 2.05f, 0f, 2.83f)
                curveToRelative(-0.79f, 0.79f, -2.05f, 0.79f, -2.83f, 0f)
                close()
                moveTo(6f, 16f)
                verticalLineTo(8f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(8f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(5f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineTo(9f)
                curveToRelative(-1.66f, 0f, -3f, -1.34f, -3f, -3f)
                close()
                moveToRelative(13.28f, 3.35f)
                lineToRelative(-3.77f, -3.77f)
                curveToRelative(-0.37f, -0.37f, -0.88f, -0.58f, -1.41f, -0.58f)
                horizontalLineToRelative(-2.6f)
                verticalLineToRelative(-3.68f)
                curveToRelative(1.09f, 0.89f, 2.66f, 1.7f, 4.2f, 2.02f)
                curveToRelative(0.67f, 0.14f, 1.3f, -0.36f, 1.3f, -1.04f)
                curveToRelative(0f, -0.53f, -0.39f, -0.96f, -0.92f, -1.05f)
                curveToRelative(-1.42f, -0.24f, -2.88f, -1.01f, -3.75f, -1.97f)
                lineToRelative(-1.4f, -1.55f)
                curveToRelative(-0.19f, -0.21f, -0.43f, -0.38f, -0.69f, -0.5f)
                curveToRelative(-0.29f, -0.14f, -0.62f, -0.23f, -0.96f, -0.23f)
                horizontalLineToRelative(-0.03f)
                curveTo(8.01f, 7f, 7f, 8.01f, 7f, 9.25f)
                verticalLineTo(15f)
                curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
                horizontalLineToRelative(5.07f)
                lineToRelative(2.78f, 2.78f)
                curveToRelative(0.39f, 0.39f, 1.04f, 0.39f, 1.43f, 0f)
                curveToRelative(0.4f, -0.39f, 0.4f, -1.03f, 0f, -1.43f)
                close()
            }
        }.build()
        
        return _Airline_seat_recline_normal!!
    }

private var _Airline_seat_recline_normal: ImageVector? = null

