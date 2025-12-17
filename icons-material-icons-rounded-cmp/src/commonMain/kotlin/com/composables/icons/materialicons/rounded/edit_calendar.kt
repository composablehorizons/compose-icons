package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Edit_calendar: ImageVector
    get() {
        if (_Edit_calendar != null) return _Edit_calendar!!
        
        _Edit_calendar = ImageVector.Builder(
            name = "edit_calendar",
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
                moveTo(12f, 22f)
                horizontalLineTo(5f)
                curveToRelative(-1.11f, 0f, -2f, -0.9f, -2f, -2f)
                lineTo(3.01f, 6f)
                curveToRelative(0f, -1.1f, 0.88f, -2f, 1.99f, -2f)
                horizontalLineToRelative(1f)
                verticalLineTo(3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(8f)
                verticalLineTo(3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(1f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineTo(5f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(7f)
                verticalLineTo(22f)
                close()
                moveTo(22.13f, 16.99f)
                lineToRelative(0.71f, -0.71f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                lineToRelative(-0.71f, -0.71f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                lineToRelative(-0.71f, 0.71f)
                lineTo(22.13f, 16.99f)
                close()
                moveTo(21.42f, 17.7f)
                lineToRelative(-5.01f, 5.01f)
                curveToRelative(-0.18f, 0.18f, -0.44f, 0.29f, -0.7f, 0.29f)
                horizontalLineTo(14.5f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-1.21f)
                curveToRelative(0f, -0.27f, 0.11f, -0.52f, 0.29f, -0.71f)
                lineToRelative(5.01f, -5.01f)
                lineTo(21.42f, 17.7f)
                close()
            }
        }.build()
        
        return _Edit_calendar!!
    }

private var _Edit_calendar: ImageVector? = null

