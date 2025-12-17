package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Droplet: ImageVector
    get() {
        if (_Droplet != null) return _Droplet!!
        
        _Droplet = ImageVector.Builder(
            name = "droplet",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 16f)
                arcToRelative(6f, 6f, 0f, false, false, 6f, -6f)
                curveToRelative(0f, -1.655f, -1.122f, -2.904f, -2.432f, -4.362f)
                curveTo(10.254f, 4.176f, 8.75f, 2.503f, 8f, 0f)
                curveToRelative(0f, 0f, -6f, 5.686f, -6f, 10f)
                arcToRelative(6f, 6f, 0f, false, false, 6f, 6f)
                moveTo(6.646f, 4.646f)
                lineToRelative(0.708f, 0.708f)
                curveToRelative(-0.29f, 0.29f, -1.128f, 1.311f, -1.907f, 2.87f)
                lineToRelative(-0.894f, -0.448f)
                curveToRelative(0.82f, -1.641f, 1.717f, -2.753f, 2.093f, -3.13f)
            }
        }.build()
        
        return _Droplet!!
    }

private var _Droplet: ImageVector? = null

