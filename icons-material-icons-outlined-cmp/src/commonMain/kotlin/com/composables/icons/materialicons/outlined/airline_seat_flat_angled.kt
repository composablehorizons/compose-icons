package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Airline_seat_flat_angled: ImageVector
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
                moveTo(6f, 6.5f)
                curveToRelative(0.31f, 0f, 0.7f, 0.15f, 0.9f, 0.56f)
                curveToRelative(0.24f, 0.5f, 0.02f, 1.1f, -0.47f, 1.34f)
                curveToRelative(-0.14f, 0.06f, -0.28f, 0.1f, -0.43f, 0.1f)
                curveToRelative(-0.3f, 0f, -0.7f, -0.15f, -0.89f, -0.56f)
                curveToRelative(-0.17f, -0.34f, -0.1f, -0.63f, -0.05f, -0.78f)
                curveToRelative(0.05f, -0.14f, 0.18f, -0.4f, 0.51f, -0.56f)
                curveToRelative(0.14f, -0.06f, 0.28f, -0.1f, 0.43f, -0.1f)
                moveToRelative(6.47f, 2.11f)
                lineToRelative(6.69f, 2.41f)
                curveToRelative(0.52f, 0.19f, 0.93f, 0.56f, 1.15f, 1.05f)
                curveToRelative(0.22f, 0.48f, 0.25f, 1.03f, 0.06f, 1.53f)
                lineToRelative(-0.01f, 0.02f)
                lineToRelative(-8.59f, -3.11f)
                lineToRelative(0.7f, -1.9f)
                moveTo(10f, 15.19f)
                lineToRelative(4f, 1.44f)
                verticalLineTo(17f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-1.81f)
                moveTo(6f, 4.5f)
                curveToRelative(-0.44f, 0f, -0.88f, 0.1f, -1.3f, 0.3f)
                curveToRelative(-1.49f, 0.71f, -2.12f, 2.5f, -1.4f, 4f)
                curveToRelative(0.51f, 1.07f, 1.58f, 1.7f, 2.7f, 1.7f)
                curveToRelative(0.44f, 0f, 0.88f, -0.1f, 1.3f, -0.3f)
                curveToRelative(1.49f, -0.72f, 2.12f, -2.51f, 1.41f, -4f)
                curveTo(8.19f, 5.13f, 7.12f, 4.5f, 6f, 4.5f)
                close()
                moveToRelative(5.28f, 1.55f)
                lineTo(9.2f, 11.71f)
                lineToRelative(12.36f, 4.47f)
                lineToRelative(0.69f, -1.89f)
                curveToRelative(0.77f, -2.09f, -0.31f, -4.39f, -2.41f, -5.15f)
                lineToRelative(-8.56f, -3.09f)
                close()
                moveToRelative(-9.09f, 4.2f)
                lineToRelative(-0.69f, 1.89f)
                lineTo(8f, 14.48f)
                verticalLineTo(19f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-1.63f)
                lineTo(20.52f, 19f)
                lineToRelative(0.69f, -1.89f)
                lineToRelative(-19.02f, -6.86f)
                close()
            }
        }.build()
        
        return _Airline_seat_flat_angled!!
    }

private var _Airline_seat_flat_angled: ImageVector? = null

