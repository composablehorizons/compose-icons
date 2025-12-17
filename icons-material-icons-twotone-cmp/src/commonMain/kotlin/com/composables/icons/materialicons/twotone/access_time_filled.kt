package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Access_time_filled: ImageVector
    get() {
        if (_Access_time_filled != null) return _Access_time_filled!!
        
        _Access_time_filled = ImageVector.Builder(
            name = "access_time_filled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            group {
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
            }
            group {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(11.99f, 2f)
                    curveTo(6.47f, 2f, 2f, 6.48f, 2f, 12f)
                    reflectiveCurveToRelative(4.47f, 10f, 9.99f, 10f)
                    curveTo(17.52f, 22f, 22f, 17.52f, 22f, 12f)
                    reflectiveCurveTo(17.52f, 2f, 11.99f, 2f)
                    close()
                    moveTo(15.29f, 16.71f)
                    lineTo(11f, 12.41f)
                    verticalLineTo(7f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(4.59f)
                    lineToRelative(3.71f, 3.71f)
                    lineTo(15.29f, 16.71f)
                    close()
                }
            }
        }.build()
        
        return _Access_time_filled!!
    }

private var _Access_time_filled: ImageVector? = null

