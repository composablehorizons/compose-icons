package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Notes: ImageVector
    get() {
        if (_Notes != null) return _Notes!!
        
        _Notes = ImageVector.Builder(
            name = "notes",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(21f, 11.01f)
                lineTo(3f, 11f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(18f)
                close()
                moveTo(3f, 16f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(2f)
                horizontalLineTo(3f)
                close()
                moveTo(21f, 6f)
                horizontalLineTo(3f)
                verticalLineToRelative(2.01f)
                lineTo(21f, 8f)
                close()
            }
        }.build()
        
        return _Notes!!
    }

private var _Notes: ImageVector? = null

