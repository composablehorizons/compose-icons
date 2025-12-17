package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Collections_bookmark: ImageVector
    get() {
        if (_Collections_bookmark != null) return _Collections_bookmark!!
        
        _Collections_bookmark = ImageVector.Builder(
            name = "collections_bookmark",
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
                moveTo(4f, 6f)
                horizontalLineTo(2f)
                verticalLineToRelative(16f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(-2f)
                horizontalLineTo(4f)
                verticalLineTo(6f)
                close()
                moveToRelative(18f, -4f)
                horizontalLineTo(6f)
                verticalLineToRelative(16f)
                horizontalLineToRelative(16f)
                verticalLineTo(2f)
                close()
                moveToRelative(-2f, 10f)
                lineToRelative(-2.5f, -1.5f)
                lineTo(15f, 12f)
                verticalLineTo(4f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(8f)
                close()
            }
        }.build()
        
        return _Collections_bookmark!!
    }

private var _Collections_bookmark: ImageVector? = null

