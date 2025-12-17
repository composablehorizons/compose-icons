package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Radioactive: ImageVector
    get() {
        if (_Radioactive != null) return _Radioactive!!
        
        _Radioactive = ImageVector.Builder(
            name = "radioactive",
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
                moveTo(13.5f, 14.6f)
                lineToRelative(3f, 5.19f)
                arcToRelative(9f, 9f, 0f, false, false, 4.5f, -7.79f)
                horizontalLineToRelative(-6f)
                arcToRelative(3f, 3f, 0f, false, true, -1.5f, 2.6f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13.5f, 9.4f)
                lineToRelative(3f, -5.19f)
                arcToRelative(9f, 9f, 0f, false, false, -9f, 0f)
                lineToRelative(3f, 5.19f)
                arcToRelative(3f, 3f, 0f, false, true, 3f, 0f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10.5f, 14.6f)
                lineToRelative(-3f, 5.19f)
                arcToRelative(9f, 9f, 0f, false, true, -4.5f, -7.79f)
                horizontalLineToRelative(6f)
                arcToRelative(3f, 3f, 0f, false, false, 1.5f, 2.6f)
            }
        }.build()
        
        return _Radioactive!!
    }

private var _Radioactive: ImageVector? = null

