package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandGoogle: ImageVector
    get() {
        if (_BrandGoogle != null) return _BrandGoogle!!
        
        _BrandGoogle = ImageVector.Builder(
            name = "brand-google",
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
                moveTo(20.945f, 11f)
                arcToRelative(9f, 9f, 0f, true, true, -3.284f, -5.997f)
                lineToRelative(-2.655f, 2.392f)
                arcToRelative(5.5f, 5.5f, 0f, true, false, 2.119f, 6.605f)
                horizontalLineToRelative(-4.125f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(7.945f)
                close()
            }
        }.build()
        
        return _BrandGoogle!!
    }

private var _BrandGoogle: ImageVector? = null

