package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Foursquare: ImageVector
    get() {
        if (_Foursquare != null) return _Foursquare!!
        
        _Foursquare = ImageVector.Builder(
            name = "foursquare",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 368f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(323.1f, 3f)
                horizontalLineTo(49.9f)
                curveTo(12.4f, 3f, 0f, 31.3f, 0f, 49.1f)
                verticalLineToRelative(433.8f)
                curveToRelative(0f, 20.3f, 12.1f, 27.7f, 18.2f, 30.1f)
                curveToRelative(6.2f, 2.5f, 22.8f, 4.6f, 32.9f, -7.1f)
                curveTo(180f, 356.5f, 182.2f, 354f, 182.2f, 354f)
                curveToRelative(3.1f, -3.4f, 3.4f, -3.1f, 6.8f, -3.1f)
                horizontalLineToRelative(83.4f)
                curveToRelative(35.1f, 0f, 40.6f, -25.2f, 44.3f, -39.7f)
                lineToRelative(48.6f, -243f)
                curveTo(373.8f, 25.8f, 363.1f, 3f, 323.1f, 3f)
                close()
                moveToRelative(-16.3f, 73.8f)
                lineToRelative(-11.4f, 59.7f)
                curveToRelative(-1.2f, 6.5f, -9.5f, 13.2f, -16.9f, 13.2f)
                horizontalLineTo(172.1f)
                curveToRelative(-12f, 0f, -20.6f, 8.3f, -20.6f, 20.3f)
                verticalLineToRelative(13f)
                curveToRelative(0f, 12f, 8.6f, 20.6f, 20.6f, 20.6f)
                horizontalLineToRelative(90.4f)
                curveToRelative(8.3f, 0f, 16.6f, 9.2f, 14.8f, 18.2f)
                curveToRelative(-1.8f, 8.9f, -10.5f, 53.8f, -11.4f, 58.8f)
                curveToRelative(-0.9f, 4.9f, -6.8f, 13.5f, -16.9f, 13.5f)
                horizontalLineToRelative(-73.5f)
                curveToRelative(-13.5f, 0f, -17.2f, 1.8f, -26.5f, 12.6f)
                curveToRelative(0f, 0f, -8.9f, 11.4f, -89.5f, 108.3f)
                curveToRelative(-0.9f, 0.9f, -1.8f, 0.6f, -1.8f, -0.3f)
                verticalLineTo(75.9f)
                curveToRelative(0f, -7.7f, 6.8f, -16.6f, 16.6f, -16.6f)
                horizontalLineToRelative(219f)
                curveToRelative(8.2f, 0f, 15.6f, 7.7f, 13.5f, 17.5f)
                close()
            }
        }.build()
        
        return _Foursquare!!
    }

private var _Foursquare: ImageVector? = null

