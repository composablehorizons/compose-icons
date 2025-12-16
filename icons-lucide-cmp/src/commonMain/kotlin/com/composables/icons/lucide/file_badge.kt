package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.FileBadge: ImageVector
    get() {
        if (_FileBadge != null) return _FileBadge!!
        
        _FileBadge = ImageVector.Builder(
            name = "file-badge",
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
                moveTo(13f, 22f)
                horizontalLineToRelative(5f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineTo(8f)
                arcToRelative(2.4f, 2.4f, 0f, false, false, -0.706f, -1.706f)
                lineToRelative(-3.588f, -3.588f)
                arcTo(2.4f, 2.4f, 0f, false, false, 14f, 2f)
                horizontalLineTo(6f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(3.3f)
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
                moveTo(7.69f, 16.479f)
                lineToRelative(1.29f, 4.88f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.698f, 0.591f)
                lineToRelative(-1.843f, -0.849f)
                arcToRelative(1f, 1f, 0f, false, false, -0.879f, 0.001f)
                lineToRelative(-1.846f, 0.85f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.692f, -0.593f)
                lineToRelative(1.29f, -4.88f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 14f)
                arcTo(3f, 3f, 0f, false, true, 6f, 17f)
                arcTo(3f, 3f, 0f, false, true, 3f, 14f)
                arcTo(3f, 3f, 0f, false, true, 9f, 14f)
                close()
            }
        }.build()
        
        return _FileBadge!!
    }

private var _FileBadge: ImageVector? = null

