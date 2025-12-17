package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.HorseToy: ImageVector
    get() {
        if (_HorseToy != null) return _HorseToy!!
        
        _HorseToy = ImageVector.Builder(
            name = "horse-toy",
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
                moveTo(3.5f, 17.5f)
                curveToRelative(5.667f, 4.667f, 11.333f, 4.667f, 17f, 0f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19f, 18.5f)
                lineToRelative(-2f, -8.5f)
                lineToRelative(1f, -2f)
                lineToRelative(2f, 1f)
                lineToRelative(1.5f, -1.5f)
                lineToRelative(-2.5f, -4.5f)
                curveToRelative(-5.052f, 0.218f, -5.99f, 3.133f, -7f, 6f)
                horizontalLineToRelative(-6f)
                arcToRelative(3f, 3f, 0f, false, false, -3f, 3f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5f, 18.5f)
                lineToRelative(2f, -9.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 20f)
                lineToRelative(2f, -5f)
                horizontalLineToRelative(4f)
                lineToRelative(2f, 5f)
            }
        }.build()
        
        return _HorseToy!!
    }

private var _HorseToy: ImageVector? = null

