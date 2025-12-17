package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.CurrencyDollar: ImageVector
    get() {
        if (_CurrencyDollar != null) return _CurrencyDollar!!
        
        _CurrencyDollar = ImageVector.Builder(
            name = "currency-dollar",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.75f, 10.818f)
                verticalLineToRelative(2.614f)
                arcTo(3.13f, 3.13f, 0f, false, false, 11.888f, 13f)
                curveToRelative(0.482f, -0.315f, 0.612f, -0.648f, 0.612f, -0.875f)
                curveToRelative(0f, -0.227f, -0.13f, -0.56f, -0.612f, -0.875f)
                arcToRelative(3.13f, 3.13f, 0f, false, false, -1.138f, -0.432f)
                close()
                moveTo(8.33f, 8.62f)
                curveToRelative(0.053f, 0.055f, 0.115f, 0.11f, 0.184f, 0.164f)
                curveToRelative(0.208f, 0.16f, 0.46f, 0.284f, 0.736f, 0.363f)
                verticalLineTo(6.603f)
                arcToRelative(2.45f, 2.45f, 0f, false, false, -0.35f, 0.13f)
                curveToRelative(-0.14f, 0.065f, -0.27f, 0.143f, -0.386f, 0.233f)
                curveToRelative(-0.377f, 0.292f, -0.514f, 0.627f, -0.514f, 0.909f)
                curveToRelative(0f, 0.184f, 0.058f, 0.39f, 0.202f, 0.592f)
                curveToRelative(0.037f, 0.051f, 0.08f, 0.102f, 0.128f, 0.152f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(18f, 10f)
                arcToRelative(8f, 8f, 0f, true, true, -16f, 0f)
                arcToRelative(8f, 8f, 0f, false, true, 16f, 0f)
                close()
                moveToRelative(-8f, -6f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, 0.75f)
                verticalLineToRelative(0.316f)
                arcToRelative(3.78f, 3.78f, 0f, false, true, 1.653f, 0.713f)
                curveToRelative(0.426f, 0.33f, 0.744f, 0.74f, 0.925f, 1.2f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.395f, 0.55f)
                arcToRelative(1.35f, 1.35f, 0f, false, false, -0.447f, -0.563f)
                arcToRelative(2.187f, 2.187f, 0f, false, false, -0.736f, -0.363f)
                verticalLineTo(9.3f)
                curveToRelative(0.698f, 0.093f, 1.383f, 0.32f, 1.959f, 0.696f)
                curveToRelative(0.787f, 0.514f, 1.29f, 1.27f, 1.29f, 2.13f)
                curveToRelative(0f, 0.86f, -0.504f, 1.616f, -1.29f, 2.13f)
                curveToRelative(-0.576f, 0.377f, -1.261f, 0.603f, -1.96f, 0.696f)
                verticalLineToRelative(0.299f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -1.5f, 0f)
                verticalLineToRelative(-0.3f)
                curveToRelative(-0.697f, -0.092f, -1.382f, -0.318f, -1.958f, -0.695f)
                curveToRelative(-0.482f, -0.315f, -0.857f, -0.717f, -1.078f, -1.188f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, 1.359f, -0.636f)
                curveToRelative(0.08f, 0.173f, 0.245f, 0.376f, 0.54f, 0.569f)
                curveToRelative(0.313f, 0.205f, 0.706f, 0.353f, 1.138f, 0.432f)
                verticalLineToRelative(-2.748f)
                arcToRelative(3.782f, 3.782f, 0f, false, true, -1.653f, -0.713f)
                curveTo(6.9f, 9.433f, 6.5f, 8.681f, 6.5f, 7.875f)
                curveToRelative(0f, -0.805f, 0.4f, -1.558f, 1.097f, -2.096f)
                arcToRelative(3.78f, 3.78f, 0f, false, true, 1.653f, -0.713f)
                verticalLineTo(4.75f)
                arcTo(0.75f, 0.75f, 0f, false, true, 10f, 4f)
                close()
            }
        }.build()
        
        return _CurrencyDollar!!
    }

private var _CurrencyDollar: ImageVector? = null

