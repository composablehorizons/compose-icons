package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandXamarin: ImageVector
    get() {
        if (_BrandXamarin != null) return _BrandXamarin!!
        
        _BrandXamarin = ImageVector.Builder(
            name = "brand-xamarin",
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
                moveTo(15.958f, 21f)
                horizontalLineToRelative(-7.917f)
                arcToRelative(2f, 2f, 0f, false, true, -1.732f, -1f)
                lineToRelative(-4.041f, -7f)
                arcToRelative(2f, 2f, 0f, false, true, 0f, -2f)
                lineToRelative(4.041f, -7f)
                arcToRelative(2f, 2f, 0f, false, true, 1.732f, -1f)
                horizontalLineToRelative(7.917f)
                arcToRelative(2f, 2f, 0f, false, true, 1.732f, 1f)
                lineToRelative(4.042f, 7f)
                arcToRelative(2f, 2f, 0f, false, true, 0f, 2f)
                lineToRelative(-4.041f, 7f)
                arcToRelative(2f, 2f, 0f, false, true, -1.733f, 1f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 16f)
                lineToRelative(-6f, -8f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 16f)
                lineToRelative(6f, -8f)
            }
        }.build()
        
        return _BrandXamarin!!
    }

private var _BrandXamarin: ImageVector? = null

