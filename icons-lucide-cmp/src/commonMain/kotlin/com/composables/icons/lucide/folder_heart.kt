package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.FolderHeart: ImageVector
    get() {
        if (_FolderHeart != null) return _FolderHeart!!
        
        _FolderHeart = ImageVector.Builder(
            name = "folder-heart",
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
                moveTo(10.638f, 20f)
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
                verticalLineToRelative(3.417f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14.62f, 18.8f)
                arcTo(2.25f, 2.25f, 0f, true, true, 18f, 15.836f)
                arcToRelative(2.25f, 2.25f, 0f, true, true, 3.38f, 2.966f)
                lineToRelative(-2.626f, 2.856f)
                arcToRelative(0.998f, 0.998f, 0f, false, true, -1.507f, 0f)
                close()
            }
        }.build()
        
        return _FolderHeart!!
    }

private var _FolderHeart: ImageVector? = null

