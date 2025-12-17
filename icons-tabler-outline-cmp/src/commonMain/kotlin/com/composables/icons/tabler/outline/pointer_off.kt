package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.PointerOff: ImageVector
    get() {
        if (_PointerOff != null) return _PointerOff!!
        
        _PointerOff = ImageVector.Builder(
            name = "pointer-off",
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
                moveTo(15.662f, 11.628f)
                lineToRelative(2.229f, -1.496f)
                arcToRelative(1.2f, 1.2f, 0f, false, false, -0.309f, -2.228f)
                lineToRelative(-8.013f, -2.303f)
                moveToRelative(-5.569f, -1.601f)
                lineToRelative(3.904f, 13.563f)
                arcToRelative(1.2f, 1.2f, 0f, false, false, 2.228f, 0.308f)
                lineToRelative(2.09f, -3.093f)
                lineToRelative(4.907f, 4.907f)
                arcToRelative(1.067f, 1.067f, 0f, false, false, 1.509f, 0f)
                lineToRelative(0.524f, -0.524f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 3f)
                lineToRelative(18f, 18f)
            }
        }.build()
        
        return _PointerOff!!
    }

private var _PointerOff: ImageVector? = null

