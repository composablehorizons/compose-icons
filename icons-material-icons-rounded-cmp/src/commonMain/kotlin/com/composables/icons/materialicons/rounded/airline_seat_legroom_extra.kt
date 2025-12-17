package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Airline_seat_legroom_extra: ImageVector
    get() {
        if (_Airline_seat_legroom_extra != null) return _Airline_seat_legroom_extra!!
        
        _Airline_seat_legroom_extra = ImageVector.Builder(
            name = "airline_seat_legroom_extra",
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
                moveTo(4f, 12f)
                verticalLineTo(4f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(8f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(5f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineTo(7f)
                curveToRelative(-1.66f, 0f, -3f, -1.34f, -3f, -3f)
                close()
                moveToRelative(18.83f, 5.24f)
                curveToRelative(-0.38f, -0.72f, -1.29f, -0.97f, -2.03f, -0.63f)
                lineToRelative(-1.09f, 0.5f)
                lineToRelative(-3.41f, -6.98f)
                curveTo(15.96f, 9.45f, 15.27f, 9f, 14.51f, 9f)
                horizontalLineTo(11f)
                verticalLineTo(3f)
                horizontalLineTo(5f)
                verticalLineToRelative(8f)
                curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
                horizontalLineToRelative(7f)
                lineToRelative(2.56f, 5.25f)
                curveToRelative(0.48f, 0.98f, 1.64f, 1.39f, 2.63f, 0.94f)
                lineToRelative(1.95f, -0.89f)
                curveToRelative(0.76f, -0.36f, 1.09f, -1.3f, 0.69f, -2.06f)
                close()
            }
        }.build()
        
        return _Airline_seat_legroom_extra!!
    }

private var _Airline_seat_legroom_extra: ImageVector? = null

