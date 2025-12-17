package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Captions: ImageVector
    get() {
        if (_Captions != null) return _Captions!!
        
        _Captions = ImageVector.Builder(
            name = "captions",
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
                moveTo(5f, 5f)
                horizontalLineTo(19f)
                arcTo(2f, 2f, 0f, false, true, 21f, 7f)
                verticalLineTo(17f)
                arcTo(2f, 2f, 0f, false, true, 19f, 19f)
                horizontalLineTo(5f)
                arcTo(2f, 2f, 0f, false, true, 3f, 17f)
                verticalLineTo(7f)
                arcTo(2f, 2f, 0f, false, true, 5f, 5f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 15f)
                horizontalLineToRelative(4f)
                moveTo(15f, 15f)
                horizontalLineToRelative(2f)
                moveTo(7f, 11f)
                horizontalLineToRelative(2f)
                moveTo(13f, 11f)
                horizontalLineToRelative(4f)
            }
        }.build()
        
        return _Captions!!
    }

private var _Captions: ImageVector? = null

