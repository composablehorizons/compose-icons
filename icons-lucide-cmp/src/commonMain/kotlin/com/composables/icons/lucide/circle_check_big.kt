package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.CircleCheckBig: ImageVector
    get() {
        if (_CircleCheckBig != null) return _CircleCheckBig!!
        
        _CircleCheckBig = ImageVector.Builder(
            name = "circle-check-big",
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
                moveTo(21.801f, 10f)
                arcTo(10f, 10f, 0f, true, true, 17f, 3.335f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 11f)
                lineToRelative(3f, 3f)
                lineTo(22f, 4f)
            }
        }.build()
        
        return _CircleCheckBig!!
    }

private var _CircleCheckBig: ImageVector? = null

