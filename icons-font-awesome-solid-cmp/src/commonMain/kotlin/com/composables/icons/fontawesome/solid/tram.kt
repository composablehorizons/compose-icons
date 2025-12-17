package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Tram: ImageVector
    get() {
        if (_Tram != null) return _Tram!!
        
        _Tram = ImageVector.Builder(
            name = "tram",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(288f, 64f)
                curveToRelative(17.7f, 0f, 32f, -14.3f, 32f, -32f)
                reflectiveCurveTo(305.7f, 0f, 288f, 0f)
                reflectiveCurveToRelative(-32f, 14.3f, -32f, 32f)
                reflectiveCurveToRelative(14.3f, 32f, 32f, 32f)
                close()
                moveToRelative(223.5f, -12.1f)
                curveToRelative(-2.3f, -8.6f, -11f, -13.6f, -19.6f, -11.3f)
                lineToRelative(-480f, 128f)
                curveToRelative(-8.5f, 2.3f, -13.6f, 11f, -11.3f, 19.6f)
                curveTo(2.5f, 195.3f, 8.9f, 200f, 16f, 200f)
                curveToRelative(1.4f, 0f, 2.8f, -0.2f, 4.1f, -0.5f)
                lineTo(240f, 140.8f)
                verticalLineTo(224f)
                horizontalLineTo(64f)
                curveToRelative(-17.7f, 0f, -32f, 14.3f, -32f, 32f)
                verticalLineToRelative(224f)
                curveToRelative(0f, 17.7f, 14.3f, 32f, 32f, 32f)
                horizontalLineToRelative(384f)
                curveToRelative(17.7f, 0f, 32f, -14.3f, 32f, -32f)
                verticalLineTo(256f)
                curveToRelative(0f, -17.7f, -14.3f, -32f, -32f, -32f)
                horizontalLineTo(272f)
                verticalLineToRelative(-91.7f)
                lineToRelative(228.1f, -60.8f)
                curveToRelative(8.6f, -2.3f, 13.6f, -11.1f, 11.4f, -19.6f)
                close()
                moveTo(176f, 384f)
                horizontalLineTo(80f)
                verticalLineToRelative(-96f)
                horizontalLineToRelative(96f)
                verticalLineToRelative(96f)
                close()
                moveToRelative(160f, -96f)
                horizontalLineToRelative(96f)
                verticalLineToRelative(96f)
                horizontalLineToRelative(-96f)
                verticalLineToRelative(-96f)
                close()
                moveToRelative(-32f, 0f)
                verticalLineToRelative(96f)
                horizontalLineToRelative(-96f)
                verticalLineToRelative(-96f)
                horizontalLineToRelative(96f)
                close()
                moveTo(192f, 96f)
                curveToRelative(17.7f, 0f, 32f, -14.3f, 32f, -32f)
                reflectiveCurveToRelative(-14.3f, -32f, -32f, -32f)
                reflectiveCurveToRelative(-32f, 14.3f, -32f, 32f)
                reflectiveCurveToRelative(14.3f, 32f, 32f, 32f)
                close()
            }
        }.build()
        
        return _Tram!!
    }

private var _Tram: ImageVector? = null

