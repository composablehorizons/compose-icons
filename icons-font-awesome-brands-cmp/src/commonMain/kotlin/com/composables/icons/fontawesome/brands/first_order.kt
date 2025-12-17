package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.FirstOrder: ImageVector
    get() {
        if (_FirstOrder != null) return _FirstOrder!!
        
        _FirstOrder = ImageVector.Builder(
            name = "first-order",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.9f, 229.2f)
                curveToRelative(0.1f, -0.1f, 0.2f, -0.3f, 0.3f, -0.4f)
                curveToRelative(0f, 0.1f, 0f, 0.3f, -0.1f, 0.4f)
                horizontalLineToRelative(-0.2f)
                close()
                moveTo(224f, 96.6f)
                curveToRelative(-7.1f, 0f, -14.6f, 0.6f, -21.4f, 1.7f)
                lineToRelative(3.7f, 67.4f)
                lineToRelative(-22f, -64f)
                curveToRelative(-14.3f, 3.7f, -27.7f, 9.4f, -40f, 16.6f)
                lineToRelative(29.4f, 61.4f)
                lineToRelative(-45.1f, -50.9f)
                curveToRelative(-11.4f, 8.9f, -21.7f, 19.1f, -30.6f, 30.9f)
                lineToRelative(50.6f, 45.4f)
                lineToRelative(-61.1f, -29.7f)
                curveToRelative(-7.1f, 12.3f, -12.9f, 25.7f, -16.6f, 40f)
                lineToRelative(64.3f, 22.6f)
                lineToRelative(-68f, -4f)
                curveToRelative(-0.9f, 7.1f, -1.4f, 14.6f, -1.4f, 22f)
                reflectiveCurveToRelative(0.6f, 14.6f, 1.4f, 21.7f)
                lineToRelative(67.7f, -4f)
                lineToRelative(-64f, 22.6f)
                curveToRelative(3.7f, 14.3f, 9.4f, 27.7f, 16.6f, 40.3f)
                lineToRelative(61.1f, -29.7f)
                lineTo(97.7f, 352f)
                curveToRelative(8.9f, 11.7f, 19.1f, 22.3f, 30.9f, 30.9f)
                lineToRelative(44.9f, -50.9f)
                lineToRelative(-29.5f, 61.4f)
                curveToRelative(12.3f, 7.4f, 25.7f, 13.1f, 40f, 16.9f)
                lineToRelative(22.3f, -64.6f)
                lineToRelative(-4f, 68f)
                curveToRelative(7.1f, 1.1f, 14.6f, 1.7f, 21.7f, 1.7f)
                curveToRelative(7.4f, 0f, 14.6f, -0.6f, 21.7f, -1.7f)
                lineToRelative(-4f, -68.6f)
                lineToRelative(22.6f, 65.1f)
                curveToRelative(14.3f, -4f, 27.7f, -9.4f, 40f, -16.9f)
                lineTo(274.9f, 332f)
                lineToRelative(44.9f, 50.9f)
                curveToRelative(11.7f, -8.9f, 22f, -19.1f, 30.6f, -30.9f)
                lineToRelative(-50.6f, -45.1f)
                lineToRelative(61.1f, 29.4f)
                curveToRelative(7.1f, -12.3f, 12.9f, -25.7f, 16.6f, -40.3f)
                lineToRelative(-64f, -22.3f)
                lineToRelative(67.4f, 4f)
                curveToRelative(1.1f, -7.1f, 1.4f, -14.3f, 1.4f, -21.7f)
                reflectiveCurveToRelative(-0.3f, -14.9f, -1.4f, -22f)
                lineToRelative(-67.7f, 4f)
                lineToRelative(64f, -22.3f)
                curveToRelative(-3.7f, -14.3f, -9.1f, -28f, -16.6f, -40.3f)
                lineToRelative(-60.9f, 29.7f)
                lineToRelative(50.6f, -45.4f)
                curveToRelative(-8.9f, -11.7f, -19.1f, -22f, -30.6f, -30.9f)
                lineToRelative(-45.1f, 50.9f)
                lineToRelative(29.4f, -61.1f)
                curveToRelative(-12.3f, -7.4f, -25.7f, -13.1f, -40f, -16.9f)
                lineTo(241.7f, 166f)
                lineToRelative(4f, -67.7f)
                curveToRelative(-7.1f, -1.2f, -14.3f, -1.7f, -21.7f, -1.7f)
                close()
                moveTo(443.4f, 128f)
                verticalLineToRelative(256f)
                lineTo(224f, 512f)
                lineTo(4.6f, 384f)
                verticalLineTo(128f)
                lineTo(224f, 0f)
                lineToRelative(219.4f, 128f)
                close()
                moveToRelative(-17.1f, 10.3f)
                lineTo(224f, 20.9f)
                lineTo(21.7f, 138.3f)
                verticalLineToRelative(235.1f)
                lineTo(224f, 491.1f)
                lineToRelative(202.3f, -117.7f)
                verticalLineTo(138.3f)
                close()
                moveTo(224f, 37.1f)
                lineToRelative(187.7f, 109.4f)
                verticalLineToRelative(218.9f)
                lineTo(224f, 474.9f)
                lineTo(36.3f, 365.4f)
                verticalLineTo(146.6f)
                lineTo(224f, 37.1f)
                close()
                moveToRelative(0f, 50.9f)
                curveToRelative(-92.3f, 0f, -166.9f, 75.1f, -166.9f, 168f)
                curveToRelative(0f, 92.6f, 74.6f, 167.7f, 166.9f, 167.7f)
                curveToRelative(92f, 0f, 166.9f, -75.1f, 166.9f, -167.7f)
                curveToRelative(0f, -92.9f, -74.9f, -168f, -166.9f, -168f)
                close()
            }
        }.build()
        
        return _FirstOrder!!
    }

private var _FirstOrder: ImageVector? = null

