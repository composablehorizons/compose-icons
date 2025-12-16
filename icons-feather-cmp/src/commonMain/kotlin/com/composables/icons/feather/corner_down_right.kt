package com.composables.icons.feather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Feather.CornerDownRight: ImageVector
    get() {
        if (_CornerDownRight != null) return _CornerDownRight!!
        
        _CornerDownRight = ImageVector.Builder(
            name = "corner-down-right",
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
                moveTo(15f, 10f)
                lineTo(20f, 15f)
                lineTo(15f, 20f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4f, 4f)
                verticalLineToRelative(7f)
                arcToRelative(4f, 4f, 0f, false, false, 4f, 4f)
                horizontalLineToRelative(12f)
            }
        }.build()
        
        return _CornerDownRight!!
    }

private var _CornerDownRight: ImageVector? = null

