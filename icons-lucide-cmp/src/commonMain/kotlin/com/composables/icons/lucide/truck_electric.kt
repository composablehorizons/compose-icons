package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.TruckElectric: ImageVector
    get() {
        if (_TruckElectric != null) return _TruckElectric!!
        
        _TruckElectric = ImageVector.Builder(
            name = "truck-electric",
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
                moveTo(14f, 19f)
                verticalLineTo(7f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                horizontalLineTo(9f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 19f)
                horizontalLineTo(9f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19f, 19f)
                horizontalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                verticalLineToRelative(-3.65f)
                arcToRelative(1f, 1f, 0f, false, false, -0.22f, -0.62f)
                lineTo(18.3f, 9.38f)
                arcToRelative(1f, 1f, 0f, false, false, -0.78f, -0.38f)
                horizontalLineTo(14f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 13f)
                verticalLineToRelative(5f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(2f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4f, 3f)
                lineTo(2.15f, 5.15f)
                arcToRelative(0.495f, 0.495f, 0f, false, false, 0.35f, 0.86f)
                horizontalLineToRelative(2.15f)
                arcToRelative(0.47f, 0.47f, 0f, false, true, 0.35f, 0.86f)
                lineTo(3f, 9.02f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19f, 19f)
                arcTo(2f, 2f, 0f, false, true, 17f, 21f)
                arcTo(2f, 2f, 0f, false, true, 15f, 19f)
                arcTo(2f, 2f, 0f, false, true, 19f, 19f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 19f)
                arcTo(2f, 2f, 0f, false, true, 7f, 21f)
                arcTo(2f, 2f, 0f, false, true, 5f, 19f)
                arcTo(2f, 2f, 0f, false, true, 9f, 19f)
                close()
            }
        }.build()
        
        return _TruckElectric!!
    }

private var _TruckElectric: ImageVector? = null

