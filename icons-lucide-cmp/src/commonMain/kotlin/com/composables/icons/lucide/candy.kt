package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Candy: ImageVector
    get() {
        if (_Candy != null) return _Candy!!
        
        _Candy = ImageVector.Builder(
            name = "candy",
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
                moveTo(10f, 7f)
                verticalLineToRelative(10.9f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 6.1f)
                verticalLineTo(17f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 7f)
                verticalLineTo(3f)
                arcToRelative(1f, 1f, 0f, false, true, 1.707f, -0.707f)
                arcToRelative(2.5f, 2.5f, 0f, false, false, 2.152f, 0.717f)
                arcToRelative(1f, 1f, 0f, false, true, 1.131f, 1.131f)
                arcToRelative(2.5f, 2.5f, 0f, false, false, 0.717f, 2.152f)
                arcTo(1f, 1f, 0f, false, true, 21f, 8f)
                horizontalLineToRelative(-4f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16.536f, 7.465f)
                arcToRelative(5f, 5f, 0f, false, false, -7.072f, 0f)
                lineToRelative(-2f, 2f)
                arcToRelative(5f, 5f, 0f, false, false, 0f, 7.07f)
                arcToRelative(5f, 5f, 0f, false, false, 7.072f, 0f)
                lineToRelative(2f, -2f)
                arcToRelative(5f, 5f, 0f, false, false, 0f, -7.07f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 17f)
                verticalLineToRelative(4f)
                arcToRelative(1f, 1f, 0f, false, true, -1.707f, 0.707f)
                arcToRelative(2.5f, 2.5f, 0f, false, false, -2.152f, -0.717f)
                arcToRelative(1f, 1f, 0f, false, true, -1.131f, -1.131f)
                arcToRelative(2.5f, 2.5f, 0f, false, false, -0.717f, -2.152f)
                arcTo(1f, 1f, 0f, false, true, 3f, 16f)
                horizontalLineToRelative(4f)
            }
        }.build()
        
        return _Candy!!
    }

private var _Candy: ImageVector? = null

