package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Flight_takeoff: ImageVector
    get() {
        if (_Flight_takeoff != null) return _Flight_takeoff!!
        
        _Flight_takeoff = ImageVector.Builder(
            name = "flight_takeoff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(20.5f, 19f)
                horizontalLineToRelative(-17f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(17f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveToRelative(1.57f, -9.36f)
                curveToRelative(-0.22f, -0.8f, -1.04f, -1.27f, -1.84f, -1.06f)
                lineTo(14.92f, 10f)
                lineTo(8.46f, 3.98f)
                curveToRelative(-0.27f, -0.26f, -0.66f, -0.35f, -1.02f, -0.25f)
                curveToRelative(-0.68f, 0.19f, -1f, 0.97f, -0.65f, 1.58f)
                lineToRelative(3.44f, 5.96f)
                lineToRelative(-4.97f, 1.33f)
                lineToRelative(-1.57f, -1.24f)
                curveToRelative(-0.25f, -0.19f, -0.57f, -0.26f, -0.88f, -0.18f)
                lineToRelative(-0.33f, 0.09f)
                curveToRelative(-0.32f, 0.08f, -0.47f, 0.45f, -0.3f, 0.73f)
                lineToRelative(1.88f, 3.25f)
                curveToRelative(0.23f, 0.39f, 0.69f, 0.58f, 1.12f, 0.47f)
                lineTo(21f, 11.48f)
                curveToRelative(0.8f, -0.22f, 1.28f, -1.04f, 1.07f, -1.84f)
                close()
            }
        }.build()
        
        return _Flight_takeoff!!
    }

private var _Flight_takeoff: ImageVector? = null

