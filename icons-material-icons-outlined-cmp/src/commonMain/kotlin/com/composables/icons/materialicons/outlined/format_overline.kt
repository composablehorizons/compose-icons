package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Format_overline: ImageVector
    get() {
        if (_Format_overline != null) return _Format_overline!!
        
        _Format_overline = ImageVector.Builder(
            name = "format_overline",
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
                    horizontalLineTo(24f)
                    verticalLineTo(24f)
                    horizontalLineTo(0f)
                    verticalLineTo(0f)
                    close()
                }
            }
            group {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(19f, 3f)
                    verticalLineToRelative(2f)
                    horizontalLineTo(5f)
                    verticalLineTo(3f)
                    horizontalLineTo(19f)
                    close()
                    moveTo(12f, 7f)
                    curveToRelative(-3.87f, 0f, -7f, 3.13f, -7f, 7f)
                    curveToRelative(0f, 3.87f, 3.13f, 7f, 7f, 7f)
                    reflectiveCurveToRelative(7f, -3.13f, 7f, -7f)
                    curveTo(19f, 10.13f, 15.87f, 7f, 12f, 7f)
                    close()
                    moveTo(12f, 18.5f)
                    curveToRelative(-2.49f, 0f, -4.5f, -2.01f, -4.5f, -4.5f)
                    reflectiveCurveTo(9.51f, 9.5f, 12f, 9.5f)
                    reflectiveCurveToRelative(4.5f, 2.01f, 4.5f, 4.5f)
                    reflectiveCurveTo(14.49f, 18.5f, 12f, 18.5f)
                    close()
                }
            }
        }.build()
        
        return _Format_overline!!
    }

private var _Format_overline: ImageVector? = null

