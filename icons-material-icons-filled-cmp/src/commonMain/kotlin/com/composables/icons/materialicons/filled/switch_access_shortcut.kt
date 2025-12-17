package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Switch_access_shortcut: ImageVector
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
                moveTo(12f, 12f)
                curveToRelative(0f, -2.73f, 1.08f, -5.27f, 2.75f, -7.25f)
                lineTo(12f, 2f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(7f)
                lineToRelative(-2.82f, -2.82f)
                curveTo(14.84f, 7.82f, 14f, 9.88f, 14f, 12f)
                curveToRelative(0f, 3.32f, 2.1f, 6.36f, 5f, 7.82f)
                lineTo(19f, 22f)
                curveTo(14.91f, 20.41f, 12f, 16.35f, 12f, 12f)
                close()
            }
        }.build()
        
        return _Switch_access_shortcut!!
    }

private var _Switch_access_shortcut: ImageVector? = null

