package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Compare: ImageVector
    get() {
        if (_Compare != null) return _Compare!!
        
        _Compare = ImageVector.Builder(
            name = "compare",
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
                moveTo(10f, 3f)
                horizontalLineTo(3f)
                verticalLineToRelative(18f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineTo(1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                close()
                moveToRelative(0f, 15f)
                horizontalLineTo(5f)
                lineToRelative(5f, -6f)
                verticalLineToRelative(6f)
                close()
                moveTo(21f, 3f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(13f)
                lineToRelative(-5f, -6f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(7f)
                verticalLineTo(3f)
                close()
            }
        }.build()
        
        return _Compare!!
    }

private var _Compare: ImageVector? = null

