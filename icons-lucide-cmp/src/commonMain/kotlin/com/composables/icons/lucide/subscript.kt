package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Subscript: ImageVector
    get() {
        if (_Subscript != null) return _Subscript!!
        
        _Subscript = ImageVector.Builder(
            name = "subscript",
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
                moveTo(4f, 5f)
                lineToRelative(8f, 8f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 5f)
                lineToRelative(-8f, 8f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20f, 19f)
                horizontalLineToRelative(-4f)
                curveToRelative(0f, -1.5f, 0.44f, -2f, 1.5f, -2.5f)
                reflectiveCurveTo(20f, 15.33f, 20f, 14f)
                curveToRelative(0f, -0.47f, -0.17f, -0.93f, -0.48f, -1.29f)
                arcToRelative(2.11f, 2.11f, 0f, false, false, -2.62f, -0.44f)
                curveToRelative(-0.42f, 0.24f, -0.74f, 0.62f, -0.9f, 1.07f)
            }
        }.build()
        
        return _Subscript!!
    }

private var _Subscript: ImageVector? = null

