package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.TruckMoving: ImageVector
    get() {
        if (_TruckMoving != null) return _TruckMoving!!
        
        _TruckMoving = ImageVector.Builder(
            name = "truck-moving",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(621.3f, 237.3f)
                lineToRelative(-58.5f, -58.5f)
                curveToRelative(-12f, -12f, -28.3f, -18.7f, -45.3f, -18.7f)
                horizontalLineTo(480f)
                verticalLineTo(64f)
                curveToRelative(0f, -17.7f, -14.3f, -32f, -32f, -32f)
                horizontalLineTo(32f)
                curveTo(14.3f, 32f, 0f, 46.3f, 0f, 64f)
                verticalLineToRelative(336f)
                curveToRelative(0f, 44.2f, 35.8f, 80f, 80f, 80f)
                curveToRelative(26.3f, 0f, 49.4f, -12.9f, 64f, -32.4f)
                curveToRelative(14.6f, 19.6f, 37.7f, 32.4f, 64f, 32.4f)
                curveToRelative(44.2f, 0f, 80f, -35.8f, 80f, -80f)
                curveToRelative(0f, -5.5f, -0.6f, -10.8f, -1.6f, -16f)
                horizontalLineToRelative(163.2f)
                curveToRelative(-1.1f, 5.2f, -1.6f, 10.5f, -1.6f, 16f)
                curveToRelative(0f, 44.2f, 35.8f, 80f, 80f, 80f)
                reflectiveCurveToRelative(80f, -35.8f, 80f, -80f)
                curveToRelative(0f, -5.5f, -0.6f, -10.8f, -1.6f, -16f)
                horizontalLineTo(624f)
                curveToRelative(8.8f, 0f, 16f, -7.2f, 16f, -16f)
                verticalLineToRelative(-85.5f)
                curveToRelative(0f, -17f, -6.7f, -33.2f, -18.7f, -45.2f)
                close()
                moveTo(80f, 432f)
                curveToRelative(-17.6f, 0f, -32f, -14.4f, -32f, -32f)
                reflectiveCurveToRelative(14.4f, -32f, 32f, -32f)
                reflectiveCurveToRelative(32f, 14.4f, 32f, 32f)
                reflectiveCurveToRelative(-14.4f, 32f, -32f, 32f)
                close()
                moveToRelative(128f, 0f)
                curveToRelative(-17.6f, 0f, -32f, -14.4f, -32f, -32f)
                reflectiveCurveToRelative(14.4f, -32f, 32f, -32f)
                reflectiveCurveToRelative(32f, 14.4f, 32f, 32f)
                reflectiveCurveToRelative(-14.4f, 32f, -32f, 32f)
                close()
                moveToRelative(272f, -224f)
                horizontalLineToRelative(37.5f)
                curveToRelative(4.3f, 0f, 8.3f, 1.7f, 11.3f, 4.7f)
                lineToRelative(43.3f, 43.3f)
                horizontalLineTo(480f)
                verticalLineToRelative(-48f)
                close()
                moveToRelative(48f, 224f)
                curveToRelative(-17.6f, 0f, -32f, -14.4f, -32f, -32f)
                reflectiveCurveToRelative(14.4f, -32f, 32f, -32f)
                reflectiveCurveToRelative(32f, 14.4f, 32f, 32f)
                reflectiveCurveToRelative(-14.4f, 32f, -32f, 32f)
                close()
            }
        }.build()
        
        return _TruckMoving!!
    }

private var _TruckMoving: ImageVector? = null

