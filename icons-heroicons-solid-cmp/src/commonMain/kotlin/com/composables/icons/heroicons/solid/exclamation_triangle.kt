package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.ExclamationTriangle: ImageVector
    get() {
        if (_ExclamationTriangle != null) return _ExclamationTriangle!!
        
        _ExclamationTriangle = ImageVector.Builder(
            name = "exclamation-triangle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.401f, 3.003f)
                curveToRelative(1.155f, -2f, 4.043f, -2f, 5.197f, 0f)
                lineToRelative(7.355f, 12.748f)
                curveToRelative(1.154f, 2f, -0.29f, 4.5f, -2.599f, 4.5f)
                horizontalLineTo(4.645f)
                curveToRelative(-2.309f, 0f, -3.752f, -2.5f, -2.598f, -4.5f)
                lineTo(9.4f, 3.003f)
                close()
                moveTo(12f, 8.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, 0.75f)
                verticalLineToRelative(3.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.5f, 0f)
                verticalLineTo(9f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, -0.75f)
                close()
                moveToRelative(0f, 8.25f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 0f, -1.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                close()
            }
        }.build()
        
        return _ExclamationTriangle!!
    }

private var _ExclamationTriangle: ImageVector? = null

