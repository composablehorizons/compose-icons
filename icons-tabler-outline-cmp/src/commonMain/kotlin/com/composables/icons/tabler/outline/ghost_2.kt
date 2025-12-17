package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Ghost2: ImageVector
    get() {
        if (_Ghost2 != null) return _Ghost2!!
        
        _Ghost2 = ImageVector.Builder(
            name = "ghost-2",
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
                moveTo(10f, 9f)
                horizontalLineToRelative(0.01f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 9f)
                horizontalLineToRelative(0.01f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 3f)
                arcToRelative(7f, 7f, 0f, false, true, 7f, 7f)
                verticalLineToRelative(1f)
                lineToRelative(1f, 0f)
                arcToRelative(2f, 2f, 0f, true, true, 0f, 4f)
                lineToRelative(-1f, 0f)
                verticalLineToRelative(3f)
                lineToRelative(2f, 3f)
                horizontalLineToRelative(-10f)
                arcToRelative(6f, 6f, 0f, false, true, -6f, -5.775f)
                lineToRelative(0f, -0.226f)
                lineToRelative(-1f, 0f)
                arcToRelative(2f, 2f, 0f, false, true, 0f, -4f)
                lineToRelative(1f, 0f)
                verticalLineToRelative(-1f)
                arcToRelative(7f, 7f, 0f, false, true, 7f, -7f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11f, 14f)
                horizontalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, false, false, -2f, 0f)
                close()
            }
        }.build()
        
        return _Ghost2!!
    }

private var _Ghost2: ImageVector? = null

