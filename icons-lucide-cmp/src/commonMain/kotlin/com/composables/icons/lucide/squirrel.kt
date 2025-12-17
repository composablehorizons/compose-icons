package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Squirrel: ImageVector
    get() {
        if (_Squirrel != null) return _Squirrel!!
        
        _Squirrel = ImageVector.Builder(
            name = "squirrel",
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
                moveTo(15.236f, 22f)
                arcToRelative(3f, 3f, 0f, false, false, -2.2f, -5f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 20f)
                arcToRelative(3f, 3f, 0f, false, true, 3f, -3f)
                horizontalLineToRelative(1f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineToRelative(-2f)
                arcToRelative(4f, 4f, 0f, false, false, -4f, -4f)
                verticalLineTo(4f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18f, 13f)
                horizontalLineToRelative(0.01f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18f, 6f)
                arcToRelative(4f, 4f, 0f, false, false, -4f, 4f)
                arcToRelative(7f, 7f, 0f, false, false, -7f, 7f)
                curveToRelative(0f, -5f, 4f, -5f, 4f, -10.5f)
                arcToRelative(4.5f, 4.5f, 0f, true, false, -9f, 0f)
                arcToRelative(2.5f, 2.5f, 0f, false, false, 5f, 0f)
                curveTo(7f, 10f, 3f, 11f, 3f, 17f)
                curveToRelative(0f, 2.8f, 2.2f, 5f, 5f, 5f)
                horizontalLineToRelative(10f)
            }
        }.build()
        
        return _Squirrel!!
    }

private var _Squirrel: ImageVector? = null

