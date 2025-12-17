package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.CurrencyBitcoin: ImageVector
    get() {
        if (_CurrencyBitcoin != null) return _CurrencyBitcoin!!
        
        _CurrencyBitcoin = ImageVector.Builder(
            name = "currency-bitcoin",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5.5f, 13f)
                verticalLineToRelative(1.25f)
                curveToRelative(0f, 0.138f, 0.112f, 0.25f, 0.25f, 0.25f)
                horizontalLineToRelative(1f)
                arcToRelative(0.25f, 0.25f, 0f, false, false, 0.25f, -0.25f)
                verticalLineTo(13f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(1.25f)
                curveToRelative(0f, 0.138f, 0.112f, 0.25f, 0.25f, 0.25f)
                horizontalLineToRelative(1f)
                arcToRelative(0.25f, 0.25f, 0f, false, false, 0.25f, -0.25f)
                verticalLineTo(13f)
                horizontalLineToRelative(0.084f)
                curveToRelative(1.992f, 0f, 3.416f, -1.033f, 3.416f, -2.82f)
                curveToRelative(0f, -1.502f, -1.007f, -2.323f, -2.186f, -2.44f)
                verticalLineToRelative(-0.088f)
                curveToRelative(0.97f, -0.242f, 1.683f, -0.974f, 1.683f, -2.19f)
                curveTo(11.997f, 3.93f, 10.847f, 3f, 9.092f, 3f)
                horizontalLineTo(9f)
                verticalLineTo(1.75f)
                arcToRelative(0.25f, 0.25f, 0f, false, false, -0.25f, -0.25f)
                horizontalLineToRelative(-1f)
                arcToRelative(0.25f, 0.25f, 0f, false, false, -0.25f, 0.25f)
                verticalLineTo(3f)
                horizontalLineToRelative(-0.573f)
                verticalLineTo(1.75f)
                arcToRelative(0.25f, 0.25f, 0f, false, false, -0.25f, -0.25f)
                horizontalLineTo(5.75f)
                arcToRelative(0.25f, 0.25f, 0f, false, false, -0.25f, 0.25f)
                verticalLineTo(3f)
                lineToRelative(-1.998f, 0.011f)
                arcToRelative(0.25f, 0.25f, 0f, false, false, -0.25f, 0.25f)
                verticalLineToRelative(0.989f)
                curveToRelative(0f, 0.137f, 0.11f, 0.25f, 0.248f, 0.25f)
                lineToRelative(0.755f, -0.005f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.745f, 0.75f)
                verticalLineToRelative(5.505f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.75f, 0.75f)
                lineToRelative(-0.748f, 0.011f)
                arcToRelative(0.25f, 0.25f, 0f, false, false, -0.25f, 0.25f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.138f, 0.112f, 0.25f, 0.25f, 0.25f)
                close()
                moveToRelative(1.427f, -8.513f)
                horizontalLineToRelative(1.719f)
                curveToRelative(0.906f, 0f, 1.438f, 0.498f, 1.438f, 1.312f)
                curveToRelative(0f, 0.871f, -0.575f, 1.362f, -1.877f, 1.362f)
                horizontalLineToRelative(-1.28f)
                close()
                moveToRelative(0f, 4.051f)
                horizontalLineToRelative(1.84f)
                curveToRelative(1.137f, 0f, 1.756f, 0.58f, 1.756f, 1.524f)
                curveToRelative(0f, 0.953f, -0.626f, 1.45f, -2.158f, 1.45f)
                horizontalLineTo(6.927f)
                close()
            }
        }.build()
        
        return _CurrencyBitcoin!!
    }

private var _CurrencyBitcoin: ImageVector? = null

