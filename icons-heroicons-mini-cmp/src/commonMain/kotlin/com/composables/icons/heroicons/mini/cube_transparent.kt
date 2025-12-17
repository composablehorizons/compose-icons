package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.CubeTransparent: ImageVector
    get() {
        if (_CubeTransparent != null) return _CubeTransparent!!
        
        _CubeTransparent = ImageVector.Builder(
            name = "cube-transparent",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.638f, 1.093f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.724f, 0f)
                lineToRelative(2f, 1.104f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -0.724f, 1.313f)
                lineTo(10f, 2.607f)
                lineToRelative(-1.638f, 0.903f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -0.724f, -1.313f)
                lineToRelative(2f, -1.104f)
                close()
                moveTo(5.403f, 4.287f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.295f, 1.019f)
                lineToRelative(-0.805f, 0.444f)
                lineToRelative(0.805f, 0.444f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.724f, 1.314f)
                lineTo(3.5f, 7.02f)
                verticalLineToRelative(0.73f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.5f, 0f)
                verticalLineToRelative(-2f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.388f, -0.657f)
                lineToRelative(1.996f, -1.1f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.019f, 0.294f)
                close()
                moveToRelative(9.194f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.02f, -0.295f)
                lineToRelative(1.995f, 1.101f)
                arcTo(0.75f, 0.75f, 0f, false, true, 18f, 5.75f)
                verticalLineToRelative(2f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.5f, 0f)
                verticalLineToRelative(-0.73f)
                lineToRelative(-0.884f, 0.488f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -0.724f, -1.314f)
                lineToRelative(0.806f, -0.444f)
                lineToRelative(-0.806f, -0.444f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.295f, -1.02f)
                close()
                moveTo(7.343f, 8.284f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.02f, -0.294f)
                lineTo(10f, 8.893f)
                lineToRelative(1.638f, -0.903f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, 0.724f, 1.313f)
                lineToRelative(-1.612f, 0.89f)
                verticalLineToRelative(1.557f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.5f, 0f)
                verticalLineToRelative(-1.557f)
                lineToRelative(-1.612f, -0.89f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.295f, -1.019f)
                close()
                moveTo(2.75f, 11.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, 0.75f)
                verticalLineToRelative(1.557f)
                lineToRelative(1.608f, 0.887f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.724f, 1.314f)
                lineToRelative(-1.996f, -1.101f)
                arcTo(0.75f, 0.75f, 0f, false, true, 2f, 14.25f)
                verticalLineToRelative(-2f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, -0.75f)
                close()
                moveToRelative(14.5f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, 0.75f)
                verticalLineToRelative(2f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.388f, 0.657f)
                lineToRelative(-1.996f, 1.1f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -0.724f, -1.313f)
                lineToRelative(1.608f, -0.887f)
                verticalLineTo(12.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, -0.75f)
                close()
                moveToRelative(-7.25f, 4f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, 0.75f)
                verticalLineToRelative(0.73f)
                lineToRelative(0.888f, -0.49f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.724f, 1.313f)
                lineToRelative(-2f, 1.104f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.724f, 0f)
                lineToRelative(-2f, -1.104f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, 0.724f, -1.313f)
                lineToRelative(0.888f, 0.49f)
                verticalLineToRelative(-0.73f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, -0.75f)
                close()
            }
        }.build()
        
        return _CubeTransparent!!
    }

private var _CubeTransparent: ImageVector? = null

