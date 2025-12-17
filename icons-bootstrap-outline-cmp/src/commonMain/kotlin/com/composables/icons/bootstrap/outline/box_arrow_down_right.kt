package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.BoxArrowDownRight: ImageVector
    get() {
        if (_BoxArrowDownRight != null) return _BoxArrowDownRight!!
        
        _BoxArrowDownRight = ImageVector.Builder(
            name = "box-arrow-down-right",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.636f, 12.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, 0.5f)
                horizontalLineTo(1.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 0f, 11.5f)
                verticalLineToRelative(-10f)
                arcTo(1.5f, 1.5f, 0f, false, true, 1.5f, 0f)
                horizontalLineToRelative(10f)
                arcTo(1.5f, 1.5f, 0f, false, true, 13f, 1.5f)
                verticalLineToRelative(6.636f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -1f, 0f)
                verticalLineTo(1.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, -0.5f)
                horizontalLineToRelative(-10f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, 0.5f)
                verticalLineToRelative(10f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(6.636f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(16f, 15.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, 0.5f)
                horizontalLineToRelative(-5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -1f)
                horizontalLineToRelative(3.793f)
                lineTo(6.146f, 6.854f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, 0.708f, -0.708f)
                lineTo(15f, 14.293f)
                verticalLineTo(10.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 1f, 0f)
                close()
            }
        }.build()
        
        return _BoxArrowDownRight!!
    }

private var _BoxArrowDownRight: ImageVector? = null

