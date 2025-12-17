package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Money: ImageVector
    get() {
        if (_Money != null) return _Money!!
        
        _Money = ImageVector.Builder(
            name = "money",
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
                moveTo(14f, 16f)
                horizontalLineToRelative(5f)
                verticalLineTo(8f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(8f)
                close()
                moveToRelative(2f, -6f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-4f)
                close()
                moveToRelative(-8f, 6f)
                horizontalLineToRelative(5f)
                verticalLineTo(8f)
                horizontalLineTo(8f)
                verticalLineToRelative(8f)
                close()
                moveToRelative(2f, -6f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-4f)
                close()
                moveTo(5f, 8f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(8f)
                horizontalLineTo(5f)
                close()
                moveTo(2f, 4f)
                verticalLineToRelative(16f)
                horizontalLineToRelative(20f)
                verticalLineTo(4f)
                horizontalLineTo(2f)
                close()
                moveToRelative(18f, 14f)
                horizontalLineTo(4f)
                verticalLineTo(6f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(12f)
                close()
            }
        }.build()
        
        return _Money!!
    }

private var _Money: ImageVector? = null

