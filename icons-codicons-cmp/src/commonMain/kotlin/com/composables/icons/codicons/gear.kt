package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Gear: ImageVector
    get() {
        if (_Gear != null) return _Gear!!
        
        _Gear = ImageVector.Builder(
            name = "gear",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.99997f, 6f)
                curveTo(6.89497f, 6f, 5.99997f, 6.895f, 5.99997f, 8f)
                curveTo(5.99997f, 9.105f, 6.89497f, 10f, 7.99997f, 10f)
                curveTo(9.10497f, 10f, 9.99997f, 9.105f, 9.99997f, 8f)
                curveTo(9.99997f, 6.895f, 9.10497f, 6f, 7.99997f, 6f)
                close()
                moveTo(7.99997f, 9f)
                curveTo(7.44797f, 9f, 6.99997f, 8.552f, 6.99997f, 8f)
                curveTo(6.99997f, 7.448f, 7.44797f, 7f, 7.99997f, 7f)
                curveTo(8.55197f, 7f, 8.99997f, 7.448f, 8.99997f, 8f)
                curveTo(8.99997f, 8.552f, 8.55197f, 9f, 7.99997f, 9f)
                close()
                moveTo(14.565f, 9.715f)
                lineTo(13.279f, 8.628f)
                curveTo(13.245f, 8.599f, 13.213f, 8.567f, 13.184f, 8.533f)
                curveTo(12.888f, 8.186f, 12.931f, 7.667f, 13.279f, 7.372f)
                lineTo(14.565f, 6.285f)
                curveTo(14.693f, 6.177f, 14.742f, 6.003f, 14.691f, 5.844f)
                curveTo(14.386f, 4.903f, 13.882f, 4.04f, 13.219f, 3.308f)
                curveTo(13.139f, 3.22f, 13.027f, 3.172f, 12.912f, 3.172f)
                curveTo(12.865f, 3.172f, 12.818f, 3.18f, 12.773f, 3.196f)
                lineTo(11.186f, 3.761f)
                curveTo(11.144f, 3.776f, 11.1f, 3.788f, 11.056f, 3.796f)
                curveTo(11.006f, 3.805f, 10.956f, 3.81f, 10.907f, 3.81f)
                curveTo(10.515f, 3.81f, 10.167f, 3.532f, 10.094f, 3.134f)
                lineTo(9.79097f, 1.482f)
                curveTo(9.76097f, 1.318f, 9.63397f, 1.188f, 9.46997f, 1.153f)
                curveTo(8.98997f, 1.051f, 8.49897f, 1f, 8.00097f, 1f)
                curveTo(7.50297f, 1f, 7.01097f, 1.052f, 6.53097f, 1.153f)
                curveTo(6.36697f, 1.188f, 6.23997f, 1.318f, 6.20997f, 1.482f)
                lineTo(5.90797f, 3.134f)
                curveTo(5.89997f, 3.178f, 5.88797f, 3.221f, 5.87297f, 3.263f)
                curveTo(5.75197f, 3.6f, 5.43397f, 3.81f, 5.09397f, 3.81f)
                curveTo(5.00197f, 3.81f, 4.90797f, 3.794f, 4.81597f, 3.762f)
                lineTo(3.22897f, 3.197f)
                curveTo(3.18397f, 3.181f, 3.13597f, 3.173f, 3.08997f, 3.173f)
                curveTo(2.97497f, 3.173f, 2.86297f, 3.221f, 2.78297f, 3.309f)
                curveTo(2.11897f, 4.041f, 1.61597f, 4.904f, 1.30997f, 5.845f)
                curveTo(1.25797f, 6.004f, 1.30797f, 6.178f, 1.43597f, 6.286f)
                lineTo(2.72197f, 7.373f)
                curveTo(2.75597f, 7.402f, 2.78797f, 7.434f, 2.81697f, 7.468f)
                curveTo(3.11297f, 7.815f, 3.06997f, 8.334f, 2.72197f, 8.629f)
                lineTo(1.43597f, 9.716f)
                curveTo(1.30797f, 9.824f, 1.25897f, 9.998f, 1.30997f, 10.157f)
                curveTo(1.61497f, 11.098f, 2.11897f, 11.961f, 2.78297f, 12.693f)
                curveTo(2.86297f, 12.781f, 2.97497f, 12.829f, 3.08997f, 12.829f)
                curveTo(3.13697f, 12.829f, 3.18397f, 12.821f, 3.22897f, 12.805f)
                lineTo(4.81597f, 12.24f)
                curveTo(4.85797f, 12.225f, 4.90197f, 12.213f, 4.94597f, 12.205f)
                curveTo(4.99597f, 12.196f, 5.04597f, 12.192f, 5.09497f, 12.192f)
                curveTo(5.48697f, 12.192f, 5.83497f, 12.47f, 5.90797f, 12.868f)
                lineTo(6.20997f, 14.52f)
                curveTo(6.23997f, 14.684f, 6.36697f, 14.814f, 6.53097f, 14.849f)
                curveTo(7.01097f, 14.951f, 7.50297f, 15.002f, 8.00097f, 15.002f)
                curveTo(8.49897f, 15.002f, 8.99097f, 14.95f, 9.46997f, 14.849f)
                curveTo(9.63397f, 14.814f, 9.76097f, 14.684f, 9.79097f, 14.52f)
                lineTo(10.094f, 12.868f)
                curveTo(10.102f, 12.824f, 10.114f, 12.781f, 10.129f, 12.739f)
                curveTo(10.25f, 12.402f, 10.568f, 12.192f, 10.908f, 12.192f)
                curveTo(11f, 12.192f, 11.094f, 12.208f, 11.186f, 12.24f)
                lineTo(12.772f, 12.805f)
                curveTo(12.818f, 12.821f, 12.865f, 12.829f, 12.911f, 12.829f)
                curveTo(13.026f, 12.829f, 13.138f, 12.781f, 13.218f, 12.693f)
                curveTo(13.882f, 11.961f, 14.385f, 11.098f, 14.69f, 10.157f)
                curveTo(14.742f, 9.998f, 14.692f, 9.824f, 14.564f, 9.716f)
                lineTo(14.565f, 9.715f)
                close()
                moveTo(12.728f, 11.726f)
                lineTo(11.521f, 11.296f)
                curveTo(11.323f, 11.226f, 11.117f, 11.19f, 10.908f, 11.19f)
                curveTo(10.139f, 11.19f, 9.44697f, 11.676f, 9.18797f, 12.399f)
                curveTo(9.15397f, 12.492f, 9.12897f, 12.588f, 9.11097f, 12.686f)
                lineTo(8.88097f, 13.937f)
                curveTo(8.59097f, 13.979f, 8.29597f, 14f, 8.00097f, 14f)
                curveTo(7.70597f, 14f, 7.41097f, 13.979f, 7.11997f, 13.936f)
                lineTo(6.89097f, 12.685f)
                curveTo(6.73197f, 11.818f, 5.97697f, 11.189f, 5.09497f, 11.189f)
                curveTo(4.98697f, 11.189f, 4.87697f, 11.199f, 4.76597f, 11.219f)
                curveTo(4.66897f, 11.237f, 4.57397f, 11.262f, 4.47997f, 11.295f)
                lineTo(3.27297f, 11.725f)
                curveTo(2.90497f, 11.264f, 2.61097f, 10.759f, 2.39397f, 10.214f)
                lineTo(3.36797f, 9.391f)
                curveTo(3.74097f, 9.076f, 3.96797f, 8.634f, 4.00797f, 8.148f)
                curveTo(4.04797f, 7.662f, 3.89497f, 7.19f, 3.57797f, 6.818f)
                curveTo(3.51397f, 6.743f, 3.44297f, 6.672f, 3.36797f, 6.608f)
                lineTo(2.39397f, 5.785f)
                curveTo(2.61097f, 5.24f, 2.90497f, 4.734f, 3.27297f, 4.274f)
                lineTo(4.47997f, 4.704f)
                curveTo(4.67797f, 4.774f, 4.88397f, 4.81f, 5.09397f, 4.81f)
                curveTo(5.86297f, 4.81f, 6.55497f, 4.324f, 6.81397f, 3.601f)
                curveTo(6.84797f, 3.507f, 6.87297f, 3.411f, 6.89097f, 3.314f)
                lineTo(7.11997f, 2.063f)
                curveTo(7.41097f, 2.021f, 7.70597f, 1.999f, 8.00097f, 1.999f)
                curveTo(8.29597f, 1.999f, 8.59097f, 2.02f, 8.88097f, 2.062f)
                lineTo(9.10997f, 3.313f)
                curveTo(9.26897f, 4.18f, 10.024f, 4.809f, 10.906f, 4.809f)
                curveTo(11.014f, 4.809f, 11.124f, 4.799f, 11.234f, 4.779f)
                curveTo(11.331f, 4.761f, 11.427f, 4.736f, 11.521f, 4.703f)
                lineTo(12.728f, 4.273f)
                curveTo(13.096f, 4.733f, 13.39f, 5.239f, 13.607f, 5.784f)
                lineTo(12.634f, 6.607f)
                curveTo(12.261f, 6.922f, 12.033f, 7.364f, 11.994f, 7.85f)
                curveTo(11.954f, 8.336f, 12.107f, 8.809f, 12.424f, 9.18f)
                curveTo(12.489f, 9.256f, 12.559f, 9.326f, 12.635f, 9.39f)
                lineTo(13.609f, 10.213f)
                curveTo(13.392f, 10.758f, 13.098f, 11.264f, 12.73f, 11.724f)
                lineTo(12.728f, 11.726f)
                close()
            }
        }.build()
        
        return _Gear!!
    }

private var _Gear: ImageVector? = null

