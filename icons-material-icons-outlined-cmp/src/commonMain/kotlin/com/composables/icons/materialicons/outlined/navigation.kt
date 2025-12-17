package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Navigation: ImageVector
    get() {
        if (_Navigation != null) return _Navigation!!
        
        _Navigation = ImageVector.Builder(
            name = "navigation",
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
                moveTo(12f, 7.27f)
                lineToRelative(4.28f, 10.43f)
                lineToRelative(-3.47f, -1.53f)
                lineToRelative(-0.81f, -0.36f)
                lineToRelative(-0.81f, 0.36f)
                lineToRelative(-3.47f, 1.53f)
                lineTo(12f, 7.27f)
                moveTo(12f, 2f)
                lineTo(4.5f, 20.29f)
                lineToRelative(0.71f, 0.71f)
                lineTo(12f, 18f)
                lineToRelative(6.79f, 3f)
                lineToRelative(0.71f, -0.71f)
                lineTo(12f, 2f)
                close()
            }
        }.build()
        
        return _Navigation!!
    }

private var _Navigation: ImageVector? = null

