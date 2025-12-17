package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.Gift: ImageVector
    get() {
        if (_Gift != null) return _Gift!!
        
        _Gift = ImageVector.Builder(
            name = "gift",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14f, 6.005f)
                arcToRelative(2.5f, 2.5f, 0f, false, false, -4f, -3f)
                arcToRelative(2.5f, 2.5f, 0f, false, false, -4f, 3f)
                horizontalLineTo(3.25f)
                curveToRelative(-0.69f, 0f, -1.25f, 0.56f, -1.25f, 1.25f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 0.69f, 0.56f, 1.25f, 1.25f, 1.25f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(6f)
                curveToRelative(0.69f, 0f, 1.25f, -0.56f, 1.25f, -1.25f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -0.69f, -0.56f, -1.25f, -1.25f, -1.25f)
                horizontalLineTo(14f)
                close()
                moveToRelative(-1f, -1.5f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-1f)
                arcToRelative(1f, 1f, 0f, true, true, 2f, 0f)
                close()
                moveToRelative(-6f, 0f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-1f)
                arcToRelative(1f, 1f, 0f, true, false, -2f, 0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.25f, 10.505f)
                horizontalLineTo(3f)
                verticalLineToRelative(4.75f)
                arcToRelative(2.75f, 2.75f, 0f, false, false, 2.75f, 2.75f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(-7.5f)
                close()
                moveTo(10.75f, 18.005f)
                verticalLineToRelative(-7.5f)
                horizontalLineTo(17f)
                verticalLineToRelative(4.75f)
                arcToRelative(2.75f, 2.75f, 0f, false, true, -2.75f, 2.75f)
                horizontalLineToRelative(-3.5f)
                close()
            }
        }.build()
        
        return _Gift!!
    }

private var _Gift: ImageVector? = null

