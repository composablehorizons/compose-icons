package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.TruckPickup: ImageVector
    get() {
        if (_TruckPickup != null) return _TruckPickup!!
        
        _TruckPickup = ImageVector.Builder(
            name = "truck-pickup",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(624f, 288f)
                horizontalLineToRelative(-16f)
                verticalLineToRelative(-64f)
                curveToRelative(0f, -17.67f, -14.33f, -32f, -32f, -32f)
                horizontalLineToRelative(-48f)
                lineTo(419.22f, 56.02f)
                arcTo(64.025f, 64.025f, 0f, false, false, 369.24f, 32f)
                horizontalLineTo(256f)
                curveToRelative(-17.67f, 0f, -32f, 14.33f, -32f, 32f)
                verticalLineToRelative(128f)
                horizontalLineTo(64f)
                curveToRelative(-17.67f, 0f, -32f, 14.33f, -32f, 32f)
                verticalLineToRelative(64f)
                horizontalLineTo(16f)
                curveToRelative(-8.84f, 0f, -16f, 7.16f, -16f, 16f)
                verticalLineToRelative(32f)
                curveToRelative(0f, 8.84f, 7.16f, 16f, 16f, 16f)
                horizontalLineToRelative(49.61f)
                curveToRelative(-0.76f, 5.27f, -1.61f, 10.52f, -1.61f, 16f)
                curveToRelative(0f, 61.86f, 50.14f, 112f, 112f, 112f)
                reflectiveCurveToRelative(112f, -50.14f, 112f, -112f)
                curveToRelative(0f, -5.48f, -0.85f, -10.73f, -1.61f, -16f)
                horizontalLineToRelative(67.23f)
                curveToRelative(-0.76f, 5.27f, -1.61f, 10.52f, -1.61f, 16f)
                curveToRelative(0f, 61.86f, 50.14f, 112f, 112f, 112f)
                reflectiveCurveToRelative(112f, -50.14f, 112f, -112f)
                curveToRelative(0f, -5.48f, -0.85f, -10.73f, -1.61f, -16f)
                horizontalLineTo(624f)
                curveToRelative(8.84f, 0f, 16f, -7.16f, 16f, -16f)
                verticalLineToRelative(-32f)
                curveToRelative(0f, -8.84f, -7.16f, -16f, -16f, -16f)
                close()
                moveTo(288f, 96f)
                horizontalLineToRelative(81.24f)
                lineToRelative(76.8f, 96f)
                horizontalLineTo(288f)
                verticalLineTo(96f)
                close()
                moveTo(176f, 416f)
                curveToRelative(-26.47f, 0f, -48f, -21.53f, -48f, -48f)
                reflectiveCurveToRelative(21.53f, -48f, 48f, -48f)
                reflectiveCurveToRelative(48f, 21.53f, 48f, 48f)
                reflectiveCurveToRelative(-21.53f, 48f, -48f, 48f)
                close()
                moveToRelative(288f, 0f)
                curveToRelative(-26.47f, 0f, -48f, -21.53f, -48f, -48f)
                reflectiveCurveToRelative(21.53f, -48f, 48f, -48f)
                reflectiveCurveToRelative(48f, 21.53f, 48f, 48f)
                reflectiveCurveToRelative(-21.53f, 48f, -48f, 48f)
                close()
            }
        }.build()
        
        return _TruckPickup!!
    }

private var _TruckPickup: ImageVector? = null

