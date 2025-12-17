package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Droplet: ImageVector
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
                moveTo(7.21f, 0.8f)
                curveTo(7.69f, 0.295f, 8f, 0f, 8f, 0f)
                quadToRelative(0.164f, 0.544f, 0.371f, 1.038f)
                curveToRelative(0.812f, 1.946f, 2.073f, 3.35f, 3.197f, 4.6f)
                curveTo(12.878f, 7.096f, 14f, 8.345f, 14f, 10f)
                arcToRelative(6f, 6f, 0f, false, true, -12f, 0f)
                curveTo(2f, 6.668f, 5.58f, 2.517f, 7.21f, 0.8f)
                moveToRelative(0.413f, 1.021f)
                arcTo(31f, 31f, 0f, false, false, 5.794f, 3.99f)
                curveToRelative(-0.726f, 0.95f, -1.436f, 2.008f, -1.96f, 3.07f)
                curveTo(3.304f, 8.133f, 3f, 9.138f, 3f, 10f)
                arcToRelative(5f, 5f, 0f, false, false, 10f, 0f)
                curveToRelative(0f, -1.201f, -0.796f, -2.157f, -2.181f, -3.7f)
                lineToRelative(-0.03f, -0.032f)
                curveTo(9.75f, 5.11f, 8.5f, 3.72f, 7.623f, 1.82f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.553f, 7.776f)
                curveToRelative(0.82f, -1.641f, 1.717f, -2.753f, 2.093f, -3.13f)
                lineToRelative(0.708f, 0.708f)
                curveToRelative(-0.29f, 0.29f, -1.128f, 1.311f, -1.907f, 2.87f)
                close()
            }
        }.build()
        
        return _Droplet!!
    }

private var _Droplet: ImageVector? = null

