package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Table_rows: ImageVector
    get() {
        if (_Table_rows != null) return _Table_rows!!
        
        _Table_rows = ImageVector.Builder(
            name = "table_rows",
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
                moveTo(21f, 8f)
                horizontalLineTo(3f)
                verticalLineTo(4f)
                horizontalLineToRelative(18f)
                verticalLineTo(8f)
                close()
                moveTo(21f, 10f)
                horizontalLineTo(3f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(18f)
                verticalLineTo(10f)
                close()
                moveTo(21f, 16f)
                horizontalLineTo(3f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(18f)
                verticalLineTo(16f)
                close()
            }
        }.build()
        
        return _Table_rows!!
    }

private var _Table_rows: ImageVector? = null

