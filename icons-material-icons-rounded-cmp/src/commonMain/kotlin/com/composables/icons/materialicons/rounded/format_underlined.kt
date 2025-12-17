package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Format_underlined: ImageVector
    get() {
        if (_Format_underlined != null) return _Format_underlined!!
        
        _Format_underlined = ImageVector.Builder(
            name = "format_underlined",
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
                moveTo(12.79f, 16.95f)
                curveToRelative(3.03f, -0.39f, 5.21f, -3.11f, 5.21f, -6.16f)
                verticalLineTo(4.25f)
                curveTo(18f, 3.56f, 17.44f, 3f, 16.75f, 3f)
                reflectiveCurveToRelative(-1.25f, 0.56f, -1.25f, 1.25f)
                verticalLineToRelative(6.65f)
                curveToRelative(0f, 1.67f, -1.13f, 3.19f, -2.77f, 3.52f)
                curveToRelative(-2.25f, 0.47f, -4.23f, -1.25f, -4.23f, -3.42f)
                verticalLineTo(4.25f)
                curveTo(8.5f, 3.56f, 7.94f, 3f, 7.25f, 3f)
                reflectiveCurveTo(6f, 3.56f, 6f, 4.25f)
                verticalLineTo(11f)
                curveToRelative(0f, 3.57f, 3.13f, 6.42f, 6.79f, 5.95f)
                close()
                moveTo(5f, 20f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(12f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineTo(6f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                close()
            }
        }.build()
        
        return _Format_underlined!!
    }

private var _Format_underlined: ImageVector? = null

