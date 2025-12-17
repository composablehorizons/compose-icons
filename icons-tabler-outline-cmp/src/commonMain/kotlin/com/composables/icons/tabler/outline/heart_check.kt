package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.HeartCheck: ImageVector
    get() {
        if (_HeartCheck != null) return _HeartCheck!!
        
        _HeartCheck = ImageVector.Builder(
            name = "heart-check",
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
                moveTo(19.5f, 12.572f)
                lineToRelative(-3f, 2.928f)
                moveToRelative(-5.5f, 3.5f)
                arcToRelative(8916.99f, 8916.99f, 0f, false, false, -6.5f, -6.428f)
                arcToRelative(5f, 5f, 0f, true, true, 7.5f, -6.566f)
                arcToRelative(5f, 5f, 0f, true, true, 7.5f, 6.572f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 19f)
                lineToRelative(2f, 2f)
                lineToRelative(4f, -4f)
            }
        }.build()
        
        return _HeartCheck!!
    }

private var _HeartCheck: ImageVector? = null

