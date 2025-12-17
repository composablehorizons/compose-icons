package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Functions: ImageVector
    get() {
        if (_Functions != null) return _Functions!!
        
        _Functions = ImageVector.Builder(
            name = "functions",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(18f, 4f)
                horizontalLineTo(6f)
                verticalLineToRelative(2f)
                lineToRelative(6.5f, 6f)
                lineTo(6f, 18f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-7f)
                lineToRelative(5f, -5f)
                lineToRelative(-5f, -5f)
                horizontalLineToRelative(7f)
                verticalLineTo(4f)
                close()
            }
        }.build()
        
        return _Functions!!
    }

private var _Functions: ImageVector? = null

