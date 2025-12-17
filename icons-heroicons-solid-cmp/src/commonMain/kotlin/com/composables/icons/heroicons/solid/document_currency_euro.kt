package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.DocumentCurrencyEuro: ImageVector
    get() {
        if (_DocumentCurrencyEuro != null) return _DocumentCurrencyEuro!!
        
        _DocumentCurrencyEuro = ImageVector.Builder(
            name = "document-currency-euro",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.75f, 3.375f)
                curveToRelative(0f, -1.036f, 0.84f, -1.875f, 1.875f, -1.875f)
                horizontalLineTo(9f)
                arcToRelative(3.75f, 3.75f, 0f, false, true, 3.75f, 3.75f)
                verticalLineToRelative(1.875f)
                curveToRelative(0f, 1.036f, 0.84f, 1.875f, 1.875f, 1.875f)
                horizontalLineTo(16.5f)
                arcToRelative(3.75f, 3.75f, 0f, false, true, 3.75f, 3.75f)
                verticalLineToRelative(7.875f)
                curveToRelative(0f, 1.035f, -0.84f, 1.875f, -1.875f, 1.875f)
                horizontalLineTo(5.625f)
                arcToRelative(1.875f, 1.875f, 0f, false, true, -1.875f, -1.875f)
                verticalLineTo(3.375f)
                close()
                moveToRelative(7.464f, 9.442f)
                curveToRelative(0.459f, -0.573f, 1.019f, -0.817f, 1.536f, -0.817f)
                curveToRelative(0.517f, 0f, 1.077f, 0.244f, 1.536f, 0.817f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 1.171f, -0.937f)
                curveToRelative(-0.713f, -0.892f, -1.689f, -1.38f, -2.707f, -1.38f)
                curveToRelative(-1.018f, 0f, -1.994f, 0.488f, -2.707f, 1.38f)
                arcToRelative(4.61f, 4.61f, 0f, false, false, -0.705f, 1.245f)
                horizontalLineTo(8.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                horizontalLineToRelative(0.763f)
                curveToRelative(-0.017f, 0.25f, -0.017f, 0.5f, 0f, 0.75f)
                horizontalLineTo(8.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                horizontalLineToRelative(1.088f)
                curveToRelative(0.17f, 0.449f, 0.406f, 0.87f, 0.705f, 1.245f)
                curveToRelative(0.713f, 0.892f, 1.689f, 1.38f, 2.707f, 1.38f)
                curveToRelative(1.018f, 0f, 1.994f, -0.488f, 2.707f, -1.38f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.171f, -0.937f)
                curveToRelative(-0.459f, 0.573f, -1.019f, 0.817f, -1.536f, 0.817f)
                curveToRelative(-0.517f, 0f, -1.077f, -0.244f, -1.536f, -0.817f)
                curveToRelative(-0.078f, -0.098f, -0.15f, -0.2f, -0.215f, -0.308f)
                horizontalLineToRelative(1.751f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.5f)
                horizontalLineToRelative(-2.232f)
                arcToRelative(3.965f, 3.965f, 0f, false, true, 0f, -0.75f)
                horizontalLineToRelative(2.232f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.5f)
                horizontalLineTo(11f)
                curveToRelative(0.065f, -0.107f, 0.136f, -0.21f, 0.214f, -0.308f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14.25f, 5.25f)
                arcToRelative(5.23f, 5.23f, 0f, false, false, -1.279f, -3.434f)
                arcToRelative(9.768f, 9.768f, 0f, false, true, 6.963f, 6.963f)
                arcTo(5.23f, 5.23f, 0f, false, false, 16.5f, 7.5f)
                horizontalLineToRelative(-1.875f)
                arcToRelative(0.375f, 0.375f, 0f, false, true, -0.375f, -0.375f)
                verticalLineTo(5.25f)
                close()
            }
        }.build()
        
        return _DocumentCurrencyEuro!!
    }

private var _DocumentCurrencyEuro: ImageVector? = null

