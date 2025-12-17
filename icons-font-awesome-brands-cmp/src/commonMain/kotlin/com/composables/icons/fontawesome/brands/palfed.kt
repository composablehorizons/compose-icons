package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Palfed: ImageVector
    get() {
        if (_Palfed != null) return _Palfed!!
        
        _Palfed = ImageVector.Builder(
            name = "palfed",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 576f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(384.9f, 193.9f)
                curveToRelative(0f, -47.4f, -55.2f, -44.2f, -95.4f, -29.8f)
                curveToRelative(-1.3f, 39.4f, -2.5f, 80.7f, -3f, 119.8f)
                curveToRelative(0.7f, 2.8f, 2.6f, 6.2f, 15.1f, 6.2f)
                curveToRelative(36.8f, 0f, 83.4f, -42.8f, 83.3f, -96.2f)
                close()
                moveToRelative(-194.5f, 72.2f)
                curveToRelative(0.2f, 0f, 6.5f, -2.7f, 11.2f, -2.7f)
                curveToRelative(26.6f, 0f, 20.7f, 44.1f, -14.4f, 44.1f)
                curveToRelative(-21.5f, 0f, -37.1f, -18.1f, -37.1f, -43f)
                curveToRelative(0f, -42f, 42.9f, -95.6f, 100.7f, -126.5f)
                curveToRelative(1f, -12.4f, 3f, -22f, 10.5f, -28.2f)
                curveToRelative(11.2f, -9f, 26.6f, -3.5f, 29.5f, 11.1f)
                curveToRelative(72.2f, -22.2f, 135.2f, 1f, 135.2f, 72f)
                curveToRelative(0f, 77.9f, -79.3f, 152.6f, -140.1f, 138.2f)
                curveToRelative(-0.1f, 39.4f, 0.9f, 74.4f, 2.7f, 100f)
                verticalLineToRelative(0.2f)
                curveToRelative(0.2f, 3.4f, 0.6f, 12.5f, -5.3f, 19.1f)
                curveToRelative(-9.6f, 10.6f, -33.4f, 10f, -36.4f, -22.3f)
                curveToRelative(-4.1f, -44.4f, 0.2f, -206.1f, 1.4f, -242.5f)
                curveToRelative(-21.5f, 15f, -58.5f, 50.3f, -58.5f, 75.9f)
                curveToRelative(0.2f, 2.5f, 0.4f, 4f, 0.6f, 4.6f)
                close()
                moveTo(8f, 181.1f)
                reflectiveCurveToRelative(-0.1f, 37.4f, 38.4f, 37.4f)
                horizontalLineToRelative(30f)
                lineToRelative(22.4f, 217.2f)
                reflectiveCurveToRelative(0f, 44.3f, 44.7f, 44.3f)
                horizontalLineToRelative(288.9f)
                reflectiveCurveToRelative(44.7f, -0.4f, 44.7f, -44.3f)
                lineToRelative(22.4f, -217.2f)
                horizontalLineToRelative(30f)
                reflectiveCurveToRelative(38.4f, 1.2f, 38.4f, -37.4f)
                curveToRelative(0f, 0f, 0.1f, -37.4f, -38.4f, -37.4f)
                horizontalLineToRelative(-30.1f)
                curveToRelative(-7.3f, -25.6f, -30.2f, -74.3f, -119.4f, -74.3f)
                horizontalLineToRelative(-28f)
                verticalLineTo(50.3f)
                reflectiveCurveToRelative(-2.7f, -18.4f, -21.1f, -18.4f)
                horizontalLineToRelative(-85.8f)
                reflectiveCurveToRelative(-21.1f, 0f, -21.1f, 18.4f)
                verticalLineToRelative(19.1f)
                horizontalLineToRelative(-28.1f)
                reflectiveCurveToRelative(-105f, 4.2f, -120.5f, 74.3f)
                horizontalLineToRelative(-29f)
                reflectiveCurveTo(8f, 142.5f, 8f, 181.1f)
                close()
            }
        }.build()
        
        return _Palfed!!
    }

private var _Palfed: ImageVector? = null

