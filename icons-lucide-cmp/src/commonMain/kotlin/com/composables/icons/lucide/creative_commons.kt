package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.CreativeCommons: ImageVector
    get() {
        if (_CreativeCommons != null) return _CreativeCommons!!
        
        _CreativeCommons = ImageVector.Builder(
            name = "creative-commons",
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
                moveTo(22f, 12f)
                arcTo(10f, 10f, 0f, false, true, 12f, 22f)
                arcTo(10f, 10f, 0f, false, true, 2f, 12f)
                arcTo(10f, 10f, 0f, false, true, 22f, 12f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 9.3f)
                arcToRelative(2.8f, 2.8f, 0f, false, false, -3.5f, 1f)
                arcToRelative(3.1f, 3.1f, 0f, false, false, 0f, 3.4f)
                arcToRelative(2.7f, 2.7f, 0f, false, false, 3.5f, 1f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17f, 9.3f)
                arcToRelative(2.8f, 2.8f, 0f, false, false, -3.5f, 1f)
                arcToRelative(3.1f, 3.1f, 0f, false, false, 0f, 3.4f)
                arcToRelative(2.7f, 2.7f, 0f, false, false, 3.5f, 1f)
            }
        }.build()
        
        return _CreativeCommons!!
    }

private var _CreativeCommons: ImageVector? = null

