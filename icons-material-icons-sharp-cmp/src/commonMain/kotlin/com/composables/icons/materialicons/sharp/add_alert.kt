package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Add_alert: ImageVector
    get() {
        if (_Add_alert != null) return _Add_alert!!
        
        _Add_alert = ImageVector.Builder(
            name = "add_alert",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 23f)
                curveToRelative(1.1f, 0f, 1.99f, -0.89f, 1.99f, -1.99f)
                horizontalLineToRelative(-3.98f)
                curveToRelative(0f, 1.1f, 0.89f, 1.99f, 1.99f, 1.99f)
                close()
                moveToRelative(7f, -6f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -3.35f, -2.36f, -6.15f, -5.5f, -6.83f)
                verticalLineTo(1.5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2.67f)
                curveTo(7.36f, 4.85f, 5f, 7.65f, 5f, 11f)
                verticalLineToRelative(6f)
                lineToRelative(-2f, 2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(-1f)
                lineToRelative(-2f, -2f)
                close()
                moveToRelative(-3f, -3.99f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3f)
                horizontalLineTo(8f)
                verticalLineTo(11f)
                horizontalLineToRelative(3f)
                verticalLineTo(8f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2.01f)
                close()
            }
        }.build()
        
        return _Add_alert!!
    }

private var _Add_alert: ImageVector? = null

