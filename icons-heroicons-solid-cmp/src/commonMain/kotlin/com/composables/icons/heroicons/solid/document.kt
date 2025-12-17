package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.Document: ImageVector
    get() {
        if (_Document != null) return _Document!!
        
        _Document = ImageVector.Builder(
            name = "document",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5.625f, 1.5f)
                curveToRelative(-1.036f, 0f, -1.875f, 0.84f, -1.875f, 1.875f)
                verticalLineToRelative(17.25f)
                curveToRelative(0f, 1.035f, 0.84f, 1.875f, 1.875f, 1.875f)
                horizontalLineToRelative(12.75f)
                curveToRelative(1.035f, 0f, 1.875f, -0.84f, 1.875f, -1.875f)
                verticalLineTo(12.75f)
                arcTo(3.75f, 3.75f, 0f, false, false, 16.5f, 9f)
                horizontalLineToRelative(-1.875f)
                arcToRelative(1.875f, 1.875f, 0f, false, true, -1.875f, -1.875f)
                verticalLineTo(5.25f)
                arcTo(3.75f, 3.75f, 0f, false, false, 9f, 1.5f)
                horizontalLineTo(5.625f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.971f, 1.816f)
                arcTo(5.23f, 5.23f, 0f, false, true, 14.25f, 5.25f)
                verticalLineToRelative(1.875f)
                curveToRelative(0f, 0.207f, 0.168f, 0.375f, 0.375f, 0.375f)
                horizontalLineTo(16.5f)
                arcToRelative(5.23f, 5.23f, 0f, false, true, 3.434f, 1.279f)
                arcToRelative(9.768f, 9.768f, 0f, false, false, -6.963f, -6.963f)
                close()
            }
        }.build()
        
        return _Document!!
    }

private var _Document: ImageVector? = null

