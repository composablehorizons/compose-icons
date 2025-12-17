package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.Star: ImageVector
    get() {
        if (_Star != null) return _Star!!
        
        _Star = ImageVector.Builder(
            name = "star",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 1.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.692f, 0.462f)
                lineToRelative(1.41f, 3.393f)
                lineToRelative(3.664f, 0.293f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.428f, 1.317f)
                lineToRelative(-2.791f, 2.39f)
                lineToRelative(0.853f, 3.575f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.12f, 0.814f)
                lineTo(7.998f, 12.08f)
                lineToRelative(-3.135f, 1.915f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.12f, -0.814f)
                lineToRelative(0.852f, -3.574f)
                lineToRelative(-2.79f, -2.39f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.427f, -1.318f)
                lineToRelative(3.663f, -0.293f)
                lineToRelative(1.41f, -3.393f)
                arcTo(0.75f, 0.75f, 0f, false, true, 8f, 1.75f)
                close()
            }
        }.build()
        
        return _Star!!
    }

private var _Star: ImageVector? = null

