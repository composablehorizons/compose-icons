package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.Document: ImageVector
    get() {
        if (_Document != null) return _Document!!
        
        _Document = ImageVector.Builder(
            name = "document",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3f, 3.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 4.5f, 2f)
                horizontalLineToRelative(6.879f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 1.06f, 0.44f)
                lineToRelative(4.122f, 4.12f)
                arcTo(1.5f, 1.5f, 0f, false, true, 17f, 7.622f)
                verticalLineTo(16.5f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -1.5f, 1.5f)
                horizontalLineToRelative(-11f)
                arcTo(1.5f, 1.5f, 0f, false, true, 3f, 16.5f)
                verticalLineToRelative(-13f)
                close()
            }
        }.build()
        
        return _Document!!
    }

private var _Document: ImageVector? = null

