package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Table_chart: ImageVector
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
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10f, 10.02f)
                horizontalLineToRelative(5f)
                verticalLineTo(21f)
                horizontalLineToRelative(-5f)
                verticalLineTo(10.02f)
                close()
                moveTo(17f, 21f)
                horizontalLineToRelative(5f)
                verticalLineTo(10f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(11f)
                close()
                moveToRelative(5f, -18f)
                horizontalLineTo(3f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(19f)
                verticalLineTo(3f)
                close()
                moveTo(3f, 21f)
                horizontalLineToRelative(5f)
                verticalLineTo(10f)
                horizontalLineTo(3f)
                verticalLineToRelative(11f)
                close()
            }
        }.build()
        
        return _Table_chart!!
    }

private var _Table_chart: ImageVector? = null

