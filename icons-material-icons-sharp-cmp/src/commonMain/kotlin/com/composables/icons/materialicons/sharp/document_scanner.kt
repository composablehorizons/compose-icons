package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Document_scanner: ImageVector
    get() {
        if (_Document_scanner != null) return _Document_scanner!!
        
        _Document_scanner = ImageVector.Builder(
            name = "document_scanner",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(24f)
                verticalLineTo(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7f, 3f)
                horizontalLineTo(4f)
                verticalLineToRelative(3f)
                horizontalLineTo(2f)
                verticalLineTo(1f)
                horizontalLineToRelative(5f)
                verticalLineTo(3f)
                close()
                moveTo(22f, 6f)
                verticalLineTo(1f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                horizontalLineTo(22f)
                close()
                moveTo(7f, 21f)
                horizontalLineTo(4f)
                verticalLineToRelative(-3f)
                horizontalLineTo(2f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(5f)
                verticalLineTo(21f)
                close()
                moveTo(20f, 18f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-5f)
                horizontalLineTo(20f)
                close()
                moveTo(19f, 4f)
                verticalLineToRelative(16f)
                horizontalLineTo(5f)
                verticalLineTo(4f)
                horizontalLineTo(19f)
                close()
                moveTo(15f, 8f)
                horizontalLineTo(9f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(6f)
                verticalLineTo(8f)
                close()
                moveTo(15f, 11f)
                horizontalLineTo(9f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(6f)
                verticalLineTo(11f)
                close()
                moveTo(15f, 14f)
                horizontalLineTo(9f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(6f)
                verticalLineTo(14f)
                close()
            }
        }.build()
        
        return _Document_scanner!!
    }

private var _Document_scanner: ImageVector? = null

