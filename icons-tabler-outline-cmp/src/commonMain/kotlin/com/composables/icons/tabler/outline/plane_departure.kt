package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.PlaneDeparture: ImageVector
    get() {
        if (_PlaneDeparture != null) return _PlaneDeparture!!
        
        _PlaneDeparture = ImageVector.Builder(
            name = "plane-departure",
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
                moveTo(14.639f, 10.258f)
                lineToRelative(4.83f, -1.294f)
                arcToRelative(2f, 2f, 0f, true, true, 1.035f, 3.863f)
                lineToRelative(-14.489f, 3.883f)
                lineToRelative(-4.45f, -5.02f)
                lineToRelative(2.897f, -0.776f)
                lineToRelative(2.45f, 1.414f)
                lineToRelative(2.897f, -0.776f)
                lineToRelative(-3.743f, -6.244f)
                lineToRelative(2.898f, -0.777f)
                lineToRelative(5.675f, 5.727f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 21f)
                horizontalLineToRelative(18f)
            }
        }.build()
        
        return _PlaneDeparture!!
    }

private var _PlaneDeparture: ImageVector? = null

