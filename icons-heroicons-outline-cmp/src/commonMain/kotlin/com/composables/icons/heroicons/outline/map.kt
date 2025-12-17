package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.Map: ImageVector
    get() {
        if (_Map != null) return _Map!!
        
        _Map = ImageVector.Builder(
            name = "map",
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
                moveTo(9f, 6.75f)
                verticalLineTo(15f)
                moveToRelative(6f, -6f)
                verticalLineToRelative(8.25f)
                moveToRelative(0.503f, 3.498f)
                lineToRelative(4.875f, -2.437f)
                curveToRelative(0.381f, -0.19f, 0.622f, -0.58f, 0.622f, -1.006f)
                verticalLineTo(4.82f)
                curveToRelative(0f, -0.836f, -0.88f, -1.38f, -1.628f, -1.006f)
                lineToRelative(-3.869f, 1.934f)
                curveToRelative(-0.317f, 0.159f, -0.69f, 0.159f, -1.006f, 0f)
                lineTo(9.503f, 3.252f)
                arcToRelative(1.125f, 1.125f, 0f, false, false, -1.006f, 0f)
                lineTo(3.622f, 5.689f)
                curveTo(3.24f, 5.88f, 3f, 6.27f, 3f, 6.695f)
                verticalLineTo(19.18f)
                curveToRelative(0f, 0.836f, 0.88f, 1.38f, 1.628f, 1.006f)
                lineToRelative(3.869f, -1.934f)
                curveToRelative(0.317f, -0.159f, 0.69f, -0.159f, 1.006f, 0f)
                lineToRelative(4.994f, 2.497f)
                curveToRelative(0.317f, 0.158f, 0.69f, 0.158f, 1.006f, 0f)
                close()
            }
        }.build()
        
        return _Map!!
    }

private var _Map: ImageVector? = null

