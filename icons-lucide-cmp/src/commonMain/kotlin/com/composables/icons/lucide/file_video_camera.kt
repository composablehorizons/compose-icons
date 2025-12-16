package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.FileVideoCamera: ImageVector
    get() {
        if (_FileVideoCamera != null) return _FileVideoCamera!!
        
        _FileVideoCamera = ImageVector.Builder(
            name = "file-video-camera",
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
                moveTo(4f, 12f)
                verticalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(8f)
                arcToRelative(2.4f, 2.4f, 0f, false, true, 1.706f, 0.706f)
                lineToRelative(3.588f, 3.588f)
                arcTo(2.4f, 2.4f, 0f, false, true, 20f, 8f)
                verticalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
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
                moveTo(10f, 17.843f)
                lineToRelative(3.033f, -1.755f)
                arcToRelative(0.64f, 0.64f, 0f, false, true, 0.967f, 0.56f)
                verticalLineToRelative(4.704f)
                arcToRelative(0.65f, 0.65f, 0f, false, true, -0.967f, 0.56f)
                lineTo(10f, 20.157f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4f, 16f)
                horizontalLineTo(9f)
                arcTo(1f, 1f, 0f, false, true, 10f, 17f)
                verticalLineTo(21f)
                arcTo(1f, 1f, 0f, false, true, 9f, 22f)
                horizontalLineTo(4f)
                arcTo(1f, 1f, 0f, false, true, 3f, 21f)
                verticalLineTo(17f)
                arcTo(1f, 1f, 0f, false, true, 4f, 16f)
                close()
            }
        }.build()
        
        return _FileVideoCamera!!
    }

private var _FileVideoCamera: ImageVector? = null

