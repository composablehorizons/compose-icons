package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.FileSearchCorner: ImageVector
    get() {
        if (_FileSearchCorner != null) return _FileSearchCorner!!
        
        _FileSearchCorner = ImageVector.Builder(
            name = "file-search-corner",
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
                moveTo(11.1f, 22f)
                horizontalLineTo(6f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(8f)
                arcToRelative(2.4f, 2.4f, 0f, false, true, 1.706f, 0.706f)
                lineToRelative(3.589f, 3.588f)
                arcTo(2.4f, 2.4f, 0f, false, true, 20f, 8f)
                verticalLineToRelative(3.25f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 2f)
                verticalLineToRelative(5f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21f, 22f)
                lineToRelative(-2.88f, -2.88f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19f, 17f)
                arcTo(3f, 3f, 0f, false, true, 16f, 20f)
                arcTo(3f, 3f, 0f, false, true, 13f, 17f)
                arcTo(3f, 3f, 0f, false, true, 19f, 17f)
                close()
            }
        }.build()
        
        return _FileSearchCorner!!
    }

private var _FileSearchCorner: ImageVector? = null

