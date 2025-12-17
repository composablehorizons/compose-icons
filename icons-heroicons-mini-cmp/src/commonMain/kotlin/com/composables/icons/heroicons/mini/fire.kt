package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.Fire: ImageVector
    get() {
        if (_Fire != null) return _Fire!!
        
        _Fire = ImageVector.Builder(
            name = "fire",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13.5f, 4.938f)
                arcToRelative(7f, 7f, 0f, true, true, -9.006f, 1.737f)
                curveToRelative(0.202f, -0.257f, 0.59f, -0.218f, 0.793f, 0.039f)
                curveToRelative(0.278f, 0.352f, 0.594f, 0.672f, 0.943f, 0.954f)
                curveToRelative(0.332f, 0.269f, 0.786f, -0.049f, 0.773f, -0.476f)
                arcToRelative(5.977f, 5.977f, 0f, false, true, 0.572f, -2.759f)
                arcToRelative(6.026f, 6.026f, 0f, false, true, 2.486f, -2.665f)
                curveToRelative(0.247f, -0.14f, 0.55f, -0.016f, 0.677f, 0.238f)
                arcTo(6.967f, 6.967f, 0f, false, false, 13.5f, 4.938f)
                close()
                moveTo(14f, 12f)
                arcToRelative(4f, 4f, 0f, false, true, -4f, 4f)
                curveToRelative(-1.913f, 0f, -3.52f, -1.398f, -3.91f, -3.182f)
                curveToRelative(-0.093f, -0.429f, 0.44f, -0.643f, 0.814f, -0.413f)
                arcToRelative(4.043f, 4.043f, 0f, false, false, 1.601f, 0.564f)
                curveToRelative(0.303f, 0.038f, 0.531f, -0.24f, 0.51f, -0.544f)
                arcToRelative(5.975f, 5.975f, 0f, false, true, 1.315f, -4.192f)
                arcToRelative(0.447f, 0.447f, 0f, false, true, 0.431f, -0.16f)
                arcTo(4.001f, 4.001f, 0f, false, true, 14f, 12f)
                close()
            }
        }.build()
        
        return _Fire!!
    }

private var _Fire: ImageVector? = null

