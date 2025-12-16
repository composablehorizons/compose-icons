package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.CornerRightUp: ImageVector
    get() {
        if (_CornerRightUp != null) return _CornerRightUp!!
        
        _CornerRightUp = ImageVector.Builder(
            name = "corner-right-up",
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
                moveTo(10f, 9f)
                lineToRelative(5f, -5f)
                lineToRelative(5f, 5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4f, 20f)
                horizontalLineToRelative(7f)
                arcToRelative(4f, 4f, 0f, false, false, 4f, -4f)
                verticalLineTo(4f)
            }
        }.build()
        
        return _CornerRightUp!!
    }

private var _CornerRightUp: ImageVector? = null

