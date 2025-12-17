package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.LevelUpAlt: ImageVector
    get() {
        if (_LevelUpAlt != null) return _LevelUpAlt!!
        
        _LevelUpAlt = ImageVector.Builder(
            name = "level-up-alt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 320f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(313.553f, 119.669f)
                lineTo(209.587f, 7.666f)
                curveToRelative(-9.485f, -10.214f, -25.676f, -10.229f, -35.174f, 0f)
                lineTo(70.438f, 119.669f)
                curveTo(56.232f, 134.969f, 67.062f, 160f, 88.025f, 160f)
                horizontalLineTo(152f)
                verticalLineToRelative(272f)
                horizontalLineTo(68.024f)
                arcToRelative(11.996f, 11.996f, 0f, false, false, -8.485f, 3.515f)
                lineToRelative(-56f, 56f)
                curveTo(-4.021f, 499.074f, 1.333f, 512f, 12.024f, 512f)
                horizontalLineTo(208f)
                curveToRelative(13.255f, 0f, 24f, -10.745f, 24f, -24f)
                verticalLineTo(160f)
                horizontalLineToRelative(63.966f)
                curveToRelative(20.878f, 0f, 31.851f, -24.969f, 17.587f, -40.331f)
                close()
            }
        }.build()
        
        return _LevelUpAlt!!
    }

private var _LevelUpAlt: ImageVector? = null

