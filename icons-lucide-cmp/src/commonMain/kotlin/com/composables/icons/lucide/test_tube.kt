package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.TestTube: ImageVector
    get() {
        if (_TestTube != null) return _TestTube!!
        
        _TestTube = ImageVector.Builder(
            name = "test-tube",
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
                moveTo(14.5f, 2f)
                verticalLineToRelative(17.5f)
                curveToRelative(0f, 1.4f, -1.1f, 2.5f, -2.5f, 2.5f)
                curveToRelative(-1.4f, 0f, -2.5f, -1.1f, -2.5f, -2.5f)
                verticalLineTo(2f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.5f, 2f)
                horizontalLineToRelative(7f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14.5f, 16f)
                horizontalLineToRelative(-5f)
            }
        }.build()
        
        return _TestTube!!
    }

private var _TestTube: ImageVector? = null

