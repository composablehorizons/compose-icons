package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Table_rows: ImageVector
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
                moveTo(19f, 3f)
                horizontalLineTo(5f)
                curveTo(3.9f, 3f, 3f, 3.9f, 3f, 5f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(14f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(5f)
                curveTo(21f, 3.9f, 20.1f, 3f, 19f, 3f)
                close()
                moveTo(19f, 5f)
                verticalLineToRelative(3f)
                horizontalLineTo(5f)
                verticalLineTo(5f)
                horizontalLineTo(19f)
                close()
                moveTo(19f, 10f)
                verticalLineToRelative(4f)
                horizontalLineTo(5f)
                verticalLineToRelative(-4f)
                horizontalLineTo(19f)
                close()
                moveTo(5f, 19f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(3f)
                horizontalLineTo(5f)
                close()
            }
        }.build()
        
        return _Table_rows!!
    }

private var _Table_rows: ImageVector? = null

