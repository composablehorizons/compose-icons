package com.composables.icons.fontawesome.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Regular.CreditCard: ImageVector
    get() {
        if (_CreditCard != null) return _CreditCard!!
        
        _CreditCard = ImageVector.Builder(
            name = "credit-card",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 576f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(527.9f, 32f)
                horizontalLineTo(48.1f)
                curveTo(21.5f, 32f, 0f, 53.5f, 0f, 80f)
                verticalLineToRelative(352f)
                curveToRelative(0f, 26.5f, 21.5f, 48f, 48.1f, 48f)
                horizontalLineToRelative(479.8f)
                curveToRelative(26.6f, 0f, 48.1f, -21.5f, 48.1f, -48f)
                verticalLineTo(80f)
                curveToRelative(0f, -26.5f, -21.5f, -48f, -48.1f, -48f)
                close()
                moveTo(54.1f, 80f)
                horizontalLineToRelative(467.8f)
                curveToRelative(3.3f, 0f, 6f, 2.7f, 6f, 6f)
                verticalLineToRelative(42f)
                horizontalLineTo(48.1f)
                verticalLineTo(86f)
                curveToRelative(0f, -3.3f, 2.7f, -6f, 6f, -6f)
                close()
                moveToRelative(467.8f, 352f)
                horizontalLineTo(54.1f)
                curveToRelative(-3.3f, 0f, -6f, -2.7f, -6f, -6f)
                verticalLineTo(256f)
                horizontalLineToRelative(479.8f)
                verticalLineToRelative(170f)
                curveToRelative(0f, 3.3f, -2.7f, 6f, -6f, 6f)
                close()
                moveTo(192f, 332f)
                verticalLineToRelative(40f)
                curveToRelative(0f, 6.6f, -5.4f, 12f, -12f, 12f)
                horizontalLineToRelative(-72f)
                curveToRelative(-6.6f, 0f, -12f, -5.4f, -12f, -12f)
                verticalLineToRelative(-40f)
                curveToRelative(0f, -6.6f, 5.4f, -12f, 12f, -12f)
                horizontalLineToRelative(72f)
                curveToRelative(6.6f, 0f, 12f, 5.4f, 12f, 12f)
                close()
                moveToRelative(192f, 0f)
                verticalLineToRelative(40f)
                curveToRelative(0f, 6.6f, -5.4f, 12f, -12f, 12f)
                horizontalLineTo(236f)
                curveToRelative(-6.6f, 0f, -12f, -5.4f, -12f, -12f)
                verticalLineToRelative(-40f)
                curveToRelative(0f, -6.6f, 5.4f, -12f, 12f, -12f)
                horizontalLineToRelative(136f)
                curveToRelative(6.6f, 0f, 12f, 5.4f, 12f, 12f)
                close()
            }
        }.build()
        
        return _CreditCard!!
    }

private var _CreditCard: ImageVector? = null

