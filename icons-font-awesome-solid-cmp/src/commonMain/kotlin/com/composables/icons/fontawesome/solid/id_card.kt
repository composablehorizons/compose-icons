package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.IdCard: ImageVector
    get() {
        if (_IdCard != null) return _IdCard!!
        
        _IdCard = ImageVector.Builder(
            name = "id-card",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 576f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(528f, 32f)
                horizontalLineTo(48f)
                curveTo(21.5f, 32f, 0f, 53.5f, 0f, 80f)
                verticalLineToRelative(16f)
                horizontalLineToRelative(576f)
                verticalLineTo(80f)
                curveToRelative(0f, -26.5f, -21.5f, -48f, -48f, -48f)
                close()
                moveTo(0f, 432f)
                curveToRelative(0f, 26.5f, 21.5f, 48f, 48f, 48f)
                horizontalLineToRelative(480f)
                curveToRelative(26.5f, 0f, 48f, -21.5f, 48f, -48f)
                verticalLineTo(128f)
                horizontalLineTo(0f)
                verticalLineToRelative(304f)
                close()
                moveToRelative(352f, -232f)
                curveToRelative(0f, -4.4f, 3.6f, -8f, 8f, -8f)
                horizontalLineToRelative(144f)
                curveToRelative(4.4f, 0f, 8f, 3.6f, 8f, 8f)
                verticalLineToRelative(16f)
                curveToRelative(0f, 4.4f, -3.6f, 8f, -8f, 8f)
                horizontalLineTo(360f)
                curveToRelative(-4.4f, 0f, -8f, -3.6f, -8f, -8f)
                verticalLineToRelative(-16f)
                close()
                moveToRelative(0f, 64f)
                curveToRelative(0f, -4.4f, 3.6f, -8f, 8f, -8f)
                horizontalLineToRelative(144f)
                curveToRelative(4.4f, 0f, 8f, 3.6f, 8f, 8f)
                verticalLineToRelative(16f)
                curveToRelative(0f, 4.4f, -3.6f, 8f, -8f, 8f)
                horizontalLineTo(360f)
                curveToRelative(-4.4f, 0f, -8f, -3.6f, -8f, -8f)
                verticalLineToRelative(-16f)
                close()
                moveToRelative(0f, 64f)
                curveToRelative(0f, -4.4f, 3.6f, -8f, 8f, -8f)
                horizontalLineToRelative(144f)
                curveToRelative(4.4f, 0f, 8f, 3.6f, 8f, 8f)
                verticalLineToRelative(16f)
                curveToRelative(0f, 4.4f, -3.6f, 8f, -8f, 8f)
                horizontalLineTo(360f)
                curveToRelative(-4.4f, 0f, -8f, -3.6f, -8f, -8f)
                verticalLineToRelative(-16f)
                close()
                moveTo(176f, 192f)
                curveToRelative(35.3f, 0f, 64f, 28.7f, 64f, 64f)
                reflectiveCurveToRelative(-28.7f, 64f, -64f, 64f)
                reflectiveCurveToRelative(-64f, -28.7f, -64f, -64f)
                reflectiveCurveToRelative(28.7f, -64f, 64f, -64f)
                close()
                moveTo(67.1f, 396.2f)
                curveTo(75.5f, 370.5f, 99.6f, 352f, 128f, 352f)
                horizontalLineToRelative(8.2f)
                curveToRelative(12.3f, 5.1f, 25.7f, 8f, 39.8f, 8f)
                reflectiveCurveToRelative(27.6f, -2.9f, 39.8f, -8f)
                horizontalLineToRelative(8.2f)
                curveToRelative(28.4f, 0f, 52.5f, 18.5f, 60.9f, 44.2f)
                curveToRelative(3.2f, 9.9f, -5.2f, 19.8f, -15.6f, 19.8f)
                horizontalLineTo(82.7f)
                curveToRelative(-10.4f, 0f, -18.8f, -10f, -15.6f, -19.8f)
                close()
            }
        }.build()
        
        return _IdCard!!
    }

private var _IdCard: ImageVector? = null

