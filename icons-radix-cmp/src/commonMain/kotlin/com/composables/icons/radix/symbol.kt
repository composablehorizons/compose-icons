package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.Symbol: ImageVector
    get() {
        if (_Symbol != null) return _Symbol!!
        
        _Symbol = ImageVector.Builder(
            name = "symbol",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.98782f, 1.5627f)
                curveTo(8.04093f, 1.27991f, 8.31343f, 1.09276f, 8.59622f, 1.14571f)
                lineTo(8.86478f, 1.20235f)
                curveTo(11.6292f, 1.83956f, 14.0531f, 4.23825f, 14.0533f, 7.70332f)
                curveTo(14.0532f, 9.23978f, 13.3539f, 10.4478f, 12.5376f, 11.3664f)
                curveTo(11.9526f, 12.0246f, 11.2828f, 12.5586f, 10.7447f, 12.968f)
                lineTo(12.3824f, 12.968f)
                curveTo(12.6583f, 12.9681f, 12.8823f, 13.192f, 12.8824f, 13.468f)
                curveTo(12.8824f, 13.744f, 12.6584f, 13.9678f, 12.3824f, 13.968f)
                lineTo(9.38235f, 13.968f)
                curveTo(9.10621f, 13.968f, 8.88235f, 13.7441f, 8.88235f, 13.468f)
                lineTo(8.88235f, 10.468f)
                curveTo(8.88245f, 10.1919f, 9.10627f, 9.96797f, 9.38235f, 9.96797f)
                curveTo(9.65831f, 9.96812f, 9.88226f, 10.192f, 9.88235f, 10.468f)
                lineTo(9.88235f, 12.3137f)
                lineTo(10.064f, 12.176f)
                curveTo(10.5978f, 11.7712f, 11.2158f, 11.2845f, 11.7583f, 10.674f)
                curveTo(12.4728f, 9.87008f, 13.0102f, 8.8984f, 13.0103f, 7.70332f)
                curveTo(13.0102f, 4.69156f, 10.8502f, 2.63053f, 8.40384f, 2.1711f)
                lineTo(8.30228f, 2.14082f)
                curveTo(8.07814f, 2.04925f, 7.94172f, 1.80993f, 7.98782f, 1.5627f)
                close()
                moveTo(0.86087f, 7.29707f)
                curveTo(0.860934f, 5.76063f, 1.56019f, 4.5526f, 2.37649f, 3.63399f)
                curveTo(2.96147f, 2.97581f, 3.63131f, 2.44175f, 4.16946f, 2.03242f)
                lineTo(2.53177f, 2.03242f)
                curveTo(2.25584f, 2.03226f, 2.03188f, 1.80836f, 2.03177f, 1.53242f)
                curveTo(2.03177f, 1.25639f, 2.25577f, 1.03259f, 2.53177f, 1.03242f)
                lineTo(5.53177f, 1.03242f)
                curveTo(5.80791f, 1.03243f, 6.03177f, 1.25628f, 6.03177f, 1.53242f)
                lineTo(6.03177f, 4.53242f)
                curveTo(6.03165f, 4.80847f, 5.80784f, 5.03242f, 5.53177f, 5.03242f)
                curveTo(5.25584f, 5.03226f, 5.03188f, 4.80836f, 5.03177f, 4.53242f)
                lineTo(5.03177f, 2.68672f)
                lineTo(4.85013f, 2.82442f)
                curveTo(4.31633f, 3.22915f, 3.69833f, 3.71595f, 3.15579f, 4.32637f)
                curveTo(2.44137f, 5.13031f, 1.9039f, 6.10201f, 1.90384f, 7.29707f)
                curveTo(1.904f, 10.3411f, 4.11096f, 12.4148f, 6.58939f, 12.8439f)
                curveTo(6.87267f, 12.8932f, 7.06305f, 13.1631f, 7.01419f, 13.4465f)
                curveTo(6.96502f, 13.7298f, 6.69501f, 13.9201f, 6.41165f, 13.8713f)
                curveTo(3.50007f, 13.3671f, 0.861028f, 10.9128f, 0.86087f, 7.29707f)
                close()
            }
        }.build()
        
        return _Symbol!!
    }

private var _Symbol: ImageVector? = null

