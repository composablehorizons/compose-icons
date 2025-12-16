package com.composables.icons.feather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Feather.CornerDownLeft: ImageVector
    get() {
        if (_CornerDownLeft != null) return _CornerDownLeft!!
        
        _CornerDownLeft = ImageVector.Builder(
            name = "corner-down-left",
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
                moveTo(9f, 10f)
                lineTo(4f, 15f)
                lineTo(9f, 20f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20f, 4f)
                verticalLineToRelative(7f)
                arcToRelative(4f, 4f, 0f, false, true, -4f, 4f)
                horizontalLineTo(4f)
            }
        }.build()
        
        return _CornerDownLeft!!
    }

private var _CornerDownLeft: ImageVector? = null

