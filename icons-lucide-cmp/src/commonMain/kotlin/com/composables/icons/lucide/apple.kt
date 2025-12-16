package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Apple: ImageVector
    get() {
        if (_Apple != null) return _Apple!!
        
        _Apple = ImageVector.Builder(
            name = "apple",
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
                moveTo(12f, 6.528f)
                verticalLineTo(3f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                horizontalLineToRelative(0f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18.237f, 21f)
                arcTo(15f, 15f, 0f, false, false, 22f, 11f)
                arcToRelative(6f, 6f, 0f, false, false, -10f, -4.472f)
                arcTo(6f, 6f, 0f, false, false, 2f, 11f)
                arcToRelative(15.1f, 15.1f, 0f, false, false, 3.763f, 10f)
                arcToRelative(3f, 3f, 0f, false, false, 3.648f, 0.648f)
                arcToRelative(5.5f, 5.5f, 0f, false, true, 5.178f, 0f)
                arcTo(3f, 3f, 0f, false, false, 18.237f, 21f)
            }
        }.build()
        
        return _Apple!!
    }

private var _Apple: ImageVector? = null

