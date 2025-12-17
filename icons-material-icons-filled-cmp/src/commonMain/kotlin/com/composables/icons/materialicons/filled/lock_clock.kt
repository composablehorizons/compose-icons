package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Lock_clock: ImageVector
    get() {
        if (_Lock_clock != null) return _Lock_clock!!
        
        _Lock_clock = ImageVector.Builder(
            name = "lock_clock",
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
                moveTo(14.5f, 14.2f)
                lineToRelative(2.9f, 1.7f)
                lineToRelative(-0.8f, 1.3f)
                lineTo(13f, 15f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(4.2f)
                close()
                moveTo(22f, 14f)
                curveToRelative(0f, 4.41f, -3.59f, 8f, -8f, 8f)
                curveToRelative(-2.02f, 0f, -3.86f, -0.76f, -5.27f, -2f)
                horizontalLineTo(4f)
                curveToRelative(-1.15f, 0f, -2f, -0.85f, -2f, -2f)
                verticalLineTo(9f)
                curveToRelative(0f, -1.12f, 0.89f, -1.96f, 2f, -2f)
                verticalLineToRelative(-0.5f)
                curveTo(4f, 4.01f, 6.01f, 2f, 8.5f, 2f)
                curveToRelative(2.34f, 0f, 4.24f, 1.79f, 4.46f, 4.08f)
                curveToRelative(0.34f, -0.05f, 0.69f, -0.08f, 1.04f, -0.08f)
                curveToRelative(4.41f, 0f, 8f, 3.59f, 8f, 8f)
                close()
                moveTo(6f, 7f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-0.74f)
                curveTo(10.88f, 4.99f, 9.8f, 4f, 8.5f, 4f)
                curveTo(7.12f, 4f, 6f, 5.12f, 6f, 6.5f)
                verticalLineTo(7f)
                close()
                moveToRelative(14f, 7f)
                curveToRelative(0f, -3.31f, -2.69f, -6f, -6f, -6f)
                reflectiveCurveToRelative(-6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                close()
            }
        }.build()
        
        return _Lock_clock!!
    }

private var _Lock_clock: ImageVector? = null

