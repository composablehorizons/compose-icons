package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Leanpub: ImageVector
    get() {
        if (_Leanpub != null) return _Leanpub!!
        
        _Leanpub = ImageVector.Builder(
            name = "leanpub",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 576f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(386.539f, 111.485f)
                lineToRelative(15.096f, 248.955f)
                lineToRelative(-10.979f, -0.275f)
                curveToRelative(-36.232f, -0.824f, -71.64f, 8.783f, -102.657f, 27.997f)
                curveToRelative(-31.016f, -19.214f, -66.424f, -27.997f, -102.657f, -27.997f)
                curveToRelative(-45.564f, 0f, -82.07f, 10.705f, -123.516f, 27.723f)
                lineTo(93.117f, 129.6f)
                curveToRelative(28.546f, -11.803f, 61.484f, -18.115f, 92.226f, -18.115f)
                curveToRelative(41.173f, 0f, 73.836f, 13.175f, 102.657f, 42.544f)
                curveToRelative(27.723f, -28.271f, 59.013f, -41.721f, 98.539f, -42.544f)
                close()
                moveTo(569.07f, 448f)
                curveToRelative(-25.526f, 0f, -47.485f, -5.215f, -70.542f, -15.645f)
                curveToRelative(-34.31f, -15.645f, -69.993f, -24.978f, -107.871f, -24.978f)
                curveToRelative(-38.977f, 0f, -74.934f, 12.901f, -102.657f, 40.623f)
                curveToRelative(-27.723f, -27.723f, -63.68f, -40.623f, -102.657f, -40.623f)
                curveToRelative(-37.878f, 0f, -73.561f, 9.333f, -107.871f, 24.978f)
                curveTo(55.239f, 442.236f, 32.731f, 448f, 8.303f, 448f)
                horizontalLineTo(6.93f)
                lineTo(49.475f, 98.859f)
                curveTo(88.726f, 76.626f, 136.486f, 64f, 181.775f, 64f)
                curveTo(218.83f, 64f, 256.984f, 71.685f, 288f, 93.095f)
                curveTo(319.016f, 71.685f, 357.17f, 64f, 394.225f, 64f)
                curveToRelative(45.289f, 0f, 93.049f, 12.626f, 132.3f, 34.859f)
                lineTo(569.07f, 448f)
                close()
                moveToRelative(-43.368f, -44.741f)
                lineToRelative(-34.036f, -280.246f)
                curveToRelative(-30.742f, -13.999f, -67.248f, -21.41f, -101.009f, -21.41f)
                curveToRelative(-38.428f, 0f, -74.385f, 12.077f, -102.657f, 38.702f)
                curveToRelative(-28.272f, -26.625f, -64.228f, -38.702f, -102.657f, -38.702f)
                curveToRelative(-33.761f, 0f, -70.267f, 7.411f, -101.009f, 21.41f)
                lineTo(50.298f, 403.259f)
                curveToRelative(47.211f, -19.487f, 82.894f, -33.486f, 135.045f, -33.486f)
                curveToRelative(37.604f, 0f, 70.817f, 9.606f, 102.657f, 29.644f)
                curveToRelative(31.84f, -20.038f, 65.052f, -29.644f, 102.657f, -29.644f)
                curveToRelative(52.151f, 0f, 87.834f, 13.999f, 135.045f, 33.486f)
                close()
            }
        }.build()
        
        return _Leanpub!!
    }

private var _Leanpub: ImageVector? = null

