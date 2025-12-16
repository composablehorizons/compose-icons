package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Rose: ImageVector
    get() {
        if (_Rose != null) return _Rose!!
        
        _Rose = ImageVector.Builder(
            name = "rose",
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
                moveTo(17f, 10f)
                horizontalLineToRelative(-1f)
                arcToRelative(4f, 4f, 0f, true, true, 4f, -4f)
                verticalLineToRelative(0.534f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17f, 6f)
                horizontalLineToRelative(1f)
                arcToRelative(4f, 4f, 0f, false, true, 1.42f, 7.74f)
                lineToRelative(-2.29f, 0.87f)
                arcToRelative(6f, 6f, 0f, false, true, -5.339f, -10.68f)
                lineToRelative(2.069f, -1.31f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4.5f, 17f)
                curveToRelative(2.8f, -0.5f, 4.4f, 0f, 5.5f, 0.8f)
                reflectiveCurveToRelative(1.8f, 2.2f, 2.3f, 3.7f)
                curveToRelative(-2f, 0.4f, -3.5f, 0.4f, -4.8f, -0.3f)
                curveToRelative(-1.2f, -0.6f, -2.3f, -1.9f, -3f, -4.2f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.77f, 12f)
                curveTo(4f, 15f, 2f, 22f, 2f, 22f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19f, 8f)
                arcTo(2f, 2f, 0f, false, true, 17f, 10f)
                arcTo(2f, 2f, 0f, false, true, 15f, 8f)
                arcTo(2f, 2f, 0f, false, true, 19f, 8f)
                close()
            }
        }.build()
        
        return _Rose!!
    }

private var _Rose: ImageVector? = null

