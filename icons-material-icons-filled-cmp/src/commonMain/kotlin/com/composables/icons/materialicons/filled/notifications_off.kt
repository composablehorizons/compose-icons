package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Notifications_off: ImageVector
    get() {
        if (_Notifications_off != null) return _Notifications_off!!
        
        _Notifications_off = ImageVector.Builder(
            name = "notifications_off",
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
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(20f, 18.69f)
                lineTo(7.84f, 6.14f)
                lineTo(5.27f, 3.49f)
                lineTo(4f, 4.76f)
                lineToRelative(2.8f, 2.8f)
                verticalLineToRelative(0.01f)
                curveToRelative(-0.52f, 0.99f, -0.8f, 2.16f, -0.8f, 3.42f)
                verticalLineToRelative(5f)
                lineToRelative(-2f, 2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(13.73f)
                lineToRelative(2f, 2f)
                lineTo(21f, 19.72f)
                lineToRelative(-1f, -1.03f)
                close()
                moveTo(12f, 22f)
                curveToRelative(1.11f, 0f, 2f, -0.89f, 2f, -2f)
                horizontalLineToRelative(-4f)
                curveToRelative(0f, 1.11f, 0.89f, 2f, 2f, 2f)
                close()
                moveToRelative(6f, -7.32f)
                verticalLineTo(11f)
                curveToRelative(0f, -3.08f, -1.64f, -5.64f, -4.5f, -6.32f)
                verticalLineTo(4f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(0.68f)
                curveToRelative(-0.15f, 0.03f, -0.29f, 0.08f, -0.42f, 0.12f)
                curveToRelative(-0.1f, 0.03f, -0.2f, 0.07f, -0.3f, 0.11f)
                horizontalLineToRelative(-0.01f)
                curveToRelative(-0.01f, 0f, -0.01f, 0f, -0.02f, 0.01f)
                curveToRelative(-0.23f, 0.09f, -0.46f, 0.2f, -0.68f, 0.31f)
                curveToRelative(0f, 0f, -0.01f, 0f, -0.01f, 0.01f)
                lineTo(18f, 14.68f)
                close()
            }
        }.build()
        
        return _Notifications_off!!
    }

private var _Notifications_off: ImageVector? = null

