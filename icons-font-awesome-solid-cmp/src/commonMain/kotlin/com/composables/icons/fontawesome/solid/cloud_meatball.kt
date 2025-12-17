package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.CloudMeatball: ImageVector
    get() {
        if (_CloudMeatball != null) return _CloudMeatball!!
        
        _CloudMeatball = ImageVector.Builder(
            name = "cloud-meatball",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(48f, 352f)
                curveToRelative(-26.5f, 0f, -48f, 21.5f, -48f, 48f)
                reflectiveCurveToRelative(21.5f, 48f, 48f, 48f)
                reflectiveCurveToRelative(48f, -21.5f, 48f, -48f)
                reflectiveCurveToRelative(-21.5f, -48f, -48f, -48f)
                close()
                moveToRelative(416f, 0f)
                curveToRelative(-26.5f, 0f, -48f, 21.5f, -48f, 48f)
                reflectiveCurveToRelative(21.5f, 48f, 48f, 48f)
                reflectiveCurveToRelative(48f, -21.5f, 48f, -48f)
                reflectiveCurveToRelative(-21.5f, -48f, -48f, -48f)
                close()
                moveToRelative(-119f, 11.1f)
                curveToRelative(4.6f, -14.5f, 1.6f, -30.8f, -9.8f, -42.3f)
                curveToRelative(-11.5f, -11.5f, -27.8f, -14.4f, -42.3f, -9.9f)
                curveToRelative(-7f, -13.5f, -20.7f, -23f, -36.9f, -23f)
                reflectiveCurveToRelative(-29.9f, 9.5f, -36.9f, 23f)
                curveToRelative(-14.5f, -4.6f, -30.8f, -1.6f, -42.3f, 9.9f)
                curveToRelative(-11.5f, 11.5f, -14.4f, 27.8f, -9.9f, 42.3f)
                curveToRelative(-13.5f, 7f, -23f, 20.7f, -23f, 36.9f)
                reflectiveCurveToRelative(9.5f, 29.9f, 23f, 36.9f)
                curveToRelative(-4.6f, 14.5f, -1.6f, 30.8f, 9.9f, 42.3f)
                curveToRelative(8.2f, 8.2f, 18.9f, 12.3f, 29.7f, 12.3f)
                curveToRelative(4.3f, 0f, 8.5f, -1.1f, 12.6f, -2.5f)
                curveToRelative(7f, 13.5f, 20.7f, 23f, 36.9f, 23f)
                reflectiveCurveToRelative(29.9f, -9.5f, 36.9f, -23f)
                curveToRelative(4.1f, 1.3f, 8.3f, 2.5f, 12.6f, 2.5f)
                curveToRelative(10.8f, 0f, 21.5f, -4.1f, 29.7f, -12.3f)
                curveToRelative(11.5f, -11.5f, 14.4f, -27.8f, 9.8f, -42.3f)
                curveToRelative(13.5f, -7f, 23f, -20.7f, 23f, -36.9f)
                reflectiveCurveToRelative(-9.5f, -29.9f, -23f, -36.9f)
                close()
                moveTo(512f, 224f)
                curveToRelative(0f, -53f, -43f, -96f, -96f, -96f)
                curveToRelative(-0.6f, 0f, -1.1f, 0.2f, -1.6f, 0.2f)
                curveToRelative(1.1f, -5.2f, 1.6f, -10.6f, 1.6f, -16.2f)
                curveToRelative(0f, -44.2f, -35.8f, -80f, -80f, -80f)
                curveToRelative(-24.6f, 0f, -46.3f, 11.3f, -61f, 28.8f)
                curveTo(256.4f, 24.8f, 219.3f, 0f, 176f, 0f)
                curveTo(114.1f, 0f, 64f, 50.1f, 64f, 112f)
                curveToRelative(0f, 7.3f, 0.8f, 14.3f, 2.1f, 21.2f)
                curveTo(27.8f, 145.8f, 0f, 181.5f, 0f, 224f)
                curveToRelative(0f, 53f, 43f, 96f, 96f, 96f)
                horizontalLineToRelative(43.4f)
                curveToRelative(3.6f, -8f, 8.4f, -15.4f, 14.8f, -21.8f)
                curveToRelative(13.5f, -13.5f, 31.5f, -21.1f, 50.8f, -21.3f)
                curveToRelative(13.5f, -13.2f, 31.7f, -20.9f, 51f, -20.9f)
                reflectiveCurveToRelative(37.5f, 7.7f, 51f, 20.9f)
                curveToRelative(19.3f, 0.2f, 37.3f, 7.8f, 50.8f, 21.3f)
                curveToRelative(6.4f, 6.4f, 11.3f, 13.8f, 14.8f, 21.8f)
                horizontalLineTo(416f)
                curveToRelative(53f, 0f, 96f, -43f, 96f, -96f)
                close()
            }
        }.build()
        
        return _CloudMeatball!!
    }

private var _CloudMeatball: ImageVector? = null

