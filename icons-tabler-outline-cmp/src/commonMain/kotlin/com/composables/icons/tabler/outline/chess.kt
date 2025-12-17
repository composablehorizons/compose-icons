package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Chess: ImageVector
    get() {
        if (_Chess != null) return _Chess!!
        
        _Chess = ImageVector.Builder(
            name = "chess",
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
                moveTo(12f, 3f)
                arcToRelative(3f, 3f, 0f, false, true, 3f, 3f)
                curveToRelative(0f, 1.113f, -0.6f, 2.482f, -1.5f, 3f)
                lineToRelative(1.5f, 7f)
                horizontalLineToRelative(-6f)
                lineToRelative(1.5f, -7f)
                curveToRelative(-0.9f, -0.518f, -1.5f, -1.887f, -1.5f, -3f)
                arcToRelative(3f, 3f, 0f, false, true, 3f, -3f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 9f)
                horizontalLineToRelative(8f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6.684f, 16.772f)
                arcToRelative(1f, 1f, 0f, false, false, -0.684f, 0.949f)
                verticalLineToRelative(1.279f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(10f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                verticalLineToRelative(-1.28f)
                arcToRelative(1f, 1f, 0f, false, false, -0.684f, -0.948f)
                lineToRelative(-2.316f, -0.772f)
                horizontalLineToRelative(-6f)
                lineToRelative(-2.316f, 0.772f)
                close()
            }
        }.build()
        
        return _Chess!!
    }

private var _Chess: ImageVector? = null

