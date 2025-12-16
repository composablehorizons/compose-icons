package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.UserRoundSearch: ImageVector
    get() {
        if (_UserRoundSearch != null) return _UserRoundSearch!!
        
        _UserRoundSearch = ImageVector.Builder(
            name = "user-round-search",
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
                moveTo(15f, 8f)
                arcTo(5f, 5f, 0f, false, true, 10f, 13f)
                arcTo(5f, 5f, 0f, false, true, 5f, 8f)
                arcTo(5f, 5f, 0f, false, true, 15f, 8f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 21f)
                arcToRelative(8f, 8f, 0f, false, true, 10.434f, -7.62f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21f, 18f)
                arcTo(3f, 3f, 0f, false, true, 18f, 21f)
                arcTo(3f, 3f, 0f, false, true, 15f, 18f)
                arcTo(3f, 3f, 0f, false, true, 21f, 18f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 22f)
                lineToRelative(-1.9f, -1.9f)
            }
        }.build()
        
        return _UserRoundSearch!!
    }

private var _UserRoundSearch: ImageVector? = null

