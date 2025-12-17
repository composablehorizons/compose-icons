package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.FileMedicalAlt: ImageVector
    get() {
        if (_FileMedicalAlt != null) return _FileMedicalAlt!!
        
        _FileMedicalAlt = ImageVector.Builder(
            name = "file-medical-alt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(288f, 136f)
                verticalLineTo(0f)
                horizontalLineTo(88f)
                curveTo(74.7f, 0f, 64f, 10.7f, 64f, 24f)
                verticalLineToRelative(232f)
                horizontalLineTo(8f)
                curveToRelative(-4.4f, 0f, -8f, 3.6f, -8f, 8f)
                verticalLineToRelative(16f)
                curveToRelative(0f, 4.4f, 3.6f, 8f, 8f, 8f)
                horizontalLineToRelative(140.9f)
                curveToRelative(3f, 0f, 5.8f, 1.7f, 7.2f, 4.4f)
                lineToRelative(19.9f, 39.8f)
                lineToRelative(56.8f, -113.7f)
                curveToRelative(2.9f, -5.9f, 11.4f, -5.9f, 14.3f, 0f)
                lineToRelative(34.7f, 69.5f)
                horizontalLineTo(352f)
                curveToRelative(8.8f, 0f, 16f, 7.2f, 16f, 16f)
                reflectiveCurveToRelative(-7.2f, 16f, -16f, 16f)
                horizontalLineToRelative(-89.9f)
                lineTo(240f, 275.8f)
                lineToRelative(-56.8f, 113.7f)
                curveToRelative(-2.9f, 5.9f, -11.4f, 5.9f, -14.3f, 0f)
                lineTo(134.1f, 320f)
                horizontalLineTo(64f)
                verticalLineToRelative(168f)
                curveToRelative(0f, 13.3f, 10.7f, 24f, 24f, 24f)
                horizontalLineToRelative(336f)
                curveToRelative(13.3f, 0f, 24f, -10.7f, 24f, -24f)
                verticalLineTo(160f)
                horizontalLineTo(312f)
                curveToRelative(-13.2f, 0f, -24f, -10.8f, -24f, -24f)
                close()
                moveToRelative(153f, -31f)
                lineTo(343.1f, 7f)
                curveToRelative(-4.5f, -4.5f, -10.6f, -7f, -17f, -7f)
                horizontalLineTo(320f)
                verticalLineToRelative(128f)
                horizontalLineToRelative(128f)
                verticalLineToRelative(-6.1f)
                curveToRelative(0f, -6.3f, -2.5f, -12.4f, -7f, -16.9f)
                close()
            }
        }.build()
        
        return _FileMedicalAlt!!
    }

private var _FileMedicalAlt: ImageVector? = null

