package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.TableTennis: ImageVector
    get() {
        if (_TableTennis != null) return _TableTennis!!
        
        _TableTennis = ImageVector.Builder(
            name = "table-tennis",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(496.2f, 296.5f)
                curveTo(527.7f, 218.7f, 512f, 126.2f, 449f, 63.1f)
                curveTo(365.1f, -21f, 229f, -21f, 145.1f, 63.1f)
                lineToRelative(-56f, 56.1f)
                lineToRelative(211.5f, 211.5f)
                curveToRelative(46.1f, -62.1f, 131.5f, -77.4f, 195.6f, -34.2f)
                close()
                moveToRelative(-217.9f, 79.7f)
                lineTo(57.9f, 155.9f)
                curveToRelative(-27.3f, 45.3f, -21.7f, 105f, 17.3f, 144.1f)
                lineToRelative(34.5f, 34.6f)
                lineTo(6.7f, 424f)
                curveToRelative(-8.6f, 7.5f, -9.1f, 20.7f, -1f, 28.8f)
                lineToRelative(53.4f, 53.5f)
                curveToRelative(8f, 8.1f, 21.2f, 7.6f, 28.7f, -1f)
                lineTo(177.1f, 402f)
                lineToRelative(35.7f, 35.7f)
                curveToRelative(19.7f, 19.7f, 44.6f, 30.5f, 70.3f, 33.3f)
                curveToRelative(-7.1f, -17f, -11f, -35.6f, -11f, -55.1f)
                curveToRelative(-0.1f, -13.8f, 2.5f, -27f, 6.2f, -39.7f)
                close()
                moveTo(416f, 320f)
                curveToRelative(-53f, 0f, -96f, 43f, -96f, 96f)
                reflectiveCurveToRelative(43f, 96f, 96f, 96f)
                reflectiveCurveToRelative(96f, -43f, 96f, -96f)
                reflectiveCurveToRelative(-43f, -96f, -96f, -96f)
                close()
            }
        }.build()
        
        return _TableTennis!!
    }

private var _TableTennis: ImageVector? = null

