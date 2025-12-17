package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.Bell: ImageVector
    get() {
        if (_Bell != null) return _Bell!!
        
        _Bell = ImageVector.Builder(
            name = "bell",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 5f)
                arcToRelative(4f, 4f, 0f, false, false, -8f, 0f)
                verticalLineToRelative(2.379f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -0.44f, 1.06f)
                lineTo(2.294f, 9.707f)
                arcToRelative(1f, 1f, 0f, false, false, -0.293f, 0.707f)
                verticalLineTo(11f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(2f)
                arcToRelative(3f, 3f, 0f, true, false, 6f, 0f)
                horizontalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                verticalLineToRelative(-0.586f)
                arcToRelative(1f, 1f, 0f, false, false, -0.293f, -0.707f)
                lineTo(12.44f, 8.44f)
                arcTo(1.5f, 1.5f, 0f, false, true, 12f, 7.38f)
                verticalLineTo(5f)
                close()
                moveToRelative(-5.5f, 7f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 3f, 0f)
                horizontalLineToRelative(-3f)
                close()
            }
        }.build()
        
        return _Bell!!
    }

private var _Bell: ImageVector? = null

