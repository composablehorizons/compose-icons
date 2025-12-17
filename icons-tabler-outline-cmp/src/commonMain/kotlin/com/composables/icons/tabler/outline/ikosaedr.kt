package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Ikosaedr: ImageVector
    get() {
        if (_Ikosaedr != null) return _Ikosaedr!!
        
        _Ikosaedr = ImageVector.Builder(
            name = "ikosaedr",
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
                moveTo(21f, 8.007f)
                verticalLineToRelative(7.986f)
                arcToRelative(2f, 2f, 0f, false, true, -1.006f, 1.735f)
                lineToRelative(-7f, 4.007f)
                arcToRelative(2f, 2f, 0f, false, true, -1.988f, 0f)
                lineToRelative(-7f, -4.007f)
                arcToRelative(2f, 2f, 0f, false, true, -1.006f, -1.735f)
                verticalLineToRelative(-7.986f)
                arcToRelative(2f, 2f, 0f, false, true, 1.006f, -1.735f)
                lineToRelative(7f, -4.007f)
                arcToRelative(2f, 2f, 0f, false, true, 1.988f, 0f)
                lineToRelative(7f, 4.007f)
                arcToRelative(2f, 2f, 0f, false, true, 1.006f, 1.735f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3.29f, 6.97f)
                lineToRelative(4.21f, 2.03f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20.71f, 6.97f)
                lineToRelative(-4.21f, 2.03f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20.7f, 17f)
                horizontalLineToRelative(-17.4f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11.76f, 2.03f)
                lineToRelative(-4.26f, 6.97f)
                lineToRelative(-4.3f, 7.84f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12.24f, 2.03f)
                quadToRelative(2.797f, 4.44f, 4.26f, 6.97f)
                reflectiveQuadToRelative(4.3f, 7.84f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 17f)
                lineToRelative(-4.5f, -8f)
                horizontalLineToRelative(9f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 17f)
                verticalLineToRelative(5f)
            }
        }.build()
        
        return _Ikosaedr!!
    }

private var _Ikosaedr: ImageVector? = null

