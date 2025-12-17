package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.HeptagonHalf: ImageVector
    get() {
        if (_HeptagonHalf != null) return _HeptagonHalf!!
        
        _HeptagonHalf = ImageVector.Builder(
            name = "heptagon-half",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.779f, 0.052f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.442f, 0f)
                lineToRelative(6.015f, 2.97f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.267f, 0.34f)
                lineToRelative(1.485f, 6.676f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.093f, 0.415f)
                lineToRelative(-4.162f, 5.354f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.395f, 0.193f)
                horizontalLineTo(4.662f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.395f, -0.193f)
                lineTo(0.105f, 10.453f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.093f, -0.415f)
                lineToRelative(1.485f, -6.676f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.267f, -0.34f)
                close()
                moveTo(8f, 15f)
                horizontalLineToRelative(3.093f)
                lineToRelative(3.868f, -4.975f)
                lineToRelative(-1.383f, -6.212f)
                lineTo(8f, 1.058f)
                close()
            }
        }.build()
        
        return _HeptagonHalf!!
    }

private var _HeptagonHalf: ImageVector? = null

