package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.ExclamationTriangle: ImageVector
    get() {
        if (_ExclamationTriangle != null) return _ExclamationTriangle!!
        
        _ExclamationTriangle = ImageVector.Builder(
            name = "exclamation-triangle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.701f, 2.25f)
                curveToRelative(0.577f, -1f, 2.02f, -1f, 2.598f, 0f)
                lineToRelative(5.196f, 9f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -1.299f, 2.25f)
                horizontalLineTo(2.804f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -1.3f, -2.25f)
                lineToRelative(5.197f, -9f)
                close()
                moveTo(8f, 4f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, 0.75f)
                verticalLineToRelative(3f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -1.5f, 0f)
                verticalLineToRelative(-3f)
                arcTo(0.75f, 0.75f, 0f, false, true, 8f, 4f)
                close()
                moveToRelative(0f, 8f)
                arcToRelative(1f, 1f, 0f, true, false, 0f, -2f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, 2f)
                close()
            }
        }.build()
        
        return _ExclamationTriangle!!
    }

private var _ExclamationTriangle: ImageVector? = null

