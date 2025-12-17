package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.FilePowerpoint: ImageVector
    get() {
        if (_FilePowerpoint != null) return _FilePowerpoint!!
        
        _FilePowerpoint = ImageVector.Builder(
            name = "file-powerpoint",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 384f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(193.7f, 271.2f)
                curveToRelative(8.8f, 0f, 15.5f, 2.7f, 20.3f, 8.1f)
                curveToRelative(9.6f, 10.9f, 9.8f, 32.7f, -0.2f, 44.1f)
                curveToRelative(-4.9f, 5.6f, -11.9f, 8.5f, -21.1f, 8.5f)
                horizontalLineToRelative(-26.9f)
                verticalLineToRelative(-60.7f)
                horizontalLineToRelative(27.9f)
                close()
                moveTo(377f, 105f)
                lineTo(279f, 7f)
                curveToRelative(-4.5f, -4.5f, -10.6f, -7f, -17f, -7f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(128f)
                horizontalLineToRelative(128f)
                verticalLineToRelative(-6.1f)
                curveToRelative(0f, -6.3f, -2.5f, -12.4f, -7f, -16.9f)
                close()
                moveToRelative(-153f, 31f)
                verticalLineTo(0f)
                horizontalLineTo(24f)
                curveTo(10.7f, 0f, 0f, 10.7f, 0f, 24f)
                verticalLineToRelative(464f)
                curveToRelative(0f, 13.3f, 10.7f, 24f, 24f, 24f)
                horizontalLineToRelative(336f)
                curveToRelative(13.3f, 0f, 24f, -10.7f, 24f, -24f)
                verticalLineTo(160f)
                horizontalLineTo(248f)
                curveToRelative(-13.2f, 0f, -24f, -10.8f, -24f, -24f)
                close()
                moveToRelative(53f, 165.2f)
                curveToRelative(0f, 90.3f, -88.8f, 77.6f, -111.1f, 77.6f)
                verticalLineTo(436f)
                curveToRelative(0f, 6.6f, -5.4f, 12f, -12f, 12f)
                horizontalLineToRelative(-30.8f)
                curveToRelative(-6.6f, 0f, -12f, -5.4f, -12f, -12f)
                verticalLineTo(236.2f)
                curveToRelative(0f, -6.6f, 5.4f, -12f, 12f, -12f)
                horizontalLineToRelative(81f)
                curveToRelative(44.5f, 0f, 72.9f, 32.8f, 72.9f, 77f)
                close()
            }
        }.build()
        
        return _FilePowerpoint!!
    }

private var _FilePowerpoint: ImageVector? = null

