package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.CurrencyDollar: ImageVector
    get() {
        if (_CurrencyDollar != null) return _CurrencyDollar!!
        
        _CurrencyDollar = ImageVector.Builder(
            name = "currency-dollar",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4f, 10.781f)
                curveToRelative(0.148f, 1.667f, 1.513f, 2.85f, 3.591f, 3.003f)
                verticalLineTo(15f)
                horizontalLineToRelative(1.043f)
                verticalLineToRelative(-1.216f)
                curveToRelative(2.27f, -0.179f, 3.678f, -1.438f, 3.678f, -3.3f)
                curveToRelative(0f, -1.59f, -0.947f, -2.51f, -2.956f, -3.028f)
                lineToRelative(-0.722f, -0.187f)
                verticalLineTo(3.467f)
                curveToRelative(1.122f, 0.11f, 1.879f, 0.714f, 2.07f, 1.616f)
                horizontalLineToRelative(1.47f)
                curveToRelative(-0.166f, -1.6f, -1.54f, -2.748f, -3.54f, -2.875f)
                verticalLineTo(1f)
                horizontalLineTo(7.591f)
                verticalLineToRelative(1.233f)
                curveToRelative(-1.939f, 0.23f, -3.27f, 1.472f, -3.27f, 3.156f)
                curveToRelative(0f, 1.454f, 0.966f, 2.483f, 2.661f, 2.917f)
                lineToRelative(0.61f, 0.162f)
                verticalLineToRelative(4.031f)
                curveToRelative(-1.149f, -0.17f, -1.94f, -0.8f, -2.131f, -1.718f)
                close()
                moveToRelative(3.391f, -3.836f)
                curveToRelative(-1.043f, -0.263f, -1.6f, -0.825f, -1.6f, -1.616f)
                curveToRelative(0f, -0.944f, 0.704f, -1.641f, 1.8f, -1.828f)
                verticalLineToRelative(3.495f)
                lineToRelative(-0.2f, -0.05f)
                close()
                moveToRelative(1.591f, 1.872f)
                curveToRelative(1.287f, 0.323f, 1.852f, 0.859f, 1.852f, 1.769f)
                curveToRelative(0f, 1.097f, -0.826f, 1.828f, -2.2f, 1.939f)
                verticalLineTo(8.73f)
                close()
            }
        }.build()
        
        return _CurrencyDollar!!
    }

private var _CurrencyDollar: ImageVector? = null

