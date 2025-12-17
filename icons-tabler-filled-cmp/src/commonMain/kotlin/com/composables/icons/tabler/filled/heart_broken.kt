package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.HeartBroken: ImageVector
    get() {
        if (_HeartBroken != null) return _HeartBroken!!
        
        _HeartBroken = ImageVector.Builder(
            name = "heart-broken",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.001f, 3.8f)
                lineToRelative(-0.001f, 1.963f)
                lineToRelative(-1.894f, 3.79f)
                lineToRelative(-0.047f, 0.11f)
                arcToRelative(1f, 1f, 0f, false, false, 0.341f, 1.137f)
                lineToRelative(3.332f, 2.499f)
                lineToRelative(-1.626f, 3.254f)
                arcToRelative(1f, 1f, 0f, false, false, -0.106f, 0.447f)
                verticalLineToRelative(3.417f)
                lineToRelative(-7.197f, -7.127f)
                arcToRelative(6f, 6f, 0f, false, true, 6.956f, -9.621f)
                close()
                moveToRelative(5.77f, -0.739f)
                lineToRelative(0.246f, 0.037f)
                arcToRelative(6f, 6f, 0f, false, true, 3.184f, 10.193f)
                lineToRelative(-0.044f, 0.037f)
                lineToRelative(-7.157f, 7.088f)
                verticalLineToRelative(-3.181f)
                lineToRelative(1.894f, -3.788f)
                lineToRelative(0.047f, -0.11f)
                arcToRelative(1f, 1f, 0f, false, false, -0.341f, -1.137f)
                lineToRelative(-3.333f, -2.5f)
                lineToRelative(1.627f, -3.253f)
                arcToRelative(1f, 1f, 0f, false, false, 0.106f, -0.447f)
                verticalLineToRelative(-2.187f)
                arcToRelative(6f, 6f, 0f, false, true, 3.77f, -0.752f)
            }
        }.build()
        
        return _HeartBroken!!
    }

private var _HeartBroken: ImageVector? = null

