package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.ArrowUpOnSquareStack: ImageVector
    get() {
        if (_ArrowUpOnSquareStack != null) return _ArrowUpOnSquareStack!!
        
        _ArrowUpOnSquareStack = ImageVector.Builder(
            name = "arrow-up-on-square-stack",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.97f, 0.97f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.06f, 0f)
                lineToRelative(3f, 3f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.06f, 1.06f)
                lineToRelative(-1.72f, -1.72f)
                verticalLineToRelative(3.44f)
                horizontalLineToRelative(-1.5f)
                verticalLineTo(3.31f)
                lineTo(8.03f, 5.03f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.06f, -1.06f)
                lineToRelative(3f, -3f)
                close()
                moveTo(9.75f, 6.75f)
                verticalLineToRelative(6f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.5f, 0f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(3f)
                arcToRelative(3f, 3f, 0f, false, true, 3f, 3f)
                verticalLineToRelative(7.5f)
                arcToRelative(3f, 3f, 0f, false, true, -3f, 3f)
                horizontalLineToRelative(-7.5f)
                arcToRelative(3f, 3f, 0f, false, true, -3f, -3f)
                verticalLineToRelative(-7.5f)
                arcToRelative(3f, 3f, 0f, false, true, 3f, -3f)
                horizontalLineToRelative(3f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.151f, 21.75f)
                arcToRelative(2.999f, 2.999f, 0f, false, false, 2.599f, 1.5f)
                horizontalLineToRelative(7.5f)
                arcToRelative(3f, 3f, 0f, false, false, 3f, -3f)
                verticalLineToRelative(-7.5f)
                curveToRelative(0f, -1.11f, -0.603f, -2.08f, -1.5f, -2.599f)
                verticalLineToRelative(7.099f)
                arcToRelative(4.5f, 4.5f, 0f, false, true, -4.5f, 4.5f)
                horizontalLineTo(7.151f)
                close()
            }
        }.build()
        
        return _ArrowUpOnSquareStack!!
    }

private var _ArrowUpOnSquareStack: ImageVector? = null

