package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Meeple: ImageVector
    get() {
        if (_Meeple != null) return _Meeple!!
        
        _Meeple = ImageVector.Builder(
            name = "meeple",
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
                moveTo(9f, 20f)
                horizontalLineToRelative(-5f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                curveToRelative(0f, -2f, 3.378f, -4.907f, 4f, -6f)
                curveToRelative(-1f, 0f, -4f, -0.5f, -4f, -2f)
                curveToRelative(0f, -2f, 4f, -3.5f, 6f, -4f)
                curveToRelative(0f, -1.5f, 0.5f, -4f, 3f, -4f)
                reflectiveCurveToRelative(3f, 2.5f, 3f, 4f)
                curveToRelative(2f, 0.5f, 6f, 2f, 6f, 4f)
                curveToRelative(0f, 1.5f, -3f, 2f, -4f, 2f)
                curveToRelative(0.622f, 1.093f, 4f, 4f, 4f, 6f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                horizontalLineToRelative(-5f)
                curveToRelative(-1f, 0f, -2f, -4f, -3f, -4f)
                reflectiveCurveToRelative(-2f, 4f, -3f, 4f)
                close()
            }
        }.build()
        
        return _Meeple!!
    }

private var _Meeple: ImageVector? = null

