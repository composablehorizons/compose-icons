package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.CarBattery: ImageVector
    get() {
        if (_CarBattery != null) return _CarBattery!!
        
        _CarBattery = ImageVector.Builder(
            name = "car-battery",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 128f)
                horizontalLineToRelative(-32f)
                verticalLineTo(80f)
                curveToRelative(0f, -8.84f, -7.16f, -16f, -16f, -16f)
                horizontalLineToRelative(-96f)
                curveToRelative(-8.84f, 0f, -16f, 7.16f, -16f, 16f)
                verticalLineToRelative(48f)
                horizontalLineTo(192f)
                verticalLineTo(80f)
                curveToRelative(0f, -8.84f, -7.16f, -16f, -16f, -16f)
                horizontalLineTo(80f)
                curveToRelative(-8.84f, 0f, -16f, 7.16f, -16f, 16f)
                verticalLineToRelative(48f)
                horizontalLineTo(32f)
                curveToRelative(-17.67f, 0f, -32f, 14.33f, -32f, 32f)
                verticalLineToRelative(256f)
                curveToRelative(0f, 17.67f, 14.33f, 32f, 32f, 32f)
                horizontalLineToRelative(448f)
                curveToRelative(17.67f, 0f, 32f, -14.33f, 32f, -32f)
                verticalLineTo(160f)
                curveToRelative(0f, -17.67f, -14.33f, -32f, -32f, -32f)
                close()
                moveTo(192f, 264f)
                curveToRelative(0f, 4.42f, -3.58f, 8f, -8f, 8f)
                horizontalLineTo(72f)
                curveToRelative(-4.42f, 0f, -8f, -3.58f, -8f, -8f)
                verticalLineToRelative(-16f)
                curveToRelative(0f, -4.42f, 3.58f, -8f, 8f, -8f)
                horizontalLineToRelative(112f)
                curveToRelative(4.42f, 0f, 8f, 3.58f, 8f, 8f)
                verticalLineToRelative(16f)
                close()
                moveToRelative(256f, 0f)
                curveToRelative(0f, 4.42f, -3.58f, 8f, -8f, 8f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(40f)
                curveToRelative(0f, 4.42f, -3.58f, 8f, -8f, 8f)
                horizontalLineToRelative(-16f)
                curveToRelative(-4.42f, 0f, -8f, -3.58f, -8f, -8f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(-40f)
                curveToRelative(-4.42f, 0f, -8f, -3.58f, -8f, -8f)
                verticalLineToRelative(-16f)
                curveToRelative(0f, -4.42f, 3.58f, -8f, 8f, -8f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-40f)
                curveToRelative(0f, -4.42f, 3.58f, -8f, 8f, -8f)
                horizontalLineToRelative(16f)
                curveToRelative(4.42f, 0f, 8f, 3.58f, 8f, 8f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(40f)
                curveToRelative(4.42f, 0f, 8f, 3.58f, 8f, 8f)
                verticalLineToRelative(16f)
                close()
            }
        }.build()
        
        return _CarBattery!!
    }

private var _CarBattery: ImageVector? = null

