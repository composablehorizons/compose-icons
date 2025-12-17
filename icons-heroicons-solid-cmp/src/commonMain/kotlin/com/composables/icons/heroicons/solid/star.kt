package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.Star: ImageVector
    get() {
        if (_Star != null) return _Star!!
        
        _Star = ImageVector.Builder(
            name = "star",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.788f, 3.21f)
                curveToRelative(0.448f, -1.077f, 1.976f, -1.077f, 2.424f, 0f)
                lineToRelative(2.082f, 5.006f)
                lineToRelative(5.404f, 0.434f)
                curveToRelative(1.164f, 0.093f, 1.636f, 1.545f, 0.749f, 2.305f)
                lineToRelative(-4.117f, 3.527f)
                lineToRelative(1.257f, 5.273f)
                curveToRelative(0.271f, 1.136f, -0.964f, 2.033f, -1.96f, 1.425f)
                lineTo(12f, 18.354f)
                lineTo(7.373f, 21.18f)
                curveToRelative(-0.996f, 0.608f, -2.231f, -0.29f, -1.96f, -1.425f)
                lineToRelative(1.257f, -5.273f)
                lineToRelative(-4.117f, -3.527f)
                curveToRelative(-0.887f, -0.76f, -0.415f, -2.212f, 0.749f, -2.305f)
                lineToRelative(5.404f, -0.434f)
                lineToRelative(2.082f, -5.005f)
                close()
            }
        }.build()
        
        return _Star!!
    }

private var _Star: ImageVector? = null

