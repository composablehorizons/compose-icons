package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Marquee: ImageVector
    get() {
        if (_Marquee != null) return _Marquee!!
        
        _Marquee = ImageVector.Builder(
            name = "marquee",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4f, 6f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                moveToRelative(3f, 0f)
                horizontalLineToRelative(1.5f)
                moveToRelative(3f, 0f)
                horizontalLineToRelative(1.5f)
                moveToRelative(3f, 0f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                moveToRelative(0f, 3f)
                verticalLineToRelative(1.5f)
                moveToRelative(0f, 3f)
                verticalLineToRelative(1.5f)
                moveToRelative(0f, 3f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                moveToRelative(-3f, 0f)
                horizontalLineToRelative(-1.5f)
                moveToRelative(-3f, 0f)
                horizontalLineToRelative(-1.5f)
                moveToRelative(-3f, 0f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                moveToRelative(0f, -3f)
                verticalLineToRelative(-1.5f)
                moveToRelative(0f, -3f)
                verticalLineToRelative(-1.5f)
                moveToRelative(0f, -3f)
            }
        }.build()
        
        return _Marquee!!
    }

private var _Marquee: ImageVector? = null

