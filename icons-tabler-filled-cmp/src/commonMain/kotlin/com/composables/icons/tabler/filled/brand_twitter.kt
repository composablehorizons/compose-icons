package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.BrandTwitter: ImageVector
    get() {
        if (_BrandTwitter != null) return _BrandTwitter!!
        
        _BrandTwitter = ImageVector.Builder(
            name = "brand-twitter",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14.058f, 3.41f)
                curveToRelative(-1.807f, 0.767f, -2.995f, 2.453f, -3.056f, 4.38f)
                lineToRelative(-0.002f, 0.182f)
                lineToRelative(-0.243f, -0.023f)
                curveToRelative(-2.392f, -0.269f, -4.498f, -1.512f, -5.944f, -3.531f)
                arcToRelative(1f, 1f, 0f, false, false, -1.685f, 0.092f)
                lineToRelative(-0.097f, 0.186f)
                lineToRelative(-0.049f, 0.099f)
                curveToRelative(-0.719f, 1.485f, -1.19f, 3.29f, -1.017f, 5.203f)
                lineToRelative(0.03f, 0.273f)
                curveToRelative(0.283f, 2.263f, 1.5f, 4.215f, 3.779f, 5.679f)
                lineToRelative(0.173f, 0.107f)
                lineToRelative(-0.081f, 0.043f)
                curveToRelative(-1.315f, 0.663f, -2.518f, 0.952f, -3.827f, 0.9f)
                curveToRelative(-1.056f, -0.04f, -1.446f, 1.372f, -0.518f, 1.878f)
                curveToRelative(3.598f, 1.961f, 7.461f, 2.566f, 10.792f, 1.6f)
                curveToRelative(4.06f, -1.18f, 7.152f, -4.223f, 8.335f, -8.433f)
                lineToRelative(0.127f, -0.495f)
                curveToRelative(0.238f, -0.993f, 0.372f, -2.006f, 0.401f, -3.024f)
                lineToRelative(0.003f, -0.332f)
                lineToRelative(0.393f, -0.779f)
                lineToRelative(0.44f, -0.862f)
                lineToRelative(0.214f, -0.434f)
                lineToRelative(0.118f, -0.247f)
                curveToRelative(0.265f, -0.565f, 0.456f, -1.033f, 0.574f, -1.43f)
                lineToRelative(0.014f, -0.056f)
                lineToRelative(0.008f, -0.018f)
                curveToRelative(0.22f, -0.593f, -0.166f, -1.358f, -0.941f, -1.358f)
                lineToRelative(-0.122f, 0.007f)
                arcToRelative(0.997f, 0.997f, 0f, false, false, -0.231f, 0.057f)
                lineToRelative(-0.086f, 0.038f)
                arcToRelative(7.46f, 7.46f, 0f, false, true, -0.88f, 0.36f)
                lineToRelative(-0.356f, 0.115f)
                lineToRelative(-0.271f, 0.08f)
                lineToRelative(-0.772f, 0.214f)
                curveToRelative(-1.336f, -1.118f, -3.144f, -1.254f, -5.012f, -0.554f)
                lineToRelative(-0.211f, 0.084f)
                close()
            }
        }.build()
        
        return _BrandTwitter!!
    }

private var _BrandTwitter: ImageVector? = null

