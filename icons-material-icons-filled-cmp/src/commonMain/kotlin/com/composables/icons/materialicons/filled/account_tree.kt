package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Account_tree: ImageVector
    get() {
        if (_Account_tree != null) return _Account_tree!!
        
        _Account_tree = ImageVector.Builder(
            name = "account_tree",
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
                moveTo(22f, 11f)
                verticalLineTo(3f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(3f)
                horizontalLineTo(9f)
                verticalLineTo(3f)
                horizontalLineTo(2f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(7f)
                verticalLineTo(8f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2f)
                verticalLineTo(8f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                close()
            }
        }.build()
        
        return _Account_tree!!
    }

private var _Account_tree: ImageVector? = null

