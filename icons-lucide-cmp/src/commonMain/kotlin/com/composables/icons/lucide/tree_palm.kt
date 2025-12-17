package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.TreePalm: ImageVector
    get() {
        if (_TreePalm != null) return _TreePalm!!
        
        _TreePalm = ImageVector.Builder(
            name = "tree-palm",
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
                moveTo(13f, 8f)
                curveToRelative(0f, -2.76f, -2.46f, -5f, -5.5f, -5f)
                reflectiveCurveTo(2f, 5.24f, 2f, 8f)
                horizontalLineToRelative(2f)
                lineToRelative(1f, -1f)
                lineToRelative(1f, 1f)
                horizontalLineToRelative(4f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13f, 7.14f)
                arcTo(5.82f, 5.82f, 0f, false, true, 16.5f, 6f)
                curveToRelative(3.04f, 0f, 5.5f, 2.24f, 5.5f, 5f)
                horizontalLineToRelative(-3f)
                lineToRelative(-1f, -1f)
                lineToRelative(-1f, 1f)
                horizontalLineToRelative(-3f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5.89f, 9.71f)
                curveToRelative(-2.15f, 2.15f, -2.3f, 5.47f, -0.35f, 7.43f)
                lineToRelative(4.24f, -4.25f)
                lineToRelative(0.7f, -0.7f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(2.12f, -2.12f)
                curveToRelative(-1.95f, -1.96f, -5.27f, -1.8f, -7.42f, 0.35f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11f, 15.5f)
                curveToRelative(0.5f, 2.5f, -0.17f, 4.5f, -1f, 6.5f)
                horizontalLineToRelative(4f)
                curveToRelative(2f, -5.5f, -0.5f, -12f, -1f, -14f)
            }
        }.build()
        
        return _TreePalm!!
    }

private var _TreePalm: ImageVector? = null

