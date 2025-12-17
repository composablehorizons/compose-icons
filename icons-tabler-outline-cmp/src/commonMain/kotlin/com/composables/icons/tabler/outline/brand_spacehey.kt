package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandSpacehey: ImageVector
    get() {
        if (_BrandSpacehey != null) return _BrandSpacehey!!
        
        _BrandSpacehey = ImageVector.Builder(
            name = "brand-spacehey",
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
                moveTo(17f, 6f)
                moveToRelative(-2f, 0f)
                arcToRelative(2f, 2f, 0f, true, false, 4f, 0f)
                arcToRelative(2f, 2f, 0f, true, false, -4f, 0f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 20f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-6f)
                arcToRelative(3f, 3f, 0f, false, false, -6f, 0f)
                verticalLineToRelative(6f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11f, 8f)
                verticalLineToRelative(2.5f)
                arcToRelative(3.5f, 3.5f, 0f, false, true, -3.5f, 3.5f)
                horizontalLineToRelative(-0.5f)
                arcToRelative(3f, 3f, 0f, false, true, 0f, -6f)
                horizontalLineToRelative(4f)
                close()
            }
        }.build()
        
        return _BrandSpacehey!!
    }

private var _BrandSpacehey: ImageVector? = null

