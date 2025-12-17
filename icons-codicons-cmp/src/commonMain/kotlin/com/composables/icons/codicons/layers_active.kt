package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.LayersActive: ImageVector
    get() {
        if (_LayersActive != null) return _LayersActive!!
        
        _LayersActive = ImageVector.Builder(
            name = "layers-active",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2.486f, 5.854f)
                lineTo(7.486f, 8.855f)
                curveTo(7.643f, 8.948f, 7.819f, 8.997f, 8f, 8.997f)
                curveTo(8.181f, 8.997f, 8.357f, 8.948f, 8.513f, 8.854f)
                lineTo(13.513f, 5.855f)
                curveTo(13.812f, 5.676f, 13.999f, 5.346f, 13.999f, 4.997f)
                curveTo(13.999f, 4.648f, 13.813f, 4.32f, 13.513f, 4.14f)
                lineTo(8.517f, 1.142f)
                curveTo(8.207f, 0.952f, 7.789f, 0.954f, 7.486f, 1.14f)
                lineTo(2.486f, 4.139f)
                curveTo(2.187f, 4.318f, 2f, 4.648f, 2f, 4.997f)
                curveTo(2f, 5.346f, 2.186f, 5.675f, 2.486f, 5.854f)
                close()
                moveTo(8f, 1.997f)
                lineTo(13f, 4.997f)
                lineTo(8f, 7.997f)
                lineTo(3f, 4.997f)
                lineTo(8f, 1.997f)
                close()
                moveTo(13.854f, 6.984f)
                lineTo(8f, 10.497f)
                lineTo(2.146f, 6.984f)
                curveTo(2.054f, 7.137f, 2f, 7.313f, 2f, 7.497f)
                curveTo(2f, 7.847f, 2.187f, 8.176f, 2.486f, 8.354f)
                lineTo(7.486f, 11.355f)
                curveTo(7.642f, 11.448f, 7.819f, 11.497f, 8f, 11.497f)
                curveTo(8.181f, 11.497f, 8.357f, 11.448f, 8.514f, 11.354f)
                lineTo(9.868f, 10.542f)
                curveTo(10.468f, 9.779f, 11.33f, 9.238f, 12.326f, 9.068f)
                lineTo(13.514f, 8.355f)
                curveTo(13.814f, 8.175f, 14f, 7.846f, 14f, 7.497f)
                curveTo(14f, 7.314f, 13.946f, 7.138f, 13.854f, 6.984f)
                close()
                moveTo(8f, 12.997f)
                lineTo(2.146f, 9.484f)
                curveTo(2.054f, 9.637f, 2f, 9.813f, 2f, 9.997f)
                curveTo(2f, 10.347f, 2.187f, 10.676f, 2.486f, 10.854f)
                lineTo(7.486f, 13.855f)
                curveTo(7.642f, 13.948f, 7.819f, 13.997f, 8f, 13.997f)
                curveTo(8.181f, 13.997f, 8.357f, 13.948f, 8.514f, 13.854f)
                lineTo(9.054f, 13.53f)
                curveTo(9.03f, 13.355f, 9f, 13.181f, 9f, 12.999f)
                curveTo(9f, 12.779f, 9.031f, 12.568f, 9.065f, 12.357f)
                lineTo(8f, 12.997f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13f, 10f)
                curveTo(11.343f, 10f, 10f, 11.343f, 10f, 13f)
                curveTo(10f, 14.657f, 11.343f, 16f, 13f, 16f)
                curveTo(14.657f, 16f, 16f, 14.657f, 16f, 13f)
                curveTo(16f, 11.343f, 14.657f, 10f, 13f, 10f)
                close()
                moveTo(14.604f, 12.604f)
                lineTo(12.854f, 14.354f)
                curveTo(12.756f, 14.452f, 12.628f, 14.5f, 12.5f, 14.5f)
                curveTo(12.372f, 14.5f, 12.244f, 14.451f, 12.146f, 14.354f)
                lineTo(11.146f, 13.354f)
                curveTo(10.951f, 13.159f, 10.951f, 12.842f, 11.146f, 12.647f)
                curveTo(11.341f, 12.452f, 11.658f, 12.452f, 11.853f, 12.647f)
                lineTo(12.499f, 13.293f)
                lineTo(13.895f, 11.897f)
                curveTo(14.09f, 11.702f, 14.407f, 11.702f, 14.602f, 11.897f)
                curveTo(14.797f, 12.092f, 14.797f, 12.409f, 14.602f, 12.604f)
                horizontalLineTo(14.604f)
                close()
            }
        }.build()
        
        return _LayersActive!!
    }

private var _LayersActive: ImageVector? = null

