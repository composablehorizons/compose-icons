package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Change_history: ImageVector
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
                lineTo(18.39f, 18f)
                horizontalLineTo(5.61f)
                lineTo(12f, 7.77f)
                moveToRelative(-0.85f, -2.41f)
                lineToRelative(-8.2f, 13.11f)
                curveToRelative(-0.41f, 0.67f, 0.07f, 1.53f, 0.85f, 1.53f)
                horizontalLineToRelative(16.4f)
                curveToRelative(0.79f, 0f, 1.26f, -0.86f, 0.85f, -1.53f)
                lineToRelative(-8.2f, -13.11f)
                curveToRelative(-0.39f, -0.63f, -1.31f, -0.63f, -1.7f, 0f)
                close()
            }
        }.build()
        
        return _Change_history!!
    }

private var _Change_history: ImageVector? = null

