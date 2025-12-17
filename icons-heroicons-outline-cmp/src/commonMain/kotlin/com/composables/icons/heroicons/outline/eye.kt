package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.Eye: ImageVector
    get() {
        if (_Eye != null) return _Eye!!
        
        _Eye = ImageVector.Builder(
            name = "eye",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f,
                strokeLineJoin = StrokeJoin.Miter
            ) {
                moveTo(2.036f, 12.322f)
                arcToRelative(1.012f, 1.012f, 0f, false, true, 0f, -0.639f)
                curveTo(3.423f, 7.51f, 7.36f, 4.5f, 12f, 4.5f)
                curveToRelative(4.638f, 0f, 8.573f, 3.007f, 9.963f, 7.178f)
                curveToRelative(0.07f, 0.207f, 0.07f, 0.431f, 0f, 0.639f)
                curveTo(20.577f, 16.49f, 16.64f, 19.5f, 12f, 19.5f)
                curveToRelative(-4.638f, 0f, -8.573f, -3.007f, -9.963f, -7.178f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f,
                strokeLineJoin = StrokeJoin.Miter
            ) {
                moveTo(15f, 12f)
                arcToRelative(3f, 3f, 0f, true, true, -6f, 0f)
                arcToRelative(3f, 3f, 0f, false, true, 6f, 0f)
                close()
            }
        }.build()
        
        return _Eye!!
    }

private var _Eye: ImageVector? = null

