package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.EscalatorUp: ImageVector
    get() {
        if (_EscalatorUp != null) return _EscalatorUp!!
        
        _EscalatorUp = ImageVector.Builder(
            name = "escalator-up",
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
                moveTo(19.5f, 7f)
                horizontalLineToRelative(-2.672f)
                arcToRelative(2f, 2f, 0f, false, false, -1.414f, 0.586f)
                lineToRelative(-8.414f, 8.414f)
                horizontalLineToRelative(-2.5f)
                arcToRelative(2.5f, 2.5f, 0f, true, false, 0f, 5f)
                horizontalLineToRelative(3.672f)
                arcToRelative(2f, 2f, 0f, false, false, 1.414f, -0.586f)
                lineToRelative(8.414f, -8.414f)
                horizontalLineToRelative(1.5f)
                arcToRelative(2.5f, 2.5f, 0f, true, false, 0f, -5f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 10f)
                verticalLineToRelative(-7f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 6f)
                lineToRelative(3f, -3f)
                lineToRelative(3f, 3f)
            }
        }.build()
        
        return _EscalatorUp!!
    }

private var _EscalatorUp: ImageVector? = null

