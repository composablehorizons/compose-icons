package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.Film: ImageVector
    get() {
        if (_Film != null) return _Film!!
        
        _Film = ImageVector.Builder(
            name = "film",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1f, 4.75f)
                curveTo(1f, 3.784f, 1.784f, 3f, 2.75f, 3f)
                horizontalLineToRelative(14.5f)
                curveToRelative(0.966f, 0f, 1.75f, 0.784f, 1.75f, 1.75f)
                verticalLineToRelative(10.515f)
                arcToRelative(1.75f, 1.75f, 0f, false, true, -1.75f, 1.75f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.078f, 0f, -0.155f, -0.005f, -0.23f, -0.015f)
                horizontalLineTo(4.48f)
                curveToRelative(-0.075f, 0.01f, -0.152f, 0.015f, -0.23f, 0.015f)
                horizontalLineToRelative(-1.5f)
                arcTo(1.75f, 1.75f, 0f, false, true, 1f, 15.265f)
                verticalLineTo(4.75f)
                close()
                moveToRelative(16.5f, 7.385f)
                verticalLineTo(11.01f)
                arcToRelative(0.25f, 0.25f, 0f, false, false, -0.25f, -0.25f)
                horizontalLineToRelative(-1.5f)
                arcToRelative(0.25f, 0.25f, 0f, false, false, -0.25f, 0.25f)
                verticalLineToRelative(1.125f)
                curveToRelative(0f, 0.138f, 0.112f, 0.25f, 0.25f, 0.25f)
                horizontalLineToRelative(1.5f)
                arcToRelative(0.25f, 0.25f, 0f, false, false, 0.25f, -0.25f)
                close()
                moveToRelative(0f, 2.005f)
                arcToRelative(0.25f, 0.25f, 0f, false, false, -0.25f, -0.25f)
                horizontalLineToRelative(-1.5f)
                arcToRelative(0.25f, 0.25f, 0f, false, false, -0.25f, 0.25f)
                verticalLineToRelative(1.125f)
                curveToRelative(0f, 0.108f, 0.069f, 0.2f, 0.165f, 0.235f)
                horizontalLineToRelative(1.585f)
                arcToRelative(0.25f, 0.25f, 0f, false, false, 0.25f, -0.25f)
                verticalLineToRelative(-1.11f)
                close()
                moveToRelative(-15f, 1.11f)
                verticalLineToRelative(-1.11f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, 0.25f, -0.25f)
                horizontalLineToRelative(1.5f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, 0.25f, 0.25f)
                verticalLineToRelative(1.125f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, -0.164f, 0.235f)
                horizontalLineTo(2.75f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, -0.25f, -0.25f)
                close()
                moveToRelative(2f, -4.24f)
                verticalLineToRelative(1.125f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, -0.25f, 0.25f)
                horizontalLineToRelative(-1.5f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, -0.25f, -0.25f)
                verticalLineTo(11.01f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, 0.25f, -0.25f)
                horizontalLineToRelative(1.5f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, 0.25f, 0.25f)
                close()
                moveToRelative(13f, -2.005f)
                verticalLineTo(7.88f)
                arcToRelative(0.25f, 0.25f, 0f, false, false, -0.25f, -0.25f)
                horizontalLineToRelative(-1.5f)
                arcToRelative(0.25f, 0.25f, 0f, false, false, -0.25f, 0.25f)
                verticalLineToRelative(1.125f)
                curveToRelative(0f, 0.138f, 0.112f, 0.25f, 0.25f, 0.25f)
                horizontalLineToRelative(1.5f)
                arcToRelative(0.25f, 0.25f, 0f, false, false, 0.25f, -0.25f)
                close()
                moveTo(4.25f, 7.63f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, 0.25f, 0.25f)
                verticalLineToRelative(1.125f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, -0.25f, 0.25f)
                horizontalLineToRelative(-1.5f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, -0.25f, -0.25f)
                verticalLineTo(7.88f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, 0.25f, -0.25f)
                horizontalLineToRelative(1.5f)
                close()
                moveToRelative(0f, -3.13f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, 0.25f, 0.25f)
                verticalLineToRelative(1.125f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, -0.25f, 0.25f)
                horizontalLineToRelative(-1.5f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, -0.25f, -0.25f)
                verticalLineTo(4.75f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, 0.25f, -0.25f)
                horizontalLineToRelative(1.5f)
                close()
                moveToRelative(11.5f, 1.625f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, -0.25f, -0.25f)
                verticalLineTo(4.75f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, 0.25f, -0.25f)
                horizontalLineToRelative(1.5f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, 0.25f, 0.25f)
                verticalLineToRelative(1.125f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, -0.25f, 0.25f)
                horizontalLineToRelative(-1.5f)
                close()
                moveToRelative(-9f, 3.125f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                horizontalLineToRelative(6.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.5f)
                horizontalLineToRelative(-6.5f)
                close()
            }
        }.build()
        
        return _Film!!
    }

private var _Film: ImageVector? = null

