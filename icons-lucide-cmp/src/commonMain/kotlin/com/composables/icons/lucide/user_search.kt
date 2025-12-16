package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.UserSearch: ImageVector
    get() {
        if (_UserSearch != null) return _UserSearch!!
        
        _UserSearch = ImageVector.Builder(
            name = "user-search",
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
                moveTo(14f, 7f)
                arcTo(4f, 4f, 0f, false, true, 10f, 11f)
                arcTo(4f, 4f, 0f, false, true, 6f, 7f)
                arcTo(4f, 4f, 0f, false, true, 14f, 7f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10.3f, 15f)
                horizontalLineTo(7f)
                arcToRelative(4f, 4f, 0f, false, false, -4f, 4f)
                verticalLineToRelative(2f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20f, 17f)
                arcTo(3f, 3f, 0f, false, true, 17f, 20f)
                arcTo(3f, 3f, 0f, false, true, 14f, 17f)
                arcTo(3f, 3f, 0f, false, true, 20f, 17f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21f, 21f)
                lineToRelative(-1.9f, -1.9f)
            }
        }.build()
        
        return _UserSearch!!
    }

private var _UserSearch: ImageVector? = null

