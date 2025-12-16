package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.FolderOpen: ImageVector
    get() {
        if (_FolderOpen != null) return _FolderOpen!!
        
        _FolderOpen = ImageVector.Builder(
            name = "folder-open",
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
                moveTo(6f, 14f)
                lineToRelative(1.5f, -2.9f)
                arcTo(2f, 2f, 0f, false, true, 9.24f, 10f)
                horizontalLineTo(20f)
                arcToRelative(2f, 2f, 0f, false, true, 1.94f, 2.5f)
                lineToRelative(-1.54f, 6f)
                arcToRelative(2f, 2f, 0f, false, true, -1.95f, 1.5f)
                horizontalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineTo(5f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(3.9f)
                arcToRelative(2f, 2f, 0f, false, true, 1.69f, 0.9f)
                lineToRelative(0.81f, 1.2f)
                arcToRelative(2f, 2f, 0f, false, false, 1.67f, 0.9f)
                horizontalLineTo(18f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(2f)
            }
        }.build()
        
        return _FolderOpen!!
    }

private var _FolderOpen: ImageVector? = null

