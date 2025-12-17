package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.FolderOpenDot: ImageVector
    get() {
        if (_FolderOpenDot != null) return _FolderOpenDot!!
        
        _FolderOpenDot = ImageVector.Builder(
            name = "folder-open-dot",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 14f)
                lineToRelative(1.45f, -2.9f)
                arcTo(2f, 2f, 0f, false, true, 9.24f, 10f)
                horizontalLineTo(20f)
                arcToRelative(2f, 2f, 0f, false, true, 1.94f, 2.5f)
                lineToRelative(-1.55f, 6f)
                arcToRelative(2f, 2f, 0f, false, true, -1.94f, 1.5f)
                horizontalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineTo(5f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(3.93f)
                arcToRelative(2f, 2f, 0f, false, true, 1.66f, 0.9f)
                lineToRelative(0.82f, 1.2f)
                arcToRelative(2f, 2f, 0f, false, false, 1.66f, 0.9f)
                horizontalLineTo(18f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(2f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 15f)
                arcTo(1f, 1f, 0f, false, true, 14f, 16f)
                arcTo(1f, 1f, 0f, false, true, 13f, 15f)
                arcTo(1f, 1f, 0f, false, true, 15f, 15f)
                close()
            }
        }.build()
        
        return _FolderOpenDot!!
    }

private var _FolderOpenDot: ImageVector? = null

