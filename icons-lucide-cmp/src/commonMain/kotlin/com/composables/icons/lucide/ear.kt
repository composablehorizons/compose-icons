package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Ear: ImageVector
    get() {
        if (_Ear != null) return _Ear!!
        
        _Ear = ImageVector.Builder(
            name = "ear",
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
                moveTo(6f, 8.5f)
                arcToRelative(6.5f, 6.5f, 0f, true, true, 13f, 0f)
                curveToRelative(0f, 6f, -6f, 6f, -6f, 10f)
                arcToRelative(3.5f, 3.5f, 0f, true, true, -7f, 0f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 8.5f)
                arcToRelative(2.5f, 2.5f, 0f, false, false, -5f, 0f)
                verticalLineToRelative(1f)
                arcToRelative(2f, 2f, 0f, true, true, 0f, 4f)
            }
        }.build()
        
        return _Ear!!
    }

private var _Ear: ImageVector? = null

