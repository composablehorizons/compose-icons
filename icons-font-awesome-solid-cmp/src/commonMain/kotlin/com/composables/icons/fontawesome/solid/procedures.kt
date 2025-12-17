package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Procedures: ImageVector
    get() {
        if (_Procedures != null) return _Procedures!!
        
        _Procedures = ImageVector.Builder(
            name = "procedures",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(528f, 224f)
                horizontalLineTo(272f)
                curveToRelative(-8.8f, 0f, -16f, 7.2f, -16f, 16f)
                verticalLineToRelative(144f)
                horizontalLineTo(64f)
                verticalLineTo(144f)
                curveToRelative(0f, -8.8f, -7.2f, -16f, -16f, -16f)
                horizontalLineTo(16f)
                curveToRelative(-8.8f, 0f, -16f, 7.2f, -16f, 16f)
                verticalLineToRelative(352f)
                curveToRelative(0f, 8.8f, 7.2f, 16f, 16f, 16f)
                horizontalLineToRelative(32f)
                curveToRelative(8.8f, 0f, 16f, -7.2f, 16f, -16f)
                verticalLineToRelative(-48f)
                horizontalLineToRelative(512f)
                verticalLineToRelative(48f)
                curveToRelative(0f, 8.8f, 7.2f, 16f, 16f, 16f)
                horizontalLineToRelative(32f)
                curveToRelative(8.8f, 0f, 16f, -7.2f, 16f, -16f)
                verticalLineTo(336f)
                curveToRelative(0f, -61.9f, -50.1f, -112f, -112f, -112f)
                close()
                moveTo(136f, 96f)
                horizontalLineToRelative(126.1f)
                lineToRelative(27.6f, 55.2f)
                curveToRelative(5.9f, 11.8f, 22.7f, 11.8f, 28.6f, 0f)
                lineTo(368f, 51.8f)
                lineTo(390.1f, 96f)
                horizontalLineTo(512f)
                curveToRelative(8.8f, 0f, 16f, -7.2f, 16f, -16f)
                reflectiveCurveToRelative(-7.2f, -16f, -16f, -16f)
                horizontalLineTo(409.9f)
                lineTo(382.3f, 8.8f)
                curveTo(376.4f, -3f, 359.6f, -3f, 353.7f, 8.8f)
                lineTo(304f, 108.2f)
                lineToRelative(-19.9f, -39.8f)
                curveToRelative(-1.4f, -2.7f, -4.1f, -4.4f, -7.2f, -4.4f)
                horizontalLineTo(136f)
                curveToRelative(-4.4f, 0f, -8f, 3.6f, -8f, 8f)
                verticalLineToRelative(16f)
                curveToRelative(0f, 4.4f, 3.6f, 8f, 8f, 8f)
                close()
                moveToRelative(24f, 256f)
                curveToRelative(35.3f, 0f, 64f, -28.7f, 64f, -64f)
                reflectiveCurveToRelative(-28.7f, -64f, -64f, -64f)
                reflectiveCurveToRelative(-64f, 28.7f, -64f, 64f)
                reflectiveCurveToRelative(28.7f, 64f, 64f, 64f)
                close()
            }
        }.build()
        
        return _Procedures!!
    }

private var _Procedures: ImageVector? = null

