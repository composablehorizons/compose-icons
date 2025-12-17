package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Edit_location: ImageVector
    get() {
        if (_Edit_location != null) return _Edit_location!!
        
        _Edit_location = ImageVector.Builder(
            name = "edit_location",
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
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(18.11f, 1.77f)
                lineTo(19.78f, 0.1f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(-1.67f, 1.67f)
                lineToRelative(-2.12f, -2.12f)
                close()
                moveToRelative(-1f, 1f)
                lineToRelative(2.12f, 2.12f)
                lineTo(13.12f, 11f)
                horizontalLineTo(11f)
                verticalLineTo(8.89f)
                lineToRelative(6.11f, -6.12f)
                close()
                moveToRelative(-1.98f, -0.13f)
                lineTo(9.5f, 8.27f)
                verticalLineToRelative(4.24f)
                horizontalLineToRelative(4.24f)
                lineToRelative(5.62f, -5.62f)
                curveToRelative(0.41f, 0.99f, 0.64f, 2.1f, 0.64f, 3.32f)
                curveToRelative(0f, 3.32f, -2.67f, 7.25f, -8f, 11.8f)
                curveToRelative(-5.33f, -4.55f, -8f, -8.48f, -8f, -11.8f)
                curveToRelative(0f, -4.98f, 3.8f, -8.2f, 8f, -8.2f)
                curveToRelative(1.09f, 0f, 2.16f, 0.22f, 3.13f, 0.63f)
                close()
            }
        }.build()
        
        return _Edit_location!!
    }

private var _Edit_location: ImageVector? = null

