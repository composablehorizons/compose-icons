package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.CellSignal1: ImageVector
    get() {
        if (_CellSignal1 != null) return _CellSignal1!!
        
        _CellSignal1 = ImageVector.Builder(
            name = "cell-signal-1",
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
                moveTo(20f, 20f)
                horizontalLineToRelative(-15.269f)
                arcToRelative(0.731f, 0.731f, 0f, false, true, -0.517f, -1.249f)
                lineToRelative(14.537f, -14.537f)
                arcToRelative(0.731f, 0.731f, 0f, false, true, 1.249f, 0.517f)
                verticalLineToRelative(15.269f)
                close()
            }
        }.build()
        
        return _CellSignal1!!
    }

private var _CellSignal1: ImageVector? = null

