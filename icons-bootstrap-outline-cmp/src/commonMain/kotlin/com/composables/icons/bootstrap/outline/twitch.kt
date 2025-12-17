package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Twitch: ImageVector
    get() {
        if (_Twitch != null) return _Twitch!!
        
        _Twitch = ImageVector.Builder(
            name = "twitch",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.857f, 0f)
                lineTo(1f, 2.857f)
                verticalLineToRelative(10.286f)
                horizontalLineToRelative(3.429f)
                verticalLineTo(16f)
                lineToRelative(2.857f, -2.857f)
                horizontalLineTo(9.57f)
                lineTo(14.714f, 8f)
                verticalLineTo(0f)
                close()
                moveToRelative(9.714f, 7.429f)
                lineToRelative(-2.285f, 2.285f)
                horizontalLineTo(9f)
                lineToRelative(-2f, 2f)
                verticalLineToRelative(-2f)
                horizontalLineTo(4.429f)
                verticalLineTo(1.143f)
                horizontalLineToRelative(9.142f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.857f, 3.143f)
                horizontalLineToRelative(-1.143f)
                verticalLineTo(6.57f)
                horizontalLineToRelative(1.143f)
                close()
                moveToRelative(-3.143f, 0f)
                horizontalLineTo(7.571f)
                verticalLineTo(6.57f)
                horizontalLineToRelative(1.143f)
                close()
            }
        }.build()
        
        return _Twitch!!
    }

private var _Twitch: ImageVector? = null

