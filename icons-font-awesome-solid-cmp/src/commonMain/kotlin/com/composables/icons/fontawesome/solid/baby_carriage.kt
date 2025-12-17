package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.BabyCarriage: ImageVector
    get() {
        if (_BabyCarriage != null) return _BabyCarriage!!
        
        _BabyCarriage = ImageVector.Builder(
            name = "baby-carriage",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(144.8f, 17f)
                curveToRelative(-11.3f, -17.8f, -37.2f, -22.8f, -54f, -9.4f)
                curveTo(35.3f, 51.9f, 0f, 118f, 0f, 192f)
                horizontalLineToRelative(256f)
                lineTo(144.8f, 17f)
                close()
                moveTo(496f, 96f)
                horizontalLineToRelative(-48f)
                curveToRelative(-35.3f, 0f, -64f, 28.7f, -64f, 64f)
                verticalLineToRelative(64f)
                horizontalLineTo(0f)
                curveToRelative(0f, 50.6f, 23f, 96.4f, 60.3f, 130.7f)
                curveTo(25.7f, 363.6f, 0f, 394.7f, 0f, 432f)
                curveToRelative(0f, 44.2f, 35.8f, 80f, 80f, 80f)
                reflectiveCurveToRelative(80f, -35.8f, 80f, -80f)
                curveToRelative(0f, -8.9f, -1.8f, -17.2f, -4.4f, -25.2f)
                curveToRelative(21.6f, 5.9f, 44.6f, 9.2f, 68.4f, 9.2f)
                reflectiveCurveToRelative(46.9f, -3.3f, 68.4f, -9.2f)
                curveToRelative(-2.7f, 8f, -4.4f, 16.3f, -4.4f, 25.2f)
                curveToRelative(0f, 44.2f, 35.8f, 80f, 80f, 80f)
                reflectiveCurveToRelative(80f, -35.8f, 80f, -80f)
                curveToRelative(0f, -37.3f, -25.7f, -68.4f, -60.3f, -77.3f)
                curveTo(425f, 320.4f, 448f, 274.6f, 448f, 224f)
                verticalLineToRelative(-64f)
                horizontalLineToRelative(48f)
                curveToRelative(8.8f, 0f, 16f, -7.2f, 16f, -16f)
                verticalLineToRelative(-32f)
                curveToRelative(0f, -8.8f, -7.2f, -16f, -16f, -16f)
                close()
                moveTo(80f, 464f)
                curveToRelative(-17.6f, 0f, -32f, -14.4f, -32f, -32f)
                reflectiveCurveToRelative(14.4f, -32f, 32f, -32f)
                reflectiveCurveToRelative(32f, 14.4f, 32f, 32f)
                reflectiveCurveToRelative(-14.4f, 32f, -32f, 32f)
                close()
                moveToRelative(320f, -32f)
                curveToRelative(0f, 17.6f, -14.4f, 32f, -32f, 32f)
                reflectiveCurveToRelative(-32f, -14.4f, -32f, -32f)
                reflectiveCurveToRelative(14.4f, -32f, 32f, -32f)
                reflectiveCurveToRelative(32f, 14.4f, 32f, 32f)
                close()
            }
        }.build()
        
        return _BabyCarriage!!
    }

private var _BabyCarriage: ImageVector? = null

