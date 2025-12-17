package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.Blob: ImageVector
    get() {
        if (_Blob != null) return _Blob!!
        
        _Blob = ImageVector.Builder(
            name = "blob",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 3f)
                curveToRelative(2.779f, 0f, 5.349f, 1.556f, 7.243f, 4.082f)
                curveToRelative(1.728f, 2.306f, 2.757f, 5.259f, 2.757f, 8.016f)
                curveToRelative(0f, 1.47f, -0.293f, 2.718f, -0.903f, 3.745f)
                curveToRelative(-0.603f, 1.014f, -1.479f, 1.758f, -2.582f, 2.257f)
                curveToRelative(-1.593f, 0.718f, -3.335f, 0.9f, -6.515f, 0.9f)
                curveToRelative(-3.175f, 0f, -4.92f, -0.183f, -6.514f, -0.9f)
                curveToRelative(-1.012f, -0.457f, -1.833f, -1.12f, -2.426f, -2.01f)
                lineToRelative(-0.157f, -0.247f)
                curveToRelative(-0.61f, -1.028f, -0.903f, -2.274f, -0.903f, -3.745f)
                curveToRelative(0f, -2.757f, 1.03f, -5.71f, 2.757f, -8.016f)
                curveToRelative(1.893f, -2.526f, 4.463f, -4.082f, 7.243f, -4.082f)
            }
        }.build()
        
        return _Blob!!
    }

private var _Blob: ImageVector? = null

