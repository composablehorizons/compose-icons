package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.LaptopMinimalCheck: ImageVector
    get() {
        if (_LaptopMinimalCheck != null) return _LaptopMinimalCheck!!
        
        _LaptopMinimalCheck = ImageVector.Builder(
            name = "laptop-minimal-check",
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
                moveTo(2f, 20f)
                horizontalLineToRelative(20f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 10f)
                lineToRelative(2f, 2f)
                lineToRelative(4f, -4f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5f, 4f)
                horizontalLineTo(19f)
                arcTo(2f, 2f, 0f, false, true, 21f, 6f)
                verticalLineTo(14f)
                arcTo(2f, 2f, 0f, false, true, 19f, 16f)
                horizontalLineTo(5f)
                arcTo(2f, 2f, 0f, false, true, 3f, 14f)
                verticalLineTo(6f)
                arcTo(2f, 2f, 0f, false, true, 5f, 4f)
                close()
            }
        }.build()
        
        return _LaptopMinimalCheck!!
    }

private var _LaptopMinimalCheck: ImageVector? = null

