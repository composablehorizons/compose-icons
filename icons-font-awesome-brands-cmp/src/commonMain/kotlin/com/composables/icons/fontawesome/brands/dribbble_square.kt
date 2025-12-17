package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.DribbbleSquare: ImageVector
    get() {
        if (_DribbbleSquare != null) return _DribbbleSquare!!
        
        _DribbbleSquare = ImageVector.Builder(
            name = "dribbble-square",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(90.2f, 228.2f)
                curveToRelative(8.9f, -42.4f, 37.4f, -77.7f, 75.7f, -95.7f)
                curveToRelative(3.6f, 4.9f, 28f, 38.8f, 50.7f, 79f)
                curveToRelative(-64f, 17f, -120.3f, 16.8f, -126.4f, 16.7f)
                close()
                moveTo(314.6f, 154f)
                curveToRelative(-33.6f, -29.8f, -79.3f, -41.1f, -122.6f, -30.6f)
                curveToRelative(3.8f, 5.1f, 28.6f, 38.9f, 51f, 80f)
                curveToRelative(48.6f, -18.3f, 69.1f, -45.9f, 71.6f, -49.4f)
                close()
                moveTo(140.1f, 364f)
                curveToRelative(40.5f, 31.6f, 93.3f, 36.7f, 137.3f, 18f)
                curveToRelative(-2f, -12f, -10f, -53.8f, -29.2f, -103.6f)
                curveToRelative(-55.1f, 18.8f, -93.8f, 56.4f, -108.1f, 85.6f)
                close()
                moveToRelative(98.8f, -108.2f)
                curveToRelative(-3.4f, -7.8f, -7.2f, -15.5f, -11.1f, -23.2f)
                curveTo(159.6f, 253f, 93.4f, 252.2f, 87.4f, 252f)
                curveToRelative(0f, 1.4f, -0.1f, 2.8f, -0.1f, 4.2f)
                curveToRelative(0f, 35.1f, 13.3f, 67.1f, 35.1f, 91.4f)
                curveToRelative(22.2f, -37.9f, 67.1f, -77.9f, 116.5f, -91.8f)
                close()
                moveToRelative(34.9f, 16.3f)
                curveToRelative(17.9f, 49.1f, 25.1f, 89.1f, 26.5f, 97.4f)
                curveToRelative(30.7f, -20.7f, 52.5f, -53.6f, 58.6f, -91.6f)
                curveToRelative(-4.6f, -1.5f, -42.3f, -12.7f, -85.1f, -5.8f)
                close()
                moveToRelative(-20.3f, -48.4f)
                curveToRelative(4.8f, 9.8f, 8.3f, 17.8f, 12f, 26.8f)
                curveToRelative(45.5f, -5.7f, 90.7f, 3.4f, 95.2f, 4.4f)
                curveToRelative(-0.3f, -32.3f, -11.8f, -61.9f, -30.9f, -85.1f)
                curveToRelative(-2.9f, 3.9f, -25.8f, 33.2f, -76.3f, 53.9f)
                close()
                moveTo(448f, 80f)
                verticalLineToRelative(352f)
                curveToRelative(0f, 26.5f, -21.5f, 48f, -48f, 48f)
                horizontalLineTo(48f)
                curveToRelative(-26.5f, 0f, -48f, -21.5f, -48f, -48f)
                verticalLineTo(80f)
                curveToRelative(0f, -26.5f, 21.5f, -48f, 48f, -48f)
                horizontalLineToRelative(352f)
                curveToRelative(26.5f, 0f, 48f, 21.5f, 48f, 48f)
                close()
                moveToRelative(-64f, 176f)
                curveToRelative(0f, -88.2f, -71.8f, -160f, -160f, -160f)
                reflectiveCurveTo(64f, 167.8f, 64f, 256f)
                reflectiveCurveToRelative(71.8f, 160f, 160f, 160f)
                reflectiveCurveToRelative(160f, -71.8f, 160f, -160f)
                close()
            }
        }.build()
        
        return _DribbbleSquare!!
    }

private var _DribbbleSquare: ImageVector? = null

