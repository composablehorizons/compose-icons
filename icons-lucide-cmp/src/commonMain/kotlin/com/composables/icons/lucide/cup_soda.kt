package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.CupSoda: ImageVector
    get() {
        if (_CupSoda != null) return _CupSoda!!
        
        _CupSoda = ImageVector.Builder(
            name = "cup-soda",
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
                moveTo(6f, 8f)
                lineToRelative(1.75f, 12.28f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 1.72f)
                horizontalLineToRelative(4.54f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -1.72f)
                lineTo(18f, 8f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5f, 8f)
                horizontalLineToRelative(14f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 15f)
                arcToRelative(6.47f, 6.47f, 0f, false, true, 5f, 0f)
                arcToRelative(6.47f, 6.47f, 0f, false, false, 5f, 0f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 8f)
                lineToRelative(1f, -6f)
                horizontalLineToRelative(2f)
            }
        }.build()
        
        return _CupSoda!!
    }

private var _CupSoda: ImageVector? = null

