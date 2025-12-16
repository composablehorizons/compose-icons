package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.FolderGit2: ImageVector
    get() {
        if (_FolderGit2 != null) return _FolderGit2!!
        
        _FolderGit2 = ImageVector.Builder(
            name = "folder-git-2",
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
                moveTo(18f, 19f)
                arcToRelative(5f, 5f, 0f, false, true, -5f, -5f)
                verticalLineToRelative(8f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 20f)
                horizontalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineTo(5f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(3.9f)
                arcToRelative(2f, 2f, 0f, false, true, 1.69f, 0.9f)
                lineToRelative(0.81f, 1.2f)
                arcToRelative(2f, 2f, 0f, false, false, 1.67f, 0.9f)
                horizontalLineTo(20f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 12f)
                arcTo(2f, 2f, 0f, false, true, 13f, 14f)
                arcTo(2f, 2f, 0f, false, true, 11f, 12f)
                arcTo(2f, 2f, 0f, false, true, 15f, 12f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 19f)
                arcTo(2f, 2f, 0f, false, true, 20f, 21f)
                arcTo(2f, 2f, 0f, false, true, 18f, 19f)
                arcTo(2f, 2f, 0f, false, true, 22f, 19f)
                close()
            }
        }.build()
        
        return _FolderGit2!!
    }

private var _FolderGit2: ImageVector? = null

