package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Redo: ImageVector
    get() {
        if (_Redo != null) return _Redo!!
        
        _Redo = ImageVector.Builder(
            name = "redo",
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
                moveTo(21f, 7f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-6f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 17f)
                arcToRelative(9f, 9f, 0f, false, true, 9f, -9f)
                arcToRelative(9f, 9f, 0f, false, true, 6f, 2.3f)
                lineToRelative(3f, 2.7f)
            }
        }.build()
        
        return _Redo!!
    }

private var _Redo: ImageVector? = null

