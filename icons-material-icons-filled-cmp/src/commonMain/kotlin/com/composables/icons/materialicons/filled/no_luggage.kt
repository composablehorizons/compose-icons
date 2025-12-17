package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.No_luggage: ImageVector
    get() {
        if (_No_luggage != null) return _No_luggage!!
        
        _No_luggage = ImageVector.Builder(
            name = "no_luggage",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(24f)
                verticalLineTo(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.75f, 9f)
                verticalLineToRelative(0.92f)
                lineToRelative(1.75f, 1.75f)
                verticalLineTo(9f)
                horizontalLineTo(16f)
                verticalLineToRelative(4.17f)
                lineToRelative(3f, 3f)
                verticalLineTo(8f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineToRelative(-2f)
                verticalLineTo(3f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-4f)
                curveTo(9.45f, 2f, 9f, 2.45f, 9f, 3f)
                verticalLineToRelative(3f)
                horizontalLineTo(8.83f)
                lineToRelative(3f, 3f)
                horizontalLineTo(12.75f)
                close()
                moveTo(10.5f, 3.5f)
                horizontalLineToRelative(3f)
                verticalLineTo(6f)
                horizontalLineToRelative(-3f)
                verticalLineTo(3.5f)
                close()
                moveTo(21.19f, 21.19f)
                lineTo(2.81f, 2.81f)
                lineTo(1.39f, 4.22f)
                lineToRelative(3.63f, 3.63f)
                curveTo(5.02f, 7.9f, 5f, 7.95f, 5f, 8f)
                verticalLineToRelative(11f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                horizontalLineToRelative(6f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                curveToRelative(0.34f, 0f, 0.65f, -0.09f, 0.93f, -0.24f)
                lineToRelative(1.85f, 1.85f)
                lineTo(21.19f, 21.19f)
                close()
                moveTo(8f, 18f)
                verticalLineToRelative(-7.17f)
                lineToRelative(1.5f, 1.5f)
                verticalLineTo(18f)
                horizontalLineTo(8f)
                close()
                moveTo(12.75f, 18f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-3.92f)
                lineToRelative(1.5f, 1.5f)
                verticalLineTo(18f)
                close()
            }
        }.build()
        
        return _No_luggage!!
    }

private var _No_luggage: ImageVector? = null

