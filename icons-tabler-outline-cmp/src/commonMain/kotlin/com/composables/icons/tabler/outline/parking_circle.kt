package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.ParkingCircle: ImageVector
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
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 16f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(3.334f)
                curveToRelative(0.92f, 0f, 1.666f, 0.895f, 1.666f, 2f)
                reflectiveCurveToRelative(-0.746f, 2f, -1.666f, 2f)
                horizontalLineToRelative(-3.334f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 12f)
                arcToRelative(9f, 9f, 0f, true, false, 18f, 0f)
                arcToRelative(9f, 9f, 0f, false, false, -18f, 0f)
            }
        }.build()
        
        return _ParkingCircle!!
    }

private var _ParkingCircle: ImageVector? = null

