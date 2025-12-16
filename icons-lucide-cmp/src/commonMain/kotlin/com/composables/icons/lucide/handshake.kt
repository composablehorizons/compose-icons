package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Handshake: ImageVector
    get() {
        if (_Handshake != null) return _Handshake!!
        
        _Handshake = ImageVector.Builder(
            name = "handshake",
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
                moveTo(11f, 17f)
                lineToRelative(2f, 2f)
                arcToRelative(1f, 1f, 0f, true, false, 3f, -3f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 14f)
                lineToRelative(2.5f, 2.5f)
                arcToRelative(1f, 1f, 0f, true, false, 3f, -3f)
                lineToRelative(-3.88f, -3.88f)
                arcToRelative(3f, 3f, 0f, false, false, -4.24f, 0f)
                lineToRelative(-0.88f, 0.88f)
                arcToRelative(1f, 1f, 0f, true, true, -3f, -3f)
                lineToRelative(2.81f, -2.81f)
                arcToRelative(5.79f, 5.79f, 0f, false, true, 7.06f, -0.87f)
                lineToRelative(0.47f, 0.28f)
                arcToRelative(2f, 2f, 0f, false, false, 1.42f, 0.25f)
                lineTo(21f, 4f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21f, 3f)
                lineToRelative(1f, 11f)
                horizontalLineToRelative(-2f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 3f)
                lineTo(2f, 14f)
                lineToRelative(6.5f, 6.5f)
                arcToRelative(1f, 1f, 0f, true, false, 3f, -3f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 4f)
                horizontalLineToRelative(8f)
            }
        }.build()
        
        return _Handshake!!
    }

private var _Handshake: ImageVector? = null

