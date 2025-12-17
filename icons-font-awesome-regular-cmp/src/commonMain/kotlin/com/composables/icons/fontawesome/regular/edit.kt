package com.composables.icons.fontawesome.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Regular.Edit: ImageVector
    get() {
        if (_Edit != null) return _Edit!!
        
        _Edit = ImageVector.Builder(
            name = "edit",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 576f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(402.3f, 344.9f)
                lineToRelative(32f, -32f)
                curveToRelative(5f, -5f, 13.7f, -1.5f, 13.7f, 5.7f)
                verticalLineTo(464f)
                curveToRelative(0f, 26.5f, -21.5f, 48f, -48f, 48f)
                horizontalLineTo(48f)
                curveToRelative(-26.5f, 0f, -48f, -21.5f, -48f, -48f)
                verticalLineTo(112f)
                curveToRelative(0f, -26.5f, 21.5f, -48f, 48f, -48f)
                horizontalLineToRelative(273.5f)
                curveToRelative(7.1f, 0f, 10.7f, 8.6f, 5.7f, 13.7f)
                lineToRelative(-32f, 32f)
                curveToRelative(-1.5f, 1.5f, -3.5f, 2.3f, -5.7f, 2.3f)
                horizontalLineTo(48f)
                verticalLineToRelative(352f)
                horizontalLineToRelative(352f)
                verticalLineTo(350.5f)
                curveToRelative(0f, -2.1f, 0.8f, -4.1f, 2.3f, -5.6f)
                close()
                moveToRelative(156.6f, -201.8f)
                lineTo(296.3f, 405.7f)
                lineToRelative(-90.4f, 10f)
                curveToRelative(-26.2f, 2.9f, -48.5f, -19.2f, -45.6f, -45.6f)
                lineToRelative(10f, -90.4f)
                lineTo(432.9f, 17.1f)
                curveToRelative(22.9f, -22.9f, 59.9f, -22.9f, 82.7f, 0f)
                lineToRelative(43.2f, 43.2f)
                curveToRelative(22.9f, 22.9f, 22.9f, 60f, 0.1f, 82.8f)
                close()
                moveTo(460.1f, 174f)
                lineTo(402f, 115.9f)
                lineTo(216.2f, 301.8f)
                lineToRelative(-7.3f, 65.3f)
                lineToRelative(65.3f, -7.3f)
                lineTo(460.1f, 174f)
                close()
                moveToRelative(64.8f, -79.7f)
                lineToRelative(-43.2f, -43.2f)
                curveToRelative(-4.1f, -4.1f, -10.8f, -4.1f, -14.8f, 0f)
                lineTo(436f, 82f)
                lineToRelative(58.1f, 58.1f)
                lineToRelative(30.9f, -30.9f)
                curveToRelative(4f, -4.2f, 4f, -10.8f, -0.1f, -14.9f)
                close()
            }
        }.build()
        
        return _Edit!!
    }

private var _Edit: ImageVector? = null

