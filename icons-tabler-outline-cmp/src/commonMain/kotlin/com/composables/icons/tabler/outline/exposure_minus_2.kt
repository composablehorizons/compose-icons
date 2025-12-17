package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.ExposureMinus2: ImageVector
    get() {
        if (_ExposureMinus2 != null) return _ExposureMinus2!!
        
        _ExposureMinus2 = ImageVector.Builder(
            name = "exposure-minus-2",
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
                moveTo(12f, 9f)
                arcToRelative(4f, 4f, 0f, true, true, 8f, 0f)
                curveToRelative(0f, 1.098f, -0.564f, 2.025f, -1.159f, 2.815f)
                lineToRelative(-6.841f, 7.185f)
                horizontalLineToRelative(8f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 12f)
                horizontalLineToRelative(6f)
            }
        }.build()
        
        return _ExposureMinus2!!
    }

private var _ExposureMinus2: ImageVector? = null

