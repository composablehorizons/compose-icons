package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.SquarePen: ImageVector
    get() {
        if (_SquarePen != null) return _SquarePen!!
        
        _SquarePen = ImageVector.Builder(
            name = "square-pen",
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
                moveTo(12f, 3f)
                horizontalLineTo(5f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(14f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(14f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineToRelative(-7f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18.375f, 2.625f)
                arcToRelative(1f, 1f, 0f, false, true, 3f, 3f)
                lineToRelative(-9.013f, 9.014f)
                arcToRelative(2f, 2f, 0f, false, true, -0.853f, 0.505f)
                lineToRelative(-2.873f, 0.84f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.62f, -0.62f)
                lineToRelative(0.84f, -2.873f)
                arcToRelative(2f, 2f, 0f, false, true, 0.506f, -0.852f)
                close()
            }
        }.build()
        
        return _SquarePen!!
    }

private var _SquarePen: ImageVector? = null

