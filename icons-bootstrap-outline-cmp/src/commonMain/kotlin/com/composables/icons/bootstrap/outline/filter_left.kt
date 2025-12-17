package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.FilterLeft: ImageVector
    get() {
        if (_FilterLeft != null) return _FilterLeft!!
        
        _FilterLeft = ImageVector.Builder(
            name = "filter-left",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2f, 10.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(3f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                horizontalLineToRelative(-3f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
                moveToRelative(0f, -3f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(7f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                horizontalLineToRelative(-7f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
                moveToRelative(0f, -3f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(11f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                horizontalLineToRelative(-11f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
            }
        }.build()
        
        return _FilterLeft!!
    }

private var _FilterLeft: ImageVector? = null

