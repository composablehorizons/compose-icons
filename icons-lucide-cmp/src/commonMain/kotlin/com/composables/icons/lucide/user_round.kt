package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.UserRound: ImageVector
    get() {
        if (_UserRound != null) return _UserRound!!
        
        _UserRound = ImageVector.Builder(
            name = "user-round",
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
                moveTo(17f, 8f)
                arcTo(5f, 5f, 0f, false, true, 12f, 13f)
                arcTo(5f, 5f, 0f, false, true, 7f, 8f)
                arcTo(5f, 5f, 0f, false, true, 17f, 8f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20f, 21f)
                arcToRelative(8f, 8f, 0f, false, false, -16f, 0f)
            }
        }.build()
        
        return _UserRound!!
    }

private var _UserRound: ImageVector? = null

