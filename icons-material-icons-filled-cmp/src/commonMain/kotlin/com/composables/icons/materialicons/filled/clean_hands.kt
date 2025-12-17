package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Clean_hands: ImageVector
    get() {
        if (_Clean_hands != null) return _Clean_hands!!
        
        _Clean_hands = ImageVector.Builder(
            name = "clean_hands",
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
                moveTo(16.99f, 5f)
                lineToRelative(0.63f, 1.37f)
                lineTo(18.99f, 7f)
                lineToRelative(-1.37f, 0.63f)
                lineTo(16.99f, 9f)
                lineToRelative(-0.63f, -1.37f)
                lineTo(14.99f, 7f)
                lineToRelative(1.37f, -0.63f)
                lineTo(16.99f, 5f)
                moveTo(11f, 6.13f)
                verticalLineTo(4f)
                horizontalLineToRelative(2f)
                curveToRelative(0.57f, 0f, 1.1f, 0.17f, 1.55f, 0.45f)
                lineToRelative(1.43f, -1.43f)
                curveTo(15.15f, 2.39f, 14.13f, 2f, 13f, 2f)
                curveToRelative(-1.48f, 0f, -5.5f, 0f, -5.5f, 0f)
                verticalLineToRelative(2f)
                horizontalLineTo(9f)
                verticalLineToRelative(2.14f)
                curveTo(7.23f, 6.51f, 5.81f, 7.8f, 5.26f, 9.5f)
                horizontalLineToRelative(3.98f)
                lineTo(15f, 11.65f)
                verticalLineToRelative(-0.62f)
                curveTo(15f, 8.61f, 13.28f, 6.59f, 11f, 6.13f)
                close()
                moveTo(1f, 22f)
                horizontalLineToRelative(4f)
                verticalLineTo(11f)
                horizontalLineTo(1f)
                verticalLineTo(22f)
                close()
                moveTo(20f, 17f)
                horizontalLineToRelative(-7f)
                lineToRelative(-2.09f, -0.73f)
                lineToRelative(0.33f, -0.94f)
                lineTo(13f, 16f)
                horizontalLineToRelative(2.82f)
                curveToRelative(0.65f, 0f, 1.18f, -0.53f, 1.18f, -1.18f)
                lineToRelative(0f, 0f)
                curveToRelative(0f, -0.49f, -0.31f, -0.93f, -0.77f, -1.11f)
                lineTo(8.97f, 11f)
                horizontalLineTo(7f)
                verticalLineToRelative(9.02f)
                lineTo(14f, 22f)
                lineToRelative(8f, -3f)
                lineToRelative(0f, 0f)
                curveTo(21.99f, 17.9f, 21.11f, 17f, 20f, 17f)
                close()
                moveTo(20f, 14f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                curveToRelative(0f, -1.1f, -2f, -4f, -2f, -4f)
                reflectiveCurveToRelative(-2f, 2.9f, -2f, 4f)
                curveTo(18f, 13.1f, 18.9f, 14f, 20f, 14f)
                close()
            }
        }.build()
        
        return _Clean_hands!!
    }

private var _Clean_hands: ImageVector? = null

