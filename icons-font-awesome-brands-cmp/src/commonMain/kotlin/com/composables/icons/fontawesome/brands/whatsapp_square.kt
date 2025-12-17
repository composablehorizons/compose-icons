package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.WhatsappSquare: ImageVector
    get() {
        if (_WhatsappSquare != null) return _WhatsappSquare!!
        
        _WhatsappSquare = ImageVector.Builder(
            name = "whatsapp-square",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(224f, 122.8f)
                curveToRelative(-72.7f, 0f, -131.8f, 59.1f, -131.9f, 131.8f)
                curveToRelative(0f, 24.9f, 7f, 49.2f, 20.2f, 70.1f)
                lineToRelative(3.1f, 5f)
                lineToRelative(-13.3f, 48.6f)
                lineToRelative(49.9f, -13.1f)
                lineToRelative(4.8f, 2.9f)
                curveToRelative(20.2f, 12f, 43.4f, 18.4f, 67.1f, 18.4f)
                horizontalLineToRelative(0.1f)
                curveToRelative(72.6f, 0f, 133.3f, -59.1f, 133.3f, -131.8f)
                curveToRelative(0f, -35.2f, -15.2f, -68.3f, -40.1f, -93.2f)
                curveToRelative(-25f, -25f, -58f, -38.7f, -93.2f, -38.7f)
                close()
                moveToRelative(77.5f, 188.4f)
                curveToRelative(-3.3f, 9.3f, -19.1f, 17.7f, -26.7f, 18.8f)
                curveToRelative(-12.6f, 1.9f, -22.4f, 0.9f, -47.5f, -9.9f)
                curveToRelative(-39.7f, -17.2f, -65.7f, -57.2f, -67.7f, -59.8f)
                curveToRelative(-2f, -2.6f, -16.2f, -21.5f, -16.2f, -41f)
                reflectiveCurveToRelative(10.2f, -29.1f, 13.9f, -33.1f)
                curveToRelative(3.6f, -4f, 7.9f, -5f, 10.6f, -5f)
                curveToRelative(2.6f, 0f, 5.3f, 0f, 7.6f, 0.1f)
                curveToRelative(2.4f, 0.1f, 5.7f, -0.9f, 8.9f, 6.8f)
                curveToRelative(3.3f, 7.9f, 11.2f, 27.4f, 12.2f, 29.4f)
                reflectiveCurveToRelative(1.7f, 4.3f, 0.3f, 6.9f)
                curveToRelative(-7.6f, 15.2f, -15.7f, 14.6f, -11.6f, 21.6f)
                curveToRelative(15.3f, 26.3f, 30.6f, 35.4f, 53.9f, 47.1f)
                curveToRelative(4f, 2f, 6.3f, 1.7f, 8.6f, -1f)
                curveToRelative(2.3f, -2.6f, 9.9f, -11.6f, 12.5f, -15.5f)
                curveToRelative(2.6f, -4f, 5.3f, -3.3f, 8.9f, -2f)
                curveToRelative(3.6f, 1.3f, 23.1f, 10.9f, 27.1f, 12.9f)
                reflectiveCurveToRelative(6.6f, 3f, 7.6f, 4.6f)
                curveToRelative(0.9f, 1.9f, 0.9f, 9.9f, -2.4f, 19.1f)
                close()
                moveTo(400f, 32f)
                horizontalLineTo(48f)
                curveTo(21.5f, 32f, 0f, 53.5f, 0f, 80f)
                verticalLineToRelative(352f)
                curveToRelative(0f, 26.5f, 21.5f, 48f, 48f, 48f)
                horizontalLineToRelative(352f)
                curveToRelative(26.5f, 0f, 48f, -21.5f, 48f, -48f)
                verticalLineTo(80f)
                curveToRelative(0f, -26.5f, -21.5f, -48f, -48f, -48f)
                close()
                moveTo(223.9f, 413.2f)
                curveToRelative(-26.6f, 0f, -52.7f, -6.7f, -75.8f, -19.3f)
                lineTo(64f, 416f)
                lineToRelative(22.5f, -82.2f)
                curveToRelative(-13.9f, -24f, -21.2f, -51.3f, -21.2f, -79.3f)
                curveTo(65.4f, 167.1f, 136.5f, 96f, 223.9f, 96f)
                curveToRelative(42.4f, 0f, 82.2f, 16.5f, 112.2f, 46.5f)
                curveToRelative(29.9f, 30f, 47.9f, 69.8f, 47.9f, 112.2f)
                curveToRelative(0f, 87.4f, -72.7f, 158.5f, -160.1f, 158.5f)
                close()
            }
        }.build()
        
        return _WhatsappSquare!!
    }

private var _WhatsappSquare: ImageVector? = null

