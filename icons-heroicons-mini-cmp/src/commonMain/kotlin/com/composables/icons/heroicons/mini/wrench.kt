package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.Wrench: ImageVector
    get() {
        if (_Wrench != null) return _Wrench!!
        
        _Wrench = ImageVector.Builder(
            name = "wrench",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(19f, 5.5f)
                arcToRelative(4.5f, 4.5f, 0f, false, true, -4.791f, 4.49f)
                curveToRelative(-0.873f, -0.055f, -1.808f, 0.128f, -2.368f, 0.8f)
                lineToRelative(-6.024f, 7.23f)
                arcToRelative(2.724f, 2.724f, 0f, true, true, -3.837f, -3.837f)
                lineTo(9.21f, 8.16f)
                curveToRelative(0.672f, -0.56f, 0.855f, -1.495f, 0.8f, -2.368f)
                arcToRelative(4.5f, 4.5f, 0f, false, true, 5.873f, -4.575f)
                curveToRelative(0.324f, 0.105f, 0.39f, 0.51f, 0.15f, 0.752f)
                lineTo(13.34f, 4.66f)
                arcToRelative(0.455f, 0.455f, 0f, false, false, -0.11f, 0.494f)
                arcToRelative(3.01f, 3.01f, 0f, false, false, 1.617f, 1.617f)
                curveToRelative(0.17f, 0.07f, 0.363f, 0.02f, 0.493f, -0.111f)
                lineToRelative(2.692f, -2.692f)
                curveToRelative(0.241f, -0.241f, 0.647f, -0.174f, 0.752f, 0.15f)
                curveToRelative(0.14f, 0.435f, 0.216f, 0.9f, 0.216f, 1.382f)
                close()
                moveTo(4f, 17f)
                arcToRelative(1f, 1f, 0f, true, false, 0f, -2f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, 2f)
                close()
            }
        }.build()
        
        return _Wrench!!
    }

private var _Wrench: ImageVector? = null

