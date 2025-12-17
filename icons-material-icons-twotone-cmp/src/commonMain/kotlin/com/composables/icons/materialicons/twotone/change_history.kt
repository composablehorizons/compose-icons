package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Change_history: ImageVector
    get() {
        if (_Change_history != null) return _Change_history!!
        
        _Change_history = ImageVector.Builder(
            name = "change_history",
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
                moveTo(12f, 7.77f)
                lineTo(5.61f, 18f)
                horizontalLineToRelative(12.78f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 4f)
                lineTo(2f, 20f)
                horizontalLineToRelative(20f)
                lineTo(12f, 4f)
                close()
                moveToRelative(0f, 3.77f)
                lineTo(18.39f, 18f)
                horizontalLineTo(5.61f)
                lineTo(12f, 7.77f)
                close()
            }
        }.build()
        
        return _Change_history!!
    }

private var _Change_history: ImageVector? = null

