package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.TrafficLight: ImageVector
    get() {
        if (_TrafficLight != null) return _TrafficLight!!
        
        _TrafficLight = ImageVector.Builder(
            name = "traffic-light",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 384f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(384f, 192f)
                horizontalLineToRelative(-64f)
                verticalLineToRelative(-37.88f)
                curveToRelative(37.2f, -13.22f, 64f, -48.38f, 64f, -90.12f)
                horizontalLineToRelative(-64f)
                verticalLineTo(32f)
                curveToRelative(0f, -17.67f, -14.33f, -32f, -32f, -32f)
                horizontalLineTo(96f)
                curveTo(78.33f, 0f, 64f, 14.33f, 64f, 32f)
                verticalLineToRelative(32f)
                horizontalLineTo(0f)
                curveToRelative(0f, 41.74f, 26.8f, 76.9f, 64f, 90.12f)
                verticalLineTo(192f)
                horizontalLineTo(0f)
                curveToRelative(0f, 41.74f, 26.8f, 76.9f, 64f, 90.12f)
                verticalLineTo(320f)
                horizontalLineTo(0f)
                curveToRelative(0f, 42.84f, 28.25f, 78.69f, 66.99f, 91.05f)
                curveTo(79.42f, 468.72f, 130.6f, 512f, 192f, 512f)
                reflectiveCurveToRelative(112.58f, -43.28f, 125.01f, -100.95f)
                curveTo(355.75f, 398.69f, 384f, 362.84f, 384f, 320f)
                horizontalLineToRelative(-64f)
                verticalLineToRelative(-37.88f)
                curveToRelative(37.2f, -13.22f, 64f, -48.38f, 64f, -90.12f)
                close()
                moveTo(192f, 416f)
                curveToRelative(-26.51f, 0f, -48f, -21.49f, -48f, -48f)
                reflectiveCurveToRelative(21.49f, -48f, 48f, -48f)
                reflectiveCurveToRelative(48f, 21.49f, 48f, 48f)
                reflectiveCurveToRelative(-21.49f, 48f, -48f, 48f)
                close()
                moveToRelative(0f, -128f)
                curveToRelative(-26.51f, 0f, -48f, -21.49f, -48f, -48f)
                reflectiveCurveToRelative(21.49f, -48f, 48f, -48f)
                reflectiveCurveToRelative(48f, 21.49f, 48f, 48f)
                reflectiveCurveToRelative(-21.49f, 48f, -48f, 48f)
                close()
                moveToRelative(0f, -128f)
                curveToRelative(-26.51f, 0f, -48f, -21.49f, -48f, -48f)
                reflectiveCurveToRelative(21.49f, -48f, 48f, -48f)
                reflectiveCurveToRelative(48f, 21.49f, 48f, 48f)
                reflectiveCurveToRelative(-21.49f, 48f, -48f, 48f)
                close()
            }
        }.build()
        
        return _TrafficLight!!
    }

private var _TrafficLight: ImageVector? = null

