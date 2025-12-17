package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Strava: ImageVector
    get() {
        if (_Strava != null) return _Strava!!
        
        _Strava = ImageVector.Builder(
            name = "strava",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 384f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(158.4f, 0f)
                lineTo(7f, 292f)
                horizontalLineToRelative(89.2f)
                lineToRelative(62.2f, -116.1f)
                lineTo(220.1f, 292f)
                horizontalLineToRelative(88.5f)
                close()
                moveToRelative(150.2f, 292f)
                lineToRelative(-43.9f, 88.2f)
                lineToRelative(-44.6f, -88.2f)
                horizontalLineToRelative(-67.6f)
                lineToRelative(112.2f, 220f)
                lineToRelative(111.5f, -220f)
                close()
            }
        }.build()
        
        return _Strava!!
    }

private var _Strava: ImageVector? = null

