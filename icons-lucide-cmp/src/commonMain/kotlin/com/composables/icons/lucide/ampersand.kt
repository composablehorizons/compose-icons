package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Ampersand: ImageVector
    get() {
        if (_Ampersand != null) return _Ampersand!!
        
        _Ampersand = ImageVector.Builder(
            name = "ampersand",
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
                moveTo(16f, 12f)
                horizontalLineToRelative(3f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17.5f, 12f)
                arcToRelative(8f, 8f, 0f, false, true, -8f, 8f)
                arcTo(4.5f, 4.5f, 0f, false, true, 5f, 15.5f)
                curveToRelative(0f, -6f, 8f, -4f, 8f, -8.5f)
                arcToRelative(3f, 3f, 0f, true, false, -6f, 0f)
                curveToRelative(0f, 3f, 2.5f, 8.5f, 12f, 13f)
            }
        }.build()
        
        return _Ampersand!!
    }

private var _Ampersand: ImageVector? = null

