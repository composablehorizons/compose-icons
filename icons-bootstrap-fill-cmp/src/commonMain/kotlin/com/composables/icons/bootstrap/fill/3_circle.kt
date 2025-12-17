package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.`3Circle`: ImageVector
    get() {
        if (_3Circle != null) return _3Circle!!
        
        _3Circle = ImageVector.Builder(
            name = "3-circle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(16f, 8f)
                arcTo(8f, 8f, 0f, true, true, 0f, 8f)
                arcToRelative(8f, 8f, 0f, false, true, 16f, 0f)
                moveToRelative(-8.082f, 0.414f)
                curveToRelative(0.92f, 0f, 1.535f, 0.54f, 1.541f, 1.318f)
                curveToRelative(0.012f, 0.791f, -0.615f, 1.36f, -1.588f, 1.354f)
                curveToRelative(-0.861f, -0.006f, -1.482f, -0.469f, -1.54f, -1.066f)
                horizontalLineTo(5.104f)
                curveToRelative(0.047f, 1.177f, 1.05f, 2.144f, 2.754f, 2.144f)
                curveToRelative(1.653f, 0f, 2.954f, -0.937f, 2.93f, -2.396f)
                curveToRelative(-0.023f, -1.278f, -1.031f, -1.846f, -1.734f, -1.916f)
                verticalLineToRelative(-0.07f)
                curveToRelative(0.597f, -0.1f, 1.505f, -0.739f, 1.482f, -1.876f)
                curveToRelative(-0.03f, -1.177f, -1.043f, -2.074f, -2.637f, -2.062f)
                curveToRelative(-1.675f, 0.006f, -2.59f, 0.984f, -2.625f, 2.12f)
                horizontalLineToRelative(1.248f)
                curveToRelative(0.036f, -0.556f, 0.557f, -1.054f, 1.348f, -1.054f)
                curveToRelative(0.785f, 0f, 1.348f, 0.486f, 1.348f, 1.195f)
                curveToRelative(0.006f, 0.715f, -0.563f, 1.237f, -1.342f, 1.237f)
                horizontalLineToRelative(-0.838f)
                verticalLineToRelative(1.072f)
                horizontalLineToRelative(0.879f)
                close()
            }
        }.build()
        
        return _3Circle!!
    }

private var _3Circle: ImageVector? = null

