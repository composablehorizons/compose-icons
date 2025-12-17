package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Edit_calendar: ImageVector
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
                moveTo(5f, 6f)
                horizontalLineTo(19f)
                verticalLineTo(8f)
                horizontalLineTo(5f)
                verticalLineTo(6f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5f, 10f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineTo(6f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineToRelative(-1f)
                verticalLineTo(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineTo(8f)
                verticalLineTo(2f)
                horizontalLineTo(6f)
                verticalLineToRelative(2f)
                horizontalLineTo(5f)
                curveTo(3.89f, 4f, 3.01f, 4.9f, 3.01f, 6f)
                lineTo(3f, 20f)
                curveToRelative(0f, 1.1f, 0.89f, 2f, 2f, 2f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-2f)
                horizontalLineTo(5f)
                verticalLineTo(10f)
                close()
                moveTo(5f, 6f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(2f)
                horizontalLineTo(5f)
                verticalLineTo(6f)
                close()
                moveTo(22.84f, 16.28f)
                lineToRelative(-0.71f, 0.71f)
                lineToRelative(-2.12f, -2.12f)
                lineToRelative(0.71f, -0.71f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                lineToRelative(0.71f, 0.71f)
                curveTo(23.23f, 15.26f, 23.23f, 15.89f, 22.84f, 16.28f)
                close()
                moveTo(19.3f, 15.58f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(-5.3f, 5.3f)
                horizontalLineTo(14f)
                verticalLineToRelative(-2.12f)
                lineTo(19.3f, 15.58f)
                close()
            }
        }.build()
        
        return _Edit_calendar!!
    }

private var _Edit_calendar: ImageVector? = null

