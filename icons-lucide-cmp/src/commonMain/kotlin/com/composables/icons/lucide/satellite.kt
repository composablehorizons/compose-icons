package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Satellite: ImageVector
    get() {
        if (_Satellite != null) return _Satellite!!
        
        _Satellite = ImageVector.Builder(
            name = "satellite",
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
                moveTo(13.5f, 6.5f)
                lineToRelative(-3.148f, -3.148f)
                arcToRelative(1.205f, 1.205f, 0f, false, false, -1.704f, 0f)
                lineTo(6.352f, 5.648f)
                arcToRelative(1.205f, 1.205f, 0f, false, false, 0f, 1.704f)
                lineTo(9.5f, 10.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16.5f, 7.5f)
                lineTo(19f, 5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17.5f, 10.5f)
                lineToRelative(3.148f, 3.148f)
                arcToRelative(1.205f, 1.205f, 0f, false, true, 0f, 1.704f)
                lineToRelative(-2.296f, 2.296f)
                arcToRelative(1.205f, 1.205f, 0f, false, true, -1.704f, 0f)
                lineTo(13.5f, 14.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 21f)
                arcToRelative(6f, 6f, 0f, false, false, -6f, -6f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.352f, 10.648f)
                arcToRelative(1.205f, 1.205f, 0f, false, false, 0f, 1.704f)
                lineToRelative(2.296f, 2.296f)
                arcToRelative(1.205f, 1.205f, 0f, false, false, 1.704f, 0f)
                lineToRelative(4.296f, -4.296f)
                arcToRelative(1.205f, 1.205f, 0f, false, false, 0f, -1.704f)
                lineToRelative(-2.296f, -2.296f)
                arcToRelative(1.205f, 1.205f, 0f, false, false, -1.704f, 0f)
                close()
            }
        }.build()
        
        return _Satellite!!
    }

private var _Satellite: ImageVector? = null

