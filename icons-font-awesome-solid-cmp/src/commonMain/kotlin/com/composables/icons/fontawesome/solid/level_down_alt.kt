package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.LevelDownAlt: ImageVector
    get() {
        if (_LevelDownAlt != null) return _LevelDownAlt!!
        
        _LevelDownAlt = ImageVector.Builder(
            name = "level-down-alt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 320f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(313.553f, 392.331f)
                lineTo(209.587f, 504.334f)
                curveToRelative(-9.485f, 10.214f, -25.676f, 10.229f, -35.174f, 0f)
                lineTo(70.438f, 392.331f)
                curveTo(56.232f, 377.031f, 67.062f, 352f, 88.025f, 352f)
                horizontalLineTo(152f)
                verticalLineTo(80f)
                horizontalLineTo(68.024f)
                arcToRelative(11.996f, 11.996f, 0f, false, true, -8.485f, -3.515f)
                lineToRelative(-56f, -56f)
                curveTo(-4.021f, 12.926f, 1.333f, 0f, 12.024f, 0f)
                horizontalLineTo(208f)
                curveToRelative(13.255f, 0f, 24f, 10.745f, 24f, 24f)
                verticalLineToRelative(328f)
                horizontalLineToRelative(63.966f)
                curveToRelative(20.878f, 0f, 31.851f, 24.969f, 17.587f, 40.331f)
                close()
            }
        }.build()
        
        return _LevelDownAlt!!
    }

private var _LevelDownAlt: ImageVector? = null

