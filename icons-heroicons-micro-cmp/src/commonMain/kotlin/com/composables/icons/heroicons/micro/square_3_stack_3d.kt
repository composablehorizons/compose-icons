package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.Square3Stack3d: ImageVector
    get() {
        if (_Square3Stack3d != null) return _Square3Stack3d!!
        
        _Square3Stack3d = ImageVector.Builder(
            name = "square-3-stack-3d",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.628f, 1.099f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.744f, 0f)
                lineToRelative(5.25f, 3f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.302f)
                lineToRelative(-5.25f, 3f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.744f, 0f)
                lineToRelative(-5.25f, -3f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, -1.302f)
                lineToRelative(5.25f, -3f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2.57f, 7.24f)
                lineToRelative(-0.192f, 0.11f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.302f)
                lineToRelative(5.25f, 3f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.744f, 0f)
                lineToRelative(5.25f, -3f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.303f)
                lineToRelative(-0.192f, -0.11f)
                lineToRelative(-4.314f, 2.465f)
                arcToRelative(2.25f, 2.25f, 0f, false, true, -2.232f, 0f)
                lineTo(2.57f, 7.239f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2.378f, 10.6f)
                lineToRelative(0.192f, -0.11f)
                lineToRelative(4.314f, 2.464f)
                arcToRelative(2.25f, 2.25f, 0f, false, false, 2.232f, 0f)
                lineToRelative(4.314f, -2.465f)
                lineToRelative(0.192f, 0.11f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.303f)
                lineToRelative(-5.25f, 3f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.744f, 0f)
                lineToRelative(-5.25f, -3f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, -1.303f)
                close()
            }
        }.build()
        
        return _Square3Stack3d!!
    }

private var _Square3Stack3d: ImageVector? = null

