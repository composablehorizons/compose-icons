package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.BrandPaypal: ImageVector
    get() {
        if (_BrandPaypal != null) return _BrandPaypal!!
        
        _BrandPaypal = ImageVector.Builder(
            name = "brand-paypal",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.5f, 2f)
                curveToRelative(3.113f, 0f, 5.309f, 1.785f, 5.863f, 4.565f)
                curveToRelative(1.725f, 1.185f, 2.637f, 3.152f, 2.637f, 5.435f)
                curveToRelative(0f, 2.933f, -2.748f, 5.384f, -5.783f, 5.496f)
                lineToRelative(-0.217f, 0.004f)
                horizontalLineToRelative(-1.754f)
                lineToRelative(-0.466f, 2.8f)
                arcToRelative(1.998f, 1.998f, 0f, false, true, -1.823f, 1.597f)
                lineToRelative(-0.157f, 0.003f)
                horizontalLineToRelative(-2.68f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -1.182f, -0.54f)
                arcToRelative(1.495f, 1.495f, 0f, false, true, -0.348f, -1.07f)
                lineToRelative(0.042f, -0.29f)
                horizontalLineToRelative(-1.632f)
                curveToRelative(-1.004f, 0f, -1.914f, -0.864f, -1.994f, -1.857f)
                lineToRelative(-0.006f, -0.143f)
                lineToRelative(0.01f, -0.141f)
                lineToRelative(1.993f, -13.954f)
                lineToRelative(0.003f, -0.048f)
                curveToRelative(0.072f, -0.894f, 0.815f, -1.682f, 1.695f, -1.832f)
                lineToRelative(0.156f, -0.02f)
                lineToRelative(0.143f, -0.005f)
                horizontalLineToRelative(5.5f)
                close()
                moveToRelative(5.812f, 7.35f)
                lineToRelative(-0.024f, 0.087f)
                curveToRelative(-0.706f, 2.403f, -3.072f, 4.436f, -5.555f, 4.557f)
                lineToRelative(-0.233f, 0.006f)
                horizontalLineToRelative(-2.503f)
                verticalLineToRelative(0.05f)
                lineToRelative(-0.025f, 0.183f)
                lineToRelative(-1.2f, 5f)
                arcToRelative(1.007f, 1.007f, 0f, false, true, -0.019f, 0.07f)
                lineToRelative(-0.088f, 0.597f)
                horizontalLineToRelative(2.154f)
                lineToRelative(0.595f, -3.564f)
                arcToRelative(1f, 1f, 0f, false, true, 0.865f, -0.829f)
                lineToRelative(0.121f, -0.007f)
                horizontalLineToRelative(2.6f)
                curveToRelative(2.073f, 0f, 4f, -1.67f, 4f, -3.5f)
                curveToRelative(0f, -1.022f, -0.236f, -1.924f, -0.688f, -2.65f)
                close()
            }
        }.build()
        
        return _BrandPaypal!!
    }

private var _BrandPaypal: ImageVector? = null

