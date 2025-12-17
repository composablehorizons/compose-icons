package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.AlignCenter: ImageVector
    get() {
        if (_AlignCenter != null) return _AlignCenter!!
        
        _AlignCenter = ImageVector.Builder(
            name = "align-center",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(432f, 160f)
                horizontalLineTo(16f)
                arcToRelative(16f, 16f, 0f, false, false, -16f, 16f)
                verticalLineToRelative(32f)
                arcToRelative(16f, 16f, 0f, false, false, 16f, 16f)
                horizontalLineToRelative(416f)
                arcToRelative(16f, 16f, 0f, false, false, 16f, -16f)
                verticalLineToRelative(-32f)
                arcToRelative(16f, 16f, 0f, false, false, -16f, -16f)
                close()
                moveToRelative(0f, 256f)
                horizontalLineTo(16f)
                arcToRelative(16f, 16f, 0f, false, false, -16f, 16f)
                verticalLineToRelative(32f)
                arcToRelative(16f, 16f, 0f, false, false, 16f, 16f)
                horizontalLineToRelative(416f)
                arcToRelative(16f, 16f, 0f, false, false, 16f, -16f)
                verticalLineToRelative(-32f)
                arcToRelative(16f, 16f, 0f, false, false, -16f, -16f)
                close()
                moveTo(108.1f, 96f)
                horizontalLineToRelative(231.81f)
                arcTo(12.09f, 12.09f, 0f, false, false, 352f, 83.9f)
                verticalLineTo(44.09f)
                arcTo(12.09f, 12.09f, 0f, false, false, 339.91f, 32f)
                horizontalLineTo(108.1f)
                arcTo(12.09f, 12.09f, 0f, false, false, 96f, 44.09f)
                verticalLineTo(83.9f)
                arcTo(12.1f, 12.1f, 0f, false, false, 108.1f, 96f)
                close()
                moveToRelative(231.81f, 256f)
                arcTo(12.09f, 12.09f, 0f, false, false, 352f, 339.9f)
                verticalLineToRelative(-39.81f)
                arcTo(12.09f, 12.09f, 0f, false, false, 339.91f, 288f)
                horizontalLineTo(108.1f)
                arcTo(12.09f, 12.09f, 0f, false, false, 96f, 300.09f)
                verticalLineToRelative(39.81f)
                arcToRelative(12.1f, 12.1f, 0f, false, false, 12.1f, 12.1f)
                close()
            }
        }.build()
        
        return _AlignCenter!!
    }

private var _AlignCenter: ImageVector? = null

