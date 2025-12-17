package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Schedule_send: ImageVector
    get() {
        if (_Schedule_send != null) return _Schedule_send!!
        
        _Schedule_send = ImageVector.Builder(
            name = "schedule_send",
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
                moveTo(16.5f, 12.5f)
                horizontalLineTo(15f)
                verticalLineToRelative(4f)
                lineToRelative(3f, 2f)
                lineToRelative(0.75f, -1.23f)
                lineToRelative(-2.25f, -1.52f)
                verticalLineTo(12.5f)
                close()
                moveTo(16f, 9f)
                lineTo(2f, 3f)
                verticalLineToRelative(7f)
                lineToRelative(9f, 2f)
                lineToRelative(-9f, 2f)
                verticalLineToRelative(7f)
                lineToRelative(7.27f, -3.11f)
                curveTo(10.09f, 20.83f, 12.79f, 23f, 16f, 23f)
                curveToRelative(3.86f, 0f, 7f, -3.14f, 7f, -7f)
                reflectiveCurveToRelative(-3.14f, -7f, -7f, -7f)
                close()
                moveToRelative(0f, 12f)
                curveToRelative(-2.75f, 0f, -4.98f, -2.22f, -5f, -4.97f)
                verticalLineToRelative(-0.07f)
                curveToRelative(0.02f, -2.74f, 2.25f, -4.97f, 5f, -4.97f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                reflectiveCurveTo(18.76f, 21f, 16f, 21f)
                close()
            }
        }.build()
        
        return _Schedule_send!!
    }

private var _Schedule_send: ImageVector? = null

