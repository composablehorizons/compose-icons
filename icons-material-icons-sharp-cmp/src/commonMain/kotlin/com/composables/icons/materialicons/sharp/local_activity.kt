package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Local_activity: ImageVector
    get() {
        if (_Local_activity != null) return _Local_activity!!
        
        _Local_activity = ImageVector.Builder(
            name = "local_activity",
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
                moveTo(20f, 12f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                verticalLineTo(4f)
                horizontalLineTo(2.01f)
                verticalLineToRelative(6f)
                curveToRelative(1.1f, 0f, 1.99f, 0.9f, 1.99f, 2f)
                reflectiveCurveToRelative(-0.89f, 2f, -2f, 2f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(-6f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                close()
                moveToRelative(-4.42f, 4.8f)
                lineTo(12f, 14.5f)
                lineToRelative(-3.58f, 2.3f)
                lineToRelative(1.08f, -4.12f)
                lineToRelative(-3.29f, -2.69f)
                lineToRelative(4.24f, -0.25f)
                lineTo(12f, 5.8f)
                lineToRelative(1.54f, 3.95f)
                lineToRelative(4.24f, 0.25f)
                lineToRelative(-3.29f, 2.69f)
                lineToRelative(1.09f, 4.11f)
                close()
            }
        }.build()
        
        return _Local_activity!!
    }

private var _Local_activity: ImageVector? = null

