package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Egg: ImageVector
    get() {
        if (_Egg != null) return _Egg!!
        
        _Egg = ImageVector.Builder(
            name = "egg",
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
                moveTo(19f, 14.083f)
                curveToRelative(0f, 4.154f, -2.966f, 6.74f, -7f, 6.917f)
                curveToRelative(-4.2f, 0f, -7f, -2.763f, -7f, -6.917f)
                curveToRelative(0f, -5.538f, 3.5f, -11.09f, 7f, -11.083f)
                curveToRelative(3.5f, 0.007f, 7f, 5.545f, 7f, 11.083f)
                close()
            }
        }.build()
        
        return _Egg!!
    }

private var _Egg: ImageVector? = null

