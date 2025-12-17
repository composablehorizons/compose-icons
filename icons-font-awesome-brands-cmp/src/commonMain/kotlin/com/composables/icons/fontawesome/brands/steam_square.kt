package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.SteamSquare: ImageVector
    get() {
        if (_SteamSquare != null) return _SteamSquare!!
        
        _SteamSquare = ImageVector.Builder(
            name = "steam-square",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(185.2f, 356.5f)
                curveToRelative(7.7f, -18.5f, -1f, -39.7f, -19.6f, -47.4f)
                lineToRelative(-29.5f, -12.2f)
                curveToRelative(11.4f, -4.3f, 24.3f, -4.5f, 36.4f, 0.5f)
                curveToRelative(12.2f, 5.1f, 21.6f, 14.6f, 26.7f, 26.7f)
                curveToRelative(5f, 12.2f, 5f, 25.6f, -0.1f, 37.7f)
                curveToRelative(-10.5f, 25.1f, -39.4f, 37f, -64.6f, 26.5f)
                curveToRelative(-11.6f, -4.8f, -20.4f, -13.6f, -25.4f, -24.2f)
                lineToRelative(28.5f, 11.8f)
                curveToRelative(18.6f, 7.8f, 39.9f, -0.9f, 47.6f, -19.4f)
                close()
                moveTo(400f, 32f)
                horizontalLineTo(48f)
                curveTo(21.5f, 32f, 0f, 53.5f, 0f, 80f)
                verticalLineToRelative(160.7f)
                lineToRelative(116.6f, 48.1f)
                curveToRelative(12f, -8.2f, 26.2f, -12.1f, 40.7f, -11.3f)
                lineToRelative(55.4f, -80.2f)
                verticalLineToRelative(-1.1f)
                curveToRelative(0f, -48.2f, 39.3f, -87.5f, 87.6f, -87.5f)
                reflectiveCurveToRelative(87.6f, 39.3f, 87.6f, 87.5f)
                curveToRelative(0f, 49.2f, -40.9f, 88.7f, -89.6f, 87.5f)
                lineToRelative(-79f, 56.3f)
                curveToRelative(1.6f, 38.5f, -29.1f, 68.8f, -65.7f, 68.8f)
                curveToRelative(-31.8f, 0f, -58.5f, -22.7f, -64.5f, -52.7f)
                lineTo(0f, 319.2f)
                verticalLineTo(432f)
                curveToRelative(0f, 26.5f, 21.5f, 48f, 48f, 48f)
                horizontalLineToRelative(352f)
                curveToRelative(26.5f, 0f, 48f, -21.5f, 48f, -48f)
                verticalLineTo(80f)
                curveToRelative(0f, -26.5f, -21.5f, -48f, -48f, -48f)
                close()
                moveToRelative(-99.7f, 222.5f)
                curveToRelative(-32.2f, 0f, -58.4f, -26.1f, -58.4f, -58.3f)
                reflectiveCurveToRelative(26.2f, -58.3f, 58.4f, -58.3f)
                reflectiveCurveToRelative(58.4f, 26.2f, 58.4f, 58.3f)
                reflectiveCurveToRelative(-26.2f, 58.3f, -58.4f, 58.3f)
                close()
                moveToRelative(0.1f, -14.6f)
                curveToRelative(24.2f, 0f, 43.9f, -19.6f, 43.9f, -43.8f)
                curveToRelative(0f, -24.2f, -19.6f, -43.8f, -43.9f, -43.8f)
                curveToRelative(-24.2f, 0f, -43.9f, 19.6f, -43.9f, 43.8f)
                curveToRelative(0f, 24.2f, 19.7f, 43.8f, 43.9f, 43.8f)
                close()
            }
        }.build()
        
        return _SteamSquare!!
    }

private var _SteamSquare: ImageVector? = null

