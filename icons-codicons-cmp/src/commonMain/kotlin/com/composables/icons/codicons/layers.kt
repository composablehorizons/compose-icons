package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Layers: ImageVector
    get() {
        if (_Layers != null) return _Layers!!
        
        _Layers = ImageVector.Builder(
            name = "layers",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 8.99993f)
                curveTo(7.819f, 8.99993f, 7.643f, 8.95093f, 7.486f, 8.85793f)
                lineTo(2.486f, 5.85693f)
                curveTo(2.186f, 5.67793f, 2f, 5.34893f, 2f, 4.99993f)
                curveTo(2f, 4.65093f, 2.187f, 4.32093f, 2.486f, 4.14193f)
                lineTo(7.486f, 1.14293f)
                curveTo(7.789f, 0.95693f, 8.207f, 0.95493f, 8.517f, 1.14493f)
                lineTo(13.513f, 4.14293f)
                curveTo(13.813f, 4.32293f, 13.999f, 4.65093f, 13.999f, 4.99993f)
                curveTo(13.999f, 5.34893f, 13.812f, 5.67893f, 13.513f, 5.85793f)
                lineTo(8.513f, 8.85693f)
                curveTo(8.357f, 8.95093f, 8.181f, 8.99993f, 8f, 8.99993f)
                close()
                moveTo(8f, 1.99993f)
                lineTo(3f, 4.99993f)
                lineTo(8f, 7.99993f)
                lineTo(13f, 4.99993f)
                lineTo(8f, 1.99993f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2.146f, 6.9873f)
                lineTo(8f, 10.5003f)
                lineTo(13.854f, 6.9873f)
                curveTo(13.946f, 7.1413f, 14f, 7.3173f, 14f, 7.5003f)
                curveTo(14f, 7.8493f, 13.814f, 8.1783f, 13.514f, 8.3583f)
                lineTo(8.514f, 11.3573f)
                curveTo(8.357f, 11.4513f, 8.181f, 11.5003f, 8f, 11.5003f)
                curveTo(7.819f, 11.5003f, 7.642f, 11.4513f, 7.486f, 11.3583f)
                lineTo(2.486f, 8.35731f)
                curveTo(2.187f, 8.17931f, 2f, 7.8503f, 2f, 7.5003f)
                curveTo(2f, 7.3163f, 2.054f, 7.1403f, 2.146f, 6.9873f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2.146f, 9.4873f)
                lineTo(8f, 13.0003f)
                lineTo(13.854f, 9.4873f)
                curveTo(13.946f, 9.6413f, 14f, 9.8173f, 14f, 10.0003f)
                curveTo(14f, 10.3493f, 13.814f, 10.6783f, 13.514f, 10.8583f)
                lineTo(8.514f, 13.8573f)
                curveTo(8.357f, 13.9513f, 8.181f, 14.0003f, 8f, 14.0003f)
                curveTo(7.819f, 14.0003f, 7.642f, 13.9513f, 7.486f, 13.8583f)
                lineTo(2.486f, 10.8573f)
                curveTo(2.187f, 10.6793f, 2f, 10.3503f, 2f, 10.0003f)
                curveTo(2f, 9.8163f, 2.054f, 9.6403f, 2.146f, 9.4873f)
                close()
            }
        }.build()
        
        return _Layers!!
    }

private var _Layers: ImageVector? = null

