package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.CursorArrowRipple: ImageVector
    get() {
        if (_CursorArrowRipple != null) return _CursorArrowRipple!!
        
        _CursorArrowRipple = ImageVector.Builder(
            name = "cursor-arrow-ripple",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f,
                strokeLineJoin = StrokeJoin.Miter
            ) {
                moveTo(15.042f, 21.672f)
                lineTo(13.684f, 16.6f)
                moveToRelative(0f, 0f)
                lineToRelative(-2.51f, 2.225f)
                lineToRelative(0.569f, -9.47f)
                lineToRelative(5.227f, 7.917f)
                lineToRelative(-3.286f, -0.672f)
                close()
                moveToRelative(-7.518f, -0.267f)
                arcTo(8.25f, 8.25f, 0f, true, true, 20.25f, 10.5f)
                moveTo(8.288f, 14.212f)
                arcTo(5.25f, 5.25f, 0f, true, true, 17.25f, 10.5f)
            }
        }.build()
        
        return _CursorArrowRipple!!
    }

private var _CursorArrowRipple: ImageVector? = null

