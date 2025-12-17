package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Text_fields: ImageVector
    get() {
        if (_Text_fields != null) return _Text_fields!!
        
        _Text_fields = ImageVector.Builder(
            name = "text_fields",
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
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2.5f, 4f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(3f)
                verticalLineTo(7f)
                horizontalLineToRelative(5f)
                verticalLineTo(4f)
                horizontalLineToRelative(-13f)
                close()
                moveToRelative(19f, 5f)
                horizontalLineToRelative(-9f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(3f)
                verticalLineTo(9f)
                close()
            }
        }.build()
        
        return _Text_fields!!
    }

private var _Text_fields: ImageVector? = null

