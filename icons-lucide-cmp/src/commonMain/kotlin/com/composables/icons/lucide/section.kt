package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Section: ImageVector
    get() {
        if (_Section != null) return _Section!!
        
        _Section = ImageVector.Builder(
            name = "section",
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
                moveTo(16f, 5f)
                arcToRelative(4f, 3f, 0f, false, false, -8f, 0f)
                curveToRelative(0f, 4f, 8f, 3f, 8f, 7f)
                arcToRelative(4f, 3f, 0f, false, true, -8f, 0f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 19f)
                arcToRelative(4f, 3f, 0f, false, false, 8f, 0f)
                curveToRelative(0f, -4f, -8f, -3f, -8f, -7f)
                arcToRelative(4f, 3f, 0f, false, true, 8f, 0f)
            }
        }.build()
        
        return _Section!!
    }

private var _Section: ImageVector? = null

