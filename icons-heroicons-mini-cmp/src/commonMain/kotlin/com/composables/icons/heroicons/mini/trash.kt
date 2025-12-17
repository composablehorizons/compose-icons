package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.Trash: ImageVector
    get() {
        if (_Trash != null) return _Trash!!
        
        _Trash = ImageVector.Builder(
            name = "trash",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.75f, 1f)
                arcTo(2.75f, 2.75f, 0f, false, false, 6f, 3.75f)
                verticalLineToRelative(0.443f)
                curveToRelative(-0.795f, 0.077f, -1.584f, 0.176f, -2.365f, 0.298f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 0.23f, 1.482f)
                lineToRelative(0.149f, -0.022f)
                lineToRelative(0.841f, 10.518f)
                arcTo(2.75f, 2.75f, 0f, false, false, 7.596f, 19f)
                horizontalLineToRelative(4.807f)
                arcToRelative(2.75f, 2.75f, 0f, false, false, 2.742f, -2.53f)
                lineToRelative(0.841f, -10.52f)
                lineToRelative(0.149f, 0.023f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.23f, -1.482f)
                arcTo(41.03f, 41.03f, 0f, false, false, 14f, 4.193f)
                verticalLineTo(3.75f)
                arcTo(2.75f, 2.75f, 0f, false, false, 11.25f, 1f)
                horizontalLineToRelative(-2.5f)
                close()
                moveTo(10f, 4f)
                curveToRelative(0.84f, 0f, 1.673f, 0.025f, 2.5f, 0.075f)
                verticalLineTo(3.75f)
                curveToRelative(0f, -0.69f, -0.56f, -1.25f, -1.25f, -1.25f)
                horizontalLineToRelative(-2.5f)
                curveToRelative(-0.69f, 0f, -1.25f, 0.56f, -1.25f, 1.25f)
                verticalLineToRelative(0.325f)
                curveTo(8.327f, 4.025f, 9.16f, 4f, 10f, 4f)
                close()
                moveTo(8.58f, 7.72f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.5f, 0.06f)
                lineToRelative(0.3f, 7.5f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 1.5f, -0.06f)
                lineToRelative(-0.3f, -7.5f)
                close()
                moveToRelative(4.34f, 0.06f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, -1.5f, -0.06f)
                lineToRelative(-0.3f, 7.5f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 1.5f, 0.06f)
                lineToRelative(0.3f, -7.5f)
                close()
            }
        }.build()
        
        return _Trash!!
    }

private var _Trash: ImageVector? = null

