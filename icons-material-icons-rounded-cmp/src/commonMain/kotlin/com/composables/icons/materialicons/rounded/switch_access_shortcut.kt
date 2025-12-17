package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Switch_access_shortcut: ImageVector
    get() {
        if (_Switch_access_shortcut != null) return _Switch_access_shortcut!!
        
        _Switch_access_shortcut = ImageVector.Builder(
            name = "switch_access_shortcut",
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
                moveTo(7.06f, 8.94f)
                lineTo(5f, 8f)
                lineToRelative(2.06f, -0.94f)
                lineTo(8f, 5f)
                lineToRelative(0.94f, 2.06f)
                lineTo(11f, 8f)
                lineTo(8.94f, 8.94f)
                lineTo(8f, 11f)
                lineTo(7.06f, 8.94f)
                close()
                moveTo(8f, 21f)
                lineToRelative(0.94f, -2.06f)
                lineTo(11f, 18f)
                lineToRelative(-2.06f, -0.94f)
                lineTo(8f, 15f)
                lineToRelative(-0.94f, 2.06f)
                lineTo(5f, 18f)
                lineToRelative(2.06f, 0.94f)
                lineTo(8f, 21f)
                close()
                moveTo(4.37f, 12.37f)
                lineTo(3f, 13f)
                lineToRelative(1.37f, 0.63f)
                lineTo(5f, 15f)
                lineToRelative(0.63f, -1.37f)
                lineTo(7f, 13f)
                lineToRelative(-1.37f, -0.63f)
                lineTo(5f, 11f)
                lineTo(4.37f, 12.37f)
                close()
                moveTo(19f, 20.41f)
                curveToRelative(0f, 0.78f, -0.84f, 1.25f, -1.51f, 0.86f)
                curveTo(14.21f, 19.36f, 12f, 15.79f, 12f, 12f)
                curveToRelative(0f, -2.73f, 1.08f, -5.27f, 2.75f, -7.25f)
                lineToRelative(-1.9f, -1.9f)
                curveTo(12.54f, 2.54f, 12.76f, 2f, 13.21f, 2f)
                horizontalLineToRelative(5.29f)
                curveTo(18.78f, 2f, 19f, 2.22f, 19f, 2.5f)
                verticalLineToRelative(5.29f)
                curveToRelative(0f, 0.45f, -0.54f, 0.67f, -0.85f, 0.35f)
                lineToRelative(-1.97f, -1.97f)
                curveTo(14.84f, 7.82f, 14f, 9.88f, 14f, 12f)
                curveToRelative(0f, 3.13f, 1.86f, 6.01f, 4.51f, 7.55f)
                curveTo(18.81f, 19.73f, 19f, 20.06f, 19f, 20.41f)
                close()
            }
        }.build()
        
        return _Switch_access_shortcut!!
    }

private var _Switch_access_shortcut: ImageVector? = null

