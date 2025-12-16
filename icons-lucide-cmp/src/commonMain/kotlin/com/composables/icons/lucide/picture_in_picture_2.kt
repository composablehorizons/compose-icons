package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.PictureInPicture2: ImageVector
    get() {
        if (_PictureInPicture2 != null) return _PictureInPicture2!!
        
        _PictureInPicture2 = ImageVector.Builder(
            name = "picture-in-picture-2",
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
                moveTo(21f, 9f)
                verticalLineTo(6f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                horizontalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(10f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(4f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 13f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, false, true, 22f, 15f)
                verticalLineTo(18f)
                arcTo(2f, 2f, 0f, false, true, 20f, 20f)
                horizontalLineTo(14f)
                arcTo(2f, 2f, 0f, false, true, 12f, 18f)
                verticalLineTo(15f)
                arcTo(2f, 2f, 0f, false, true, 14f, 13f)
                close()
            }
        }.build()
        
        return _PictureInPicture2!!
    }

private var _PictureInPicture2: ImageVector? = null

