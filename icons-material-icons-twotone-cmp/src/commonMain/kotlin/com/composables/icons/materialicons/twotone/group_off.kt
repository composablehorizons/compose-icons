package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Group_off: ImageVector
    get() {
        if (_Group_off != null) return _Group_off!!
        
        _Group_off = ImageVector.Builder(
            name = "group_off",
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
                moveTo(10.99f, 8.16f)
                curveTo(11f, 8.11f, 11f, 8.06f, 11f, 8f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                curveTo(8.94f, 6f, 8.89f, 6f, 8.84f, 6.01f)
                lineTo(10.99f, 8.16f)
                close()
                moveTo(9f, 15f)
                curveToRelative(-2.7f, 0f, -5.8f, 1.29f, -6f, 2.01f)
                verticalLineTo(18f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-0.17f)
                lineToRelative(-2.11f, -2.11f)
                curveTo(11.76f, 15.31f, 10.33f, 15f, 9f, 15f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(15f, 8f)
                curveToRelative(0f, -1.42f, -0.5f, -2.73f, -1.33f, -3.76f)
                curveTo(14.09f, 4.1f, 14.53f, 4f, 15f, 4f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                reflectiveCurveToRelative(-1.79f, 4f, -4f, 4f)
                curveToRelative(-0.06f, 0f, -0.12f, 0f, -0.18f, 0f)
                lineToRelative(-0.77f, -0.77f)
                curveTo(14.65f, 10.29f, 15f, 9.18f, 15f, 8f)
                close()
                moveTo(22.83f, 20f)
                horizontalLineTo(23f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -2.18f, -3.58f, -3.47f, -6.34f, -3.87f)
                curveToRelative(1.1f, 0.75f, 1.95f, 1.71f, 2.23f, 2.94f)
                lineTo(22.83f, 20f)
                close()
                moveTo(9f, 6f)
                curveTo(8.94f, 6f, 8.89f, 6f, 8.84f, 6.01f)
                lineToRelative(-1.6f, -1.6f)
                curveTo(7.77f, 4.15f, 8.37f, 4f, 9f, 4f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                curveToRelative(0f, 0.63f, -0.15f, 1.23f, -0.41f, 1.76f)
                lineToRelative(-1.6f, -1.6f)
                curveTo(11f, 8.11f, 11f, 8.06f, 11f, 8f)
                curveTo(11f, 6.9f, 10.1f, 6f, 9f, 6f)
                close()
                moveTo(9.17f, 12f)
                curveTo(9.11f, 12f, 9.06f, 12f, 9f, 12f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                curveToRelative(0f, -0.06f, 0f, -0.11f, 0f, -0.17f)
                lineTo(0.69f, 3.51f)
                lineTo(2.1f, 2.1f)
                lineToRelative(19.8f, 19.8f)
                lineToRelative(-1.41f, 1.41f)
                lineTo(17f, 19.83f)
                verticalLineTo(20f)
                horizontalLineTo(1f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -2.66f, 5.33f, -4f, 8f, -4f)
                curveToRelative(0.37f, 0f, 0.8f, 0.03f, 1.25f, 0.08f)
                lineTo(9.17f, 12f)
                close()
                moveTo(9f, 15f)
                curveToRelative(-2.7f, 0f, -5.8f, 1.29f, -6f, 2.01f)
                verticalLineTo(18f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-0.17f)
                lineToRelative(-2.11f, -2.11f)
                curveTo(11.76f, 15.31f, 10.33f, 15f, 9f, 15f)
                close()
            }
        }.build()
        
        return _Group_off!!
    }

private var _Group_off: ImageVector? = null

