package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.AB2: ImageVector
    get() {
        if (_AB2 != null) return _AB2!!
        
        _AB2 = ImageVector.Builder(
            name = "a-b-2",
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
                moveTo(16f, 21f)
                horizontalLineToRelative(3f)
                curveToRelative(0.81f, 0f, 1.48f, -0.67f, 1.48f, -1.48f)
                lineToRelative(0.02f, -0.02f)
                curveToRelative(0f, -0.82f, -0.69f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 15f)
                horizontalLineToRelative(2.5f)
                curveToRelative(0.84f, -0.01f, 1.5f, 0.66f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.66f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(-3f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4f, 9f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -1.036f, 0.895f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.964f, 2f, 2f)
                verticalLineToRelative(4f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2.99f, 11.98f)
                arcToRelative(9f, 9f, 0f, false, false, 9f, 9f)
                moveToRelative(9f, -9f)
                arcToRelative(9f, 9f, 0f, false, false, -9f, -9f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 7f)
                horizontalLineToRelative(-4f)
            }
        }.build()
        
        return _AB2!!
    }

private var _AB2: ImageVector? = null

