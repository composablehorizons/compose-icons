package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Cherry: ImageVector
    get() {
        if (_Cherry != null) return _Cherry!!
        
        _Cherry = ImageVector.Builder(
            name = "cherry",
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
                moveTo(2f, 17f)
                arcToRelative(5f, 5f, 0f, false, false, 10f, 0f)
                curveToRelative(0f, -2.76f, -2.5f, -5f, -5f, -3f)
                curveToRelative(-2.5f, -2f, -5f, 0.24f, -5f, 3f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 17f)
                arcToRelative(5f, 5f, 0f, false, false, 10f, 0f)
                curveToRelative(0f, -2.76f, -2.5f, -5f, -5f, -3f)
                curveToRelative(-2.5f, -2f, -5f, 0.24f, -5f, 3f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 14f)
                curveToRelative(3.22f, -2.91f, 4.29f, -8.75f, 5f, -12f)
                curveToRelative(1.66f, 2.38f, 4.94f, 9f, 5f, 12f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 9f)
                curveToRelative(-4.29f, 0f, -7.14f, -2.33f, -10f, -7f)
                curveToRelative(5.71f, 0f, 10f, 4.67f, 10f, 7f)
                close()
            }
        }.build()
        
        return _Cherry!!
    }

private var _Cherry: ImageVector? = null

