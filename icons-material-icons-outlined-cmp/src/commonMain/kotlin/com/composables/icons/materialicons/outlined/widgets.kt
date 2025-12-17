package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Widgets: ImageVector
    get() {
        if (_Widgets != null) return _Widgets!!
        
        _Widgets = ImageVector.Builder(
            name = "widgets",
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
                moveTo(16.66f, 4.52f)
                lineToRelative(2.83f, 2.83f)
                lineToRelative(-2.83f, 2.83f)
                lineToRelative(-2.83f, -2.83f)
                lineToRelative(2.83f, -2.83f)
                moveTo(9f, 5f)
                verticalLineToRelative(4f)
                horizontalLineTo(5f)
                verticalLineTo(5f)
                horizontalLineToRelative(4f)
                moveToRelative(10f, 10f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(4f)
                moveTo(9f, 15f)
                verticalLineToRelative(4f)
                horizontalLineTo(5f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(4f)
                moveToRelative(7.66f, -13.31f)
                lineTo(11f, 7.34f)
                lineTo(16.66f, 13f)
                lineToRelative(5.66f, -5.66f)
                lineToRelative(-5.66f, -5.65f)
                close()
                moveTo(11f, 3f)
                horizontalLineTo(3f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(8f)
                verticalLineTo(3f)
                close()
                moveToRelative(10f, 10f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-8f)
                close()
                moveToRelative(-10f, 0f)
                horizontalLineTo(3f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-8f)
                close()
            }
        }.build()
        
        return _Widgets!!
    }

private var _Widgets: ImageVector? = null

