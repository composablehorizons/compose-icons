package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Mosque: ImageVector
    get() {
        if (_Mosque != null) return _Mosque!!
        
        _Mosque = ImageVector.Builder(
            name = "mosque",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0f, 480f)
                curveToRelative(0f, 17.67f, 14.33f, 32f, 32f, 32f)
                horizontalLineToRelative(64f)
                curveToRelative(17.67f, 0f, 32f, -14.33f, 32f, -32f)
                verticalLineTo(160f)
                horizontalLineTo(0f)
                verticalLineToRelative(320f)
                close()
                moveToRelative(579.16f, -192f)
                curveToRelative(17.86f, -17.39f, 28.84f, -37.34f, 28.84f, -58.91f)
                curveToRelative(0f, -52.86f, -41.79f, -93.79f, -87.92f, -122.9f)
                curveToRelative(-41.94f, -26.47f, -80.63f, -57.77f, -111.96f, -96.22f)
                lineTo(400f, 0f)
                lineToRelative(-8.12f, 9.97f)
                curveToRelative(-31.33f, 38.45f, -70.01f, 69.76f, -111.96f, 96.22f)
                curveTo(233.79f, 135.3f, 192f, 176.23f, 192f, 229.09f)
                curveToRelative(0f, 21.57f, 10.98f, 41.52f, 28.84f, 58.91f)
                horizontalLineToRelative(358.32f)
                close()
                moveTo(608f, 320f)
                horizontalLineTo(192f)
                curveToRelative(-17.67f, 0f, -32f, 14.33f, -32f, 32f)
                verticalLineToRelative(128f)
                curveToRelative(0f, 17.67f, 14.33f, 32f, 32f, 32f)
                horizontalLineToRelative(32f)
                verticalLineToRelative(-64f)
                curveToRelative(0f, -17.67f, 14.33f, -32f, 32f, -32f)
                reflectiveCurveToRelative(32f, 14.33f, 32f, 32f)
                verticalLineToRelative(64f)
                horizontalLineToRelative(64f)
                verticalLineToRelative(-72f)
                curveToRelative(0f, -48f, 48f, -72f, 48f, -72f)
                reflectiveCurveToRelative(48f, 24f, 48f, 72f)
                verticalLineToRelative(72f)
                horizontalLineToRelative(64f)
                verticalLineToRelative(-64f)
                curveToRelative(0f, -17.67f, 14.33f, -32f, 32f, -32f)
                reflectiveCurveToRelative(32f, 14.33f, 32f, 32f)
                verticalLineToRelative(64f)
                horizontalLineToRelative(32f)
                curveToRelative(17.67f, 0f, 32f, -14.33f, 32f, -32f)
                verticalLineTo(352f)
                curveToRelative(0f, -17.67f, -14.33f, -32f, -32f, -32f)
                close()
                moveTo(64f, 0f)
                reflectiveCurveTo(0f, 32f, 0f, 96f)
                verticalLineToRelative(32f)
                horizontalLineToRelative(128f)
                verticalLineTo(96f)
                curveToRelative(0f, -64f, -64f, -96f, -64f, -96f)
                close()
            }
        }.build()
        
        return _Mosque!!
    }

private var _Mosque: ImageVector? = null

