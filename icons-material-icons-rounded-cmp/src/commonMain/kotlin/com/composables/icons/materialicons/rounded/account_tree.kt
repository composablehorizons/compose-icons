package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Account_tree: ImageVector
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
                moveTo(17f, 11f)
                horizontalLineToRelative(3f)
                curveToRelative(1.11f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(5f)
                curveToRelative(0f, -1.11f, -0.9f, -2f, -2f, -2f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.11f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(1f)
                horizontalLineTo(9.01f)
                verticalLineTo(5f)
                curveToRelative(0f, -1.11f, -0.9f, -2f, -2f, -2f)
                horizontalLineTo(4f)
                curveTo(2.9f, 3f, 2f, 3.9f, 2f, 5f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 1.11f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(3f)
                curveToRelative(1.11f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(8f)
                horizontalLineTo(11f)
                verticalLineToRelative(7.01f)
                curveToRelative(0f, 1.65f, 1.34f, 2.99f, 2.99f, 2.99f)
                horizontalLineTo(15f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 1.11f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(3f)
                curveToRelative(1.11f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -1.11f, -0.9f, -2f, -2f, -2f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.11f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-1.01f)
                curveTo(13.45f, 16f, 13f, 15.55f, 13f, 15.01f)
                verticalLineTo(8f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(1f)
                curveTo(15f, 10.1f, 15.9f, 11f, 17f, 11f)
                close()
            }
        }.build()
        
        return _Account_tree!!
    }

private var _Account_tree: ImageVector? = null

