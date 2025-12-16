package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.CakeSlice: ImageVector
    get() {
        if (_CakeSlice != null) return _CakeSlice!!
        
        _CakeSlice = ImageVector.Builder(
            name = "cake-slice",
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
                moveTo(16f, 13f)
                horizontalLineTo(3f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 17f)
                horizontalLineTo(3f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7.2f, 7.9f)
                lineToRelative(-3.388f, 2.5f)
                arcTo(2f, 2f, 0f, false, false, 3f, 12.01f)
                verticalLineTo(20f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(16f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                verticalLineToRelative(-8.654f)
                curveToRelative(0f, -2f, -2.44f, -6.026f, -6.44f, -8.026f)
                arcToRelative(1f, 1f, 0f, false, false, -1.082f, 0.057f)
                lineTo(10.4f, 5.6f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11f, 7f)
                arcTo(2f, 2f, 0f, false, true, 9f, 9f)
                arcTo(2f, 2f, 0f, false, true, 7f, 7f)
                arcTo(2f, 2f, 0f, false, true, 11f, 7f)
                close()
            }
        }.build()
        
        return _CakeSlice!!
    }

private var _CakeSlice: ImageVector? = null

