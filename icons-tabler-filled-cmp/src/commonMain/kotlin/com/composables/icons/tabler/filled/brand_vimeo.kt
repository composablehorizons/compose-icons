package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.BrandVimeo: ImageVector
    get() {
        if (_BrandVimeo != null) return _BrandVimeo!!
        
        _BrandVimeo = ImageVector.Builder(
            name = "brand-vimeo",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(18.5f, 3f)
                curveToRelative(2.38f, 0f, 3.985f, 2.174f, 3.486f, 5.164f)
                curveToRelative(-0.535f, 3.21f, -2.25f, 6.074f, -4.808f, 8.675f)
                curveToRelative(-1.277f, 1.298f, -2.211f, 2.061f, -4.112f, 3.485f)
                curveToRelative(-2.323f, 1.597f, -4.408f, 0.365f, -5.47f, -1.897f)
                curveToRelative(-0.292f, -0.618f, -0.586f, -1.724f, -1.248f, -4.477f)
                lineToRelative(-0.03f, -0.126f)
                curveToRelative(-0.483f, -2.01f, -0.819f, -3.319f, -0.982f, -3.878f)
                lineToRelative(-0.016f, -0.052f)
                lineToRelative(-0.031f, 0.013f)
                lineToRelative(-0.13f, 0.06f)
                lineToRelative(-0.137f, 0.07f)
                arcToRelative(4f, 4f, 0f, false, false, -0.43f, 0.269f)
                arcToRelative(1f, 1f, 0f, false, true, -1.3f, -0.099f)
                lineToRelative(-1f, -1f)
                arcToRelative(1f, 1f, 0f, false, true, -0.124f, -1.262f)
                arcToRelative(20f, 20f, 0f, false, true, 1.918f, -2.382f)
                curveToRelative(0.98f, -1.037f, 1.955f, -1.816f, 2.928f, -2.233f)
                curveToRelative(0.5f, -0.214f, 0.996f, -0.33f, 1.486f, -0.33f)
                curveToRelative(2.237f, 0f, 3.02f, 1.588f, 3.567f, 4.963f)
                curveToRelative(0.03f, 0.183f, 0.057f, 0.359f, 0.112f, 0.709f)
                curveToRelative(0.123f, 0.784f, 0.197f, 1.198f, 0.292f, 1.588f)
                curveToRelative(0.292f, 1.185f, 0.528f, 1.984f, 0.735f, 2.483f)
                lineToRelative(-0.016f, -0.039f)
                lineToRelative(0.096f, -0.107f)
                curveToRelative(0.354f, -0.411f, 0.757f, -1.014f, 1.172f, -1.771f)
                lineToRelative(0.157f, -0.291f)
                curveToRelative(0.391f, -0.745f, 0.505f, -1.528f, 0.363f, -1.9f)
                curveToRelative(-0.028f, -0.073f, 0.007f, -0.065f, -0.456f, 0.218f)
                arcToRelative(1f, 1f, 0f, false, true, -1.51f, -1.013f)
                curveToRelative(0.496f, -3.053f, 2.745f, -4.84f, 5.488f, -4.84f)
            }
        }.build()
        
        return _BrandVimeo!!
    }

private var _BrandVimeo: ImageVector? = null

