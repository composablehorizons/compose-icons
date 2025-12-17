package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.BoxArrowDown: ImageVector
    get() {
        if (_BoxArrowDown != null) return _BoxArrowDown!!
        
        _BoxArrowDown = ImageVector.Builder(
            name = "box-arrow-down",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.5f, 10f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
                verticalLineToRelative(-8f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(9f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(8f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, 0.5f)
                horizontalLineToRelative(-2f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 1f)
                horizontalLineToRelative(2f)
                arcTo(1.5f, 1.5f, 0f, false, false, 14f, 9.5f)
                verticalLineToRelative(-8f)
                arcTo(1.5f, 1.5f, 0f, false, false, 12.5f, 0f)
                horizontalLineToRelative(-9f)
                arcTo(1.5f, 1.5f, 0f, false, false, 2f, 1.5f)
                verticalLineToRelative(8f)
                arcTo(1.5f, 1.5f, 0f, false, false, 3.5f, 11f)
                horizontalLineToRelative(2f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, -1f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.646f, 15.854f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.708f, 0f)
                lineToRelative(3f, -3f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.708f, -0.708f)
                lineTo(8.5f, 14.293f)
                verticalLineTo(5.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -1f, 0f)
                verticalLineToRelative(8.793f)
                lineToRelative(-2.146f, -2.147f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.708f, 0.708f)
                close()
            }
        }.build()
        
        return _BoxArrowDown!!
    }

private var _BoxArrowDown: ImageVector? = null

