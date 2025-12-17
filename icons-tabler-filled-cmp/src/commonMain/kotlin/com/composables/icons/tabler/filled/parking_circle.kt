package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.ParkingCircle: ImageVector
    get() {
        if (_ParkingCircle != null) return _ParkingCircle!!
        
        _ParkingCircle = ImageVector.Builder(
            name = "parking-circle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 2f)
                curveToRelative(5.523f, 0f, 10f, 4.477f, 10f, 10f)
                arcToRelative(10f, 10f, 0f, false, true, -20f, 0f)
                lineToRelative(0.004f, -0.28f)
                curveToRelative(0.148f, -5.393f, 4.566f, -9.72f, 9.996f, -9.72f)
                moveToRelative(1.334f, 5f)
                horizontalLineToRelative(-3.334f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(8f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                lineToRelative(0.117f, -0.007f)
                arcToRelative(1f, 1f, 0f, false, false, 0.883f, -0.993f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2.334f)
                curveToRelative(1.516f, 0f, 2.666f, -1.38f, 2.666f, -3f)
                reflectiveCurveToRelative(-1.15f, -3f, -2.666f, -3f)
                moveToRelative(0f, 2f)
                curveToRelative(0.323f, 0f, 0.666f, 0.411f, 0.666f, 1f)
                reflectiveCurveToRelative(-0.343f, 1f, -0.666f, 1f)
                horizontalLineToRelative(-2.334f)
                verticalLineToRelative(-2f)
                close()
            }
        }.build()
        
        return _ParkingCircle!!
    }

private var _ParkingCircle: ImageVector? = null

