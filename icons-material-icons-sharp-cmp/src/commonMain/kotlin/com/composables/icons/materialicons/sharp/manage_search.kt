package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Manage_search: ImageVector
    get() {
        if (_Manage_search != null) return _Manage_search!!
        
        _Manage_search = ImageVector.Builder(
            name = "manage_search",
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
                    moveTo(7f, 9f)
                    horizontalLineTo(2f)
                    verticalLineTo(7f)
                    horizontalLineToRelative(5f)
                    verticalLineTo(9f)
                    close()
                    moveTo(7f, 12f)
                    horizontalLineTo(2f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(5f)
                    verticalLineTo(12f)
                    close()
                    moveTo(20.59f, 19f)
                    lineToRelative(-3.83f, -3.83f)
                    curveTo(15.96f, 15.69f, 15.02f, 16f, 14f, 16f)
                    curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                    reflectiveCurveToRelative(2.24f, -5f, 5f, -5f)
                    reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
                    curveToRelative(0f, 1.02f, -0.31f, 1.96f, -0.83f, 2.75f)
                    lineTo(22f, 17.59f)
                    lineTo(20.59f, 19f)
                    close()
                    moveTo(17f, 11f)
                    curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                    reflectiveCurveToRelative(-3f, 1.35f, -3f, 3f)
                    reflectiveCurveToRelative(1.35f, 3f, 3f, 3f)
                    reflectiveCurveTo(17f, 12.65f, 17f, 11f)
                    close()
                    moveTo(2f, 19f)
                    horizontalLineToRelative(10f)
                    verticalLineToRelative(-2f)
                    horizontalLineTo(2f)
                    verticalLineTo(19f)
                    close()
                }
            }
        }.build()
        
        return _Manage_search!!
    }

private var _Manage_search: ImageVector? = null

