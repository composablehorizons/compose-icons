package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Schema: ImageVector
    get() {
        if (_Schema != null) return _Schema!!
        
        _Schema = ImageVector.Builder(
            name = "schema",
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
                moveTo(14f, 9f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-3f)
                verticalLineTo(9f)
                horizontalLineTo(8.5f)
                verticalLineTo(7f)
                horizontalLineTo(11f)
                verticalLineTo(1f)
                horizontalLineTo(4f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(2f)
                horizontalLineTo(4f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(2f)
                horizontalLineTo(4f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-6f)
                horizontalLineTo(8.5f)
                verticalLineToRelative(-2f)
                horizontalLineTo(11f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(7f)
                verticalLineTo(9f)
                horizontalLineTo(14f)
                close()
            }
        }.build()
        
        return _Schema!!
    }

private var _Schema: ImageVector? = null

