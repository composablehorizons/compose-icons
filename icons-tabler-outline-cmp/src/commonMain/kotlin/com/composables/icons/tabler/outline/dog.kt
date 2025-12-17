package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Dog: ImageVector
    get() {
        if (_Dog != null) return _Dog!!
        
        _Dog = ImageVector.Builder(
            name = "dog",
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
                moveTo(11f, 5f)
                horizontalLineToRelative(2f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19f, 12f)
                curveToRelative(-0.667f, 5.333f, -2.333f, 8f, -5f, 8f)
                horizontalLineToRelative(-4f)
                curveToRelative(-2.667f, 0f, -4.333f, -2.667f, -5f, -8f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11f, 16f)
                curveToRelative(0f, 0.667f, 0.333f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.333f, 1f, -1f)
                horizontalLineToRelative(-2f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 18f)
                verticalLineToRelative(2f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 11f)
                verticalLineToRelative(0.01f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 11f)
                verticalLineToRelative(0.01f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5f, 4f)
                lineToRelative(6f, 0.97f)
                lineToRelative(-6.238f, 6.688f)
                arcToRelative(1.021f, 1.021f, 0f, false, true, -1.41f, 0.111f)
                arcToRelative(0.953f, 0.953f, 0f, false, true, -0.327f, -0.954f)
                lineToRelative(1.975f, -6.815f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19f, 4f)
                lineToRelative(-6f, 0.97f)
                lineToRelative(6.238f, 6.688f)
                curveToRelative(0.358f, 0.408f, 0.989f, 0.458f, 1.41f, 0.111f)
                arcToRelative(0.953f, 0.953f, 0f, false, false, 0.327f, -0.954f)
                lineToRelative(-1.975f, -6.815f)
                close()
            }
        }.build()
        
        return _Dog!!
    }

private var _Dog: ImageVector? = null

