package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.MoonStars: ImageVector
    get() {
        if (_MoonStars != null) return _MoonStars!!
        
        _MoonStars = ImageVector.Builder(
            name = "moon-stars",
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
                moveTo(12f, 3f)
                curveToRelative(0.132f, 0f, 0.263f, 0f, 0.393f, 0f)
                arcToRelative(7.5f, 7.5f, 0f, false, false, 7.92f, 12.446f)
                arcToRelative(9f, 9f, 0f, true, true, -8.313f, -12.454f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17f, 4f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19f, 11f)
                horizontalLineToRelative(2f)
                moveToRelative(-1f, -1f)
                verticalLineToRelative(2f)
            }
        }.build()
        
        return _MoonStars!!
    }

private var _MoonStars: ImageVector? = null

