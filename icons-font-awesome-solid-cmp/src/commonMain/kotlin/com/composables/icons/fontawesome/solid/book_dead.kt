package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.BookDead: ImageVector
    get() {
        if (_BookDead != null) return _BookDead!!
        
        _BookDead = ImageVector.Builder(
            name = "book-dead",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(272f, 136f)
                curveToRelative(8.8f, 0f, 16f, -7.2f, 16f, -16f)
                reflectiveCurveToRelative(-7.2f, -16f, -16f, -16f)
                reflectiveCurveToRelative(-16f, 7.2f, -16f, 16f)
                reflectiveCurveToRelative(7.2f, 16f, 16f, 16f)
                close()
                moveToRelative(176f, 222.4f)
                verticalLineTo(25.6f)
                curveToRelative(0f, -16f, -9.6f, -25.6f, -25.6f, -25.6f)
                horizontalLineTo(96f)
                curveTo(41.6f, 0f, 0f, 41.6f, 0f, 96f)
                verticalLineToRelative(320f)
                curveToRelative(0f, 54.4f, 41.6f, 96f, 96f, 96f)
                horizontalLineToRelative(326.4f)
                curveToRelative(12.8f, 0f, 25.6f, -9.6f, 25.6f, -25.6f)
                verticalLineToRelative(-16f)
                curveToRelative(0f, -6.4f, -3.2f, -12.8f, -9.6f, -19.2f)
                curveToRelative(-3.2f, -16f, -3.2f, -60.8f, 0f, -73.6f)
                curveToRelative(6.4f, -3.2f, 9.6f, -9.6f, 9.6f, -19.2f)
                close()
                moveTo(240f, 56f)
                curveToRelative(44.2f, 0f, 80f, 28.7f, 80f, 64f)
                curveToRelative(0f, 20.9f, -12.7f, 39.2f, -32f, 50.9f)
                verticalLineTo(184f)
                curveToRelative(0f, 8.8f, -7.2f, 16f, -16f, 16f)
                horizontalLineToRelative(-64f)
                curveToRelative(-8.8f, 0f, -16f, -7.2f, -16f, -16f)
                verticalLineToRelative(-13.1f)
                curveToRelative(-19.3f, -11.7f, -32f, -30f, -32f, -50.9f)
                curveToRelative(0f, -35.3f, 35.8f, -64f, 80f, -64f)
                close()
                moveTo(124.8f, 223.3f)
                lineToRelative(6.3f, -14.7f)
                curveToRelative(1.7f, -4.1f, 6.4f, -5.9f, 10.5f, -4.2f)
                lineToRelative(98.3f, 42.1f)
                lineToRelative(98.4f, -42.1f)
                curveToRelative(4.1f, -1.7f, 8.8f, 0.1f, 10.5f, 4.2f)
                lineToRelative(6.3f, 14.7f)
                curveToRelative(1.7f, 4.1f, -0.1f, 8.8f, -4.2f, 10.5f)
                lineTo(280.6f, 264f)
                lineToRelative(70.3f, 30.1f)
                curveToRelative(4.1f, 1.7f, 5.9f, 6.4f, 4.2f, 10.5f)
                lineToRelative(-6.3f, 14.7f)
                curveToRelative(-1.7f, 4.1f, -6.4f, 5.9f, -10.5f, 4.2f)
                lineTo(240f, 281.4f)
                lineToRelative(-98.3f, 42.2f)
                curveToRelative(-4.1f, 1.7f, -8.8f, -0.1f, -10.5f, -4.2f)
                lineToRelative(-6.3f, -14.7f)
                curveToRelative(-1.7f, -4.1f, 0.1f, -8.8f, 4.2f, -10.5f)
                lineToRelative(70.4f, -30.1f)
                lineToRelative(-70.5f, -30.3f)
                curveToRelative(-4.1f, -1.7f, -5.9f, -6.4f, -4.2f, -10.5f)
                close()
                moveToRelative(256f, 224.7f)
                horizontalLineTo(96f)
                curveToRelative(-19.2f, 0f, -32f, -12.8f, -32f, -32f)
                reflectiveCurveToRelative(16f, -32f, 32f, -32f)
                horizontalLineToRelative(284.8f)
                close()
                moveTo(208f, 136f)
                curveToRelative(8.8f, 0f, 16f, -7.2f, 16f, -16f)
                reflectiveCurveToRelative(-7.2f, -16f, -16f, -16f)
                reflectiveCurveToRelative(-16f, 7.2f, -16f, 16f)
                reflectiveCurveToRelative(7.2f, 16f, 16f, 16f)
                close()
            }
        }.build()
        
        return _BookDead!!
    }

private var _BookDead: ImageVector? = null

