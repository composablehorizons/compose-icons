package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandVk: ImageVector
    get() {
        if (_BrandVk != null) return _BrandVk!!
        
        _BrandVk = ImageVector.Builder(
            name = "brand-vk",
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
                moveTo(14f, 19f)
                horizontalLineToRelative(-4f)
                arcToRelative(8f, 8f, 0f, false, true, -8f, -8f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(5f)
                arcToRelative(4f, 4f, 0f, false, false, 4f, 4f)
                horizontalLineToRelative(0f)
                verticalLineToRelative(-9f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(4.5f)
                lineToRelative(0.03f, 0f)
                arcToRelative(4.531f, 4.531f, 0f, false, false, 3.97f, -4.496f)
                horizontalLineToRelative(4f)
                lineToRelative(-0.342f, 1.711f)
                arcToRelative(6.858f, 6.858f, 0f, false, true, -3.658f, 4.789f)
                horizontalLineToRelative(0f)
                arcToRelative(5.34f, 5.34f, 0f, false, true, 3.566f, 4.111f)
                lineToRelative(0.434f, 2.389f)
                horizontalLineToRelative(0f)
                horizontalLineToRelative(-4f)
                arcToRelative(4.531f, 4.531f, 0f, false, false, -3.97f, -4.496f)
                verticalLineToRelative(4.5f)
                close()
            }
        }.build()
        
        return _BrandVk!!
    }

private var _BrandVk: ImageVector? = null

