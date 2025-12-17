package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.ArrowRoundaboutRight: ImageVector
    get() {
        if (_ArrowRoundaboutRight != null) return _ArrowRoundaboutRight!!
        
        _ArrowRoundaboutRight = ImageVector.Builder(
            name = "arrow-roundabout-right",
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
                moveTo(21f, 9f)
                horizontalLineToRelative(-8f)
                arcToRelative(5f, 5f, 0f, true, false, -5f, 5f)
                verticalLineToRelative(7f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17f, 5f)
                lineToRelative(4f, 4f)
                lineToRelative(-4f, 4f)
            }
        }.build()
        
        return _ArrowRoundaboutRight!!
    }

private var _ArrowRoundaboutRight: ImageVector? = null

