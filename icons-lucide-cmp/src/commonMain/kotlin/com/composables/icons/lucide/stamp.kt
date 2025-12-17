package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Stamp: ImageVector
    get() {
        if (_Stamp != null) return _Stamp!!
        
        _Stamp = ImageVector.Builder(
            name = "stamp",
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
                moveTo(14f, 13f)
                verticalLineTo(8.5f)
                curveTo(14f, 7f, 15f, 7f, 15f, 5f)
                arcToRelative(3f, 3f, 0f, false, false, -6f, 0f)
                curveToRelative(0f, 2f, 1f, 2f, 1f, 3.5f)
                verticalLineTo(13f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20f, 15.5f)
                arcToRelative(2.5f, 2.5f, 0f, false, false, -2.5f, -2.5f)
                horizontalLineToRelative(-11f)
                arcTo(2.5f, 2.5f, 0f, false, false, 4f, 15.5f)
                verticalLineTo(17f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(14f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5f, 22f)
                horizontalLineToRelative(14f)
            }
        }.build()
        
        return _Stamp!!
    }

private var _Stamp: ImageVector? = null

