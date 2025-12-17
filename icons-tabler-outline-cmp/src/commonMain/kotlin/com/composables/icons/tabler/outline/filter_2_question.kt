package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Filter2Question: ImageVector
    get() {
        if (_Filter2Question != null) return _Filter2Question!!
        
        _Filter2Question = ImageVector.Builder(
            name = "filter-2-question",
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
                moveTo(4f, 6f)
                horizontalLineToRelative(16f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 12f)
                horizontalLineToRelative(10.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 18f)
                horizontalLineToRelative(5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19f, 22f)
                verticalLineToRelative(0.01f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19f, 19f)
                curveToRelative(0.448f, -0.001f, 0.883f, -0.153f, 1.235f, -0.431f)
                curveToRelative(0.352f, -0.278f, 0.6f, -0.666f, 0.706f, -1.101f)
                curveToRelative(0.105f, -0.436f, 0.061f, -0.894f, -0.125f, -1.302f)
                curveToRelative(-0.186f, -0.408f, -0.504f, -0.742f, -0.902f, -0.948f)
                curveToRelative(-0.398f, -0.204f, -0.853f, -0.267f, -1.291f, -0.179f)
                curveToRelative(-0.438f, 0.088f, -0.834f, 0.321f, -1.123f, 0.662f)
            }
        }.build()
        
        return _Filter2Question!!
    }

private var _Filter2Question: ImageVector? = null

