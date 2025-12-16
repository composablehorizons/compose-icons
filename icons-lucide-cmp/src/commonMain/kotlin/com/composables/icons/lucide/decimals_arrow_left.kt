package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.DecimalsArrowLeft: ImageVector
    get() {
        if (_DecimalsArrowLeft != null) return _DecimalsArrowLeft!!
        
        _DecimalsArrowLeft = ImageVector.Builder(
            name = "decimals-arrow-left",
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
                moveTo(13f, 21f)
                lineToRelative(-3f, -3f)
                lineToRelative(3f, -3f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20f, 18f)
                horizontalLineTo(10f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 11f)
                horizontalLineToRelative(0.01f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.5f, 3f)
                horizontalLineTo(8.5f)
                arcTo(2.5f, 2.5f, 0f, false, true, 11f, 5.5f)
                verticalLineTo(8.5f)
                arcTo(2.5f, 2.5f, 0f, false, true, 8.5f, 11f)
                horizontalLineTo(8.5f)
                arcTo(2.5f, 2.5f, 0f, false, true, 6f, 8.5f)
                verticalLineTo(5.5f)
                arcTo(2.5f, 2.5f, 0f, false, true, 8.5f, 3f)
                close()
            }
        }.build()
        
        return _DecimalsArrowLeft!!
    }

private var _DecimalsArrowLeft: ImageVector? = null

