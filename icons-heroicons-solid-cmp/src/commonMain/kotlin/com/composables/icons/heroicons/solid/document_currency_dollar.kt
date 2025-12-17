package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.DocumentCurrencyDollar: ImageVector
    get() {
        if (_DocumentCurrencyDollar != null) return _DocumentCurrencyDollar!!
        
        _DocumentCurrencyDollar = ImageVector.Builder(
            name = "document-currency-dollar",
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
                moveToRelative(10.5f, 1.875f)
                arcToRelative(5.23f, 5.23f, 0f, false, false, -1.279f, -3.434f)
                arcToRelative(9.768f, 9.768f, 0f, false, true, 6.963f, 6.963f)
                arcTo(5.23f, 5.23f, 0f, false, false, 16.5f, 7.5f)
                horizontalLineToRelative(-1.875f)
                arcToRelative(0.375f, 0.375f, 0f, false, true, -0.375f, -0.375f)
                verticalLineTo(5.25f)
                close()
                moveTo(12f, 10.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, 0.75f)
                verticalLineToRelative(0.028f)
                arcToRelative(9.727f, 9.727f, 0f, false, true, 1.687f, 0.28f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -0.374f, 1.452f)
                arcToRelative(8.207f, 8.207f, 0f, false, false, -1.313f, -0.226f)
                verticalLineToRelative(1.68f)
                lineToRelative(0.969f, 0.332f)
                curveToRelative(0.67f, 0.23f, 1.281f, 0.85f, 1.281f, 1.704f)
                curveToRelative(0f, 0.158f, -0.007f, 0.314f, -0.02f, 0.468f)
                curveToRelative(-0.083f, 0.931f, -0.83f, 1.582f, -1.669f, 1.695f)
                arcToRelative(9.776f, 9.776f, 0f, false, true, -0.561f, 0.059f)
                verticalLineToRelative(0.028f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.5f, 0f)
                verticalLineToRelative(-0.029f)
                arcToRelative(9.724f, 9.724f, 0f, false, true, -1.687f, -0.278f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.374f, -1.453f)
                curveToRelative(0.425f, 0.11f, 0.864f, 0.186f, 1.313f, 0.226f)
                verticalLineToRelative(-1.68f)
                lineToRelative(-0.968f, -0.332f)
                curveTo(9.612f, 14.974f, 9f, 14.354f, 9f, 13.5f)
                curveToRelative(0f, -0.158f, 0.007f, -0.314f, 0.02f, -0.468f)
                curveToRelative(0.083f, -0.931f, 0.831f, -1.582f, 1.67f, -1.694f)
                curveToRelative(0.185f, -0.025f, 0.372f, -0.045f, 0.56f, -0.06f)
                verticalLineToRelative(-0.028f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, -0.75f)
                close()
                moveToRelative(-1.11f, 2.324f)
                curveToRelative(0.119f, -0.016f, 0.239f, -0.03f, 0.36f, -0.04f)
                verticalLineToRelative(1.166f)
                lineToRelative(-0.482f, -0.165f)
                curveToRelative(-0.208f, -0.072f, -0.268f, -0.211f, -0.268f, -0.285f)
                curveToRelative(0f, -0.113f, 0.005f, -0.225f, 0.015f, -0.336f)
                curveToRelative(0.013f, -0.146f, 0.14f, -0.309f, 0.374f, -0.34f)
                close()
                moveToRelative(1.86f, 4.392f)
                verticalLineTo(16.05f)
                lineToRelative(0.482f, 0.165f)
                curveToRelative(0.208f, 0.072f, 0.268f, 0.211f, 0.268f, 0.285f)
                curveToRelative(0f, 0.113f, -0.005f, 0.225f, -0.015f, 0.336f)
                curveToRelative(-0.012f, 0.146f, -0.14f, 0.309f, -0.374f, 0.34f)
                curveToRelative(-0.12f, 0.016f, -0.24f, 0.03f, -0.361f, 0.04f)
                close()
            }
        }.build()
        
        return _DocumentCurrencyDollar!!
    }

private var _DocumentCurrencyDollar: ImageVector? = null

