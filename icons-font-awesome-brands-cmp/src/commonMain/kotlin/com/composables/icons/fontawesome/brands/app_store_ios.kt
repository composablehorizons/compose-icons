package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.AppStoreIos: ImageVector
    get() {
        if (_AppStoreIos != null) return _AppStoreIos!!
        
        _AppStoreIos = ImageVector.Builder(
            name = "app-store-ios",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
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
                moveTo(127f, 384.5f)
                curveToRelative(-5.5f, 9.6f, -17.8f, 12.8f, -27.3f, 7.3f)
                curveToRelative(-9.6f, -5.5f, -12.8f, -17.8f, -7.3f, -27.3f)
                lineToRelative(14.3f, -24.7f)
                curveToRelative(16.1f, -4.9f, 29.3f, -1.1f, 39.6f, 11.4f)
                lineTo(127f, 384.5f)
                close()
                moveToRelative(138.9f, -53.9f)
                horizontalLineTo(84f)
                curveToRelative(-11f, 0f, -20f, -9f, -20f, -20f)
                reflectiveCurveToRelative(9f, -20f, 20f, -20f)
                horizontalLineToRelative(51f)
                lineToRelative(65.4f, -113.2f)
                lineToRelative(-20.5f, -35.4f)
                curveToRelative(-5.5f, -9.6f, -2.2f, -21.8f, 7.3f, -27.3f)
                curveToRelative(9.6f, -5.5f, 21.8f, -2.2f, 27.3f, 7.3f)
                lineToRelative(8.9f, 15.4f)
                lineToRelative(8.9f, -15.4f)
                curveToRelative(5.5f, -9.6f, 17.8f, -12.8f, 27.3f, -7.3f)
                curveToRelative(9.6f, 5.5f, 12.8f, 17.8f, 7.3f, 27.3f)
                lineToRelative(-85.8f, 148.6f)
                horizontalLineToRelative(62.1f)
                curveToRelative(20.2f, 0f, 31.5f, 23.7f, 22.7f, 40f)
                close()
                moveToRelative(98.1f, 0f)
                horizontalLineToRelative(-29f)
                lineToRelative(19.6f, 33.9f)
                curveToRelative(5.5f, 9.6f, 2.2f, 21.8f, -7.3f, 27.3f)
                curveToRelative(-9.6f, 5.5f, -21.8f, 2.2f, -27.3f, -7.3f)
                curveToRelative(-32.9f, -56.9f, -57.5f, -99.7f, -74f, -128.1f)
                curveToRelative(-16.7f, -29f, -4.8f, -58f, 7.1f, -67.8f)
                curveToRelative(13.1f, 22.7f, 32.7f, 56.7f, 58.9f, 102f)
                horizontalLineToRelative(52f)
                curveToRelative(11f, 0f, 20f, 9f, 20f, 20f)
                curveToRelative(0f, 11.1f, -9f, 20f, -20f, 20f)
                close()
            }
        }.build()
        
        return _AppStoreIos!!
    }

private var _AppStoreIos: ImageVector? = null

