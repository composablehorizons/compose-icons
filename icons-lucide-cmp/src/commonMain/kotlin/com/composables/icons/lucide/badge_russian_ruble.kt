package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.BadgeRussianRuble: ImageVector
    get() {
        if (_BadgeRussianRuble != null) return _BadgeRussianRuble!!
        
        _BadgeRussianRuble = ImageVector.Builder(
            name = "badge-russian-ruble",
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
                moveTo(3.85f, 8.62f)
                arcToRelative(4f, 4f, 0f, false, true, 4.78f, -4.77f)
                arcToRelative(4f, 4f, 0f, false, true, 6.74f, 0f)
                arcToRelative(4f, 4f, 0f, false, true, 4.78f, 4.78f)
                arcToRelative(4f, 4f, 0f, false, true, 0f, 6.74f)
                arcToRelative(4f, 4f, 0f, false, true, -4.77f, 4.78f)
                arcToRelative(4f, 4f, 0f, false, true, -6.75f, 0f)
                arcToRelative(4f, 4f, 0f, false, true, -4.78f, -4.77f)
                arcToRelative(4f, 4f, 0f, false, true, 0f, -6.76f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 16f)
                horizontalLineToRelative(5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 12f)
                horizontalLineToRelative(5f)
                arcToRelative(2f, 2f, 0f, true, false, 0f, -4f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(9f)
            }
        }.build()
        
        return _BadgeRussianRuble!!
    }

private var _BadgeRussianRuble: ImageVector? = null

