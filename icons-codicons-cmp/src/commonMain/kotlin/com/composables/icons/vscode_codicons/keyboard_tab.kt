package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.KeyboardTab: ImageVector
    get() {
        if (_KeyboardTab != null) return _KeyboardTab!!
        
        _KeyboardTab = ImageVector.Builder(
            name = "keyboard-tab",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14f, 12.0011f)
                verticalLineTo(3.00111f)
                curveTo(13.9998f, 2.87616f, 14.0463f, 2.75566f, 14.1305f, 2.66332f)
                curveTo(14.2147f, 2.57099f, 14.3304f, 2.51352f, 14.4548f, 2.50223f)
                curveTo(14.5793f, 2.49094f, 14.7034f, 2.52665f, 14.8028f, 2.60233f)
                curveTo(14.9023f, 2.678f, 14.9697f, 2.78816f, 14.992f, 2.91111f)
                lineTo(15f, 3.00111f)
                verticalLineTo(12.0011f)
                curveTo(15.0002f, 12.1261f, 14.9537f, 12.2466f, 14.8695f, 12.3389f)
                curveTo(14.7853f, 12.4312f, 14.6696f, 12.4887f, 14.5452f, 12.5f)
                curveTo(14.4207f, 12.5113f, 14.2966f, 12.4756f, 14.1972f, 12.3999f)
                curveTo(14.0977f, 12.3242f, 14.0303f, 12.2141f, 14.008f, 12.0911f)
                lineTo(14f, 12.0011f)
                close()
                moveTo(2.008f, 7.59111f)
                lineTo(2f, 7.50111f)
                curveTo(1.99996f, 7.38408f, 2.04097f, 7.27075f, 2.11589f, 7.18085f)
                curveTo(2.19081f, 7.09095f, 2.29489f, 7.03017f, 2.41f, 7.00911f)
                lineTo(2.5f, 7.00111f)
                horizontalLineTo(11.292f)
                lineTo(8.611f, 4.31911f)
                curveTo(8.52817f, 4.23637f, 8.477f, 4.1272f, 8.4664f, 4.01062f)
                curveTo(8.4558f, 3.89403f, 8.48645f, 3.77742f, 8.553f, 3.68111f)
                lineTo(8.611f, 3.61211f)
                curveTo(8.69373f, 3.52928f, 8.8029f, 3.47811f, 8.91949f, 3.46751f)
                curveTo(9.03608f, 3.45691f, 9.15269f, 3.48755f, 9.249f, 3.55411f)
                lineTo(9.318f, 3.61211f)
                lineTo(12.854f, 7.14711f)
                curveTo(12.9367f, 7.22996f, 12.9877f, 7.3392f, 12.9981f, 7.45578f)
                curveTo(13.0085f, 7.57236f, 12.9777f, 7.68891f, 12.911f, 7.78511f)
                lineTo(12.854f, 7.85511f)
                lineTo(9.318f, 11.3901f)
                curveTo(9.22981f, 11.4787f, 9.11164f, 11.531f, 8.98678f, 11.5368f)
                curveTo(8.86191f, 11.5426f, 8.73941f, 11.5014f, 8.64342f, 11.4213f)
                curveTo(8.54742f, 11.3413f, 8.4849f, 11.2282f, 8.46816f, 11.1043f)
                curveTo(8.45142f, 10.9804f, 8.48169f, 10.8548f, 8.553f, 10.7521f)
                lineTo(8.611f, 10.6831f)
                lineTo(11.292f, 8.00111f)
                horizontalLineTo(2.5f)
                curveTo(2.38297f, 8.00115f, 2.26964f, 7.96013f, 2.17974f, 7.88522f)
                curveTo(2.08984f, 7.8103f, 2.02906f, 7.70622f, 2.008f, 7.59111f)
                close()
            }
        }.build()
        
        return _KeyboardTab!!
    }

private var _KeyboardTab: ImageVector? = null

