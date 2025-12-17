package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Leaf: ImageVector
    get() {
        if (_Leaf != null) return _Leaf!!
        
        _Leaf = ImageVector.Builder(
            name = "leaf",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1.4f, 1.7f)
                curveToRelative(0.216f, 0.289f, 0.65f, 0.84f, 1.725f, 1.274f)
                curveToRelative(1.093f, 0.44f, 2.884f, 0.774f, 5.834f, 0.528f)
                lineToRelative(0.37f, -0.023f)
                curveToRelative(1.823f, -0.06f, 3.117f, 0.598f, 3.956f, 1.579f)
                curveTo(14.16f, 6.082f, 14.5f, 7.41f, 14.5f, 8.5f)
                curveToRelative(0f, 0.58f, -0.032f, 1.285f, -0.229f, 1.997f)
                quadToRelative(0.198f, 0.248f, 0.382f, 0.54f)
                curveToRelative(0.756f, 1.2f, 1.19f, 2.563f, 1.348f, 3.966f)
                arcToRelative(1f, 1f, 0f, false, true, -1.98f, 0.198f)
                curveToRelative(-0.13f, -0.97f, -0.397f, -1.913f, -0.868f, -2.77f)
                curveTo(12.173f, 13.386f, 10.565f, 14f, 8f, 14f)
                curveToRelative(-1.854f, 0f, -3.32f, -0.544f, -4.45f, -1.435f)
                curveToRelative(-1.125f, -0.887f, -1.89f, -2.095f, -2.391f, -3.383f)
                curveTo(0.16f, 6.62f, 0.16f, 3.646f, 0.509f, 1.902f)
                lineTo(0.73f, 0.806f)
                close()
                moveToRelative(-0.05f, 1.39f)
                curveToRelative(-0.146f, 1.609f, -0.008f, 3.809f, 0.74f, 5.728f)
                curveToRelative(0.457f, 1.17f, 1.13f, 2.213f, 2.079f, 2.961f)
                curveToRelative(0.942f, 0.744f, 2.185f, 1.22f, 3.83f, 1.221f)
                curveToRelative(2.588f, 0f, 3.91f, -0.66f, 4.609f, -1.445f)
                curveToRelative(-1.789f, -2.46f, -4.121f, -1.213f, -6.342f, -2.68f)
                curveToRelative(-0.74f, -0.488f, -1.735f, -1.323f, -1.844f, -2.308f)
                curveToRelative(-0.023f, -0.214f, 0.237f, -0.274f, 0.38f, -0.112f)
                curveToRelative(1.4f, 1.6f, 3.573f, 1.757f, 5.59f, 2.045f)
                curveToRelative(1.227f, 0.215f, 2.21f, 0.526f, 3.033f, 1.158f)
                curveToRelative(0.058f, -0.39f, 0.075f, -0.782f, 0.075f, -1.158f)
                curveToRelative(0f, -0.91f, -0.288f, -1.988f, -0.975f, -2.792f)
                curveToRelative(-0.626f, -0.732f, -1.622f, -1.281f, -3.167f, -1.229f)
                lineToRelative(-0.316f, 0.02f)
                curveToRelative(-3.05f, 0.253f, -5.01f, -0.08f, -6.291f, -0.598f)
                arcToRelative(5.3f, 5.3f, 0f, false, true, -1.4f, -0.811f)
            }
        }.build()
        
        return _Leaf!!
    }

private var _Leaf: ImageVector? = null

