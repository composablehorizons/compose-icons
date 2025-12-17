package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.Square3Stack3d: ImageVector
    get() {
        if (_Square3Stack3d != null) return _Square3Stack3d!!
        
        _Square3Stack3d = ImageVector.Builder(
            name = "square-3-stack-3d",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.644f, 1.59f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.712f, 0f)
                lineToRelative(9.75f, 5.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.32f)
                lineToRelative(-9.75f, 5.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.712f, 0f)
                lineToRelative(-9.75f, -5.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, -1.32f)
                lineToRelative(9.75f, -5.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.265f, 10.602f)
                lineToRelative(7.668f, 4.129f)
                arcToRelative(2.25f, 2.25f, 0f, false, false, 2.134f, 0f)
                lineToRelative(7.668f, -4.13f)
                lineToRelative(1.37f, 0.739f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.32f)
                lineToRelative(-9.75f, 5.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.71f, 0f)
                lineToRelative(-9.75f, -5.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, -1.32f)
                lineToRelative(1.37f, -0.738f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.933f, 19.231f)
                lineToRelative(-7.668f, -4.13f)
                lineToRelative(-1.37f, 0.739f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.32f)
                lineToRelative(9.75f, 5.25f)
                curveToRelative(0.221f, 0.12f, 0.489f, 0.12f, 0.71f, 0f)
                lineToRelative(9.75f, -5.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.32f)
                lineToRelative(-1.37f, -0.738f)
                lineToRelative(-7.668f, 4.13f)
                arcToRelative(2.25f, 2.25f, 0f, false, true, -2.134f, -0.001f)
                close()
            }
        }.build()
        
        return _Square3Stack3d!!
    }

private var _Square3Stack3d: ImageVector? = null

