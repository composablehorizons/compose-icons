package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Eggs: ImageVector
    get() {
        if (_Eggs != null) return _Eggs!!
        
        _Eggs = ImageVector.Builder(
            name = "eggs",
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
                moveTo(13f, 22f)
                curveToRelative(-3f, 0f, -4.868f, -2.118f, -5f, -5f)
                curveToRelative(0f, -3f, 2f, -5f, 5f, -5f)
                curveToRelative(4f, 0f, 8.01f, 2.5f, 8f, 5f)
                curveToRelative(0f, 2.5f, -4f, 5f, -8f, 5f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 18f)
                curveToRelative(-3.03f, -0.196f, -5f, -2.309f, -5f, -5.38f)
                curveToRelative(0f, -4.307f, 2.75f, -8.625f, 5.5f, -8.62f)
                curveToRelative(2.614f, 0f, 5.248f, 3.915f, 5.5f, 8f)
            }
        }.build()
        
        return _Eggs!!
    }

private var _Eggs: ImageVector? = null

