package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Kitchen: ImageVector
    get() {
        if (_Kitchen != null) return _Kitchen!!
        
        _Kitchen = ImageVector.Builder(
            name = "kitchen",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(20f, 2.01f)
                lineTo(4f, 2f)
                verticalLineToRelative(20f)
                horizontalLineToRelative(16f)
                verticalLineTo(2.01f)
                close()
                moveTo(18f, 20f)
                horizontalLineTo(6f)
                verticalLineToRelative(-9.02f)
                horizontalLineToRelative(12f)
                verticalLineTo(20f)
                close()
                moveToRelative(0f, -11f)
                horizontalLineTo(6f)
                verticalLineTo(4f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(5f)
                close()
                moveTo(8f, 5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                horizontalLineTo(8f)
                verticalLineTo(5f)
                close()
                moveToRelative(0f, 7f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(5f)
                horizontalLineTo(8f)
                verticalLineToRelative(-5f)
                close()
            }
        }.build()
        
        return _Kitchen!!
    }

private var _Kitchen: ImageVector? = null

