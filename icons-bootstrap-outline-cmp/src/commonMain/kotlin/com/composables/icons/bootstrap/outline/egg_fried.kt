package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.EggFried: ImageVector
    get() {
        if (_EggFried != null) return _EggFried!!
        
        _EggFried = ImageVector.Builder(
            name = "egg-fried",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 11f)
                arcToRelative(3f, 3f, 0f, true, false, 0f, -6f)
                arcToRelative(3f, 3f, 0f, false, false, 0f, 6f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13.997f, 5.17f)
                arcToRelative(5f, 5f, 0f, false, false, -8.101f, -4.09f)
                arcTo(5f, 5f, 0f, false, false, 1.28f, 9.342f)
                arcToRelative(5f, 5f, 0f, false, false, 8.336f, 5.109f)
                arcToRelative(3.5f, 3.5f, 0f, false, false, 5.201f, -4.065f)
                arcToRelative(3.001f, 3.001f, 0f, false, false, -0.822f, -5.216f)
                close()
                moveToRelative(-1f, -0.034f)
                arcToRelative(1f, 1f, 0f, false, false, 0.668f, 0.977f)
                arcToRelative(2.001f, 2.001f, 0f, false, true, 0.547f, 3.478f)
                arcToRelative(1f, 1f, 0f, false, false, -0.341f, 1.113f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, -3.715f, 2.905f)
                arcToRelative(1f, 1f, 0f, false, false, -1.262f, 0.152f)
                arcToRelative(4f, 4f, 0f, false, true, -6.67f, -4.087f)
                arcToRelative(1f, 1f, 0f, false, false, -0.2f, -1f)
                arcToRelative(4f, 4f, 0f, false, true, 3.693f, -6.61f)
                arcToRelative(1f, 1f, 0f, false, false, 0.8f, -0.2f)
                arcToRelative(4f, 4f, 0f, false, true, 6.48f, 3.273f)
                close()
            }
        }.build()
        
        return _EggFried!!
    }

private var _EggFried: ImageVector? = null

