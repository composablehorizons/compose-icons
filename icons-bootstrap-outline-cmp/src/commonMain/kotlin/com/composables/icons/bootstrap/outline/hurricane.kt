package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Hurricane: ImageVector
    get() {
        if (_Hurricane != null) return _Hurricane!!
        
        _Hurricane = ImageVector.Builder(
            name = "hurricane",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.999f, 2.6f)
                arcTo(5.5f, 5.5f, 0f, false, true, 15f, 7.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 1f, 0f)
                arcToRelative(6.5f, 6.5f, 0f, true, false, -13f, 0f)
                arcToRelative(5f, 5f, 0f, false, false, 6.001f, 4.9f)
                arcTo(5.5f, 5.5f, 0f, false, true, 1f, 7.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -1f, 0f)
                arcToRelative(6.5f, 6.5f, 0f, true, false, 13f, 0f)
                arcToRelative(5f, 5f, 0f, false, false, -6.001f, -4.9f)
                moveTo(10f, 7.5f)
                arcToRelative(2f, 2f, 0f, true, true, -4f, 0f)
                arcToRelative(2f, 2f, 0f, false, true, 4f, 0f)
            }
        }.build()
        
        return _Hurricane!!
    }

private var _Hurricane: ImageVector? = null

