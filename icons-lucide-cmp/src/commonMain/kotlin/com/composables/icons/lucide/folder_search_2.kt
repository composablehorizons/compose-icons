package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.FolderSearch2: ImageVector
    get() {
        if (_FolderSearch2 != null) return _FolderSearch2!!
        
        _FolderSearch2 = ImageVector.Builder(
            name = "folder-search-2",
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
                moveTo(14f, 12.5f)
                arcTo(2.5f, 2.5f, 0f, false, true, 11.5f, 15f)
                arcTo(2.5f, 2.5f, 0f, false, true, 9f, 12.5f)
                arcTo(2.5f, 2.5f, 0f, false, true, 14f, 12.5f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20f, 20f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineTo(8f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                horizontalLineToRelative(-7.9f)
                arcToRelative(2f, 2f, 0f, false, true, -1.69f, -0.9f)
                lineTo(9.6f, 3.9f)
                arcTo(2f, 2f, 0f, false, false, 7.93f, 3f)
                horizontalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(13f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13.3f, 14.3f)
                lineTo(15f, 16f)
            }
        }.build()
        
        return _FolderSearch2!!
    }

private var _FolderSearch2: ImageVector? = null

