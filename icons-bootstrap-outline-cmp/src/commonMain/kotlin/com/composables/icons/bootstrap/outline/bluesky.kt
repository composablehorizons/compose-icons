package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Bluesky: ImageVector
    get() {
        if (_Bluesky != null) return _Bluesky!!
        
        _Bluesky = ImageVector.Builder(
            name = "bluesky",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.468f, 1.948f)
                curveTo(5.303f, 3.325f, 7.276f, 6.118f, 8f, 7.616f)
                curveToRelative(0.725f, -1.498f, 2.698f, -4.29f, 4.532f, -5.668f)
                curveTo(13.855f, 0.955f, 16f, 0.186f, 16f, 2.632f)
                curveToRelative(0f, 0.489f, -0.28f, 4.105f, -0.444f, 4.692f)
                curveToRelative(-0.572f, 2.04f, -2.653f, 2.561f, -4.504f, 2.246f)
                curveToRelative(3.236f, 0.551f, 4.06f, 2.375f, 2.281f, 4.2f)
                curveToRelative(-3.376f, 3.464f, -4.852f, -0.87f, -5.23f, -1.98f)
                curveToRelative(-0.07f, -0.204f, -0.103f, -0.3f, -0.103f, -0.218f)
                curveToRelative(0f, -0.081f, -0.033f, 0.014f, -0.102f, 0.218f)
                curveToRelative(-0.379f, 1.11f, -1.855f, 5.444f, -5.231f, 1.98f)
                curveToRelative(-1.778f, -1.825f, -0.955f, -3.65f, 2.28f, -4.2f)
                curveToRelative(-1.85f, 0.315f, -3.932f, -0.205f, -4.503f, -2.246f)
                curveTo(0.28f, 6.737f, 0f, 3.12f, 0f, 2.632f)
                curveTo(0f, 0.186f, 2.145f, 0.955f, 3.468f, 1.948f)
            }
        }.build()
        
        return _Bluesky!!
    }

private var _Bluesky: ImageVector? = null

