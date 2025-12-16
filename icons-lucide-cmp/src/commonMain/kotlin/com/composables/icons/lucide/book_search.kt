package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.BookSearch: ImageVector
    get() {
        if (_BookSearch != null) return _BookSearch!!
        
        _BookSearch = ImageVector.Builder(
            name = "book-search",
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
                moveTo(11f, 22f)
                horizontalLineTo(5.5f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, -5f)
                horizontalLineToRelative(4.501f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21f, 22f)
                lineToRelative(-1.879f, -1.878f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 19.5f)
                verticalLineToRelative(-15f)
                arcTo(2.5f, 2.5f, 0f, false, true, 5.5f, 2f)
                horizontalLineTo(18f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(8f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20f, 18f)
                arcTo(3f, 3f, 0f, false, true, 17f, 21f)
                arcTo(3f, 3f, 0f, false, true, 14f, 18f)
                arcTo(3f, 3f, 0f, false, true, 20f, 18f)
                close()
            }
        }.build()
        
        return _BookSearch!!
    }

private var _BookSearch: ImageVector? = null

