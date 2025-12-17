package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Functions: ImageVector
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
                horizontalLineToRelative(-7f)
                lineToRelative(5f, -5f)
                lineToRelative(-5f, -5f)
                horizontalLineToRelative(7f)
                verticalLineTo(4f)
                horizontalLineTo(6f)
                verticalLineToRelative(2f)
                lineToRelative(6.5f, 6f)
                lineTo(6f, 18f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(12f)
                close()
            }
        }.build()
        
        return _Functions!!
    }

private var _Functions: ImageVector? = null

