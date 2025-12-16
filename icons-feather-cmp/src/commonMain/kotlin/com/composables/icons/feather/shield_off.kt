package com.composables.icons.feather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Feather.ShieldOff: ImageVector
    get() {
        if (_ShieldOff != null) return _ShieldOff!!
        
        _ShieldOff = ImageVector.Builder(
            name = "shield-off",
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
                moveTo(19.69f, 14f)
                arcToRelative(6.9f, 6.9f, 0f, false, false, 0.31f, -2f)
                verticalLineTo(5f)
                lineToRelative(-8f, -3f)
                lineToRelative(-3.16f, 1.18f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4.73f, 4.73f)
                lineTo(4f, 5f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 6f, 8f, 10f, 8f, 10f)
                arcToRelative(20.29f, 20.29f, 0f, false, false, 5.62f, -4.38f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(1f, 1f)
                lineTo(23f, 23f)
            }
        }.build()
        
        return _ShieldOff!!
    }

private var _ShieldOff: ImageVector? = null

