package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Trowel: ImageVector
    get() {
        if (_Trowel != null) return _Trowel!!
        
        _Trowel = ImageVector.Builder(
            name = "trowel",
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
                moveTo(14.42f, 9.058f)
                lineToRelative(-5.362f, 5.363f)
                arcToRelative(1.978f, 1.978f, 0f, false, true, -3.275f, -0.773f)
                lineToRelative(-2.682f, -8.044f)
                arcToRelative(1.978f, 1.978f, 0f, false, true, 2.502f, -2.502f)
                lineToRelative(8.045f, 2.682f)
                arcToRelative(1.978f, 1.978f, 0f, false, true, 0.773f, 3.274f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 10f)
                lineToRelative(6.5f, 6.5f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19.347f, 16.575f)
                lineToRelative(1.08f, 1.079f)
                arcToRelative(1.96f, 1.96f, 0f, false, true, -2.773f, 2.772f)
                lineToRelative(-1.08f, -1.079f)
                arcToRelative(1.96f, 1.96f, 0f, false, true, 2.773f, -2.772f)
                close()
            }
        }.build()
        
        return _Trowel!!
    }

private var _Trowel: ImageVector? = null

