package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Airline_seat_legroom_reduced: ImageVector
    get() {
        if (_Airline_seat_legroom_reduced != null) return _Airline_seat_legroom_reduced!!
        
        _Airline_seat_legroom_reduced = ImageVector.Builder(
            name = "airline_seat_legroom_reduced",
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
                moveTo(19.97f, 19.2f)
                curveToRelative(0.18f, 0.96f, -0.55f, 1.8f, -1.47f, 1.8f)
                horizontalLineTo(14f)
                verticalLineToRelative(-3f)
                lineToRelative(1f, -4f)
                horizontalLineTo(9f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineTo(3f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(5f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                lineToRelative(-2f, 7f)
                horizontalLineToRelative(1.44f)
                curveToRelative(0.73f, 0f, 1.39f, 0.49f, 1.53f, 1.2f)
                close()
                moveTo(5f, 12f)
                verticalLineTo(3f)
                horizontalLineTo(3f)
                verticalLineToRelative(9f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-2f)
                horizontalLineTo(8f)
                curveToRelative(-1.66f, 0f, -3f, -1.34f, -3f, -3f)
                close()
            }
        }.build()
        
        return _Airline_seat_legroom_reduced!!
    }

private var _Airline_seat_legroom_reduced: ImageVector? = null

