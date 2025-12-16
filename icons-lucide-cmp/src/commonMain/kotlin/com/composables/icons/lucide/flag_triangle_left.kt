package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.FlagTriangleLeft: ImageVector
    get() {
        if (_FlagTriangleLeft != null) return _FlagTriangleLeft!!
        
        _FlagTriangleLeft = ImageVector.Builder(
            name = "flag-triangle-left",
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
                moveTo(18f, 22f)
                verticalLineTo(2.8f)
                arcToRelative(0.8f, 0.8f, 0f, false, false, -1.17f, -0.71f)
                lineTo(5.45f, 7.78f)
                arcToRelative(0.8f, 0.8f, 0f, false, false, 0f, 1.44f)
                lineTo(18f, 15.5f)
            }
        }.build()
        
        return _FlagTriangleLeft!!
    }

private var _FlagTriangleLeft: ImageVector? = null

