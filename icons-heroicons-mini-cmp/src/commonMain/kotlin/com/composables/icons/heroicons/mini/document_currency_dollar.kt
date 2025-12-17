package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.DocumentCurrencyDollar: ImageVector
    get() {
        if (_DocumentCurrencyDollar != null) return _DocumentCurrencyDollar!!
        
        _DocumentCurrencyDollar = ImageVector.Builder(
            name = "document-currency-dollar",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.5f, 2f)
                arcTo(1.5f, 1.5f, 0f, false, false, 3f, 3.5f)
                verticalLineToRelative(13f)
                arcTo(1.5f, 1.5f, 0f, false, false, 4.5f, 18f)
                horizontalLineToRelative(11f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 1.5f, -1.5f)
                verticalLineTo(7.621f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, -0.44f, -1.06f)
                lineToRelative(-4.12f, -4.122f)
                arcTo(1.5f, 1.5f, 0f, false, false, 11.378f, 2f)
                horizontalLineTo(4.5f)
                close()
                moveToRelative(6.25f, 3.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.5f, 0f)
                verticalLineToRelative(0.272f)
                curveToRelative(-0.418f, 0.024f, -0.831f, 0.069f, -1.238f, 0.132f)
                curveToRelative(-0.962f, 0.15f, -1.807f, 0.882f, -1.95f, 1.928f)
                curveToRelative(-0.04f, 0.3f, -0.062f, 0.607f, -0.062f, 0.918f)
                curveToRelative(0f, 1.044f, 0.83f, 1.759f, 1.708f, 1.898f)
                lineToRelative(1.542f, 0.243f)
                verticalLineToRelative(2.334f)
                arcToRelative(11.214f, 11.214f, 0f, false, true, -2.297f, -0.392f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.405f, 1.444f)
                curveToRelative(0.867f, 0.243f, 1.772f, 0.397f, 2.702f, 0.451f)
                verticalLineToRelative(0.272f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.5f, 0f)
                verticalLineToRelative(-0.272f)
                curveToRelative(0.419f, -0.024f, 0.832f, -0.069f, 1.239f, -0.132f)
                curveToRelative(0.961f, -0.15f, 1.807f, -0.882f, 1.95f, -1.928f)
                curveToRelative(0.04f, -0.3f, 0.061f, -0.607f, 0.061f, -0.918f)
                curveToRelative(0f, -1.044f, -0.83f, -1.759f, -1.708f, -1.898f)
                lineTo(10.75f, 9.86f)
                verticalLineTo(7.525f)
                curveToRelative(0.792f, 0.052f, 1.56f, 0.185f, 2.297f, 0.392f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.406f, -1.444f)
                arcToRelative(12.723f, 12.723f, 0f, false, false, -2.703f, -0.451f)
                verticalLineTo(5.75f)
                close()
                moveTo(8.244f, 7.636f)
                curveToRelative(0.33f, -0.052f, 0.666f, -0.09f, 1.006f, -0.111f)
                verticalLineToRelative(2.097f)
                lineToRelative(-1.308f, -0.206f)
                curveTo(7.635f, 9.367f, 7.5f, 9.156f, 7.5f, 9f)
                curveToRelative(0f, -0.243f, 0.017f, -0.482f, 0.049f, -0.716f)
                curveToRelative(0.042f, -0.309f, 0.305f, -0.587f, 0.695f, -0.648f)
                close()
                moveToRelative(2.506f, 5.84f)
                verticalLineToRelative(-2.098f)
                lineToRelative(1.308f, 0.206f)
                curveToRelative(0.307f, 0.049f, 0.442f, 0.26f, 0.442f, 0.416f)
                curveToRelative(0f, 0.243f, -0.016f, 0.482f, -0.048f, 0.716f)
                curveToRelative(-0.042f, 0.309f, -0.306f, 0.587f, -0.695f, 0.648f)
                curveToRelative(-0.331f, 0.052f, -0.667f, 0.09f, -1.007f, 0.111f)
                close()
            }
        }.build()
        
        return _DocumentCurrencyDollar!!
    }

private var _DocumentCurrencyDollar: ImageVector? = null

