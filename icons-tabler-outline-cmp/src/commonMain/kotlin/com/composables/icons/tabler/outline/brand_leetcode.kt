package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandLeetcode: ImageVector
    get() {
        if (_BrandLeetcode != null) return _BrandLeetcode!!
        
        _BrandLeetcode = ImageVector.Builder(
            name = "brand-leetcode",
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
                moveTo(12f, 13f)
                horizontalLineToRelative(7.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.424f, 7.268f)
                lineToRelative(4.999f, -4.999f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16.633f, 16.644f)
                lineToRelative(-2.402f, 2.415f)
                arcToRelative(3.189f, 3.189f, 0f, false, true, -4.524f, 0f)
                lineToRelative(-3.77f, -3.787f)
                arcToRelative(3.223f, 3.223f, 0f, false, true, 0f, -4.544f)
                lineToRelative(3.77f, -3.787f)
                arcToRelative(3.189f, 3.189f, 0f, false, true, 4.524f, 0f)
                lineToRelative(2.302f, 2.313f)
            }
        }.build()
        
        return _BrandLeetcode!!
    }

private var _BrandLeetcode: ImageVector? = null

