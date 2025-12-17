package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandRevolut: ImageVector
    get() {
        if (_BrandRevolut != null) return _BrandRevolut!!
        
        _BrandRevolut = ImageVector.Builder(
            name = "brand-revolut",
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
                moveTo(5f, 10f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(-3f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14.5f, 4f)
                horizontalLineToRelative(-9.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(9.4f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 0f, 3f)
                horizontalLineToRelative(-3.4f)
                verticalLineToRelative(4f)
                lineToRelative(4f, 6f)
                horizontalLineToRelative(4f)
                lineToRelative(-5f, -7f)
                horizontalLineToRelative(0.5f)
                arcToRelative(4.5f, 4.5f, 0f, true, false, 0f, -9f)
                close()
            }
        }.build()
        
        return _BrandRevolut!!
    }

private var _BrandRevolut: ImageVector? = null

