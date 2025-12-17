package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Flight_takeoff: ImageVector
    get() {
        if (_Flight_takeoff != null) return _Flight_takeoff!!
        
        _Flight_takeoff = ImageVector.Builder(
            name = "flight_takeoff",
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
                moveTo(2.5f, 19f)
                horizontalLineToRelative(19f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-19f)
                verticalLineToRelative(-2f)
                close()
                moveToRelative(19.57f, -9.36f)
                curveToRelative(-0.21f, -0.8f, -1.04f, -1.28f, -1.84f, -1.06f)
                lineTo(14.92f, 10f)
                lineToRelative(-6.9f, -6.43f)
                lineToRelative(-1.93f, 0.51f)
                lineToRelative(4.14f, 7.17f)
                lineToRelative(-4.97f, 1.33f)
                lineToRelative(-1.97f, -1.54f)
                lineToRelative(-1.45f, 0.39f)
                lineToRelative(2.59f, 4.49f)
                lineTo(21f, 11.49f)
                curveToRelative(0.81f, -0.23f, 1.28f, -1.05f, 1.07f, -1.85f)
                close()
            }
        }.build()
        
        return _Flight_takeoff!!
    }

private var _Flight_takeoff: ImageVector? = null

