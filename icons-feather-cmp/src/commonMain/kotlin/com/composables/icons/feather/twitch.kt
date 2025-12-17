package com.composables.icons.feather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Feather.Twitch: ImageVector
    get() {
        if (_Twitch != null) return _Twitch!!
        
        _Twitch = ImageVector.Builder(
            name = "twitch",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21f, 2f)
                horizontalLineTo(3f)
                verticalLineToRelative(16f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(4f)
                lineToRelative(4f, -4f)
                horizontalLineToRelative(5f)
                lineToRelative(4f, -4f)
                verticalLineTo(2f)
                close()
                moveToRelative(-10f, 9f)
                verticalLineTo(7f)
                moveToRelative(5f, 4f)
                verticalLineTo(7f)
            }
        }.build()
        
        return _Twitch!!
    }

private var _Twitch: ImageVector? = null

