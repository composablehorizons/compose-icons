package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.BoxArrowInUp: ImageVector
    get() {
        if (_BoxArrowInUp != null) return _BoxArrowInUp!!
        
        _BoxArrowInUp = ImageVector.Builder(
            name = "box-arrow-in-up",
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
                moveTo(7.646f, 4.146f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.708f, 0f)
                lineToRelative(3f, 3f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.708f, 0.708f)
                lineTo(8.5f, 5.707f)
                verticalLineTo(14.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -1f, 0f)
                verticalLineTo(5.707f)
                lineTo(5.354f, 7.854f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -0.708f, -0.708f)
                close()
            }
        }.build()
        
        return _BoxArrowInUp!!
    }

private var _BoxArrowInUp: ImageVector? = null

