package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.New_label: ImageVector
    get() {
        if (_New_label != null) return _New_label!!
        
        _New_label = ImageVector.Builder(
            name = "new_label",
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
                moveTo(21f, 12f)
                lineToRelative(-4.97f, 7f)
                horizontalLineTo(12f)
                lineToRelative(0f, -2f)
                lineToRelative(0f, -4f)
                horizontalLineTo(9f)
                verticalLineToRelative(-3f)
                horizontalLineTo(3f)
                verticalLineTo(5f)
                horizontalLineToRelative(13.03f)
                lineTo(21f, 12f)
                close()
                moveTo(10f, 15f)
                horizontalLineTo(7f)
                verticalLineToRelative(-3f)
                horizontalLineTo(5f)
                verticalLineToRelative(3f)
                horizontalLineTo(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(3f)
                verticalLineTo(15f)
                close()
            }
        }.build()
        
        return _New_label!!
    }

private var _New_label: ImageVector? = null

