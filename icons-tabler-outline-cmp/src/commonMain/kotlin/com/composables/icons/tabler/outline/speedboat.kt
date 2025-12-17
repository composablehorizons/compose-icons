package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Speedboat: ImageVector
    get() {
        if (_Speedboat != null) return _Speedboat!!
        
        _Speedboat = ImageVector.Builder(
            name = "speedboat",
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
                moveTo(2f, 17f)
                horizontalLineToRelative(14.4f)
                arcToRelative(3f, 3f, 0f, false, false, 2.5f, -1.34f)
                lineToRelative(3.1f, -4.66f)
                horizontalLineToRelative(-6.23f)
                arcToRelative(4f, 4f, 0f, false, false, -1.49f, 0.29f)
                lineToRelative(-3.56f, 1.42f)
                arcToRelative(4f, 4f, 0f, false, true, -1.49f, 0.29f)
                horizontalLineToRelative(-5.73f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 13f)
                lineToRelative(1.5f, -5f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 8f)
                horizontalLineToRelative(8f)
                lineToRelative(2f, 3f)
            }
        }.build()
        
        return _Speedboat!!
    }

private var _Speedboat: ImageVector? = null

