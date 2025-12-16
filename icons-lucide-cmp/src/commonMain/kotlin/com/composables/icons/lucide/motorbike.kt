package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Motorbike: ImageVector
    get() {
        if (_Motorbike != null) return _Motorbike!!
        
        _Motorbike = ImageVector.Builder(
            name = "motorbike",
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
                moveTo(18f, 14f)
                lineToRelative(-1f, -3f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 9f)
                lineToRelative(6f, 2f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(2f)
                arcToRelative(2f, 2f, 0f, false, true, 1.99f, 1.81f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 17f)
                horizontalLineToRelative(3f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                arcToRelative(6f, 6f, 0f, false, true, 6f, -6f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                verticalLineToRelative(-0.75f)
                arcTo(5f, 5f, 0f, false, false, 17f, 5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 17f)
                arcTo(3f, 3f, 0f, false, true, 19f, 20f)
                arcTo(3f, 3f, 0f, false, true, 16f, 17f)
                arcTo(3f, 3f, 0f, false, true, 22f, 17f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 17f)
                arcTo(3f, 3f, 0f, false, true, 5f, 20f)
                arcTo(3f, 3f, 0f, false, true, 2f, 17f)
                arcTo(3f, 3f, 0f, false, true, 8f, 17f)
                close()
            }
        }.build()
        
        return _Motorbike!!
    }

private var _Motorbike: ImageVector? = null

