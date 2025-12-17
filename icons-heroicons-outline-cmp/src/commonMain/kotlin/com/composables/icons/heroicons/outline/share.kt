package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.Share: ImageVector
    get() {
        if (_Share != null) return _Share!!
        
        _Share = ImageVector.Builder(
            name = "share",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f,
                strokeLineJoin = StrokeJoin.Miter
            ) {
                moveTo(7.217f, 10.907f)
                arcToRelative(2.25f, 2.25f, 0f, true, false, 0f, 2.186f)
                moveToRelative(0f, -2.186f)
                curveToRelative(0.18f, 0.324f, 0.283f, 0.696f, 0.283f, 1.093f)
                reflectiveCurveToRelative(-0.103f, 0.77f, -0.283f, 1.093f)
                moveToRelative(0f, -2.186f)
                lineToRelative(9.566f, -5.314f)
                moveToRelative(-9.566f, 7.5f)
                lineToRelative(9.566f, 5.314f)
                moveToRelative(0f, 0f)
                arcToRelative(2.25f, 2.25f, 0f, true, false, 3.935f, 2.186f)
                arcToRelative(2.25f, 2.25f, 0f, false, false, -3.935f, -2.186f)
                close()
                moveToRelative(0f, -12.814f)
                arcToRelative(2.25f, 2.25f, 0f, true, false, 3.933f, -2.185f)
                arcToRelative(2.25f, 2.25f, 0f, false, false, -3.933f, 2.185f)
                close()
            }
        }.build()
        
        return _Share!!
    }

private var _Share: ImageVector? = null

