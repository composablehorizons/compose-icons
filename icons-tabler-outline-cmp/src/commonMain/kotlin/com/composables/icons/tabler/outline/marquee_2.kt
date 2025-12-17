package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Marquee2: ImageVector
    get() {
        if (_Marquee2 != null) return _Marquee2!!
        
        _Marquee2 = ImageVector.Builder(
            name = "marquee-2",
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
                moveTo(4f, 6f)
                verticalLineToRelative(-1f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                horizontalLineToRelative(1f)
                moveToRelative(5f, 0f)
                horizontalLineToRelative(2f)
                moveToRelative(5f, 0f)
                horizontalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(1f)
                moveToRelative(0f, 5f)
                verticalLineToRelative(2f)
                moveToRelative(0f, 5f)
                verticalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                horizontalLineToRelative(-1f)
                moveToRelative(-5f, 0f)
                horizontalLineToRelative(-2f)
                moveToRelative(-5f, 0f)
                horizontalLineToRelative(-1f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                verticalLineToRelative(-1f)
                moveToRelative(0f, -5f)
                verticalLineToRelative(-2f)
            }
        }.build()
        
        return _Marquee2!!
    }

private var _Marquee2: ImageVector? = null

