package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Pointer: ImageVector
    get() {
        if (_Pointer != null) return _Pointer!!
        
        _Pointer = ImageVector.Builder(
            name = "pointer",
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
                moveTo(7.904f, 17.563f)
                arcToRelative(1.2f, 1.2f, 0f, false, false, 2.228f, 0.308f)
                lineToRelative(2.09f, -3.093f)
                lineToRelative(4.907f, 4.907f)
                arcToRelative(1.067f, 1.067f, 0f, false, false, 1.509f, 0f)
                lineToRelative(1.047f, -1.047f)
                arcToRelative(1.067f, 1.067f, 0f, false, false, 0f, -1.509f)
                lineToRelative(-4.907f, -4.907f)
                lineToRelative(3.113f, -2.09f)
                arcToRelative(1.2f, 1.2f, 0f, false, false, -0.309f, -2.228f)
                lineToRelative(-13.582f, -3.904f)
                lineToRelative(3.904f, 13.563f)
                close()
            }
        }.build()
        
        return _Pointer!!
    }

private var _Pointer: ImageVector? = null

