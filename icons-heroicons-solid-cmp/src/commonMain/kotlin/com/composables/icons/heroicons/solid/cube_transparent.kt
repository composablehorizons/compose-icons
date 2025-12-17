package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.CubeTransparent: ImageVector
    get() {
        if (_CubeTransparent != null) return _CubeTransparent!!
        
        _CubeTransparent = ImageVector.Builder(
            name = "cube-transparent",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.622f, 1.602f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.756f, 0f)
                lineToRelative(2.25f, 1.313f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.756f, 1.295f)
                lineTo(12f, 3.118f)
                lineTo(10.128f, 4.21f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -0.756f, -1.295f)
                lineToRelative(2.25f, -1.313f)
                close()
                moveTo(5.898f, 5.81f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.27f, 1.025f)
                lineToRelative(-1.14f, 0.665f)
                lineToRelative(1.14f, 0.665f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -0.756f, 1.295f)
                lineTo(3.75f, 8.806f)
                verticalLineToRelative(0.944f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.5f, 0f)
                verticalLineTo(7.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.372f, -0.648f)
                lineToRelative(2.25f, -1.312f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.026f, 0.27f)
                close()
                moveToRelative(12.204f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.026f, -0.27f)
                lineToRelative(2.25f, 1.312f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.372f, 0.648f)
                verticalLineToRelative(2.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.5f, 0f)
                verticalLineToRelative(-0.944f)
                lineToRelative(-1.122f, 0.654f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -0.756f, -1.295f)
                lineToRelative(1.14f, -0.665f)
                lineToRelative(-1.14f, -0.665f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.27f, -1.025f)
                close()
                moveToRelative(-9f, 5.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.026f, -0.27f)
                lineTo(12f, 11.882f)
                lineToRelative(1.872f, -1.092f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, 0.756f, 1.295f)
                lineToRelative(-1.878f, 1.096f)
                verticalLineTo(15f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.5f, 0f)
                verticalLineToRelative(-1.82f)
                lineToRelative(-1.878f, -1.095f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.27f, -1.025f)
                close()
                moveTo(3f, 13.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, 0.75f)
                verticalLineToRelative(1.82f)
                lineToRelative(1.878f, 1.095f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -0.756f, 1.295f)
                lineToRelative(-2.25f, -1.312f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.372f, -0.648f)
                verticalLineToRelative(-2.25f)
                arcTo(0.75f, 0.75f, 0f, false, true, 3f, 13.5f)
                close()
                moveToRelative(18f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, 0.75f)
                verticalLineToRelative(2.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.372f, 0.648f)
                lineToRelative(-2.25f, 1.312f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -0.756f, -1.295f)
                lineToRelative(1.878f, -1.096f)
                verticalLineTo(14.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, -0.75f)
                close()
                moveToRelative(-9f, 5.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, 0.75f)
                verticalLineToRelative(0.944f)
                lineToRelative(1.122f, -0.654f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, 0.756f, 1.295f)
                lineToRelative(-2.25f, 1.313f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.756f, 0f)
                lineToRelative(-2.25f, -1.313f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, 0.756f, -1.295f)
                lineToRelative(1.122f, 0.654f)
                verticalLineTo(19.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, -0.75f)
                close()
            }
        }.build()
        
        return _CubeTransparent!!
    }

private var _CubeTransparent: ImageVector? = null

