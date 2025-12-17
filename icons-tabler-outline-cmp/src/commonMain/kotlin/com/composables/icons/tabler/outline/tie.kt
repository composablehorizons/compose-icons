package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Tie: ImageVector
    get() {
        if (_Tie != null) return _Tie!!
        
        _Tie = ImageVector.Builder(
            name = "tie",
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
                moveTo(12f, 22f)
                lineToRelative(4f, -4f)
                lineToRelative(-2.5f, -11f)
                lineToRelative(0.993f, -2.649f)
                arcToRelative(1f, 1f, 0f, false, false, -0.936f, -1.351f)
                horizontalLineToRelative(-3.114f)
                arcToRelative(1f, 1f, 0f, false, false, -0.936f, 1.351f)
                lineToRelative(0.993f, 2.649f)
                lineToRelative(-2.5f, 11f)
                lineToRelative(4f, 4f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10.5f, 7f)
                horizontalLineToRelative(3f)
                lineToRelative(5f, 5.5f)
            }
        }.build()
        
        return _Tie!!
    }

private var _Tie: ImageVector? = null

