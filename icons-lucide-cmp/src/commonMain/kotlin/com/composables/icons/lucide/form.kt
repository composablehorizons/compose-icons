package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Form: ImageVector
    get() {
        if (_Form != null) return _Form!!
        
        _Form = ImageVector.Builder(
            name = "form",
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
                moveTo(4f, 14f)
                horizontalLineToRelative(6f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4f, 2f)
                horizontalLineToRelative(10f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5f, 18f)
                horizontalLineTo(19f)
                arcTo(1f, 1f, 0f, false, true, 20f, 19f)
                verticalLineTo(21f)
                arcTo(1f, 1f, 0f, false, true, 19f, 22f)
                horizontalLineTo(5f)
                arcTo(1f, 1f, 0f, false, true, 4f, 21f)
                verticalLineTo(19f)
                arcTo(1f, 1f, 0f, false, true, 5f, 18f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5f, 6f)
                horizontalLineTo(19f)
                arcTo(1f, 1f, 0f, false, true, 20f, 7f)
                verticalLineTo(9f)
                arcTo(1f, 1f, 0f, false, true, 19f, 10f)
                horizontalLineTo(5f)
                arcTo(1f, 1f, 0f, false, true, 4f, 9f)
                verticalLineTo(7f)
                arcTo(1f, 1f, 0f, false, true, 5f, 6f)
                close()
            }
        }.build()
        
        return _Form!!
    }

private var _Form: ImageVector? = null

