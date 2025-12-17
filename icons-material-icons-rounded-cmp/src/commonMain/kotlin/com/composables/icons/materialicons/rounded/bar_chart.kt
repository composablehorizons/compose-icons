package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Bar_chart: ImageVector
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
                moveTo(6.4f, 9.2f)
                horizontalLineToRelative(0.2f)
                curveToRelative(0.77f, 0f, 1.4f, 0.63f, 1.4f, 1.4f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 0.77f, -0.63f, 1.4f, -1.4f, 1.4f)
                horizontalLineToRelative(-0.2f)
                curveToRelative(-0.77f, 0f, -1.4f, -0.63f, -1.4f, -1.4f)
                verticalLineToRelative(-7f)
                curveToRelative(0f, -0.77f, 0.63f, -1.4f, 1.4f, -1.4f)
                close()
                moveTo(12f, 5f)
                curveToRelative(0.77f, 0f, 1.4f, 0.63f, 1.4f, 1.4f)
                verticalLineToRelative(11.2f)
                curveToRelative(0f, 0.77f, -0.63f, 1.4f, -1.4f, 1.4f)
                curveToRelative(-0.77f, 0f, -1.4f, -0.63f, -1.4f, -1.4f)
                verticalLineTo(6.4f)
                curveToRelative(0f, -0.77f, 0.63f, -1.4f, 1.4f, -1.4f)
                close()
                moveToRelative(5.6f, 8f)
                curveToRelative(0.77f, 0f, 1.4f, 0.63f, 1.4f, 1.4f)
                verticalLineToRelative(3.2f)
                curveToRelative(0f, 0.77f, -0.63f, 1.4f, -1.4f, 1.4f)
                curveToRelative(-0.77f, 0f, -1.4f, -0.63f, -1.4f, -1.4f)
                verticalLineToRelative(-3.2f)
                curveToRelative(0f, -0.77f, 0.63f, -1.4f, 1.4f, -1.4f)
                close()
            }
        }.build()
        
        return _Bar_chart!!
    }

private var _Bar_chart: ImageVector? = null

