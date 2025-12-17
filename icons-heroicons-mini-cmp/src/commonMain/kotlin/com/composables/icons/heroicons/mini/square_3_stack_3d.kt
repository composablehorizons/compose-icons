package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.Square3Stack3d: ImageVector
    get() {
        if (_Square3Stack3d != null) return _Square3Stack3d!!
        
        _Square3Stack3d = ImageVector.Builder(
            name = "square-3-stack-3d",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.196f, 12.87f)
                lineToRelative(-0.825f, 0.483f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.294f)
                lineToRelative(7.25f, 4.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.758f, 0f)
                lineToRelative(7.25f, -4.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.294f)
                lineToRelative(-0.825f, -0.484f)
                lineToRelative(-5.666f, 3.322f)
                arcToRelative(2.25f, 2.25f, 0f, false, true, -2.276f, 0f)
                lineTo(3.196f, 12.87f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.196f, 8.87f)
                lineToRelative(-0.825f, 0.483f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.294f)
                lineToRelative(7.25f, 4.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.758f, 0f)
                lineToRelative(7.25f, -4.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.294f)
                lineToRelative(-0.825f, -0.484f)
                lineToRelative(-5.666f, 3.322f)
                arcToRelative(2.25f, 2.25f, 0f, false, true, -2.276f, 0f)
                lineTo(3.196f, 8.87f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.38f, 1.103f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.76f, 0f)
                lineToRelative(-7.25f, 4.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.294f)
                lineToRelative(7.25f, 4.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.76f, 0f)
                lineToRelative(7.25f, -4.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.294f)
                lineToRelative(-7.25f, -4.25f)
                close()
            }
        }.build()
        
        return _Square3Stack3d!!
    }

private var _Square3Stack3d: ImageVector? = null

