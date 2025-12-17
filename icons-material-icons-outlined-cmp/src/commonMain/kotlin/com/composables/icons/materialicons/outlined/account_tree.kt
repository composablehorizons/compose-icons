package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Account_tree: ImageVector
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
                horizontalLineTo(24f)
                verticalLineTo(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
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
                horizontalLineTo(22f)
                close()
                moveTo(7f, 9f)
                horizontalLineTo(4f)
                verticalLineTo(5f)
                horizontalLineToRelative(3f)
                verticalLineTo(9f)
                close()
                moveTo(17f, 15f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-3f)
                verticalLineTo(15f)
                close()
                moveTo(17f, 5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-3f)
                verticalLineTo(5f)
                close()
            }
        }.build()
        
        return _Account_tree!!
    }

private var _Account_tree: ImageVector? = null

