package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Smog: ImageVector
    get() {
        if (_Smog != null) return _Smog!!
        
        _Smog = ImageVector.Builder(
            name = "smog",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(624f, 368f)
                horizontalLineTo(80f)
                curveToRelative(-8.8f, 0f, -16f, 7.2f, -16f, 16f)
                verticalLineToRelative(16f)
                curveToRelative(0f, 8.8f, 7.2f, 16f, 16f, 16f)
                horizontalLineToRelative(544f)
                curveToRelative(8.8f, 0f, 16f, -7.2f, 16f, -16f)
                verticalLineToRelative(-16f)
                curveToRelative(0f, -8.8f, -7.2f, -16f, -16f, -16f)
                close()
                moveToRelative(-480f, 96f)
                horizontalLineTo(16f)
                curveToRelative(-8.8f, 0f, -16f, 7.2f, -16f, 16f)
                verticalLineToRelative(16f)
                curveToRelative(0f, 8.8f, 7.2f, 16f, 16f, 16f)
                horizontalLineToRelative(128f)
                curveToRelative(8.8f, 0f, 16f, -7.2f, 16f, -16f)
                verticalLineToRelative(-16f)
                curveToRelative(0f, -8.8f, -7.2f, -16f, -16f, -16f)
                close()
                moveToRelative(416f, 0f)
                horizontalLineTo(224f)
                curveToRelative(-8.8f, 0f, -16f, 7.2f, -16f, 16f)
                verticalLineToRelative(16f)
                curveToRelative(0f, 8.8f, 7.2f, 16f, 16f, 16f)
                horizontalLineToRelative(336f)
                curveToRelative(8.8f, 0f, 16f, -7.2f, 16f, -16f)
                verticalLineToRelative(-16f)
                curveToRelative(0f, -8.8f, -7.2f, -16f, -16f, -16f)
                close()
                moveTo(144f, 288f)
                horizontalLineToRelative(156.1f)
                curveToRelative(22.5f, 19.7f, 51.6f, 32f, 83.9f, 32f)
                reflectiveCurveToRelative(61.3f, -12.3f, 83.9f, -32f)
                horizontalLineTo(528f)
                curveToRelative(61.9f, 0f, 112f, -50.1f, 112f, -112f)
                reflectiveCurveTo(589.9f, 64f, 528f, 64f)
                curveToRelative(-18f, 0f, -34.7f, 4.6f, -49.7f, 12.1f)
                curveTo(454f, 31f, 406.8f, 0f, 352f, 0f)
                curveToRelative(-41f, 0f, -77.8f, 17.3f, -104f, 44.8f)
                curveTo(221.8f, 17.3f, 185f, 0f, 144f, 0f)
                curveTo(64.5f, 0f, 0f, 64.5f, 0f, 144f)
                reflectiveCurveToRelative(64.5f, 144f, 144f, 144f)
                close()
            }
        }.build()
        
        return _Smog!!
    }

private var _Smog: ImageVector? = null

