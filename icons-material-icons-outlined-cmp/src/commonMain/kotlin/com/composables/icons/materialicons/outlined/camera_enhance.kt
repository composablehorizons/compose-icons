package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Camera_enhance: ImageVector
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
                moveTo(12f, 10f)
                lineToRelative(-0.94f, 2.06f)
                lineTo(9f, 13f)
                lineToRelative(2.06f, 0.94f)
                lineTo(12f, 16f)
                lineToRelative(0.94f, -2.06f)
                lineTo(15f, 13f)
                lineToRelative(-2.06f, -0.94f)
                close()
                moveToRelative(8f, -5f)
                horizontalLineToRelative(-3.17f)
                lineTo(15f, 3f)
                horizontalLineTo(9f)
                lineTo(7.17f, 5f)
                horizontalLineTo(4f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(12f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(16f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(7f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveToRelative(0f, 14f)
                horizontalLineTo(4f)
                verticalLineTo(7f)
                horizontalLineToRelative(4.05f)
                lineToRelative(0.59f, -0.65f)
                lineTo(9.88f, 5f)
                horizontalLineToRelative(4.24f)
                lineToRelative(1.24f, 1.35f)
                lineToRelative(0.59f, 0.65f)
                horizontalLineTo(20f)
                verticalLineToRelative(12f)
                close()
                moveTo(12f, 8f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                reflectiveCurveToRelative(2.24f, 5f, 5f, 5f)
                reflectiveCurveToRelative(5f, -2.24f, 5f, -5f)
                reflectiveCurveToRelative(-2.24f, -5f, -5f, -5f)
                close()
                moveToRelative(0f, 8f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                reflectiveCurveToRelative(1.35f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.35f, 3f, 3f)
                reflectiveCurveToRelative(-1.35f, 3f, -3f, 3f)
                close()
            }
        }.build()
        
        return _Camera_enhance!!
    }

private var _Camera_enhance: ImageVector? = null

