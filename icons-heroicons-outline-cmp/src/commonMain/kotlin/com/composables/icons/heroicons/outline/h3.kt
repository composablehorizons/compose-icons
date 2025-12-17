package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.H3: ImageVector
    get() {
        if (_H3 != null) return _H3!!
        
        _H3 = ImageVector.Builder(
            name = "h3",
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
                moveTo(20.905f, 14.626f)
                arcToRelative(4.52f, 4.52f, 0f, false, true, 0.738f, 3.603f)
                curveToRelative(-0.154f, 0.695f, -0.794f, 1.143f, -1.504f, 1.208f)
                arcToRelative(15.194f, 15.194f, 0f, false, true, -3.639f, -0.104f)
                moveToRelative(4.405f, -4.707f)
                arcToRelative(4.52f, 4.52f, 0f, false, false, 0.738f, -3.603f)
                curveToRelative(-0.154f, -0.696f, -0.794f, -1.144f, -1.504f, -1.209f)
                arcToRelative(15.19f, 15.19f, 0f, false, false, -3.639f, 0.104f)
                moveToRelative(4.405f, 4.708f)
                horizontalLineTo(18f)
                moveTo(2.243f, 4.493f)
                verticalLineToRelative(7.5f)
                moveToRelative(0f, 0f)
                verticalLineToRelative(7.502f)
                moveToRelative(0f, -7.501f)
                horizontalLineToRelative(10.5f)
                moveToRelative(0f, -7.5f)
                verticalLineToRelative(7.5f)
                moveToRelative(0f, 0f)
                verticalLineToRelative(7.501f)
            }
        }.build()
        
        return _H3!!
    }

private var _H3: ImageVector? = null

