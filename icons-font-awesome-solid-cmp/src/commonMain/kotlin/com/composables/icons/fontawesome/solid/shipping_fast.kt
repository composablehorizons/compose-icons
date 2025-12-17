package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.ShippingFast: ImageVector
    get() {
        if (_ShippingFast != null) return _ShippingFast!!
        
        _ShippingFast = ImageVector.Builder(
            name = "shipping-fast",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(624f, 352f)
                horizontalLineToRelative(-16f)
                verticalLineTo(243.9f)
                curveToRelative(0f, -12.7f, -5.1f, -24.9f, -14.1f, -33.9f)
                lineTo(494f, 110.1f)
                curveToRelative(-9f, -9f, -21.2f, -14.1f, -33.9f, -14.1f)
                horizontalLineTo(416f)
                verticalLineTo(48f)
                curveToRelative(0f, -26.5f, -21.5f, -48f, -48f, -48f)
                horizontalLineTo(112f)
                curveTo(85.5f, 0f, 64f, 21.5f, 64f, 48f)
                verticalLineToRelative(48f)
                horizontalLineTo(8f)
                curveToRelative(-4.4f, 0f, -8f, 3.6f, -8f, 8f)
                verticalLineToRelative(16f)
                curveToRelative(0f, 4.4f, 3.6f, 8f, 8f, 8f)
                horizontalLineToRelative(272f)
                curveToRelative(4.4f, 0f, 8f, 3.6f, 8f, 8f)
                verticalLineToRelative(16f)
                curveToRelative(0f, 4.4f, -3.6f, 8f, -8f, 8f)
                horizontalLineTo(40f)
                curveToRelative(-4.4f, 0f, -8f, 3.6f, -8f, 8f)
                verticalLineToRelative(16f)
                curveToRelative(0f, 4.4f, 3.6f, 8f, 8f, 8f)
                horizontalLineToRelative(208f)
                curveToRelative(4.4f, 0f, 8f, 3.6f, 8f, 8f)
                verticalLineToRelative(16f)
                curveToRelative(0f, 4.4f, -3.6f, 8f, -8f, 8f)
                horizontalLineTo(8f)
                curveToRelative(-4.4f, 0f, -8f, 3.6f, -8f, 8f)
                verticalLineToRelative(16f)
                curveToRelative(0f, 4.4f, 3.6f, 8f, 8f, 8f)
                horizontalLineToRelative(208f)
                curveToRelative(4.4f, 0f, 8f, 3.6f, 8f, 8f)
                verticalLineToRelative(16f)
                curveToRelative(0f, 4.4f, -3.6f, 8f, -8f, 8f)
                horizontalLineTo(64f)
                verticalLineToRelative(128f)
                curveToRelative(0f, 53f, 43f, 96f, 96f, 96f)
                reflectiveCurveToRelative(96f, -43f, 96f, -96f)
                horizontalLineToRelative(128f)
                curveToRelative(0f, 53f, 43f, 96f, 96f, 96f)
                reflectiveCurveToRelative(96f, -43f, 96f, -96f)
                horizontalLineToRelative(48f)
                curveToRelative(8.8f, 0f, 16f, -7.2f, 16f, -16f)
                verticalLineToRelative(-32f)
                curveToRelative(0f, -8.8f, -7.2f, -16f, -16f, -16f)
                close()
                moveTo(160f, 464f)
                curveToRelative(-26.5f, 0f, -48f, -21.5f, -48f, -48f)
                reflectiveCurveToRelative(21.5f, -48f, 48f, -48f)
                reflectiveCurveToRelative(48f, 21.5f, 48f, 48f)
                reflectiveCurveToRelative(-21.5f, 48f, -48f, 48f)
                close()
                moveToRelative(320f, 0f)
                curveToRelative(-26.5f, 0f, -48f, -21.5f, -48f, -48f)
                reflectiveCurveToRelative(21.5f, -48f, 48f, -48f)
                reflectiveCurveToRelative(48f, 21.5f, 48f, 48f)
                reflectiveCurveToRelative(-21.5f, 48f, -48f, 48f)
                close()
                moveToRelative(80f, -208f)
                horizontalLineTo(416f)
                verticalLineTo(144f)
                horizontalLineToRelative(44.1f)
                lineToRelative(99.9f, 99.9f)
                verticalLineTo(256f)
                close()
            }
        }.build()
        
        return _ShippingFast!!
    }

private var _ShippingFast: ImageVector? = null

