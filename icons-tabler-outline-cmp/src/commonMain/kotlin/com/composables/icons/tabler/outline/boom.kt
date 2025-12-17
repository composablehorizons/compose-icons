package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Boom: ImageVector
    get() {
        if (_Boom != null) return _Boom!!
        
        _Boom = ImageVector.Builder(
            name = "boom",
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
                moveTo(3f, 9.662f)
                curveToRelative(2f, 2.338f, 2f, 4.338f, 0f, 6.338f)
                curveToRelative(3f, 0.5f, 4.5f, 1f, 5f, 4f)
                curveToRelative(2f, -3f, 6f, -4f, 9f, 0f)
                curveToRelative(0f, -3f, 1f, -4f, 4f, -4.004f)
                quadToRelative(-3f, -2.995f, 0f, -5.996f)
                curveToRelative(-3f, 0f, -5f, -2f, -5f, -5f)
                curveToRelative(-2f, 4f, -5f, 3f, -7.5f, -1f)
                curveToRelative(-0.5f, 3f, -2.5f, 5f, -5.5f, 5.662f)
            }
        }.build()
        
        return _Boom!!
    }

private var _Boom: ImageVector? = null

