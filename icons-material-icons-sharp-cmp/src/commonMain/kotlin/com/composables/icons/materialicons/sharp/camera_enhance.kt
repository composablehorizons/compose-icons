package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Camera_enhance: ImageVector
    get() {
        if (_Camera_enhance != null) return _Camera_enhance!!
        
        _Camera_enhance = ImageVector.Builder(
            name = "camera_enhance",
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
                moveTo(16.83f, 5f)
                lineTo(15f, 3f)
                horizontalLineTo(9f)
                lineTo(7.17f, 5f)
                horizontalLineTo(2f)
                verticalLineToRelative(16f)
                horizontalLineToRelative(20f)
                verticalLineTo(5f)
                horizontalLineToRelative(-5.17f)
                close()
                moveTo(12f, 18f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                reflectiveCurveToRelative(2.24f, -5f, 5f, -5f)
                reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
                reflectiveCurveToRelative(-2.24f, 5f, -5f, 5f)
                close()
                moveToRelative(0f, -9f)
                lineToRelative(-1.25f, 2.75f)
                lineTo(8f, 13f)
                lineToRelative(2.75f, 1.25f)
                lineTo(12f, 17f)
                lineToRelative(1.25f, -2.75f)
                lineTo(16f, 13f)
                lineToRelative(-2.75f, -1.25f)
                close()
            }
        }.build()
        
        return _Camera_enhance!!
    }

private var _Camera_enhance: ImageVector? = null

