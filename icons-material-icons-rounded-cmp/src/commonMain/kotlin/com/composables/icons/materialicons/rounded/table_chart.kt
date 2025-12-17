package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Table_chart: ImageVector
    get() {
        if (_Table_chart != null) return _Table_chart!!
        
        _Table_chart = ImageVector.Builder(
            name = "table_chart",
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
                moveTo(10f, 10.02f)
                horizontalLineToRelative(5f)
                verticalLineTo(21f)
                horizontalLineToRelative(-5f)
                verticalLineTo(10.02f)
                close()
                moveTo(17f, 21f)
                horizontalLineToRelative(3f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineToRelative(-9f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(11f)
                close()
                moveToRelative(3f, -18f)
                horizontalLineTo(5f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(19f)
                verticalLineTo(5f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveTo(3f, 19f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(3f)
                verticalLineTo(10f)
                horizontalLineTo(3f)
                verticalLineToRelative(9f)
                close()
            }
        }.build()
        
        return _Table_chart!!
    }

private var _Table_chart: ImageVector? = null

