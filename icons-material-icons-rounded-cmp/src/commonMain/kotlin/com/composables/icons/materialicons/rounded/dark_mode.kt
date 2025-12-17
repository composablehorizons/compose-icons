package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Dark_mode: ImageVector
    get() {
        if (_Dark_mode != null) return _Dark_mode!!
        
        _Dark_mode = ImageVector.Builder(
            name = "dark_mode",
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
                moveTo(11.01f, 3.05f)
                curveTo(6.51f, 3.54f, 3f, 7.36f, 3f, 12f)
                curveToRelative(0f, 4.97f, 4.03f, 9f, 9f, 9f)
                curveToRelative(4.63f, 0f, 8.45f, -3.5f, 8.95f, -8f)
                curveToRelative(0.09f, -0.79f, -0.78f, -1.42f, -1.54f, -0.95f)
                curveToRelative(-0.84f, 0.54f, -1.84f, 0.85f, -2.91f, 0.85f)
                curveToRelative(-2.98f, 0f, -5.4f, -2.42f, -5.4f, -5.4f)
                curveToRelative(0f, -1.06f, 0.31f, -2.06f, 0.84f, -2.89f)
                curveTo(12.39f, 3.94f, 11.9f, 2.98f, 11.01f, 3.05f)
                close()
            }
        }.build()
        
        return _Dark_mode!!
    }

private var _Dark_mode: ImageVector? = null

