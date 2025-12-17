package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.Cake: ImageVector
    get() {
        if (_Cake != null) return _Cake!!
        
        _Cake = ImageVector.Builder(
            name = "cake",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.75f, 0.98f)
                lineToRelative(-0.884f, 0.883f)
                arcToRelative(1.25f, 1.25f, 0f, true, false, 1.768f, 0f)
                lineTo(6.75f, 0.98f)
                close()
                moveTo(13.25f, 0.98f)
                lineToRelative(-0.884f, 0.883f)
                arcToRelative(1.25f, 1.25f, 0f, true, false, 1.768f, 0f)
                lineTo(13.25f, 0.98f)
                close()
                moveTo(10f, 0.98f)
                lineToRelative(0.884f, 0.883f)
                arcToRelative(1.25f, 1.25f, 0f, true, true, -1.768f, 0f)
                lineTo(10f, 0.98f)
                close()
                moveTo(7.5f, 5.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.5f, 0f)
                verticalLineToRelative(0.464f)
                curveToRelative(-1.179f, 0.304f, -2f, 1.39f, -2f, 2.622f)
                verticalLineToRelative(0.094f)
                curveToRelative(0.1f, -0.02f, 0.202f, -0.038f, 0.306f, -0.052f)
                arcTo(42.867f, 42.867f, 0f, false, true, 10f, 8.5f)
                curveToRelative(1.93f, 0f, 3.83f, 0.129f, 5.694f, 0.378f)
                curveToRelative(0.104f, 0.014f, 0.206f, 0.032f, 0.306f, 0.052f)
                verticalLineToRelative(-0.094f)
                curveToRelative(0f, -1.232f, -0.821f, -2.317f, -2f, -2.622f)
                verticalLineTo(5.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.5f, 0f)
                verticalLineToRelative(0.318f)
                arcToRelative(45.645f, 45.645f, 0f, false, false, -1.75f, -0.062f)
                verticalLineTo(5.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.5f, 0f)
                verticalLineToRelative(0.256f)
                curveToRelative(-0.586f, 0.01f, -1.17f, 0.03f, -1.75f, 0.062f)
                verticalLineTo(5.75f)
                close()
                moveTo(4.505f, 10.365f)
                arcTo(41.36f, 41.36f, 0f, false, true, 10f, 10f)
                curveToRelative(1.863f, 0f, 3.697f, 0.124f, 5.495f, 0.365f)
                curveTo(16.967f, 10.562f, 18f, 11.838f, 18f, 13.28f)
                verticalLineToRelative(0.693f)
                arcToRelative(3.72f, 3.72f, 0f, false, true, -1.665f, -0.393f)
                arcToRelative(5.222f, 5.222f, 0f, false, false, -4.67f, 0f)
                arcToRelative(3.722f, 3.722f, 0f, false, true, -3.33f, 0f)
                arcToRelative(5.222f, 5.222f, 0f, false, false, -4.67f, 0f)
                arcTo(3.72f, 3.72f, 0f, false, true, 2f, 13.972f)
                verticalLineToRelative(-0.693f)
                curveToRelative(0f, -1.441f, 1.033f, -2.717f, 2.505f, -2.914f)
                close()
                moveTo(15.665f, 14.92f)
                arcToRelative(5.22f, 5.22f, 0f, false, false, 2.335f, 0.552f)
                verticalLineTo(16.5f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -1.5f, 1.5f)
                horizontalLineToRelative(-13f)
                arcTo(1.5f, 1.5f, 0f, false, true, 2f, 16.5f)
                verticalLineToRelative(-1.028f)
                curveToRelative(0.8f, 0f, 1.6f, -0.184f, 2.335f, -0.551f)
                arcToRelative(3.722f, 3.722f, 0f, false, true, 3.33f, 0f)
                curveToRelative(1.47f, 0.735f, 3.2f, 0.735f, 4.67f, 0f)
                arcToRelative(3.722f, 3.722f, 0f, false, true, 3.33f, 0f)
                close()
            }
        }.build()
        
        return _Cake!!
    }

private var _Cake: ImageVector? = null

