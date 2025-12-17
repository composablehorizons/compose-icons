package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.EqualApproximately: ImageVector
    get() {
        if (_EqualApproximately != null) return _EqualApproximately!!
        
        _EqualApproximately = ImageVector.Builder(
            name = "equal-approximately",
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
                moveTo(5f, 15f)
                arcToRelative(6.5f, 6.5f, 0f, false, true, 7f, 0f)
                arcToRelative(6.5f, 6.5f, 0f, false, false, 7f, 0f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5f, 9f)
                arcToRelative(6.5f, 6.5f, 0f, false, true, 7f, 0f)
                arcToRelative(6.5f, 6.5f, 0f, false, false, 7f, 0f)
            }
        }.build()
        
        return _EqualApproximately!!
    }

private var _EqualApproximately: ImageVector? = null

