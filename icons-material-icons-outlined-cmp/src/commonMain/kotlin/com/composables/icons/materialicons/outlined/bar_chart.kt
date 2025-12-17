package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Bar_chart: ImageVector
    get() {
        if (_Bar_chart != null) return _Bar_chart!!
        
        _Bar_chart = ImageVector.Builder(
            name = "bar_chart",
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
                moveTo(5f, 9.2f)
                horizontalLineToRelative(3f)
                verticalLineTo(19f)
                horizontalLineTo(5f)
                verticalLineTo(9.2f)
                close()
                moveTo(10.6f, 5f)
                horizontalLineToRelative(2.8f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(-2.8f)
                verticalLineTo(5f)
                close()
                moveToRelative(5.6f, 8f)
                horizontalLineTo(19f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-2.8f)
                verticalLineToRelative(-6f)
                close()
            }
        }.build()
        
        return _Bar_chart!!
    }

private var _Bar_chart: ImageVector? = null

