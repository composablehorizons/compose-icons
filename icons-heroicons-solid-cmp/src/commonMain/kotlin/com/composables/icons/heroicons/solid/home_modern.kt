package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.HomeModern: ImageVector
    get() {
        if (_HomeModern != null) return _HomeModern!!
        
        _HomeModern = ImageVector.Builder(
            name = "home-modern",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(19.006f, 3.705f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, -0.512f, -1.41f)
                lineTo(6f, 6.838f)
                verticalLineTo(3f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.75f, -0.75f)
                horizontalLineToRelative(-1.5f)
                arcTo(0.75f, 0.75f, 0f, false, false, 3f, 3f)
                verticalLineToRelative(4.93f)
                lineToRelative(-1.006f, 0.365f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.512f, 1.41f)
                lineToRelative(16.5f, -6f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.019f, 11.114f)
                lineTo(18f, 5.667f)
                verticalLineToRelative(3.421f)
                lineToRelative(4.006f, 1.457f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -0.512f, 1.41f)
                lineToRelative(-0.494f, -0.18f)
                verticalLineToRelative(8.475f)
                horizontalLineToRelative(0.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.5f)
                horizontalLineTo(2.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, -1.5f)
                horizontalLineTo(3f)
                verticalLineToRelative(-9.129f)
                lineToRelative(0.019f, -0.007f)
                close()
                moveTo(18f, 20.25f)
                verticalLineToRelative(-9.566f)
                lineToRelative(1.5f, 0.546f)
                verticalLineToRelative(9.02f)
                horizontalLineTo(18f)
                close()
                moveToRelative(-9f, -6f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.75f, 0.75f)
                verticalLineToRelative(4.5f)
                curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
                horizontalLineToRelative(3f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.75f, -0.75f)
                verticalLineTo(15f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.75f, -0.75f)
                horizontalLineTo(9f)
                close()
            }
        }.build()
        
        return _HomeModern!!
    }

private var _HomeModern: ImageVector? = null

