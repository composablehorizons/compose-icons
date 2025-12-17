package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Golf: ImageVector
    get() {
        if (_Golf != null) return _Golf!!
        
        _Golf = ImageVector.Builder(
            name = "golf",
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
                moveTo(12f, 18f)
                verticalLineToRelative(-15f)
                lineToRelative(7f, 4f)
                lineToRelative(-7f, 4f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 17.67f)
                curveToRelative(-0.62f, 0.36f, -1f, 0.82f, -1f, 1.33f)
                curveToRelative(0f, 1.1f, 1.8f, 2f, 4f, 2f)
                reflectiveCurveToRelative(4f, -0.9f, 4f, -2f)
                curveToRelative(0f, -0.5f, -0.38f, -0.97f, -1f, -1.33f)
            }
        }.build()
        
        return _Golf!!
    }

private var _Golf: ImageVector? = null

