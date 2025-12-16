package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.CloudCheck: ImageVector
    get() {
        if (_CloudCheck != null) return _CloudCheck!!
        
        _CloudCheck = ImageVector.Builder(
            name = "cloud-check",
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
                moveTo(17f, 15f)
                lineToRelative(-5.5f, 5.5f)
                lineTo(9f, 18f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5f, 17.743f)
                arcTo(7f, 7f, 0f, true, true, 15.71f, 10f)
                horizontalLineToRelative(1.79f)
                arcToRelative(4.5f, 4.5f, 0f, false, true, 1.5f, 8.742f)
            }
        }.build()
        
        return _CloudCheck!!
    }

private var _CloudCheck: ImageVector? = null

