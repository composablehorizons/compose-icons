package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Skull: ImageVector
    get() {
        if (_Skull != null) return _Skull!!
        
        _Skull = ImageVector.Builder(
            name = "skull",
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
                moveTo(12.5f, 17f)
                lineToRelative(-0.5f, -1f)
                lineToRelative(-0.5f, 1f)
                horizontalLineToRelative(1f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 22f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                verticalLineToRelative(-1f)
                arcToRelative(2f, 2f, 0f, false, false, 1.56f, -3.25f)
                arcToRelative(8f, 8f, 0f, true, false, -11.12f, 0f)
                arcTo(2f, 2f, 0f, false, false, 8f, 20f)
                verticalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 12f)
                arcTo(1f, 1f, 0f, false, true, 15f, 13f)
                arcTo(1f, 1f, 0f, false, true, 14f, 12f)
                arcTo(1f, 1f, 0f, false, true, 16f, 12f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 12f)
                arcTo(1f, 1f, 0f, false, true, 9f, 13f)
                arcTo(1f, 1f, 0f, false, true, 8f, 12f)
                arcTo(1f, 1f, 0f, false, true, 10f, 12f)
                close()
            }
        }.build()
        
        return _Skull!!
    }

private var _Skull: ImageVector? = null

