package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.LassoPolygon: ImageVector
    get() {
        if (_LassoPolygon != null) return _LassoPolygon!!
        
        _LassoPolygon = ImageVector.Builder(
            name = "lasso-polygon",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5.581f, 2.186f)
                lineToRelative(6.566f, 4.69f)
                lineToRelative(7.502f, -2.812f)
                arcToRelative(1f, 1f, 0f, false, true, 1.326f, 0.714f)
                lineToRelative(0.019f, 0.112f)
                lineToRelative(1f, 9f)
                arcToRelative(1f, 1f, 0f, false, true, -0.678f, 1.059f)
                lineToRelative(-9f, 3f)
                arcToRelative(1f, 1f, 0f, false, true, -0.553f, 0.023f)
                lineToRelative(-4.434f, -1.082f)
                arcToRelative(3f, 3f, 0f, false, true, -1.287f, 0.923f)
                curveToRelative(0.095f, 0.986f, 0.374f, 1.9f, 0.826f, 2.69f)
                arcToRelative(1f, 1f, 0f, false, true, -1.736f, 0.993f)
                curveToRelative(-0.624f, -1.09f, -0.99f, -2.335f, -1.098f, -3.656f)
                arcToRelative(3f, 3f, 0f, false, true, -2.034f, -2.84f)
                lineToRelative(0.005f, -0.176f)
                arcToRelative(3f, 3f, 0f, false, true, 0.86f, -1.932f)
                lineToRelative(-0.818f, -2.59f)
                arcToRelative(1f, 1f, 0f, false, true, -0.009f, -0.577f)
                lineToRelative(2f, -7f)
                arcToRelative(1f, 1f, 0f, false, true, 1.543f, -0.539f)
                moveToRelative(-0.009f, 2.451f)
                lineToRelative(-1.528f, 5.348f)
                lineToRelative(0.642f, 2.031f)
                quadToRelative(0.155f, -0.016f, 0.314f, -0.016f)
                arcToRelative(3f, 3f, 0f, false, true, 3f, 2.995f)
                lineToRelative(3.957f, 0.965f)
                lineToRelative(7.96f, -2.654f)
                lineToRelative(-0.769f, -6.919f)
                lineToRelative(-6.797f, 2.55f)
                arcToRelative(1f, 1f, 0f, false, true, -0.827f, -0.058f)
                lineToRelative(-0.105f, -0.065f)
                close()
            }
        }.build()
        
        return _LassoPolygon!!
    }

private var _LassoPolygon: ImageVector? = null

