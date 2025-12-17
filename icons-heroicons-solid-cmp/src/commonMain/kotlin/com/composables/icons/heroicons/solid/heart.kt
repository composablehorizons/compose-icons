package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.Heart: ImageVector
    get() {
        if (_Heart != null) return _Heart!!
        
        _Heart = ImageVector.Builder(
            name = "heart",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.645f, 20.91f)
                lineToRelative(-0.007f, -0.003f)
                lineToRelative(-0.022f, -0.012f)
                arcToRelative(15.247f, 15.247f, 0f, false, true, -0.383f, -0.218f)
                arcToRelative(25.18f, 25.18f, 0f, false, true, -4.244f, -3.17f)
                curveTo(4.688f, 15.36f, 2.25f, 12.174f, 2.25f, 8.25f)
                curveTo(2.25f, 5.322f, 4.714f, 3f, 7.688f, 3f)
                arcTo(5.5f, 5.5f, 0f, false, true, 12f, 5.052f)
                arcTo(5.5f, 5.5f, 0f, false, true, 16.313f, 3f)
                curveToRelative(2.973f, 0f, 5.437f, 2.322f, 5.437f, 5.25f)
                curveToRelative(0f, 3.925f, -2.438f, 7.111f, -4.739f, 9.256f)
                arcToRelative(25.175f, 25.175f, 0f, false, true, -4.244f, 3.17f)
                arcToRelative(15.247f, 15.247f, 0f, false, true, -0.383f, 0.219f)
                lineToRelative(-0.022f, 0.012f)
                lineToRelative(-0.007f, 0.004f)
                lineToRelative(-0.003f, 0.001f)
                arcToRelative(0.752f, 0.752f, 0f, false, true, -0.704f, 0f)
                lineToRelative(-0.003f, -0.001f)
                close()
            }
        }.build()
        
        return _Heart!!
    }

private var _Heart: ImageVector? = null

