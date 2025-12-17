package com.composables.icons.fontawesome.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Regular.IdCard: ImageVector
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
                verticalLineToRelative(352f)
                curveToRelative(0f, 26.5f, 21.5f, 48f, 48f, 48f)
                horizontalLineToRelative(480f)
                curveToRelative(26.5f, 0f, 48f, -21.5f, 48f, -48f)
                verticalLineTo(80f)
                curveToRelative(0f, -26.5f, -21.5f, -48f, -48f, -48f)
                close()
                moveToRelative(0f, 400f)
                horizontalLineTo(303.2f)
                curveToRelative(0.9f, -4.5f, 0.8f, 3.6f, 0.8f, -22.4f)
                curveToRelative(0f, -31.8f, -30.1f, -57.6f, -67.2f, -57.6f)
                curveToRelative(-10.8f, 0f, -18.7f, 8f, -44.8f, 8f)
                curveToRelative(-26.9f, 0f, -33.4f, -8f, -44.8f, -8f)
                curveToRelative(-37.1f, 0f, -67.2f, 25.8f, -67.2f, 57.6f)
                curveToRelative(0f, 26f, -0.2f, 17.9f, 0.8f, 22.4f)
                horizontalLineTo(48f)
                verticalLineTo(144f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(288f)
                close()
                moveToRelative(-168f, -80f)
                horizontalLineToRelative(112f)
                curveToRelative(4.4f, 0f, 8f, -3.6f, 8f, -8f)
                verticalLineToRelative(-16f)
                curveToRelative(0f, -4.4f, -3.6f, -8f, -8f, -8f)
                horizontalLineTo(360f)
                curveToRelative(-4.4f, 0f, -8f, 3.6f, -8f, 8f)
                verticalLineToRelative(16f)
                curveToRelative(0f, 4.4f, 3.6f, 8f, 8f, 8f)
                close()
                moveToRelative(0f, -64f)
                horizontalLineToRelative(112f)
                curveToRelative(4.4f, 0f, 8f, -3.6f, 8f, -8f)
                verticalLineToRelative(-16f)
                curveToRelative(0f, -4.4f, -3.6f, -8f, -8f, -8f)
                horizontalLineTo(360f)
                curveToRelative(-4.4f, 0f, -8f, 3.6f, -8f, 8f)
                verticalLineToRelative(16f)
                curveToRelative(0f, 4.4f, 3.6f, 8f, 8f, 8f)
                close()
                moveToRelative(0f, -64f)
                horizontalLineToRelative(112f)
                curveToRelative(4.4f, 0f, 8f, -3.6f, 8f, -8f)
                verticalLineToRelative(-16f)
                curveToRelative(0f, -4.4f, -3.6f, -8f, -8f, -8f)
                horizontalLineTo(360f)
                curveToRelative(-4.4f, 0f, -8f, 3.6f, -8f, 8f)
                verticalLineToRelative(16f)
                curveToRelative(0f, 4.4f, 3.6f, 8f, 8f, 8f)
                close()
                moveToRelative(-168f, 96f)
                curveToRelative(35.3f, 0f, 64f, -28.7f, 64f, -64f)
                reflectiveCurveToRelative(-28.7f, -64f, -64f, -64f)
                reflectiveCurveToRelative(-64f, 28.7f, -64f, 64f)
                reflectiveCurveToRelative(28.7f, 64f, 64f, 64f)
                close()
            }
        }.build()
        
        return _IdCard!!
    }

private var _IdCard: ImageVector? = null

