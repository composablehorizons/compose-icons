package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Receipt: ImageVector
    get() {
        if (_Receipt != null) return _Receipt!!
        
        _Receipt = ImageVector.Builder(
            name = "receipt",
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
                moveTo(18f, 17f)
                horizontalLineTo(6f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(2f)
                close()
                moveToRelative(0f, -4f)
                horizontalLineTo(6f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(2f)
                close()
                moveToRelative(0f, -4f)
                horizontalLineTo(6f)
                verticalLineTo(7f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(2f)
                close()
                moveTo(3f, 22f)
                lineToRelative(1.5f, -1.5f)
                lineTo(6f, 22f)
                lineToRelative(1.5f, -1.5f)
                lineTo(9f, 22f)
                lineToRelative(1.5f, -1.5f)
                lineTo(12f, 22f)
                lineToRelative(1.5f, -1.5f)
                lineTo(15f, 22f)
                lineToRelative(1.5f, -1.5f)
                lineTo(18f, 22f)
                lineToRelative(1.5f, -1.5f)
                lineTo(21f, 22f)
                verticalLineTo(2f)
                lineToRelative(-1.5f, 1.5f)
                lineTo(18f, 2f)
                lineToRelative(-1.5f, 1.5f)
                lineTo(15f, 2f)
                lineToRelative(-1.5f, 1.5f)
                lineTo(12f, 2f)
                lineToRelative(-1.5f, 1.5f)
                lineTo(9f, 2f)
                lineTo(7.5f, 3.5f)
                lineTo(6f, 2f)
                lineTo(4.5f, 3.5f)
                lineTo(3f, 2f)
                verticalLineToRelative(20f)
                close()
            }
        }.build()
        
        return _Receipt!!
    }

private var _Receipt: ImageVector? = null

