package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.ContactRound: ImageVector
    get() {
        if (_ContactRound != null) return _ContactRound!!
        
        _ContactRound = ImageVector.Builder(
            name = "contact-round",
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
                moveTo(16f, 2f)
                verticalLineToRelative(2f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17.915f, 22f)
                arcToRelative(6f, 6f, 0f, false, false, -12f, 0f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 2f)
                verticalLineToRelative(2f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 12f)
                arcTo(4f, 4f, 0f, false, true, 12f, 16f)
                arcTo(4f, 4f, 0f, false, true, 8f, 12f)
                arcTo(4f, 4f, 0f, false, true, 16f, 12f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5f, 4f)
                horizontalLineTo(19f)
                arcTo(2f, 2f, 0f, false, true, 21f, 6f)
                verticalLineTo(20f)
                arcTo(2f, 2f, 0f, false, true, 19f, 22f)
                horizontalLineTo(5f)
                arcTo(2f, 2f, 0f, false, true, 3f, 20f)
                verticalLineTo(6f)
                arcTo(2f, 2f, 0f, false, true, 5f, 4f)
                close()
            }
        }.build()
        
        return _ContactRound!!
    }

private var _ContactRound: ImageVector? = null

