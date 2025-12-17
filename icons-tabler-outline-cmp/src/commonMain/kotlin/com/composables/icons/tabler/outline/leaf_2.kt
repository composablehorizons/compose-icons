package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Leaf2: ImageVector
    get() {
        if (_Leaf2 != null) return _Leaf2!!
        
        _Leaf2 = ImageVector.Builder(
            name = "leaf-2",
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
                moveTo(5f, 21f)
                curveToRelative(0.5f, -4.5f, 2.5f, -8f, 7f, -10f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7.5f, 15f)
                quadToRelative(-3.5f, 0f, -4.5f, -6f)
                arcToRelative(8.4f, 8.4f, 0f, false, true, 3.438f, 0.402f)
                arcToRelative(12f, 12f, 0f, false, true, -0.052f, -0.793f)
                curveToRelative(0f, -3.606f, 3.204f, -5.609f, 3.204f, -5.609f)
                reflectiveCurveToRelative(2.003f, 1.252f, 2.842f, 3.557f)
                quadToRelative(2.568f, -1.557f, 6.568f, -1.557f)
                quadToRelative(0.396f, 3.775f, -1.557f, 6.568f)
                curveToRelative(2.305f, 0.839f, 3.557f, 2.842f, 3.557f, 2.842f)
                reflectiveCurveToRelative(-3f, 2.59f, -7f, 2.59f)
                curveToRelative(0f, 1f, 0f, 1f, 0.5f, 3f)
                quadToRelative(-6f, 0f, -7f, -5f)
            }
        }.build()
        
        return _Leaf2!!
    }

private var _Leaf2: ImageVector? = null

