package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Airline_seat_flat: ImageVector
    get() {
        if (_Airline_seat_flat != null) return _Airline_seat_flat!!
        
        _Airline_seat_flat = ImageVector.Builder(
            name = "airline_seat_flat",
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
                moveTo(5f, 13f)
                curveToRelative(0.78f, 0f, 1.55f, -0.3f, 2.14f, -0.9f)
                curveToRelative(1.16f, -1.19f, 1.14f, -3.08f, -0.04f, -4.24f)
                curveTo(6.51f, 7.29f, 5.75f, 7f, 5f, 7f)
                curveToRelative(-0.78f, 0f, -1.55f, 0.3f, -2.14f, 0.9f)
                curveToRelative(-1.16f, 1.19f, -1.14f, 3.08f, 0.04f, 4.24f)
                curveToRelative(0.59f, 0.57f, 1.35f, 0.86f, 2.1f, 0.86f)
                close()
                moveToRelative(-0.71f, -3.7f)
                curveToRelative(0.19f, -0.19f, 0.44f, -0.3f, 0.71f, -0.3f)
                curveToRelative(0.26f, 0f, 0.51f, 0.1f, 0.7f, 0.28f)
                curveToRelative(0.4f, 0.39f, 0.4f, 1.01f, 0.02f, 1.41f)
                curveToRelative(-0.2f, 0.2f, -0.45f, 0.31f, -0.72f, 0.31f)
                curveToRelative(-0.26f, 0f, -0.51f, -0.1f, -0.7f, -0.28f)
                curveToRelative(-0.4f, -0.4f, -0.4f, -1.02f, -0.01f, -1.42f)
                close()
                moveTo(18f, 7f)
                horizontalLineTo(9f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(13f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                close()
                moveToRelative(-7f, 4f)
                verticalLineTo(9f)
                horizontalLineToRelative(7f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                horizontalLineToRelative(-9f)
                close()
                moveToRelative(-9f, 5f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-2f)
                horizontalLineTo(2f)
                close()
            }
        }.build()
        
        return _Airline_seat_flat!!
    }

private var _Airline_seat_flat: ImageVector? = null

