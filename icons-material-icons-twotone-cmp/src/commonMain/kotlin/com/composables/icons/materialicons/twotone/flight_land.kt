package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Flight_land: ImageVector
    get() {
        if (_Flight_land != null) return _Flight_land!!
        
        _Flight_land = ImageVector.Builder(
            name = "flight_land",
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
                moveToRelative(16.84f, -3.15f)
                curveToRelative(0.8f, 0.21f, 1.62f, -0.26f, 1.84f, -1.06f)
                curveToRelative(0.21f, -0.8f, -0.26f, -1.62f, -1.06f, -1.84f)
                lineToRelative(-5.31f, -1.42f)
                lineToRelative(-2.76f, -9.02f)
                lineTo(10.12f, 2f)
                verticalLineToRelative(8.28f)
                lineTo(5.15f, 8.95f)
                lineToRelative(-0.93f, -2.32f)
                lineToRelative(-1.45f, -0.39f)
                verticalLineToRelative(5.17f)
                lineToRelative(16.57f, 4.44f)
                close()
            }
        }.build()
        
        return _Flight_land!!
    }

private var _Flight_land: ImageVector? = null

