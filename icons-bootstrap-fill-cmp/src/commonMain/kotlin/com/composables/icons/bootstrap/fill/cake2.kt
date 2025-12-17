package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Cake2: ImageVector
    get() {
        if (_Cake2 != null) return _Cake2!!
        
        _Cake2 = ImageVector.Builder(
            name = "cake2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2.899f, 0.804f)
                lineToRelative(0.595f, -0.792f)
                lineToRelative(0.598f, 0.79f)
                arcTo(0.747f, 0.747f, 0f, false, true, 4f, 1.806f)
                verticalLineToRelative(4.886f)
                quadToRelative(-0.532f, -0.09f, -1f, -0.201f)
                verticalLineTo(1.813f)
                arcToRelative(0.747f, 0.747f, 0f, false, true, -0.1f, -1.01f)
                close()
                moveTo(13f, 1.806f)
                verticalLineToRelative(4.685f)
                arcToRelative(15f, 15f, 0f, false, true, -1f, 0.201f)
                verticalLineToRelative(-4.88f)
                arcToRelative(0.747f, 0.747f, 0f, false, true, -0.1f, -1.007f)
                lineToRelative(0.595f, -0.792f)
                lineToRelative(0.598f, 0.79f)
                arcTo(0.746f, 0.746f, 0f, false, true, 13f, 1.806f)
                moveToRelative(-3f, 0f)
                arcToRelative(0.746f, 0.746f, 0f, false, false, 0.092f, -1.004f)
                lineToRelative(-0.598f, -0.79f)
                lineToRelative(-0.595f, 0.792f)
                arcTo(0.747f, 0.747f, 0f, false, false, 9f, 1.813f)
                verticalLineToRelative(5.17f)
                quadToRelative(0.512f, -0.02f, 1f, -0.055f)
                close()
                moveToRelative(-3f, 0f)
                verticalLineToRelative(5.176f)
                quadToRelative(-0.512f, -0.018f, -1f, -0.054f)
                verticalLineTo(1.813f)
                arcToRelative(0.747f, 0.747f, 0f, false, true, -0.1f, -1.01f)
                lineToRelative(0.595f, -0.79f)
                lineToRelative(0.598f, 0.789f)
                arcTo(0.747f, 0.747f, 0f, false, true, 7f, 1.806f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.5f, 6.988f)
                verticalLineTo(4.226f)
                arcToRelative(23f, 23f, 0f, false, true, 1f, -0.114f)
                verticalLineTo(7.16f)
                curveToRelative(0f, 0.131f, 0.101f, 0.24f, 0.232f, 0.25f)
                lineToRelative(0.231f, 0.017f)
                quadToRelative(0.498f, 0.037f, 1.02f, 0.055f)
                lineToRelative(0.258f, 0.01f)
                arcToRelative(0.25f, 0.25f, 0f, false, false, 0.26f, -0.25f)
                verticalLineTo(4.003f)
                arcToRelative(29f, 29f, 0f, false, true, 1f, 0f)
                verticalLineTo(7.24f)
                arcToRelative(0.25f, 0.25f, 0f, false, false, 0.258f, 0.25f)
                lineToRelative(0.259f, -0.009f)
                quadToRelative(0.52f, -0.018f, 1.019f, -0.055f)
                lineToRelative(0.231f, -0.017f)
                arcToRelative(0.25f, 0.25f, 0f, false, false, 0.232f, -0.25f)
                verticalLineTo(4.112f)
                quadToRelative(0.518f, 0.047f, 1f, 0.114f)
                verticalLineToRelative(2.762f)
                arcToRelative(0.25f, 0.25f, 0f, false, false, 0.292f, 0.246f)
                lineToRelative(0.291f, -0.049f)
                quadToRelative(0.547f, -0.091f, 1.033f, -0.208f)
                lineToRelative(0.192f, -0.046f)
                arcToRelative(0.25f, 0.25f, 0f, false, false, 0.192f, -0.243f)
                verticalLineTo(4.621f)
                curveToRelative(0.672f, 0.184f, 1.251f, 0.409f, 1.677f, 0.678f)
                curveToRelative(0.415f, 0.261f, 0.823f, 0.655f, 0.823f, 1.2f)
                verticalLineTo(13.5f)
                curveToRelative(0f, 0.546f, -0.408f, 0.94f, -0.823f, 1.201f)
                curveToRelative(-0.44f, 0.278f, -1.043f, 0.51f, -1.745f, 0.696f)
                curveToRelative(-1.41f, 0.376f, -3.33f, 0.603f, -5.432f, 0.603f)
                reflectiveCurveToRelative(-4.022f, -0.227f, -5.432f, -0.603f)
                curveToRelative(-0.702f, -0.187f, -1.305f, -0.418f, -1.745f, -0.696f)
                curveTo(0.408f, 14.44f, 0f, 14.046f, 0f, 13.5f)
                verticalLineToRelative(-7f)
                curveToRelative(0f, -0.546f, 0.408f, -0.94f, 0.823f, -1.201f)
                curveToRelative(0.426f, -0.269f, 1.005f, -0.494f, 1.677f, -0.678f)
                verticalLineToRelative(2.067f)
                curveToRelative(0f, 0.116f, 0.08f, 0.216f, 0.192f, 0.243f)
                lineToRelative(0.192f, 0.046f)
                quadToRelative(0.486f, 0.116f, 1.033f, 0.208f)
                lineToRelative(0.292f, 0.05f)
                arcToRelative(0.25f, 0.25f, 0f, false, false, 0.291f, -0.247f)
                moveTo(1f, 8.82f)
                verticalLineToRelative(1.659f)
                arcToRelative(1.935f, 1.935f, 0f, false, false, 2.298f, 0.43f)
                arcToRelative(0.935f, 0.935f, 0f, false, true, 1.08f, 0.175f)
                lineToRelative(0.348f, 0.349f)
                arcToRelative(2f, 2f, 0f, false, false, 2.615f, 0.185f)
                lineToRelative(0.059f, -0.044f)
                arcToRelative(1f, 1f, 0f, false, true, 1.2f, 0f)
                lineToRelative(0.06f, 0.044f)
                arcToRelative(2f, 2f, 0f, false, false, 2.613f, -0.185f)
                lineToRelative(0.348f, -0.348f)
                arcToRelative(0.94f, 0.94f, 0f, false, true, 1.082f, -0.175f)
                curveToRelative(0.781f, 0.39f, 1.718f, 0.208f, 2.297f, -0.426f)
                verticalLineTo(8.833f)
                lineToRelative(-0.68f, 0.907f)
                arcToRelative(0.94f, 0.94f, 0f, false, true, -1.17f, 0.276f)
                arcToRelative(1.94f, 1.94f, 0f, false, false, -2.236f, 0.363f)
                lineToRelative(-0.348f, 0.348f)
                arcToRelative(1f, 1f, 0f, false, true, -1.307f, 0.092f)
                lineToRelative(-0.06f, -0.044f)
                arcToRelative(2f, 2f, 0f, false, false, -2.399f, 0f)
                lineToRelative(-0.06f, 0.044f)
                arcToRelative(1f, 1f, 0f, false, true, -1.306f, -0.092f)
                lineToRelative(-0.35f, -0.35f)
                arcToRelative(1.935f, 1.935f, 0f, false, false, -2.233f, -0.362f)
                arcToRelative(0.935f, 0.935f, 0f, false, true, -1.168f, -0.277f)
                close()
            }
        }.build()
        
        return _Cake2!!
    }

private var _Cake2: ImageVector? = null

