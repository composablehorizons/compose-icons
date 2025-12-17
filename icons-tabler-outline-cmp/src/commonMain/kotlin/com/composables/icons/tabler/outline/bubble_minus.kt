package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BubbleMinus: ImageVector
    get() {
        if (_BubbleMinus != null) return _BubbleMinus!!
        
        _BubbleMinus = ImageVector.Builder(
            name = "bubble-minus",
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
                moveTo(12.4f, 19f)
                arcToRelative(4.2f, 4.2f, 0f, false, true, -1.57f, -0.298f)
                lineToRelative(-3.83f, 2.298f)
                verticalLineToRelative(-3.134f)
                arcToRelative(2.668f, 2.668f, 0f, false, true, -1.795f, -3.773f)
                arcToRelative(4.8f, 4.8f, 0f, false, true, 2.908f, -8.933f)
                arcToRelative(5.335f, 5.335f, 0f, false, true, 9.194f, 1.078f)
                arcToRelative(5.333f, 5.333f, 0f, false, true, 3.404f, 8.771f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 19f)
                horizontalLineToRelative(6f)
            }
        }.build()
        
        return _BubbleMinus!!
    }

private var _BubbleMinus: ImageVector? = null

