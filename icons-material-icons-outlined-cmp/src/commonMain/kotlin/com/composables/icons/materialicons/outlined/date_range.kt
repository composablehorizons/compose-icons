package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Date_range: ImageVector
    get() {
        if (_Date_range != null) return _Date_range!!
        
        _Date_range = ImageVector.Builder(
            name = "date_range",
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
                moveTo(7f, 11f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineTo(7f)
                verticalLineToRelative(-2f)
                close()
                moveToRelative(14f, -5f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                horizontalLineTo(5f)
                curveToRelative(-1.11f, 0f, -2f, -0.9f, -2f, -2f)
                lineToRelative(0.01f, -14f)
                curveToRelative(0f, -1.1f, 0.88f, -2f, 1.99f, -2f)
                horizontalLineToRelative(1f)
                verticalLineTo(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(8f)
                verticalLineTo(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                close()
                moveTo(5f, 8f)
                horizontalLineToRelative(14f)
                verticalLineTo(6f)
                horizontalLineTo(5f)
                verticalLineToRelative(2f)
                close()
                moveToRelative(14f, 12f)
                verticalLineTo(10f)
                horizontalLineTo(5f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(14f)
                close()
                moveToRelative(-4f, -7f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                close()
                moveToRelative(-4f, 0f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                close()
            }
        }.build()
        
        return _Date_range!!
    }

private var _Date_range: ImageVector? = null

