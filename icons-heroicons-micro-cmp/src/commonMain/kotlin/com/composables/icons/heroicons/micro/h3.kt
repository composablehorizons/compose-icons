package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.H3: ImageVector
    get() {
        if (_H3 != null) return _H3!!
        
        _H3 = ImageVector.Builder(
            name = "h3",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1.75f, 3f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, 0.75f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-3.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.5f, 0f)
                verticalLineToRelative(8.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.5f, 0f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(3.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.5f, 0f)
                verticalLineToRelative(-8.5f)
                arcTo(0.75f, 0.75f, 0f, false, true, 1.75f, 3f)
                close()
                moveTo(12.5f, 7.5f)
                curveToRelative(-0.558f, 0f, -1.107f, 0.04f, -1.642f, 0.119f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.217f, -1.484f)
                arcToRelative(12.851f, 12.851f, 0f, false, true, 2.856f, -0.097f)
                curveToRelative(0.696f, 0.054f, 1.363f, 0.561f, 1.464f, 1.353f)
                arcToRelative(4.805f, 4.805f, 0f, false, true, -0.203f, 2.109f)
                arcToRelative(4.745f, 4.745f, 0f, false, true, 0.203f, 2.109f)
                curveToRelative(-0.101f, 0.792f, -0.768f, 1.299f, -1.464f, 1.353f)
                arcToRelative(12.955f, 12.955f, 0f, false, true, -2.856f, -0.097f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.217f, -1.484f)
                arcToRelative(11.351f, 11.351f, 0f, false, false, 2.523f, 0.085f)
                arcToRelative(0.14f, 0.14f, 0f, false, false, 0.08f, -0.03f)
                curveToRelative(0.007f, -0.006f, 0.01f, -0.012f, 0.01f, -0.012f)
                lineToRelative(0.002f, -0.003f)
                verticalLineToRelative(-0.003f)
                arcToRelative(3.29f, 3.29f, 0f, false, false, -0.06f, -1.168f)
                horizontalLineTo(11.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, -1.5f)
                horizontalLineToRelative(1.663f)
                arcToRelative(3.262f, 3.262f, 0f, false, false, 0.06f, -1.168f)
                lineToRelative(-0.001f, -0.006f)
                lineToRelative(-0.01f, -0.012f)
                arcToRelative(0.14f, 0.14f, 0f, false, false, -0.08f, -0.03f)
                curveToRelative(-0.291f, -0.023f, -0.585f, -0.034f, -0.882f, -0.034f)
                close()
            }
        }.build()
        
        return _H3!!
    }

private var _H3: ImageVector? = null

