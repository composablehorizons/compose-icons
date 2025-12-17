package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Local_police: ImageVector
    get() {
        if (_Local_police != null) return _Local_police!!
        
        _Local_police = ImageVector.Builder(
            name = "local_police",
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
                moveTo(12f, 3.19f)
                lineTo(5f, 6.3f)
                verticalLineTo(11f)
                curveToRelative(0f, 4.52f, 2.98f, 8.69f, 7f, 9.93f)
                curveToRelative(4.02f, -1.23f, 7f, -5.41f, 7f, -9.93f)
                verticalLineTo(6.3f)
                lineTo(12f, 3.19f)
                close()
                moveTo(14.5f, 12.59f)
                lineToRelative(0.9f, 3.88f)
                lineTo(12f, 14.42f)
                lineToRelative(-3.4f, 2.05f)
                lineToRelative(0.9f, -3.87f)
                lineToRelative(-3f, -2.59f)
                lineToRelative(3.96f, -0.34f)
                lineTo(12f, 6.02f)
                lineToRelative(1.54f, 3.64f)
                lineTo(17.5f, 10f)
                lineTo(14.5f, 12.59f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14.5f, 12.59f)
                lineToRelative(0.9f, 3.88f)
                lineTo(12f, 14.42f)
                lineToRelative(-3.4f, 2.05f)
                lineToRelative(0.9f, -3.87f)
                lineToRelative(-3f, -2.59f)
                lineToRelative(3.96f, -0.34f)
                lineTo(12f, 6.02f)
                lineToRelative(1.54f, 3.64f)
                lineTo(17.5f, 10f)
                lineTo(14.5f, 12.59f)
                close()
                moveTo(12f, 3.19f)
                lineToRelative(7f, 3.11f)
                verticalLineTo(11f)
                curveToRelative(0f, 4.52f, -2.98f, 8.69f, -7f, 9.93f)
                curveTo(7.98f, 19.69f, 5f, 15.52f, 5f, 11f)
                verticalLineTo(6.3f)
                lineTo(12f, 3.19f)
                moveTo(12f, 1f)
                lineTo(3f, 5f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 5.55f, 3.84f, 10.74f, 9f, 12f)
                curveToRelative(5.16f, -1.26f, 9f, -6.45f, 9f, -12f)
                verticalLineTo(5f)
                lineTo(12f, 1f)
                lineTo(12f, 1f)
                close()
            }
        }.build()
        
        return _Local_police!!
    }

private var _Local_police: ImageVector? = null

