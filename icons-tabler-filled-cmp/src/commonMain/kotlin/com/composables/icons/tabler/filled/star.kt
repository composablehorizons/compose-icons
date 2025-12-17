package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.Star: ImageVector
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
                moveTo(8.243f, 7.34f)
                lineToRelative(-6.38f, 0.925f)
                lineToRelative(-0.113f, 0.023f)
                arcToRelative(1f, 1f, 0f, false, false, -0.44f, 1.684f)
                lineToRelative(4.622f, 4.499f)
                lineToRelative(-1.09f, 6.355f)
                lineToRelative(-0.013f, 0.11f)
                arcToRelative(1f, 1f, 0f, false, false, 1.464f, 0.944f)
                lineToRelative(5.706f, -3f)
                lineToRelative(5.693f, 3f)
                lineToRelative(0.1f, 0.046f)
                arcToRelative(1f, 1f, 0f, false, false, 1.352f, -1.1f)
                lineToRelative(-1.091f, -6.355f)
                lineToRelative(4.624f, -4.5f)
                lineToRelative(0.078f, -0.085f)
                arcToRelative(1f, 1f, 0f, false, false, -0.633f, -1.62f)
                lineToRelative(-6.38f, -0.926f)
                lineToRelative(-2.852f, -5.78f)
                arcToRelative(1f, 1f, 0f, false, false, -1.794f, 0f)
                lineToRelative(-2.853f, 5.78f)
                close()
            }
        }.build()
        
        return _Star!!
    }

private var _Star: ImageVector? = null

