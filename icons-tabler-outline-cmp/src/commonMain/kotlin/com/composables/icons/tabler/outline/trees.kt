package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Trees: ImageVector
    get() {
        if (_Trees != null) return _Trees!!
        
        _Trees = ImageVector.Builder(
            name = "trees",
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
                moveTo(16f, 5f)
                lineToRelative(3f, 3f)
                lineToRelative(-2f, 1f)
                lineToRelative(4f, 4f)
                lineToRelative(-3f, 1f)
                lineToRelative(4f, 4f)
                horizontalLineToRelative(-9f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 21f)
                lineToRelative(0f, -3f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 13f)
                lineToRelative(-2f, -2f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 12f)
                lineToRelative(2f, -2f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 21f)
                verticalLineToRelative(-13f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5.824f, 16f)
                arcToRelative(3f, 3f, 0f, false, true, -2.743f, -3.69f)
                arcToRelative(3f, 3f, 0f, false, true, 0.304f, -4.833f)
                arcToRelative(3f, 3f, 0f, false, true, 4.615f, -3.707f)
                arcToRelative(3f, 3f, 0f, false, true, 4.614f, 3.707f)
                arcToRelative(3f, 3f, 0f, false, true, 0.305f, 4.833f)
                arcToRelative(3f, 3f, 0f, false, true, -2.919f, 3.695f)
                horizontalLineToRelative(-4f)
                close()
            }
        }.build()
        
        return _Trees!!
    }

private var _Trees: ImageVector? = null

