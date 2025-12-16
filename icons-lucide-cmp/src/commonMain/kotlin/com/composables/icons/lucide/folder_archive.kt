package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.FolderArchive: ImageVector
    get() {
        if (_FolderArchive != null) return _FolderArchive!!
        
        _FolderArchive = ImageVector.Builder(
            name = "folder-archive",
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
                moveTo(17f, 19f)
                arcTo(2f, 2f, 0f, false, true, 15f, 21f)
                arcTo(2f, 2f, 0f, false, true, 13f, 19f)
                arcTo(2f, 2f, 0f, false, true, 17f, 19f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20.9f, 19.8f)
                arcTo(2f, 2f, 0f, false, false, 22f, 18f)
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
                horizontalLineToRelative(5.1f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 11f)
                verticalLineToRelative(-1f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 17f)
                verticalLineToRelative(-2f)
            }
        }.build()
        
        return _FolderArchive!!
    }

private var _FolderArchive: ImageVector? = null

