package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.GlobeAlt: ImageVector
    get() {
        if (_GlobeAlt != null) return _GlobeAlt!!
        
        _GlobeAlt = ImageVector.Builder(
            name = "globe-alt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(16.555f, 5.412f)
                arcToRelative(8.028f, 8.028f, 0f, false, false, -3.503f, -2.81f)
                arcToRelative(14.899f, 14.899f, 0f, false, true, 1.663f, 4.472f)
                arcToRelative(8.547f, 8.547f, 0f, false, false, 1.84f, -1.662f)
                close()
                moveTo(13.326f, 7.825f)
                arcToRelative(13.43f, 13.43f, 0f, false, false, -2.413f, -5.773f)
                arcToRelative(8.087f, 8.087f, 0f, false, false, -1.826f, 0f)
                arcToRelative(13.43f, 13.43f, 0f, false, false, -2.413f, 5.773f)
                arcTo(8.473f, 8.473f, 0f, false, false, 10f, 8.5f)
                curveToRelative(1.18f, 0f, 2.304f, -0.24f, 3.326f, -0.675f)
                close()
                moveTo(6.514f, 9.376f)
                arcTo(9.98f, 9.98f, 0f, false, false, 10f, 10f)
                curveToRelative(1.226f, 0f, 2.4f, -0.22f, 3.486f, -0.624f)
                arcToRelative(13.54f, 13.54f, 0f, false, true, -0.351f, 3.759f)
                arcTo(13.54f, 13.54f, 0f, false, true, 10f, 13.5f)
                curveToRelative(-1.079f, 0f, -2.128f, -0.127f, -3.134f, -0.366f)
                arcToRelative(13.538f, 13.538f, 0f, false, true, -0.352f, -3.758f)
                close()
                moveTo(5.285f, 7.074f)
                arcToRelative(14.9f, 14.9f, 0f, false, true, 1.663f, -4.471f)
                arcToRelative(8.028f, 8.028f, 0f, false, false, -3.503f, 2.81f)
                curveToRelative(0.529f, 0.638f, 1.149f, 1.199f, 1.84f, 1.66f)
                close()
                moveTo(17.334f, 6.798f)
                arcToRelative(7.973f, 7.973f, 0f, false, true, 0.614f, 4.115f)
                arcToRelative(13.47f, 13.47f, 0f, false, true, -3.178f, 1.72f)
                arcToRelative(15.093f, 15.093f, 0f, false, false, 0.174f, -3.939f)
                arcToRelative(10.043f, 10.043f, 0f, false, false, 2.39f, -1.896f)
                close()
                moveTo(2.666f, 6.798f)
                arcToRelative(10.042f, 10.042f, 0f, false, false, 2.39f, 1.896f)
                arcToRelative(15.196f, 15.196f, 0f, false, false, 0.174f, 3.94f)
                arcToRelative(13.472f, 13.472f, 0f, false, true, -3.178f, -1.72f)
                arcToRelative(7.973f, 7.973f, 0f, false, true, 0.615f, -4.115f)
                close()
                moveTo(10f, 15f)
                curveToRelative(0.898f, 0f, 1.778f, -0.079f, 2.633f, -0.23f)
                arcToRelative(13.473f, 13.473f, 0f, false, true, -1.72f, 3.178f)
                arcToRelative(8.099f, 8.099f, 0f, false, true, -1.826f, 0f)
                arcToRelative(13.47f, 13.47f, 0f, false, true, -1.72f, -3.178f)
                curveToRelative(0.855f, 0.151f, 1.735f, 0.23f, 2.633f, 0.23f)
                close()
                moveTo(14.357f, 14.357f)
                arcToRelative(14.912f, 14.912f, 0f, false, true, -1.305f, 3.04f)
                arcToRelative(8.027f, 8.027f, 0f, false, false, 4.345f, -4.345f)
                curveToRelative(-0.953f, 0.542f, -1.971f, 0.981f, -3.04f, 1.305f)
                close()
                moveTo(6.948f, 17.397f)
                arcToRelative(8.027f, 8.027f, 0f, false, true, -4.345f, -4.345f)
                curveToRelative(0.953f, 0.542f, 1.971f, 0.981f, 3.04f, 1.305f)
                arcToRelative(14.912f, 14.912f, 0f, false, false, 1.305f, 3.04f)
                close()
            }
        }.build()
        
        return _GlobeAlt!!
    }

private var _GlobeAlt: ImageVector? = null

