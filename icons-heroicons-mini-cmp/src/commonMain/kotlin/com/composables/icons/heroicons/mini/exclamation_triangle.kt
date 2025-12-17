package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.ExclamationTriangle: ImageVector
    get() {
        if (_ExclamationTriangle != null) return _ExclamationTriangle!!
        
        _ExclamationTriangle = ImageVector.Builder(
            name = "exclamation-triangle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.485f, 2.495f)
                curveToRelative(0.673f, -1.167f, 2.357f, -1.167f, 3.03f, 0f)
                lineToRelative(6.28f, 10.875f)
                curveToRelative(0.673f, 1.167f, -0.17f, 2.625f, -1.516f, 2.625f)
                horizontalLineTo(3.72f)
                curveToRelative(-1.347f, 0f, -2.189f, -1.458f, -1.515f, -2.625f)
                lineTo(8.485f, 2.495f)
                close()
                moveTo(10f, 5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, 0.75f)
                verticalLineToRelative(3.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.5f, 0f)
                verticalLineToRelative(-3.5f)
                arcTo(0.75f, 0.75f, 0f, false, true, 10f, 5f)
                close()
                moveToRelative(0f, 9f)
                arcToRelative(1f, 1f, 0f, true, false, 0f, -2f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, 2f)
                close()
            }
        }.build()
        
        return _ExclamationTriangle!!
    }

private var _ExclamationTriangle: ImageVector? = null

