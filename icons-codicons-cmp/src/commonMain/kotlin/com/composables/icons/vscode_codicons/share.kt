package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Share: ImageVector
    get() {
        if (_Share != null) return _Share!!
        
        _Share = ImageVector.Builder(
            name = "share",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.307f, 1.10533f)
                curveTo(11.1562f, 0.988085f, 10.9519f, 0.966945f, 10.7803f, 1.05085f)
                curveTo(10.6088f, 1.13475f, 10.5f, 1.30904f, 10.5f, 1.5f)
                verticalLineTo(3.49274f)
                curveTo(10.4571f, 3.49456f, 10.4122f, 3.49701f, 10.3654f, 3.5002f)
                curveTo(9.96247f, 3.52766f, 9.41128f, 3.61105f, 8.82119f, 3.83704f)
                curveTo(8.11343f, 4.10809f, 7.34877f, 4.58508f, 6.72601f, 5.41126f)
                curveTo(6.10338f, 6.23727f, 5.64499f, 7.38259f, 5.50206f, 8.95474f)
                curveTo(5.48301f, 9.16438f, 5.5973f, 9.36351f, 5.78793f, 9.4528f)
                curveTo(5.97857f, 9.54209f, 6.20471f, 9.50241f, 6.35356f, 9.35356f)
                curveTo(7.54248f, 8.16464f, 8.72298f, 7.57773f, 9.59562f, 7.28685f)
                curveTo(9.9558f, 7.16679f, 10.2643f, 7.09693f, 10.5f, 7.0563f)
                verticalLineTo(9f)
                curveTo(10.5f, 9.1969f, 10.6156f, 9.37546f, 10.7952f, 9.45612f)
                curveTo(10.9748f, 9.53678f, 11.185f, 9.50452f, 11.3322f, 9.37371f)
                lineTo(15.8322f, 5.37371f)
                curveTo(15.9432f, 5.27502f, 16.0046f, 5.13207f, 15.9997f, 4.98361f)
                curveTo(15.9949f, 4.83514f, 15.9242f, 4.69653f, 15.807f, 4.60533f)
                lineTo(11.307f, 1.10533f)
                close()
                moveTo(10.9429f, 4.49679f)
                lineTo(10.9457f, 4.49705f)
                curveTo(11.0865f, 4.51223f, 11.2279f, 4.46706f, 11.3335f, 4.37257f)
                curveTo(11.4394f, 4.27772f, 11.5f, 4.14223f, 11.5f, 4f)
                verticalLineTo(2.52232f)
                lineTo(14.7186f, 5.02564f)
                lineTo(11.5f, 7.88658f)
                verticalLineTo(6.5f)
                curveTo(11.5f, 6.22386f, 11.2762f, 6f, 11f, 6f)
                lineTo(10.9989f, 6f)
                lineTo(10.9976f, 6.00001f)
                lineTo(10.9943f, 6.00003f)
                lineTo(10.9848f, 6.00014f)
                lineTo(10.9552f, 6.00087f)
                curveTo(10.9307f, 6.00166f, 10.897f, 6.00316f, 10.8544f, 6.00599f)
                curveTo(10.7695f, 6.01166f, 10.6495f, 6.02268f, 10.4996f, 6.04409f)
                curveTo(10.1999f, 6.08691f, 9.77971f, 6.17139f, 9.2794f, 6.33816f)
                curveTo(8.55493f, 6.57965f, 7.66479f, 6.99299f, 6.7319f, 7.69863f)
                curveTo(6.9264f, 6.98158f, 7.2077f, 6.43355f, 7.52456f, 6.01319f)
                curveTo(8.01593f, 5.36132f, 8.61523f, 4.98675f, 9.17883f, 4.7709f)
                curveTo(9.65371f, 4.58903f, 10.1025f, 4.52044f, 10.4334f, 4.49788f)
                curveTo(10.5981f, 4.48666f, 10.7314f, 4.48699f, 10.8211f, 4.48988f)
                curveTo(10.866f, 4.49133f, 10.8997f, 4.49341f, 10.9209f, 4.49498f)
                lineTo(10.9429f, 4.49679f)
                close()
                moveTo(3.5f, 2f)
                curveTo(2.11929f, 2f, 1f, 3.11929f, 1f, 4.5f)
                verticalLineTo(12.5f)
                curveTo(1f, 13.8807f, 2.11929f, 15f, 3.5f, 15f)
                horizontalLineTo(11.5f)
                curveTo(12.8807f, 15f, 14f, 13.8807f, 14f, 12.5f)
                verticalLineTo(9.5f)
                curveTo(14f, 9.22386f, 13.7761f, 9f, 13.5f, 9f)
                curveTo(13.2239f, 9f, 13f, 9.22386f, 13f, 9.5f)
                verticalLineTo(12.5f)
                curveTo(13f, 13.3284f, 12.3284f, 14f, 11.5f, 14f)
                horizontalLineTo(3.5f)
                curveTo(2.67157f, 14f, 2f, 13.3284f, 2f, 12.5f)
                verticalLineTo(4.5f)
                curveTo(2f, 3.67157f, 2.67157f, 3f, 3.5f, 3f)
                horizontalLineTo(7.5f)
                curveTo(7.77614f, 3f, 8f, 2.77614f, 8f, 2.5f)
                curveTo(8f, 2.22386f, 7.77614f, 2f, 7.5f, 2f)
                horizontalLineTo(3.5f)
                close()
            }
        }.build()
        
        return _Share!!
    }

private var _Share: ImageVector? = null

