package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.PersonBooth: ImageVector
    get() {
        if (_PersonBooth != null) return _PersonBooth!!
        
        _PersonBooth = ImageVector.Builder(
            name = "person-booth",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 576f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(192f, 496f)
                curveToRelative(0f, 8.8f, 7.2f, 16f, 16f, 16f)
                horizontalLineToRelative(32f)
                curveToRelative(8.8f, 0f, 16f, -7.2f, 16f, -16f)
                verticalLineTo(320f)
                horizontalLineToRelative(-64f)
                verticalLineToRelative(176f)
                close()
                moveToRelative(32f, -272f)
                horizontalLineToRelative(-50.9f)
                lineToRelative(-45.2f, -45.3f)
                curveTo(115.8f, 166.6f, 99.7f, 160f, 82.7f, 160f)
                horizontalLineTo(64f)
                curveToRelative(-17.1f, 0f, -33.2f, 6.7f, -45.3f, 18.8f)
                curveTo(6.7f, 190.9f, 0f, 207f, 0f, 224.1f)
                lineTo(0.2f, 320f)
                lineTo(0f, 480f)
                curveToRelative(0f, 17.7f, 14.3f, 32f, 31.9f, 32f)
                curveToRelative(17.6f, 0f, 32f, -14.3f, 32f, -32f)
                lineToRelative(0.1f, -100.7f)
                curveToRelative(0.9f, 0.5f, 1.6f, 1.3f, 2.5f, 1.7f)
                lineToRelative(29.1f, 43f)
                verticalLineToRelative(56f)
                curveToRelative(0f, 17.7f, 14.3f, 32f, 32f, 32f)
                reflectiveCurveToRelative(32f, -14.3f, 32f, -32f)
                verticalLineToRelative(-56.5f)
                curveToRelative(0f, -9.9f, -2.3f, -19.8f, -6.7f, -28.6f)
                lineToRelative(-41.2f, -61.3f)
                verticalLineTo(253f)
                lineToRelative(20.9f, 20.9f)
                curveToRelative(9.1f, 9.1f, 21.1f, 14.1f, 33.9f, 14.1f)
                horizontalLineTo(224f)
                curveToRelative(17.7f, 0f, 32f, -14.3f, 32f, -32f)
                reflectiveCurveToRelative(-14.3f, -32f, -32f, -32f)
                close()
                moveTo(64f, 128f)
                curveToRelative(26.5f, 0f, 48f, -21.5f, 48f, -48f)
                reflectiveCurveTo(90.5f, 32f, 64f, 32f)
                reflectiveCurveTo(16f, 53.5f, 16f, 80f)
                reflectiveCurveToRelative(21.5f, 48f, 48f, 48f)
                close()
                moveToRelative(224f, -96f)
                lineToRelative(31.5f, 223.1f)
                lineToRelative(-30.9f, 154.6f)
                curveToRelative(-4.3f, 21.6f, 13f, 38.3f, 31.4f, 38.3f)
                curveToRelative(15.2f, 0f, 28f, -9.1f, 32.3f, -30.4f)
                curveToRelative(0.9f, 16.9f, 14.6f, 30.4f, 31.7f, 30.4f)
                curveToRelative(17.7f, 0f, 32f, -14.3f, 32f, -32f)
                curveToRelative(0f, 17.7f, 14.3f, 32f, 32f, 32f)
                reflectiveCurveToRelative(32f, -14.3f, 32f, -32f)
                verticalLineTo(0f)
                horizontalLineTo(288f)
                verticalLineToRelative(32f)
                close()
                moveToRelative(-96f, 0f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(64f)
                verticalLineTo(0f)
                horizontalLineToRelative(-32f)
                curveToRelative(-17.7f, 0f, -32f, 14.3f, -32f, 32f)
                close()
                moveTo(544f, 0f)
                horizontalLineToRelative(-32f)
                verticalLineToRelative(496f)
                curveToRelative(0f, 8.8f, 7.2f, 16f, 16f, 16f)
                horizontalLineToRelative(32f)
                curveToRelative(8.8f, 0f, 16f, -7.2f, 16f, -16f)
                verticalLineTo(32f)
                curveToRelative(0f, -17.7f, -14.3f, -32f, -32f, -32f)
                close()
            }
        }.build()
        
        return _PersonBooth!!
    }

private var _PersonBooth: ImageVector? = null

