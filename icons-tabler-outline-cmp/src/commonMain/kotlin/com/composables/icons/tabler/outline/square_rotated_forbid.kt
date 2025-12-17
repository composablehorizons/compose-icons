package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.SquareRotatedForbid: ImageVector
    get() {
        if (_SquareRotatedForbid != null) return _SquareRotatedForbid!!
        
        _SquareRotatedForbid = ImageVector.Builder(
            name = "square-rotated-forbid",
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
                moveTo(13.446f, 2.6f)
                lineToRelative(7.955f, 7.954f)
                arcToRelative(2.045f, 2.045f, 0f, false, true, 0f, 2.892f)
                lineToRelative(-7.955f, 7.955f)
                arcToRelative(2.045f, 2.045f, 0f, false, true, -2.892f, 0f)
                lineToRelative(-7.955f, -7.955f)
                arcToRelative(2.045f, 2.045f, 0f, false, true, 0f, -2.892f)
                lineToRelative(7.955f, -7.955f)
                arcToRelative(2.045f, 2.045f, 0f, false, true, 2.892f, 0f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.5f, 14.5f)
                lineToRelative(5f, -5f)
            }
        }.build()
        
        return _SquareRotatedForbid!!
    }

private var _SquareRotatedForbid: ImageVector? = null

