package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.CursorArrowRays: ImageVector
    get() {
        if (_CursorArrowRays != null) return _CursorArrowRays!!
        
        _CursorArrowRays = ImageVector.Builder(
            name = "cursor-arrow-rays",
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
                moveTo(12f, 2.25f)
                verticalLineTo(4.5f)
                moveToRelative(5.834f, 0.166f)
                lineToRelative(-1.591f, 1.591f)
                moveTo(20.25f, 10.5f)
                horizontalLineTo(18f)
                moveTo(7.757f, 14.743f)
                lineToRelative(-1.59f, 1.59f)
                moveTo(6f, 10.5f)
                horizontalLineTo(3.75f)
                moveToRelative(4.007f, -4.243f)
                lineToRelative(-1.59f, -1.59f)
            }
        }.build()
        
        return _CursorArrowRays!!
    }

private var _CursorArrowRays: ImageVector? = null

